package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryVerTransacciones;
import Model.Categoria;
import Model.CompraVentaIva;
import Model.EmpresaOrden;
import Model.PromptComboBoxRenderer;
import Model.SubCategoria;
import Model.Transaccion;
import Model.TransaccionEditable;
import View.EditView;
import View.FormVerTransacciones;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class VerTransaccionesController implements ActionListener, ItemListener {

    FormVerTransacciones formVerT = new FormVerTransacciones();
    MenuPrincipal viewMenu = new MenuPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    QueryVerTransacciones queryVerT = new QueryVerTransacciones();
    EditView editVista = new EditView();
    ArrayList<Transaccion> listT = queryVerT.listarTransacciones();
    DecimalFormat formato = new DecimalFormat("#,###.00");
    private JTextField[] textFields = {editVista.txtImpNetoGrav, editVista.txtIvaFact, editVista.txtIvaFact21, editVista.txtIvaFac27,
        editVista.txtImpInterno, editVista.txtConceptoNoGrav, editVista.txtPercepcionIVA, editVista.txtRetGanan, editVista.txtPercIvaC,
        editVista.txtIvaRg212, editVista.txtIvaDereReg, editVista.txtCNoGravSellos, editVista.txtRetIiBbV, editVista.txtGravLey25413,
        editVista.txtIntNumerales, editVista.txtOpExentas, editVista.txtIngBrutos, editVista.txtRetIva, editVista.txtImpRIngBrutos,
        editVista.txtOtros, editVista.txtImpPais, editVista.txtImpPaisArg, editVista.txtAfipRG485, editVista.txtPercIIBB_bsas};

    public VerTransaccionesController(MenuPrincipal menu) {
        updateTabla(listT);
        deshabilitarCamposIva();
        formVerT.setLocationRelativeTo(null);
        this.viewMenu = menu;
        viewMenu.btnVerTransacciones.addActionListener(this);
        iniciarTabla2();

        setearNullCampos();

        formVerT.cbbBuscarCategoria.addActionListener(this);
        formVerT.cbbSubCategoria.addActionListener(this);
        formVerT.cbbBuscarCuenta.addActionListener(this);
        formVerT.cbbEmpresa.addActionListener(this);
        formVerT.btnLimpiar.addActionListener(this);

        formVerT.btnBuscarT.addActionListener(this);
        formVerT.btnEditar.addActionListener(this);

        editVista.btnModificarT.addActionListener(this);
        editVista.btnModificarCVI.addActionListener(this);

        formVerT.btnEliminar.addActionListener(this);

        formVerT.btnActualizar.addActionListener(this);

        formVerT.txtEntradas.setText(obtenerSumaEntradas());
        formVerT.txtSalidas.setText(obtenerSumaSalidas());

        iniciarComboBox();
        this.editVista.cbbCategoria.addActionListener(this);
        this.editVista.cbbCuenta.addActionListener(this);
        this.editVista.cbbEmpresa.addActionListener(this);
        this.formVerT.btnBuscarPorFecha.addActionListener(this);
        this.formVerT.btnSetState.addActionListener(this);

        editVista.checkBoxIVA10.addItemListener(this);
        editVista.checkBoxIVA21.addItemListener(this);
        editVista.checkBoxIVA27.addItemListener(this);

        /*keyListenerCampos();*/
        for (int i = 0; i < textFields.length; i++) {
            textFields[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateSum();
                }
            });
        }
        addDocumentListenerTotalFact();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loadVerTransacciones(e);
        accionBuscarPorCat(e);
        accionBuscarPorSubCat(e);
        accionBuscarPorCuenta(e);
        accionBuscarPorEmpresa(e);
        accionLimpiar(e);
        accionBuscar(e);
        borrarTransaccionAndCVI(e);
        accionActualizar(e);
        accionBuscarPorFecha(e);
        try {
            accionEditarCVI(e);
            accionEditTransaccion(e);
            accionEditarTransaccion(e);
            accionCbbCuenta(e);
            accionCbbCategoria(e);
            verificarTransaccion(e);
        } catch (ParseException ex) {
            Logger.getLogger(VerTransaccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadVerTransacciones(ActionEvent e) {
        if (e.getSource() == viewMenu.btnVerTransacciones) {
            formVerT.setVisible(true);
        }
    }

    public void iniciarTabla(ArrayList<Transaccion> listT) {

        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 9) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        modelo.addColumn("Número");
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A Impuesto ?");
        modelo.addColumn(" A IVA ?");
        modelo.addColumn("Verificado");

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
        addCheckBox(9, formVerT.tablaVerTransacciones);
        if (!listT.isEmpty()) {
            for (Transaccion t : listT) {
                Object[] dato = new Object[10];
                dato[0] = String.valueOf(t.getIdTransaccion());
                dato[1] = t.getCodigo();
                dato[2] = t.getFecha().toString();
                dato[3] = t.getDescripcion();
                dato[4] = String.valueOf(t.getCantidad());
                dato[5] = "$" + evaluarNum(t.getSalida());
                dato[6] = "$" + evaluarNum(t.getEntrada());
                dato[7] = cambiarFormatoIVA(t.isA_impuesto());
                dato[8] = cambiarFormatoIVA(t.isA_iva());
                dato[9] = t.isVerificada() == true;
                modelo.addRow(dato);
            }
        } else {
            DefaultTableModel model = new DefaultTableModel(1, 1);
            // Establezca el mensaje en la celda del modelo de tabla personalizado
            model.setValueAt("No hay transaccion registradas", 0, 0);
            // Establezca el modelo de tabla personalizado en la JTable
            formVerT.tablaVerTransacciones.setModel(model);
        }

    }

    public void accionBuscarPorCat(ActionEvent e) {
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if (e.getSource() == formVerT.cbbBuscarCategoria) {
            if (formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null) {

                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();

                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();

                String categoria = (String) formVerT.cbbBuscarCategoria.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorCategorias(categoria, fecha_desde, fecha_hasta);
                if (!listTransacciones.isEmpty()) {
                    formVerT.txtBusqueda.setText(categoria);
                    iniciarTabla(listTransacciones);
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones registradas \n"
                            + "para la búsqueda filtrada por la Categoria: " + categoria + "\n"
                            + "entre las fechas " + fecha_desde + " - " + fecha_hasta);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    public void accionBuscarPorSubCat(ActionEvent e) {
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if (e.getSource() == formVerT.cbbSubCategoria) {
            if (formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null) {

                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();

                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();

                String subcategoria = (String) formVerT.cbbSubCategoria.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorSubCategoria(subcategoria, fecha_desde, fecha_hasta);
                if (!listTransacciones.isEmpty()) {
                    formVerT.txtBusqueda.setText(subcategoria);
                    iniciarTabla(listTransacciones);
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones registradas \n"
                            + "para la búsqueda filtrada por la SubCategoria: " + subcategoria + "\n"
                            + "entre las fechas " + fecha_desde + " - " + fecha_hasta);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    public void accionBuscarPorCuenta(ActionEvent e) {
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if (e.getSource() == formVerT.cbbBuscarCuenta) {
            if (formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null) {

                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();

                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();

                String cuenta = (String) formVerT.cbbBuscarCuenta.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorCuenta(cuenta, fecha_desde, fecha_hasta);
                if (!listTransacciones.isEmpty()) {
                    formVerT.txtBusqueda.setText(cuenta);
                    iniciarTabla(listTransacciones);
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones registradas \n"
                            + "para la búsqueda filtrada por la cuenta: " + cuenta + "\n"
                            + "entre las fechas " + fecha_desde + " - " + fecha_hasta);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    public void accionBuscarPorEmpresa(ActionEvent e) {
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if (e.getSource() == formVerT.cbbEmpresa) {
            if (formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null) {

                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();

                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();

                String empresa = (String) formVerT.cbbEmpresa.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorEmpresa(empresa, fecha_desde, fecha_hasta);
                if (!listTransacciones.isEmpty()) {
                    formVerT.txtBusqueda.setText(empresa);
                    iniciarTabla(listTransacciones);
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones registradas \n"
                            + "para la búsqueda filtrada por la empresa/orden: " + empresa + "\n"
                            + "entre las fechas " + fecha_desde + " - " + fecha_hasta);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    public String obtenerSumaEntradas() {
        String entradasString = "";
        double entradas = 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {

            String entradaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 6)).toString().substring(1);
            double entradasTotales = converFormatNumToDouble(entradaSin$);
            entradas += entradasTotales;
        }
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String entradasFormateado = formato.format(entradas);
        entradasString = "$" + String.valueOf(entradasFormateado);
        return entradasString;
    }

    public String obtenerSumaSalidas() {
        String salidasString = "";
        double salidas = 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {

            String salidaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 5)).toString().substring(1);
            double salidasTotales = converFormatNumToDouble(salidaSin$);
            salidas += salidasTotales;
        }
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String SalidasFormateado = formato.format(salidas);

        salidasString = "$" + String.valueOf(SalidasFormateado);
        return salidasString;
    }

    public String cambiarFormatoIVA(Boolean b) {
        if (b.equals(true)) {
            return "Si";
        }
        return "No";
    }

    public void iniciarComboBoxBuscarCategoria() {
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        for (String c : listCategoria) {
            formVerT.cbbBuscarCategoria.addItem(c);
        }
    }

    public void iniciarComboBoxBuscarCuentas() {
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for (String c : nombreCuentas) {
            formVerT.cbbBuscarCuenta.addItem(c);
        }
    }

    public void iniciarcomboBoxBuscarSubcategoria() {
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for (SubCategoria subCat : listSubCategoria) {
            formVerT.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }

    public void iniciarComboBoxBuscarEmpresa() {
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        for (String emp : listEmpresas) {
            formVerT.cbbEmpresa.addItem(emp);
        }
    }

    public void accionLimpiar(ActionEvent e) {
        ArrayList<Transaccion> arrayVacio = new ArrayList<>();
        if (e.getSource() == formVerT.btnLimpiar) {
            setearNullCampos();
            iniciarTabla2();
            formVerT.txtEntradas.setText(obtenerSumaEntradas());
            formVerT.txtSalidas.setText(obtenerSumaSalidas());
        }
    }

    public void setearNullCampos() {
        formVerT.txtFechaDesde.setDate(null);
        formVerT.txtFechaHasta.setDate(null);
        formVerT.txtBusqueda.setText("");
        formVerT.txtSalidas.setText("");
        formVerT.txtEntradas.setText("");
        formVerT.txtNum.setText("");
        iniciarComboBoxBuscarCategoria();
        iniciarComboBoxBuscarCuentas();
        iniciarcomboBoxBuscarSubcategoria();
        iniciarComboBoxBuscarEmpresa();

    }

    public MenuPrincipal getViewMeu() {
        return viewMenu;
    }

    public void setViewMeu(MenuPrincipal viewMeu) {
        this.viewMenu = viewMeu;
    }

    public void accionBuscarTransaccion(ActionEvent e) {
        if (e.getSource() == formVerT.btnBuscarT) {

        }
    }

    public void iniciarTabla2() {
        ArrayList<Transaccion> listT = queryVerT.listarTransacciones();
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 9) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        modelo.addColumn("N° Transacc.");
        modelo.addColumn("Codigo Transacc.");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A Impuesto ?");
        modelo.addColumn(" A IVA ?");
        modelo.addColumn("Verificado");

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
        addCheckBox(9, formVerT.tablaVerTransacciones);

        if (!listT.isEmpty()) {

            for (Transaccion t : listT) {
                /*puede ser q no haya datos en la bdd y me tire excepcion*/
                Object[] dato = new Object[10];
                dato[0] = String.valueOf(t.getIdTransaccion());
                dato[1] = t.getCodigo();
                dato[2] = t.getFecha().toString();
                dato[3] = t.getDescripcion();
                dato[4] = String.valueOf(t.getCantidad());
                dato[5] = "$" + evaluarNum(t.getSalida());
                dato[6] = "$" + evaluarNum(t.getEntrada());
                dato[7] = cambiarFormatoIVA(t.isA_impuesto());
                dato[8] = cambiarFormatoIVA(t.isA_iva());
                dato[9] = t.isVerificada() == true;
                modelo.addRow(dato);
            }
        } else {
            DefaultTableModel model = new DefaultTableModel(1, 1);
            // Establezca el mensaje en la celda del modelo de tabla personalizado
            model.setValueAt("No hay transaccion registradas", 0, 0);
            // Establezca el modelo de tabla personalizado en la JTable
            formVerT.tablaVerTransacciones.setModel(model);
        }

    }

    public void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));

    }

    public String evaluarNum(double n) {
        String numero = "0";
        if (n >= 10000) {
            numero = formatNumberMenosUno(n);
        } else {
            if (n <= 10000) {
                numero = formatNumber(n);
            }
        }
        return numero;
    }

    public String formatNumber(double numero) {
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        String num = formatoNumero.format(numero);
        double b = converFormatNumToDouble(num);

        return num.substring(0, num.length());
    }

    public String formatNumberMenosUno(double numero) {
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        String num = formatoNumero.format(numero);
        double b = converFormatNumToDouble(num);

        DecimalFormat formato = new DecimalFormat("#,###.00");
        String valorFormateado = formato.format(b);

        return valorFormateado;
    }

    public String formatP(double numero) {
        NumberFormat formatoNumero = NumberFormat.getNumberInstance();
        String y = formatoNumero.format(numero);
        String yReemplaza = y.replaceAll("\\.", "");
        String flotanteNum = yReemplaza.replaceAll("\\,", ".");
        DecimalFormat formato = new DecimalFormat("#.##");
        double dou = Double.parseDouble((flotanteNum));
        String dd = (formato.format(dou).replaceAll("\\,", "."));
        return dd;
    }

    public void accionBuscar(ActionEvent e) {
        if (e.getSource() == formVerT.btnBuscarT) {
            if (!"".equals(formVerT.txtNum.getText())) {
                String numero = formVerT.txtNum.getText();
                if (queryVerT.existeIdTransaccion(Integer.parseInt(numero))) {
                    iniciarTabla3(queryVerT.obtenerTransaccion(Integer.parseInt(numero.trim())));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe Transacción con número: " + numero);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No ingreso número de Transacción \n"
                        + "Ingrese Número Valido");
            }

        }
    }

    public void iniciarTabla3(Transaccion t) {
        ArrayList<Transaccion> listT = queryVerT.listarTransacciones();
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 1 && columna == 2 && columna == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        modelo.addColumn("N° Transacc.");
        modelo.addColumn("Codigo Transacc.");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A Impuesto ?");
        modelo.addColumn(" A IVA ?");
        modelo.addColumn("Verificado");

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);

        addCheckBox(9, formVerT.tablaVerTransacciones);

        if (t != null) {
                /*puede ser q no haya datos en la bdd y me tire excepcion*/
                Object[] dato = new Object[10];
                dato[0] = String.valueOf(t.getIdTransaccion());
                dato[1] = t.getCodigo();
                dato[2] = t.getFecha().toString();
                dato[3] = t.getDescripcion();
                dato[4] = String.valueOf(t.getCantidad());
                dato[5] = "$" + evaluarNum(t.getSalida());
                dato[6] = "$" + evaluarNum(t.getEntrada());
                dato[7] = cambiarFormatoIVA(t.isA_impuesto());
                dato[8] = cambiarFormatoIVA(t.isA_iva());
                dato[9] = t.isVerificada() == true;
                modelo.addRow(dato);
            
        } else {
            DefaultTableModel model = new DefaultTableModel(1, 1);
            // Establezca el mensaje en la celda del modelo de tabla personalizado
            model.setValueAt("No hay transaccion registradas", 0, 0);
            // Establezca el modelo de tabla personalizado en la JTable
            formVerT.tablaVerTransacciones.setModel(model);
        }

    }

    public void accionEditarTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == formVerT.btnEditar) {
            CompraVentaIva cvi = new CompraVentaIva();
            Transaccion t = new Transaccion();
            TransaccionEditable tEdit = new TransaccionEditable();
            int fila = formVerT.tablaVerTransacciones.getSelectedRow();
            if (fila >= 0) {

                t.setIdTransaccion(Integer.parseInt((String) formVerT.tablaVerTransacciones.getValueAt(fila, 0)));
                tEdit = obtenerDatosT(Integer.parseInt((String) formVerT.tablaVerTransacciones.getValueAt(fila, 0)));

                editVista.cbbCategoria.setSelectedItem(tEdit.getCategoria());
                editVista.txtCantidad.setText(String.valueOf(tEdit.getCantidad()));
                editVista.txtNumCheque.setText(tEdit.getNumeroCheque());
                editVista.txtNumeroFactura.setText(tEdit.getNumeroFactura());
                editVista.cbbSubCategoria.setSelectedItem(tEdit.getSubCategoria());
                editVista.cbbCuenta.setSelectedItem(tEdit.getCuenta());
                editVista.cbbEmpresa.setSelectedItem(tEdit.getEmpresa());

                editVista.txtDescripcion.setText(tEdit.getDescripcion());

                String fecha = (String) formVerT.tablaVerTransacciones.getValueAt(fila, 2);
                t.setFecha(java.sql.Date.valueOf(fecha));

                String salida = formVerT.tablaVerTransacciones.getValueAt(fila, 5).toString();

                String entrada = formVerT.tablaVerTransacciones.getValueAt(fila, 6).toString();

                mensajeVerificacion(t.getIdTransaccion());

                editVista.labelNumT.setText(String.valueOf(t.getIdTransaccion()));
                editVista.txtFechaT.setDate(t.getFecha());
                editVista.txtSalidas.setText(changeFormatDiner(salida.substring(1)));
                editVista.txtEntradas.setText(changeFormatDiner(entrada.substring(1)));

                cvi = queryVerT.obtenerCompraVenta(Integer.parseInt((String) formVerT.tablaVerTransacciones.getValueAt(fila, 0)));

                setearVistaCVI(cvi);
                editVista.setVisible(true);
                editVista.setLocationRelativeTo(null);
                editVista.txtNombre.setEditable(false);
                editVista.txtCuit.setEditable(false);
                editVista.txtOperacion.setEditable(false);

            } else {
                JOptionPane.showMessageDialog(null, "Para Modificar Transacciones debe seleccionar la fila en la tabla.\n"
                        + "Haciendo click una sola vez.");
            }
        }
    }

    public void setearVistaCVI(CompraVentaIva cvi) {
        editVista.txtFecha.setDate(cvi.getFecha());
        editVista.txtTipoComprobante.setText(cvi.getTipo_comprobante());
        editVista.txtNumComprobante.setText(cvi.getNumComprobante());
        editVista.txtOperacion.setText(cvi.getOperacion());
        editVista.txtNombre.setText(cvi.getEmpresa());
        editVista.txtCuit.setText(cvi.getCuit());
        editVista.txtImpNetoGrav.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getImp_neto_grav()))));
        editVista.txtIvaFact.setText(String.valueOf((converFormatNumToDouble2(formato.format(cvi.getIva_facturado())))));

        editVista.txtImpInterno.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getImp_interno()))));
        editVista.txtConceptoNoGrav.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getConcep_no_grav()))));
        editVista.txtPercepcionIVA.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getPercepcion_iva()))));
        editVista.txtRetGanan.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getRet_ganancias()))));
        editVista.txtPercIvaC.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getPerc_iibb_compra()))));

        editVista.txtImpTotalFact.setText(String.valueOf(converFormatNumToDouble2((formato.format(cvi.getImp_total_fact())))));

        editVista.txtIvaDereReg.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getIte_iva_dere_reg()))));
        editVista.txtCNoGravSellos.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getC_no_grav_sellos()))));
        editVista.txtRetIiBbV.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getRet_iibb_venta()))));
        editVista.txtIvaRg212.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getIva_rg_212()))));
        editVista.txtGravLey25413.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getGrav_ley_25413()))));
        editVista.txtIntNumerales.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getInt_numerales()))));
        editVista.txtOpExentas.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getOperaciones_exentas()))));
        editVista.txtIngBrutos.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getIng_brutos()))));
        editVista.txtRetIva.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getRet_iva()))));
        editVista.txtImpRIngBrutos.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getImp_r_ing_brutos()))));
        editVista.txtOtros.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getOtros()))));
        editVista.txtIvaFact21.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getIva_facturado_21()))));
        editVista.txtIvaFac27.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getIva_facturado_27()))));
        
        editVista.txtImpPais.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getImp_pais()))));
        editVista.txtImpPaisArg.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getImp_pais_arg()))));
        editVista.txtAfipRG485.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getPerc_afip_rg_4815()))));
        editVista.txtPercIIBB_bsas.setText(String.valueOf(converFormatNumToDouble2(formato.format(cvi.getPerc_iibb_bsas()))));
    }

    public double cambiarFormato(double numero) {
        DecimalFormat formato = new DecimalFormat("#.##");
        double num = Double.parseDouble(formato.format(String.valueOf(numero)));
        return num;
    }

    public void accionEditTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == editVista.btnModificarT) {
            if (editVista.txtFechaT.getDate() != null) {

                Transaccion t = new Transaccion();
                java.sql.Date sqlDate = new java.sql.Date(editVista.txtFechaT.getDate().getTime());
                t.setFecha(sqlDate);
                NumberFormat f1 = NumberFormat.getInstance();
                NumberFormat f2 = NumberFormat.getInstance();
                t.setSalida(Double.parseDouble(verificarBlanco(editVista.txtSalidas.getText())));
                t.setEntrada(Double.parseDouble(verificarBlanco(editVista.txtEntradas.getText())));
                t.setDescripcion(editVista.txtDescripcion.getText());
                t.setIdOrdenEmp(queryEO.obtenerIdEmpresaPorNombre(editVista.cbbEmpresa.getSelectedItem().toString()));
                t.setIdCuenta(queryCuentas.obtenerIdCuentaPorNombre(editVista.cbbCuenta.getSelectedItem().toString()));
                t.setIdCat(queryCategoria.obtenerIdCatePorNombre(editVista.cbbCategoria.getSelectedItem().toString()));
                t.setCantidad(Integer.parseInt(editVista.txtCantidad.getText()));
                t.setIdSubCat(querySubCat.obtenerIdSubCatPorNombre(editVista.cbbSubCategoria.getSelectedItem().toString()));
                queryVerT.modificarTransaccion(t, Integer.parseInt(editVista.labelNumT.getText()));
                JOptionPane.showMessageDialog(null, "Transacción N° " + editVista.labelNumT.getText() + " modificada");
                iniciarTabla2();
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());

            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar transaccion, debe ingresar una fecha en el campo.\n"
                        + "No debe quedar el campo sin vacio");
            }

        }
    }

    public String verificarBlanco(String numero) {
        if (numero.equals("")) {
            return "0";
        } else {
            return numero;
        }
    }

    public void accionEditarCVI(ActionEvent e) throws ParseException {
        if (e.getSource() == editVista.btnModificarCVI) {
            if (editVista.txtFecha.getDate() != null) {
                queryVerT.modificarCVI(createObjetCVI(), (Integer.parseInt(editVista.labelNumT.getText())));
                JOptionPane.showMessageDialog(null, "Modificación realizada con Éxito.");
                iniciarTabla2();
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar datos.\n"
                        + "El campo fecha del apartado CompraVentaIva no debe estar vacio.");

            }
        }
    }

    public CompraVentaIva createObjetCVI() throws ParseException {
        CompraVentaIva cvi = new CompraVentaIva();

        cvi.setOperacion(editVista.txtOperacion.getText());

        java.sql.Date sqlDate = new java.sql.Date(editVista.txtFecha.getDate().getTime());
        cvi.setFecha(sqlDate);

        cvi.setTipo_comprobante(editVista.txtTipoComprobante.getText());

        cvi.setNumComprobante(editVista.txtNumComprobante.getText());

        cvi.setEmpresa(editVista.txtNombre.getText());

        cvi.setCuit(editVista.txtCuit.getText());

        NumberFormat f = NumberFormat.getInstance();

        cvi.setImp_neto_grav(Double.parseDouble(verificarBlanco(editVista.txtImpNetoGrav.getText())));

        cvi.setIva_facturado(Double.parseDouble(verificarBlanco(editVista.txtIvaFact.getText())));

        cvi.setImp_interno(Double.parseDouble(verificarBlanco(editVista.txtImpInterno.getText())));

        cvi.setConcep_no_grav(Double.parseDouble(verificarBlanco(editVista.txtConceptoNoGrav.getText())));

        cvi.setPercepcion_iva(Double.parseDouble(verificarBlanco(editVista.txtPercepcionIVA.getText())));

        cvi.setRet_ganancias(Double.parseDouble(verificarBlanco(editVista.txtRetGanan.getText())));

        cvi.setPerc_iibb_compra(Double.parseDouble(verificarBlanco(editVista.txtPercIvaC.getText())));

        cvi.setImp_total_fact(Double.parseDouble(verificarBlanco(converFormatNumToDouble2(editVista.txtImpTotalFact.getText()))));

        cvi.setIte_iva_dere_reg(Double.parseDouble(verificarBlanco(editVista.txtIvaDereReg.getText())));

        cvi.setC_no_grav_sellos(Double.parseDouble(verificarBlanco(editVista.txtCNoGravSellos.getText())));

        cvi.setRet_iibb_venta(Double.parseDouble(verificarBlanco(editVista.txtRetIiBbV.getText())));

        cvi.setIva_rg_212(Double.parseDouble(verificarBlanco(editVista.txtIvaRg212.getText())));

        cvi.setGrav_ley_25413(Double.parseDouble(verificarBlanco(editVista.txtGravLey25413.getText())));

        cvi.setInt_numerales(Double.parseDouble(verificarBlanco(editVista.txtIntNumerales.getText())));

        cvi.setOtros(Double.parseDouble(verificarBlanco(editVista.txtOtros.getText())));

        cvi.setIdTransaccion(Integer.parseInt(editVista.labelNumT.getText()));

        cvi.setOperaciones_exentas(Double.parseDouble(verificarBlanco(editVista.txtOpExentas.getText())));

        cvi.setIng_brutos(Double.parseDouble(verificarBlanco(editVista.txtIngBrutos.getText())));

        cvi.setRet_iva(Double.parseDouble(verificarBlanco(editVista.txtRetIva.getText())));

        cvi.setImp_r_ing_brutos((Double.parseDouble(verificarBlanco(editVista.txtImpRIngBrutos.getText()))));
        cvi.setIva_facturado_21(Double.parseDouble(verificarBlanco(editVista.txtIvaFact21.getText())));
        cvi.setIva_facturado_27(Double.parseDouble(verificarBlanco(editVista.txtIvaFac27.getText())));
        
        cvi.setImp_pais(Double.parseDouble(verificarBlanco(editVista.txtImpPais.getText())));
        cvi.setImp_pais_arg(Double.parseDouble(verificarBlanco(editVista.txtImpPaisArg.getText())));
        cvi.setPerc_afip_rg_4815(Double.parseDouble(verificarBlanco(editVista.txtAfipRG485.getText())));
        cvi.setPerc_iibb_bsas(Double.parseDouble(verificarBlanco(editVista.txtPercIIBB_bsas.getText())));
        
        return cvi;
    }

    public void borrarTransaccionAndCVI(ActionEvent e) {

        if (e.getSource() == formVerT.btnEliminar) {

            String botones[] = {"Aceptar", "Cancelar"};
            int fila = formVerT.tablaVerTransacciones.getSelectedRow();

            if (fila >= 0) {
                int eleccion = JOptionPane.showOptionDialog(formVerT, "<html><p style = \"font:15px\">¿Desea eliminar la transaccion con número : " + formVerT.tablaVerTransacciones.getValueAt(fila, 0).toString() + " ? </p></html>", "Eliminar Transacción", 0, 0, null, botones, this);
                if (eleccion == JOptionPane.YES_OPTION) {
                    String idtransaccion = formVerT.tablaVerTransacciones.getValueAt(fila, 0).toString();
                    queryVerT.eliminarCvi(idtransaccion);
                    queryVerT.eliminarTransaccion(idtransaccion);
                    JOptionPane.showMessageDialog(null, "<html><p style = \"font:15px\">La Transacción: " + formVerT.tablaVerTransacciones.getValueAt(fila, 0).toString() + " se ha eliminado");
                    iniciarTabla2();
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else if (eleccion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"font:15px\">Se ha cancelado operación</p></html>", "Se canceló operación", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"font:15px\">Por favor, seleccione transacción a eliminar en la tabla</p></html>");
            }

        }
    }

    public void updateTabla(ArrayList<Transaccion> l) {
        ArrayList<Transaccion> listT = l;
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 1 && columna == 2 && columna == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        modelo.addColumn("N° Transacc.");
        modelo.addColumn("Codigo Transacc.");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A Impuesto ?");
        modelo.addColumn(" A IVA ?");

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
        for (Transaccion t : listT) {
            String[] dato = new String[10];
            dato[0] = String.valueOf(t.getIdTransaccion());
            dato[1] = t.getCodigo();
            dato[2] = t.getFecha().toString();
            dato[3] = t.getDescripcion();
            dato[4] = String.valueOf(t.getCantidad());
            dato[5] = "$" + String.valueOf((float) t.getSalida());
            dato[6] = "$" + String.valueOf(t.getEntrada());
            dato[7] = cambiarFormatoIVA(t.isA_impuesto());
            dato[8] = cambiarFormatoIVA(t.isA_iva());

            modelo.addRow(dato);
        }

    }

    public void accionActualizar(ActionEvent e) {
        if (e.getSource() == formVerT.btnActualizar) {
            iniciarTabla2();
            formVerT.txtEntradas.setText(obtenerSumaEntradas());
            formVerT.txtSalidas.setText(obtenerSumaSalidas());
        }
    }

    /*Método para aquellas transacciones que no se le discriminó el IVA, entonces muestra un texto*/
    public void mensajeVerificacion(int idTransaccion) {
        if (!queryVerT.existeIdTransaccioncvi(idTransaccion)) {
            editVista.labelVerificacion.setText("No se discriminó COMPRA_VENTA_IVA para esta Transacción.");
            editVista.btnModificarCVI.setEnabled(false);
        } else {
            editVista.labelVerificacion.setText("");
            editVista.btnModificarCVI.setEnabled(true);
        }

    }

    public TransaccionEditable obtenerDatosT(int idTransaccion) {
        return queryVerT.obtenerDatosT(idTransaccion);
    }

    /* Parte que se agrego para editar campos faltantes de transacciones */
    public void iniciarComboBox() {
        iniciarComboBoxEmpresa();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarComboBoxSubCategoria();
    }

    public void iniciarComboBoxSubCategoria() {
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for (SubCategoria subCat : listSubCategoria) {
            editVista.cbbSubCategoria.addItem(subCat.getNombre());
        }
        AutoCompleteDecorator.decorate(editVista.cbbSubCategoria);
    }

    public void iniciarComboBoxEmpresa() {
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        listEmpresas.add(0, e.getNombre());
        for (String emp : listEmpresas) {
            editVista.cbbEmpresa.addItem(emp);
        }
        AutoCompleteDecorator.decorate(editVista.cbbEmpresa);
    }

    public void iniciarComboBoxCuentas() {
        editVista.cbbCuenta.removeAllItems();
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for (String c : nombreCuentas) {
            editVista.cbbCuenta.addItem(c);
        }
        editVista.cbbCuenta.setRenderer(new PromptComboBoxRenderer("Pago Con..."));
        editVista.cbbCuenta.setSelectedIndex(-1);
        AutoCompleteDecorator.decorate(editVista.cbbCuenta);
    }

    public void iniciarComboBoxCategoria() {
        editVista.cbbCategoria.removeAllItems();
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        Categoria c = new Categoria();
        c.setNombre("");
        listCategoria.add(0, c.getNombre());
        for (String cat : listCategoria) {
            editVista.cbbCategoria.addItem(cat);
        }
        AutoCompleteDecorator.decorate(editVista.cbbCategoria);
    }

    public void accionCbbCuenta(ActionEvent e) {
        if (e.getSource() == editVista.cbbCuenta) {
            String nombre = queryCuentas.obtenerTipoCuenta(editVista.cbbCuenta.getSelectedItem().toString());
            editVista.labelTipoCuenta.setText(nombre);
        }
    }

    public void accionCbbCategoria(ActionEvent e) {
        if (e.getSource() == editVista.cbbCategoria) {
            String nombre = queryCategoria.obtenerNombreTC(editVista.cbbCategoria.getSelectedItem().toString());
            editVista.labelTipoCategoria.setText(nombre);
        }
    }

    /*Método para conversión de formato dinero a formato String para el uso como doble*/
    public String changeFormatDiner(String numero) {
        String yReemplaza = numero.replaceAll("\\.", "");
        String flotanteNum = yReemplaza.replaceAll("\\,", ".");
        DecimalFormat formato = new DecimalFormat("#.##");
        double dou = Double.parseDouble((flotanteNum));
        String dd = (formato.format(dou).replaceAll("\\,", "."));
        return dd;
    }

    /*Método para convertir formNum a Double*/
    public double converFormatNumToDouble(String s) {
        String yReemplaza = s.replaceAll("\\.", "");
        String flotanteNum = yReemplaza.replaceAll("\\,", ".");
        DecimalFormat formato = new DecimalFormat("#.##");
        double dou = Double.parseDouble((flotanteNum));
        return dou;

    }

    /*Método que realiza lo mismo que el de la linea 881 per con la diferencia que no es necesario convertirlo a doble al valor*/
    public String converFormatNumToDouble2(String s) {
        String yReemplaza = s.replaceAll("\\.", "");
        String flotanteNum = yReemplaza.replaceAll("\\,", ".");
        return flotanteNum;

    }

    public void accionBuscarPorFecha(ActionEvent e) {
        if (e.getSource() == formVerT.btnBuscarPorFecha) {
            ArrayList<Transaccion> listTransacciones = new ArrayList<>();
            if (formVerT.txtFechaDesde.getDate() != null
                    && formVerT.txtFechaHasta.getDate() != null) {

                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();

                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();

                listTransacciones = queryVerT.obtenerTransaccionesPorFecha(fecha_desde, fecha_hasta);
                if (!listTransacciones.isEmpty()) {
                    iniciarTabla(listTransacciones);
                    formVerT.txtEntradas.setText(obtenerSumaEntradas());
                    formVerT.txtSalidas.setText(obtenerSumaSalidas());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron transacciones registradas entre las fechas \n"
                            + "" + fecha_desde + " - " + fecha_hasta);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    /*Método para ir cambiando el estado de una transacción, lo que nos permite saber si se chequeo*/
    public void verificarTransaccion(ActionEvent e) {
        if (e.getSource() == formVerT.btnSetState) {

            for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {
                if (isSelected(i, 9, formVerT.tablaVerTransacciones)) {
                    queryVerT.setStateTransaccion(true, Integer.parseInt(formVerT.tablaVerTransacciones.getValueAt(i, 0).toString()));

                } else {
                    if (!isSelected(i, 9, formVerT.tablaVerTransacciones)) {
                        queryVerT.setStateTransaccion(false, Integer.parseInt(formVerT.tablaVerTransacciones.getValueAt(i, 0).toString()));
                    }
                }

            }
            JOptionPane.showMessageDialog(null, "Cambios Guardados Correctamente");
        }
    }

    public boolean isSelected(int row, int column, JTable table) {
        Boolean s = Boolean.parseBoolean(String.valueOf(table.getValueAt(row, column)));
        if (s == true) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        accionIva10_5(e);
        accionIva21(e);
        accionIva27(e);
    }

    public void accionIva10_5(ItemEvent e) {

        if (editVista.checkBoxIVA10.isSelected()) {
            if (!verificarNeto()) {

                double valor = Double.parseDouble(editVista.txtImpNetoGrav.getText());
                double porcentaje = valor * 0.105;
                String ivaConPunto = String.format("%.2f", (porcentaje));
                editVista.txtIvaFact.setText(ivaConPunto.replaceAll("\\,", "."));
            } else {
                JOptionPane.showMessageDialog(null, "El Impuesto Neto esta vacio", "Error al calcular IVA", 3);
            }
        } else {
            // Establecer el JTextField en cero
            editVista.txtIvaFact.setText(".00");

        }
    }

    public void accionIva21(ItemEvent e) {

        if (editVista.checkBoxIVA21.isSelected()) {
            if (!verificarNeto()) {

                double valor = Double.parseDouble(editVista.txtImpNetoGrav.getText());
                double porcentaje = valor * 0.21;
                String ivaConPunto = String.format("%.2f", (porcentaje));
                editVista.txtIvaFact21.setText(ivaConPunto.replaceAll("\\,", "."));

            } else {
                JOptionPane.showMessageDialog(null, "El Impuesto Neto esta vacio", "Error al calcular IVA", 3);
            }
        } else {
            // Establecer el JTextField en cero
            editVista.txtIvaFact21.setText(".00");
        }

    }

    public void actualizarTotalConIVA(double totalImpFact, double iva, JTextField txtIva) {
        if (!".00".equals(txtIva.getText())) {

        }
    }

    public void accionIva27(ItemEvent e) {
        if (editVista.checkBoxIVA27.isSelected()) {
            if (!verificarNeto()) {

                double valor = Double.parseDouble(editVista.txtImpNetoGrav.getText());
                double porcentaje = valor * 0.27;
                String ivaConPunto = String.format("%.2f", (porcentaje));
                editVista.txtIvaFac27.setText(ivaConPunto.replaceAll("\\,", "."));
            } else {
                JOptionPane.showMessageDialog(null, "El Impuesto Neto esta vacio", "Error al calcular IVA", 3);
            }
        } else {
            // Establecer el JTextField en cero
            editVista.txtIvaFac27.setText(".00");

        }
    }

    public void deshabilitarCamposIva() {
        editVista.txtIvaFact.setEditable(false);
        editVista.txtIvaFact21.setEditable(false);
        editVista.txtIvaFac27.setEditable(false);
    }

    /*Método para verificar que haya escrito valor en neto*/
    public boolean verificarNeto() {
        return editVista.txtImpNetoGrav.getText().equals("");
    }

    /*Método donde se le aplica evento DocumentListener a txt Imp. Total Fact.*/
    public void addDocumentListenerTotalFact() {
        editVista.txtImpTotalFact.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {

            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSum();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }
        });
    }

    /*Método que suma instantaniamente los campos y actualiza el campo imp. total facturado*/
    private void updateSum() {
        double sum = 0;
        for (int i = 0; i < textFields.length; i++) {
            try {
                double value = Double.parseDouble(textFields[i].getText());
                sum += value;
            } catch (NumberFormatException e) {

            }
        }
        final double totalSum = sum;

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                editVista.txtImpTotalFact.setText(String.format("%.2f", totalSum));
            }
        });
    }

}
