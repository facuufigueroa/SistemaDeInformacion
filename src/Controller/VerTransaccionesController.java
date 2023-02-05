package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryVerTransacciones;
import Model.CompraVentaIva;
import Model.SubCategoria;
import Model.Transaccion;
import View.EditView;
import View.FormVerTransacciones;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Float.parseFloat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerTransaccionesController implements ActionListener {

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

    public VerTransaccionesController(MenuPrincipal menu) {
        updateTabla(listT);
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
        try {
            accionEditarCVI(e);
            accionEditTransaccion(e);
            accionEditarTransaccion(e);
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
                if (columna == 1 && columna == 2 && columna == 3) {
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
        //modelo.addColumn("Empresa / Orden");

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
        for (Transaccion t : listT) {
            String[] dato = new String[10];
            int id = t.getIdTransaccion();
            dato[0] = String.valueOf(id);
            dato[1] = t.getCodigo().toString();
            dato[2] = t.getFecha().toString();
            dato[3] = t.getDescripcion();
            dato[4] = String.valueOf(t.getCantidad());
            dato[5] = "$" + String.valueOf((float) t.getSalida());
            dato[6] = "$" + String.valueOf(t.getEntrada());
            dato[7] = cambiarFormatoIVA(t.isA_impuesto());
            dato[8] = cambiarFormatoIVA(t.isA_iva());
            String empresa = queryVerT.obtenerEmpresa(t.getIdOrdenEmp());
            dato[7] = empresa;
            modelo.addRow(dato);
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
                formVerT.txtBusqueda.setText(categoria);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
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
                formVerT.txtBusqueda.setText(subcategoria);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
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
                formVerT.txtBusqueda.setText(cuenta);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
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
                formVerT.txtBusqueda.setText(empresa);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas());
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }

    public String obtenerSumaEntradas() {
        String entradasString = "";
        float entradas = (float) 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {

            String entradaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 6)).toString().substring(1);
            entradas += parseFloat(entradaSin$);
        }
        entradasString = "$" + String.valueOf(entradas);
        return entradasString;
    }

    public String obtenerSumaSalidas() {
        String salidasString = "";
        float salidas = (float) 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {

            String salidaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 5)).toString().substring(1);
            salidas += parseFloat(salidaSin$);
        }
        salidasString = "$" + String.valueOf(salidas);
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

        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);

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

    public void accionEditarTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == formVerT.btnEditar) {
            CompraVentaIva cvi = new CompraVentaIva();
            Transaccion t = new Transaccion();
            int fila = formVerT.tablaVerTransacciones.getSelectedRow();
            if (fila >= 0) {
                
                    t.setIdTransaccion(Integer.parseInt((String) formVerT.tablaVerTransacciones.getValueAt(fila, 0)));
                    String fecha = (String) formVerT.tablaVerTransacciones.getValueAt(fila, 2);
                    t.setFecha(java.sql.Date.valueOf(fecha));


                    String salida = formVerT.tablaVerTransacciones.getValueAt(fila, 5).toString();

                    t.setSalida(Float.parseFloat(salida.substring(1)));

                    String entrada = formVerT.tablaVerTransacciones.getValueAt(fila, 6).toString();
                    t.setEntrada(Float.parseFloat(entrada.substring(1)));

                    mensajeVerificacion(t.getIdTransaccion());    

                    editVista.labelNumT.setText(String.valueOf(t.getIdTransaccion()));
                    editVista.txtFechaT.setDate(t.getFecha());
                    editVista.txtSalidas.setText(String.valueOf(t.getSalida()));
                    editVista.txtEntradas.setText(String.valueOf(t.getEntrada()));


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
        editVista.txtImpNetoGrav.setText(String.valueOf(cvi.getImp_neto_grav()));
        editVista.txtIvaFact.setText(String.valueOf(cvi.getIva_facturado()));
        editVista.txtImpInterno.setText(String.valueOf(cvi.getImp_interno()));
        editVista.txtConceptoNoGrav.setText(String.valueOf(cvi.getConcep_no_grav()));
        editVista.txtPercepcionIVA.setText(String.valueOf(cvi.getPercepcion_iva()));
        editVista.txtRetGanan.setText(String.valueOf(cvi.getRet_ganancias()));
        editVista.txtPercIvaC.setText(String.valueOf(cvi.getPerc_iibb_compra()));
        editVista.txtImpTotalFact.setText(String.valueOf(cvi.getImp_total_fact()));
        editVista.txtIvaDereReg.setText(String.valueOf(cvi.getIte_iva_dere_reg()));
        editVista.txtCNoGravSellos.setText(String.valueOf(cvi.getC_no_grav_sellos()));
        editVista.txtRetIiBbV.setText(String.valueOf(cvi.getRet_iibb_venta()));
        editVista.txtIvaRg212.setText(String.valueOf(cvi.getIva_rg_212()));
        editVista.txtGravLey25413.setText(String.valueOf(cvi.getGrav_ley_25413()));
        editVista.txtIntNumerales.setText(String.valueOf(cvi.getInt_numerales()));
        editVista.txtOpExentas.setText(String.valueOf(cvi.getOperaciones_exentas()));
        editVista.txtIngBrutos.setText(String.valueOf(cvi.getIng_brutos()));
        editVista.txtRetIva.setText(String.valueOf(cvi.getRet_iva()));
        editVista.txtImpRIngBrutos.setText(String.valueOf(cvi.getImp_r_ing_brutos()));
        editVista.txtOtros.setText(String.valueOf(cvi.getOtros()));
        editVista.txtIvaFact21.setText(String.valueOf(cvi.getIva_facturado_21()));
    }

    public void accionEditTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == editVista.btnModificarT) {
            if (editVista.txtFechaT.getDate() != null) {
                Transaccion t = new Transaccion();
                java.sql.Date sqlDate = new java.sql.Date(editVista.txtFechaT.getDate().getTime());
                t.setFecha(sqlDate);
                NumberFormat f1 = NumberFormat.getInstance();
                NumberFormat f2 = NumberFormat.getInstance();
                t.setSalida((float) f1.parse(verificarBlanco(editVista.txtSalidas.getText())).floatValue());
                t.setEntrada((float) f2.parse(verificarBlanco(editVista.txtEntradas.getText())).floatValue());
                queryVerT.modificarTransaccion(t, Integer.parseInt(editVista.labelNumT.getText()));
                JOptionPane.showMessageDialog(null, "Transacción N° " + editVista.labelNumT.getText() + " modificada");

                iniciarTabla2();
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

        cvi.setImp_neto_grav((float) f.parse(verificarBlanco(editVista.txtImpNetoGrav.getText())).doubleValue());

        cvi.setIva_facturado((float) f.parse(verificarBlanco(editVista.txtIvaFact.getText())).doubleValue());

        cvi.setImp_interno((float) f.parse(verificarBlanco(editVista.txtImpInterno.getText())).doubleValue());

        cvi.setConcep_no_grav((float) f.parse(verificarBlanco(editVista.txtConceptoNoGrav.getText())).doubleValue());

        cvi.setPercepcion_iva((float) f.parse(verificarBlanco(editVista.txtPercepcionIVA.getText())).doubleValue());

        cvi.setRet_ganancias((float) f.parse(verificarBlanco(editVista.txtRetGanan.getText())).doubleValue());

        cvi.setPerc_iibb_compra((float) f.parse(verificarBlanco(editVista.txtPercIvaC.getText())).doubleValue());

        cvi.setImp_total_fact((float) f.parse(verificarBlanco(editVista.txtImpTotalFact.getText())).doubleValue());

        cvi.setIte_iva_dere_reg((float) f.parse(verificarBlanco(editVista.txtIvaDereReg.getText())).doubleValue());

        cvi.setC_no_grav_sellos((float) f.parse(verificarBlanco(editVista.txtCNoGravSellos.getText())).doubleValue());

        cvi.setRet_iibb_venta((float) f.parse(verificarBlanco(editVista.txtRetIiBbV.getText())).doubleValue());

        cvi.setIva_rg_212((float) f.parse(verificarBlanco(editVista.txtIvaRg212.getText())).doubleValue());

        cvi.setGrav_ley_25413((float) f.parse(verificarBlanco(editVista.txtGravLey25413.getText())).doubleValue());

        cvi.setInt_numerales((float) f.parse(verificarBlanco(editVista.txtIntNumerales.getText())).doubleValue());

        cvi.setOtros((float) f.parse(verificarBlanco(editVista.txtOtros.getText())).doubleValue());

        cvi.setIdTransaccion(Integer.parseInt(editVista.labelNumT.getText()));

        cvi.setOperaciones_exentas((float) f.parse(verificarBlanco(editVista.txtOpExentas.getText())).doubleValue());

        cvi.setIng_brutos((float) f.parse(verificarBlanco(editVista.txtIngBrutos.getText())).doubleValue());

        cvi.setRet_iva((float) f.parse(verificarBlanco(editVista.txtRetIva.getText())).doubleValue());

        cvi.setImp_r_ing_brutos((float) f.parse(verificarBlanco(editVista.txtImpRIngBrutos.getText())).doubleValue());
        cvi.setIva_facturado_21((float) f.parse(verificarBlanco(editVista.txtIvaFact21.getText())).doubleValue());

        
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
                    JOptionPane.showMessageDialog(null,"<html><p style = \"font:15px\">La Transacción: "+formVerT.tablaVerTransacciones.getValueAt(fila, 0).toString() + " se ha eliminado");
                    iniciarTabla2();
                    
                } else if (eleccion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"font:15px\">Se ha cancelado operación</p></html>","Se canceló operación",1);
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
    
    public void accionActualizar(ActionEvent e){
        if(e.getSource() == formVerT.btnActualizar){
            iniciarTabla2();
        }
    }
    
    
    /*Método para aquellas transacciones que no se le discriminó el IVA, entonces muestra un texto*/
    public void mensajeVerificacion(int idTransaccion){
          if(!queryVerT.existeIdTransaccioncvi(idTransaccion)){
              editVista.labelVerificacion.setText("No se discriminó COMPRA_VENTA_IVA para esta Transacción.");
              editVista.btnModificarCVI.setEnabled(false);
          }   
          else{
              editVista.labelVerificacion.setText("");
              editVista.btnModificarCVI.setEnabled(true);
          }
      
    }
}
