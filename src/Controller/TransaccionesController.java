package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCompraVentaIVA;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryTipoCategoria;
import Consultas.QueryTipoCuenta;
import Consultas.QueryTransaccion;
import Model.Categoria;
import Model.CompraVentaIva;
import Model.EmpresaOrden;
import Model.PromptComboBoxRenderer;
import Model.SubCategoria;
import Model.TipoCategoria;
import Model.TipoCuenta;
import Model.Transaccion;
import View.FormComprasVentasIVA;
import View.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class TransaccionesController implements ActionListener {

    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QueryTipoCuenta queryTCuenta = new QueryTipoCuenta();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryTipoCategoria queryTCat = new QueryTipoCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();

    Transacciones transacciones = new Transacciones();

    QueryTransaccion queryTransaccion = new QueryTransaccion();

    private static TransaccionesController tSingleton;

    int id_new_transaccion = queryTransaccion.obtenerMaxId() + 1;

    /* todo cvi*/
    FormComprasVentasIVA formCVI = new FormComprasVentasIVA();
    QueryTransaccion queryT = new QueryTransaccion();
    QueryCompraVentaIVA queryCVI = new QueryCompraVentaIVA();
    private int id_transaccion;

    public TransaccionesController() {
        iniciarCamposEnCero();
        iniciarTabla();
        this.transacciones.cbbCuentas.addActionListener(this);

        this.transacciones.btnCompraVentasIVA.addActionListener(this);
        this.transacciones.cbbCategorias.addActionListener(this);

        /*TODO CVI*/
        setearCamosEnCeroCVI();
        iniciarComboBoxEmpresaCVI();
        //iniciarComboBoxCuit();
        iniciarComboBoxOperacion();

        this.formCVI.cbbEmpresa.addActionListener(this);
        formCVI.labelIdTransaccion.setText(String.valueOf(queryT.obtenerMaxId()));

        this.formCVI.btnFinalizar.addActionListener(this);
        this.transacciones.btnSaveSinIva.addActionListener(this);

        transacciones.labelNumT.setText(String.valueOf(id_new_transaccion));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            accionTipoCuenta(e);
            accionEmpresa(e);
            loadComprasVentas(e);
            accionCompraVenta(e);
            guardarSinIva(e);
            accionTipoCategoria(e);
        } catch (ParseException ex) {
            Logger.getLogger(TransaccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadNewTransaccion() {
        transacciones.setVisible(true);
        transacciones.setLocationRelativeTo(null);
    }

    public void iniciarComboBoxTipoCuenta() {
        ArrayList<TipoCuenta> listTipoCuentas = queryTCuenta.listarTipoCuentas();
        transacciones.cbbTipoCuenta.removeAllItems();
        TipoCuenta t = new TipoCuenta();
        t.setNombre("");
        listTipoCuentas.add(0, t);
        for (TipoCuenta tc : listTipoCuentas) {
            transacciones.cbbTipoCuenta.addItem(tc.getNombre());
        }
    }

    public void accionTipoCuenta(ActionEvent e) {
        if (e.getSource() == transacciones.cbbCuentas) {
            int id_tipo_cuenta = queryCuentas.obtenerIdTipoCuenta2((String) transacciones.cbbCuentas.getSelectedItem());
            transacciones.cbbTipoCuenta.setSelectedItem(queryCuentas.obtenerNombreTipoCuenta(id_tipo_cuenta));
        }
    }

    public void iniciarComboBoxCuentas() {

        transacciones.cbbCuentas.removeAllItems();

        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for (String c : nombreCuentas) {
            transacciones.cbbCuentas.addItem(c);
        }
        transacciones.cbbCuentas.setRenderer(new PromptComboBoxRenderer("Pago Con..."));
        transacciones.cbbCuentas.setSelectedIndex(-1);
        AutoCompleteDecorator.decorate(transacciones.cbbCuentas);

    }

    public void iniciarComboBoxTipoCategoria() {
        transacciones.cbbTipoCategoria.removeAllItems();
        ArrayList<TipoCategoria> listTipoCategoria = queryTCat.listarTiposCat();
        TipoCategoria t = new TipoCategoria();
        t.setNombre("");
        listTipoCategoria.add(0, t);
        for (TipoCategoria tcc : listTipoCategoria) {
            transacciones.cbbTipoCategoria.addItem(tcc.getNombre());
        }
    }

    public void iniciarComboBoxCategoria() {
        transacciones.cbbCategorias.removeAllItems();
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        Categoria c = new Categoria();
        c.setNombre("");
        listCategoria.add(0, c.getNombre());
        for (String cat : listCategoria) {
            transacciones.cbbCategorias.addItem(cat);
        }
        AutoCompleteDecorator.decorate(transacciones.cbbCategorias);

    }

    public void iniciarcomboBoxSubcategoria() {
        transacciones.cbbSubCategoria.removeAllItems();
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        SubCategoria subca = new SubCategoria();
        subca.setNombre("");
        listSubCategoria.add(0, subca);
        for (SubCategoria subCat : listSubCategoria) {
            transacciones.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }

    public void iniciarComboBoxEmpresa() {
        transacciones.cbbEmpresa.removeAllItems();
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        listEmpresas.add(0, e.getNombre());
        for (String emp : listEmpresas) {
            transacciones.cbbEmpresa.addItem(emp);
        }
        AutoCompleteDecorator.decorate(transacciones.cbbEmpresa);

    }

    public void iniciarTabla() {
        ArrayList<Transaccion> listTransac = queryTransaccion.listarTransacciones();
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 1 && columna == 2 && columna == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A impuesto IVA");
        modelo.addColumn("A IVA");

        transacciones.tablaTransacciones.setRowHeight(15);
        transacciones.tablaTransacciones.setModel(modelo);
        transacciones.tablaTransacciones.setRowHeight(25);

        for (Transaccion t : listTransac) {
            String[] dato = new String[7];
            dato[0] = t.getFecha().toString();
            dato[1] = t.getDescripcion();
            dato[2] = "$" + String.valueOf(t.getSalida());
            dato[3] = "$" + String.valueOf(t.getEntrada());
            dato[4] = convertAImpues(String.valueOf(t.isA_impuesto()));
            dato[5] = convertAIVA(String.valueOf(t.isA_iva()));
            modelo.addRow(dato);
        }

    }

    public String convertAImpues(String a_imp) {
        if (a_imp.equals("true")) {
            return "Si";
        } else {
            if (a_imp.equals("false")) {
                return "No";
            }
        }
        return "";
    }

    public String convertAIVA(String a_iva) {
        if (a_iva.equals("true")) {
            return "Si";
        } else {
            if (a_iva.equals("false")) {
                return "No";
            }
        }
        return "";
    }

    public void loadComprasVentas(ActionEvent e) throws ParseException {
        if (e.getSource() == transacciones.btnCompraVentasIVA) {
            if (!verificarVacios()) {
                if (!queryTransaccion.verificarCodigoT(obtenerTransaccion().getCodigo())) {
                    if (!queryTransaccion.verificarNumFactura(obtenerTransaccion().getNumFactura()) || !queryTransaccion.verificarNumCheque(obtenerTransaccion().getNumCheque())) {
                        loadComVentaIva(obtenerTransaccion().getIdOrdenEmp());
                        setearCamosEnCeroCVI();
                        formCVI.labelIdTransaccion.setText(String.valueOf(id_new_transaccion));
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> El N° de Factura o el N° de Cheque ingresado</p/</html>\n"
                                + "<html><p style = \"font:14px\"> ya se escuentra en el sistema.</p/</html>\n"
                                + "<html><p style = \"font:14px\">Verifique nuevamente.</p/</html>", "Error al guardar transacción", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> Error al continuar con la Transacción - Ya existe codigo</p/</html>");
                }
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> Error al continuar con la Transacción - Campos incompletos.</p/</html> \n"
                        + "<html><p style = \"font:12px\"> Verifique algunas de las siguientes opciones: </p/</html> \n"
                        + "<html><p style = \"font:12px\">1) Haya seleccionado una cuenta.</p/</html> \n"
                        + "<html><p style = \"font:12px\">2) Haya seleccionado un tipo de categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">3) Haya seleccionado un tipo de cuenta.</p/</html> \n"
                        + "<html><p style = \"font:12px\">4) Haya seleccionado una fecha.</p/</html> \n"
                        + "<html><p style = \"font:12px\">5) Haya seleccionado una empresa/orden.</p/</html> \n"
                        + "<html><p style = \"font:12px\">6) Haya seleccionado una categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">7) Haya seleccionado una sub-categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">8) Haya escrito una descripción.</p/</html>\n"
                        + "<html><p style = \"font:12px\">9) Haya escrito un numero de cheque o numero de factura. </p/</html>", "ERROR, VERIFIQUE CAMPOS", 0
                );
            }
        }
    }

    /*Para guardar transaccion sin IVA*/
    public void guardarSinIva(ActionEvent e) throws ParseException {
        if (e.getSource() == transacciones.btnSaveSinIva) {
            if (!verificarVacios()) {
                if (!queryTransaccion.verificarCodigoT(obtenerTransaccion().getCodigo())) {
                    if (!queryTransaccion.verificarNumFactura(obtenerTransaccion().getNumFactura()) || !queryTransaccion.verificarNumCheque(obtenerTransaccion().getNumCheque())) {
                        queryTransaccion.addTransaccion(obtenerTransaccion());
                        JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\">Transacción registrada correctamente</p/</html>");
                        iniciarTabla();
                        setearCamposEnCero();
                        transacciones.labelNumT.setText(String.valueOf(queryTransaccion.obtenerMaxId() + 1));
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> El N° de Factura o el N° de Cheque ingresado</p/</html>\n"
                                + "<html><p style = \"font:14px\"> ya se escuentra en el sistema.</p/</html>\n"
                                + "<html><p style = \"font:14px\">Verifique nuevamente.</p/</html>", "Error al guardar transacción", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> Error al continuar con la Transacción - Ya existe codigo</p/</html>");
                }
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> Error al continuar con la Transacción - Campos incompletos.</p/</html> \n"
                        + "<html><p style = \"font:12px\"> Verifique algunas de las siguientes opciones: </p/</html> \n"
                        + "<html><p style = \"font:12px\">1) Haya seleccionado una cuenta.</p/</html> \n"
                        + "<html><p style = \"font:12px\">2) Haya seleccionado un tipo de categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">3) Haya seleccionado un tipo de cuenta.</p/</html> \n"
                        + "<html><p style = \"font:12px\">4) Haya seleccionado una fecha.</p/</html> \n"
                        + "<html><p style = \"font:12px\">5) Haya seleccionado una empresa/orden.</p/</html> \n"
                        + "<html><p style = \"font:12px\">6) Haya seleccionado una categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">7) Haya seleccionado una sub-categoria.</p/</html> \n"
                        + "<html><p style = \"font:12px\">8) Haya escrito una descripción.</p/</html>\n"
                        + "<html><p style = \"font:12px\">9) Haya escrito un numero de cheque o numero de factura. </p/</html>", "ERROR, VERIFIQUE CAMPOS", 0
                );
            }
        }

    }

    public void updateComboBoxCategoria(ArrayList<Categoria> listCat) {
        ArrayList<Categoria> listCategoria = listCat;
        for (Categoria cat : listCategoria) {
            transacciones.cbbCategorias.addItem(cat.getNombre());
        }
    }

    public void accionTipoCategoria(ActionEvent e) {
        if (e.getSource() == transacciones.cbbCategorias) {
            int id_tipo_categoria = queryCategoria.obtenerIdTipoCat((String) transacciones.cbbCategorias.getSelectedItem());

            transacciones.cbbTipoCategoria.setSelectedItem(queryCategoria.obtenerNombreTipoCat(id_tipo_categoria));
        }
    }

    /*Es para qe no pueda modificar el tipo de cuenta para la cuenta correspondiente y
    para que no pueda modificar el tipo de categoria para la categoria correspondiente.
     */
    public void deshabilitarComboBox() {
        transacciones.cbbTipoCategoria.setEnabled(false);
        transacciones.cbbTipoCategoria.setEditable(false);
    }

    /*Método para crear el objeto transacción*/
    public Transaccion obtenerTransaccion() throws ParseException {
        Transaccion t = new Transaccion();

        t.setCodigo("T-" + queryT.obtenerMaxId());

        t.setIdCuenta(queryCuentas.obtenerIdCuentaPorNombre((String) transacciones.cbbCuentas.getSelectedItem()));

        t.setNumFactura(evaluarNumFact(transacciones.txtTipoFact.getText(), transacciones.txtNumFact.getText()));

        t.setNumCheque(transacciones.txtNumCheque.getText()); //Puede ser numCheque o

        java.sql.Date sqlDate = new java.sql.Date(transacciones.txtFecha.getDate().getTime());
        t.setFecha(sqlDate);

        t.setDescripcion(transacciones.txtDescripcion.getText());

        t.setIdOrdenEmp(queryEO.obtenerIdEmpresaPorNombre((String) transacciones.cbbEmpresa.getSelectedItem()));

        t.setCantidad(parseInt(transacciones.txtCantidad.getText()));

        t.setIdCat(queryCategoria.obtenerIdCatePorNombre((String) transacciones.cbbCategorias.getSelectedItem()));

        t.setIdSubCat(querySubCat.obtenerIdSubCatPorNombre((String) transacciones.cbbSubCategoria.getSelectedItem()));

        t.setSalida(Float.parseFloat(transacciones.txtSalida.getText()));

        t.setEntrada(Float.parseFloat(transacciones.txtEntrada.getText()));

        t.setA_impuesto(obtenerSetImpuesto());

        t.setA_iva(a_iva());

        return t;
    }

    public boolean obtenerSetImpuesto() {
        if (transacciones.cbbImp.getSelectedItem() == "Sí") {
            return true;
        }
        return false;
    }

    public boolean a_iva() {
        if (transacciones.checkAIva.isSelected()) {
            return true;
        }
        return false;
    }

    public boolean verificarVacios() {
        if (transacciones.cbbCuentas.getRenderer().equals("Pago Con...")
                || transacciones.cbbTipoCategoria.getSelectedItem().equals("")
                || transacciones.cbbTipoCuenta.getSelectedItem().equals("")
                || transacciones.txtFecha.getDate() == null
                || transacciones.cbbEmpresa.getSelectedItem().equals("")
                || transacciones.cbbCategorias.getSelectedItem().equals("")
                || transacciones.cbbSubCategoria.getSelectedItem().equals("")
                || transacciones.txtDescripcion.getText().equals("")
                || transacciones.txtNumCheque.getText().equals("")
                && (transacciones.txtNumFact.getText().equals("")
                || transacciones.txtTipoFact.getText().equals(""))) {
            return true;
        }
        return false;
    }

    public void iniciarCamposEnCero() {
        transacciones.txtCantidad.setText("0");
        transacciones.txtSalida.setText("0");
        transacciones.txtEntrada.setText("0");
        transacciones.txtNumCheque.setText("");
        transacciones.txtTipoFact.setText("");
        transacciones.txtNumFact.setText("");

    }

    public void setearCamposEnCero() {
        transacciones.txtCantidad.setText("0");
        transacciones.txtSalida.setText("0");
        transacciones.txtEntrada.setText("0");
        transacciones.txtNumCheque.setText("");
        transacciones.txtTipoFact.setText("");
        transacciones.txtNumFact.setText("");
        iniciarComboBoxTipoCuenta();
        iniciarComboBoxTipoCategoria();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarcomboBoxSubcategoria();
        iniciarComboBoxEmpresa();
        transacciones.txtFecha.setDate(null);
        transacciones.txtDescripcion.setText("");
        transacciones.checkAIva.setSelected(false);
    }

    public void iniciarTablaMain() {
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A impuesto IVA");
        modelo.addColumn("A IVA");

        transacciones.tablaTransacciones.setRowHeight(15);
        transacciones.tablaTransacciones.setModel(modelo);
        transacciones.tablaTransacciones.setRowHeight(25);

    }

    /* Todo compra venta IVA*/
    public void loadComVentaIva(int IdEmpresa) {
        formCVI.setVisible(true);
        formCVI.setLocationRelativeTo(null);
        formCVI.cbbEmpresa.setSelectedItem(obtenerEmpresa(IdEmpresa).getNombre());
               
        iniciarComboBoxCuit(obtenerEmpresa(IdEmpresa).getCuit());
    }
    
    public EmpresaOrden obtenerEmpresa(int idEmpresa){
        return queryEO.obtenerEmpresaPorId(idEmpresa);   
    }
    
    public void iniciarComboBoxEmpresaCVI() {

        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        listEmpresas.add(0, e.getNombre());
        for (String emp : listEmpresas) {
            formCVI.cbbEmpresa.addItem(emp);
        }
    }

    public void iniciarComboBoxOperacion() {
        formCVI.cbbOperacion.removeAllItems();
        formCVI.cbbOperacion.addItem("");
        formCVI.cbbOperacion.addItem("Venta");
        formCVI.cbbOperacion.addItem("Compra");
        formCVI.cbbOperacion.addItem("Banco");

    }

    /*Muestra el cuit y el nombre de la empresa juntos*/
    public void iniciarComboBoxCuit(String cuit) {
        formCVI.cbbCuitEmpresa.removeAllItems();
        ArrayList<EmpresaOrden> listEmpresas = queryEO.listarEmpresaOrden();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        e.setCuit("");
        listEmpresas.add(0, e);
        for (EmpresaOrden emp : listEmpresas) {
            formCVI.cbbCuitEmpresa.addItem(emp.getCuit());
        }
        formCVI.cbbCuitEmpresa.setSelectedItem(cuit);
    }

    public void accionEmpresa(ActionEvent e) {
        if (e.getSource() == formCVI.cbbEmpresa) {
            String cuit = queryEO.obtenerCuitPorNombre(formCVI.cbbEmpresa.getSelectedItem().toString());
            formCVI.cbbCuitEmpresa.setSelectedItem(cuit);
        }
    }

    public void accionCompraVenta(ActionEvent e) throws ParseException {
        if (e.getSource() == formCVI.btnFinalizar) {
            if (!verificarBlancos()) {
                queryTransaccion.addTransaccion(obtenerTransaccion());
                iniciarTabla();
                queryCVI.agregarCompraVenta(newCompraVenta());
                JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> El registro se efectuó correctamente </p/</html> \n", "Operación Finalizada", 1);
                setearCamosEnCeroCVI();
                formCVI.setVisible(false);
                setearCamposEnCero();
                transacciones.labelNumT.setText(String.valueOf(queryTransaccion.obtenerMaxId() + 1));
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"font:14px\"> Error - Campos incompletos.</p/</html> \n"
                        + "<html><p style = \"font:12px\">Verifique que: </p/</html>\n"
                        + "<html><p style = \"font:12px\">1) Haya seleccionado una Fecha </p/</html>\n"
                        + "<html><p style = \"font:12px\">2) Haya seleccionado la Operación correspondiente </p/</html>\n"
                        + "<html><p style = \"font:12px\">3) Haya escrito un Tipo de Comprobante </p/</html>\n"
                        + "<html><p style = \"font:12px\">4) Haya escrito un Numero de Comprobante </p/</html>\n"
                        + "<html><p style = \"font:12px\">5) Haya seleccionado una Empresa/Orden </p/</html> \n"
                        + "<html><p style = \"font:12px\">¡ Una vez completado los campos faltantes </p/</html> \n"
                        + "<html><p style = \"font:12px\">  presione nuevamente el boton Finalizar Operación !</p/</html>"
                        + "", "Eror - Verifique", 0);
            }
        }

    }

    public CompraVentaIva newCompraVenta() throws ParseException {
        CompraVentaIva cvi = new CompraVentaIva();

        String operacion = (String) formCVI.cbbOperacion.getSelectedItem();
        cvi.setOperacion(operacion.toLowerCase());

        java.sql.Date sqlDate = new java.sql.Date(formCVI.txtFecha.getDate().getTime());
        cvi.setFecha(sqlDate);

        cvi.setTipo_comprobante(formCVI.txtTipoComprobante.getText());

        cvi.setNumComprobante(formCVI.txtNumComprobante.getText());

        cvi.setEmpresa((String) formCVI.cbbEmpresa.getSelectedItem());

        cvi.setCuit((String) formCVI.cbbCuitEmpresa.getSelectedItem());

        NumberFormat f = NumberFormat.getInstance();

        cvi.setImp_neto_grav(Float.parseFloat(verificarBlanco(formCVI.txtImpNetoGrav.getText())));

        cvi.setIva_facturado(Float.parseFloat(verificarBlanco(formCVI.txtIvaFact.getText())));

        cvi.setImp_interno(Float.parseFloat(verificarBlanco(formCVI.txtImpInterno.getText())));

        cvi.setConcep_no_grav(Float.parseFloat(verificarBlanco(formCVI.txtConceptoNoGrav.getText())));

        cvi.setPercepcion_iva(Float.parseFloat(verificarBlanco(formCVI.txtPercepcionIVA.getText())));

        cvi.setRet_ganancias(Float.parseFloat(verificarBlanco(formCVI.txtRetGanan.getText())));

        cvi.setPerc_iibb_compra(Float.parseFloat(verificarBlanco(formCVI.txtPercIvaC.getText())));

        cvi.setImp_total_fact(Float.parseFloat(verificarBlanco(formCVI.txtImpTotalFact.getText())));

        cvi.setIte_iva_dere_reg(Float.parseFloat(verificarBlanco(formCVI.txtIvaDereReg.getText())));

        cvi.setC_no_grav_sellos(Float.parseFloat(verificarBlanco(formCVI.txtCNoGravSellos.getText())));

        cvi.setRet_iibb_venta(Float.parseFloat(verificarBlanco(formCVI.txtRetIiBbV.getText())));

        cvi.setIva_rg_212(Float.parseFloat(verificarBlanco(formCVI.txtIvaRg212.getText())));

        cvi.setGrav_ley_25413(Float.parseFloat(verificarBlanco(formCVI.txtGravLey25413.getText())));

        cvi.setInt_numerales(Float.parseFloat(verificarBlanco(formCVI.txtIntNumerales.getText())));

        cvi.setOtros(Float.parseFloat(verificarBlanco(formCVI.txtOtros.getText())));

        cvi.setIdTransaccion(queryT.obtenerMaxId());

        cvi.setOperaciones_exentas(Float.parseFloat(verificarBlanco(formCVI.txtOpExentas.getText())));

        cvi.setIng_brutos(Float.parseFloat(verificarBlanco(formCVI.txtIngBrutos.getText())));

        cvi.setRet_iva(Float.parseFloat(verificarBlanco(formCVI.txtRetIva.getText())));

        cvi.setImp_r_ing_brutos(Float.parseFloat(verificarBlanco(formCVI.txtImpRIngBrutos.getText())));

        cvi.setIva_facturado_21(Float.parseFloat(verificarBlanco(formCVI.txtIvaFact21.getText())));

        cvi.setIva_facturado_27(Float.parseFloat(verificarBlanco(formCVI.txtIvaFact27.getText())));

        return cvi;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public void setearCamosEnCeroCVI() {
        //iniciarComboBoxCuit();
        iniciarComboBoxEmpresaCVI();
        iniciarComboBoxOperacion();
        formCVI.txtFecha.setDate(null);
        formCVI.txtTipoComprobante.setText("");
        formCVI.txtNumComprobante.setText("0");
        formCVI.txtImpNetoGrav.setText("0.0");
        formCVI.txtIvaFact.setText("0.0");
        formCVI.txtImpInterno.setText("0.0");
        formCVI.txtConceptoNoGrav.setText("0.0");
        formCVI.txtPercepcionIVA.setText("0.0");
        formCVI.txtRetGanan.setText("0.0");
        formCVI.txtPercIvaC.setText("0.0");
        formCVI.txtImpTotalFact.setText("0.0");
        formCVI.txtIvaDereReg.setText("0.0");
        formCVI.txtCNoGravSellos.setText("0.0");
        formCVI.txtRetIiBbV.setText("0.0");
        formCVI.txtIvaRg212.setText("0.0");
        formCVI.txtGravLey25413.setText("0.0");
        formCVI.txtIntNumerales.setText("0.0");
        formCVI.txtOtros.setText("0.0");
        formCVI.txtOpExentas.setText("0.0");
        formCVI.txtIngBrutos.setText("0.0");
        formCVI.txtRetIva.setText("0.0");
        formCVI.txtImpRIngBrutos.setText("0.0");
        formCVI.txtIvaFact21.setText("0.0");
        formCVI.txtIvaFact27.setText("0.0");
    }

    public boolean verificarBlancos() {
        if (formCVI.txtFecha.getDate() == null || formCVI.cbbOperacion.getSelectedItem().equals("")
                || formCVI.txtTipoComprobante.getText().equals("")
                || formCVI.txtNumComprobante.getText().equals("")
                || formCVI.cbbEmpresa.getSelectedItem().equals("")) {
            return true;
        }
        return false;
    }

    public String verificarBlanco(String numero) {
        if (numero.equals("")) {
            return "0";
        } else {
            return numero;
        }
    }

    /* Método para evitar guión cuando no pone numero de factura*/
    public String evaluarNumFact(String tipo, String numFact) {
        if ("".equals(numFact)) {
            return "";
        } else {
            numFact = tipo.toUpperCase() + "-" + numFact;
            return numFact;
        }
    }
}
