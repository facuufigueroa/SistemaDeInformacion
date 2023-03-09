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
import Paginacion.Paginacion;
import View.MenuPrincipal;
import View.VerInfoTransaccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class HistoricoTransaccionController implements ActionListener {
    
    private final MenuPrincipal menu;
    private Paginacion paginacion = new Paginacion();
    VerInfoTransaccion infoView = new VerInfoTransaccion();
    QueryVerTransacciones queryVerT = new QueryVerTransacciones();
    DecimalFormat formato = new DecimalFormat("#,###.00");
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    
    public HistoricoTransaccionController(MenuPrincipal menuP) {
        this.menu = menuP;
        this.menu.btnAnterior.addActionListener(this);
        this.menu.btnSiguiente.addActionListener(this);
        DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(1, 80), paginacion.ColumNames());
        this.menu.tablaTH.setModel(datos);
        this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        this.menu.tablaTH.setRowHeight(25);
        
        this.menu.btnVerInfo.addActionListener(this);
        this.infoView.btnEditT.addActionListener(this);
        this.infoView.btnEditCvi.addActionListener(this);
        iniciarComboBox();
        this.infoView.cbbCuenta.addActionListener(this);
        this.infoView.cbbCategoria.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            accionBtnAnterior(e);
            accionBtnSiguiente(e);
            accionCbbCuenta(e);
            accionCbbCategoria(e);
            accionVerTransaccion(e);
            accionEditTransaccion(e);
            accionEditarCVI(e);
        } catch (ParseException ex) {
            Logger.getLogger(HistoricoTransaccionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void accionBtnAnterior(ActionEvent e) {
        if (e.getSource() == menu.btnAnterior) {
            DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(paginacion.getNumPage() - 1, 80), paginacion.ColumNames());
            this.menu.tablaTH.setModel(datos);
            this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        }
    }
    
    public void accionBtnSiguiente(ActionEvent e) {
        if (e.getSource() == menu.btnSiguiente) {
            DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(paginacion.getNumPage() + 1, 80), paginacion.ColumNames());
            this.menu.tablaTH.setModel(datos);
            this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        }
    }
    
    public void accionVerTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == menu.btnVerInfo) {
            CompraVentaIva cvi = new CompraVentaIva();
            Transaccion t = new Transaccion();
            TransaccionEditable tEdit = new TransaccionEditable();
            int fila = menu.tablaTH.getSelectedRow();
            if (fila >= 0) {
                
                t.setIdTransaccion(Integer.parseInt((String) menu.tablaTH.getValueAt(fila, 0)));
                tEdit = obtenerDatosT2(Integer.parseInt((String) menu.tablaTH.getValueAt(fila, 0)));
                mensajeVerificacion(t.getIdTransaccion());
                
                infoView.cbbCategoria.setSelectedItem(tEdit.getCategoria());
                infoView.txtCantidad.setText(String.valueOf(tEdit.getCantidad()));
                infoView.txtNumCheque.setText(tEdit.getNumeroCheque());
                infoView.txtNumeroFactura.setText(tEdit.getNumeroFactura());
                
                infoView.cbbCuenta.setSelectedItem(tEdit.getCuenta());
                infoView.cbbEmpresa.setSelectedItem(tEdit.getEmpresa());
                
                infoView.txtDescripcion.setText(tEdit.getDescripcion());
                
                String fecha = (String) menu.tablaTH.getValueAt(fila, 2);
                t.setFecha(java.sql.Date.valueOf(fecha));
                
                infoView.labelNumT.setText(String.valueOf(t.getIdTransaccion()));
                infoView.txtFechaT.setDate(t.getFecha());
                infoView.txtSalidas.setText(String.valueOf(converFormatNumToDouble(formato.format(tEdit.getSalidas()))));
                infoView.txtEntradas.setText(String.valueOf(converFormatNumToDouble(formato.format(tEdit.getEntradas()))));
                
                cvi = queryVerT.obtenerCompraVenta(Integer.parseInt((String) menu.tablaTH.getValueAt(fila, 0)));
                
                setearVistaCVI(cvi);
                infoView.setVisible(true);
                infoView.setLocationRelativeTo(null);
                infoView.txtNombre.setEditable(false);
                infoView.txtCuit.setEditable(false);
                infoView.txtOperacion.setEditable(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Para Modificar Transacciones debe seleccionar la fila en la tabla.\n"
                        + "Haciendo click una sola vez.");
            }
        }
        
    }
    
    public void setearVistaCVI(CompraVentaIva cvi) {
        infoView.txtFecha.setDate(cvi.getFecha());
        infoView.txtTipoComprobante.setText(cvi.getTipo_comprobante());
        infoView.txtNumComprobante.setText(cvi.getNumComprobante());
        infoView.txtOperacion.setText(cvi.getOperacion());
        infoView.txtNombre.setText(cvi.getEmpresa());
        infoView.txtCuit.setText(cvi.getCuit());
        infoView.txtImpNetoGrav.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getImp_neto_grav()))));
        infoView.txtIvaFact.setText(String.valueOf((converFormatNumToDouble(formato.format(cvi.getIva_facturado())))));
        infoView.txtImpInterno.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getImp_interno()))));
        infoView.txtConceptoNoGrav.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getConcep_no_grav()))));
        infoView.txtPercepcionIVA.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getPercepcion_iva()))));
        infoView.txtRetGanan.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getRet_ganancias()))));
        infoView.txtPercIvaC.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getPerc_iibb_compra()))));
        
        infoView.txtImpTotalFact.setText(String.valueOf(converFormatNumToDouble((formato.format(cvi.getImp_total_fact())))));
        
        infoView.txtIvaDereReg.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getIte_iva_dere_reg()))));
        infoView.txtCNoGravSellos.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getC_no_grav_sellos()))));
        infoView.txtRetIiBbV.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getRet_iibb_venta()))));
        infoView.txtIvaRg212.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getIva_rg_212()))));
        infoView.txtGravLey25413.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getGrav_ley_25413()))));
        infoView.txtIntNumerales.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getInt_numerales()))));
        infoView.txtOpExentas.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getOperaciones_exentas()))));
        infoView.txtIngBrutos.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getIng_brutos()))));
        infoView.txtRetIva.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getRet_iva()))));
        infoView.txtImpRIngBrutos.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getImp_r_ing_brutos()))));
        infoView.txtOtros.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getOtros()))));
        infoView.txtIvaFact21.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getIva_facturado_21()))));
        infoView.txtIvaFac27.setText(String.valueOf(converFormatNumToDouble(formato.format(cvi.getIva_facturado_27()))));
    }
    
    public TransaccionEditable obtenerDatosT2(int idTransaccion) {
        return queryVerT.obtenerDatosT2(idTransaccion);
    }
    
    public double converFormatNumToDouble(String s) {
        String yReemplaza = s.replaceAll("\\.", "");
        String flotanteNum = yReemplaza.replaceAll("\\,", ".");
        DecimalFormat formato = new DecimalFormat("#.##");        
        double dou = Double.parseDouble((flotanteNum));
        return dou;
    }
    
    public void accionEditTransaccion(ActionEvent e) throws ParseException {
        if (e.getSource() == infoView.btnEditT) {
            if (infoView.txtFechaT.getDate() != null) {
                
                Transaccion t = new Transaccion();
                
                java.sql.Date sqlDate = new java.sql.Date(infoView.txtFechaT.getDate().getTime());
                t.setFecha(sqlDate);
                NumberFormat f1 = NumberFormat.getInstance();
                NumberFormat f2 = NumberFormat.getInstance();
                t.setSalida(Double.parseDouble(verificarBlanco(infoView.txtSalidas.getText())));
                t.setEntrada(Double.parseDouble(verificarBlanco(infoView.txtEntradas.getText())));
                t.setDescripcion(infoView.txtDescripcion.getText());
                t.setIdOrdenEmp(queryEO.obtenerIdEmpresaPorNombre(infoView.cbbEmpresa.getSelectedItem().toString()));
                t.setIdCuenta(queryCuentas.obtenerIdCuentaPorNombre(infoView.cbbCuenta.getSelectedItem().toString()));
                t.setIdCat(queryCategoria.obtenerIdCatePorNombre(infoView.cbbCategoria.getSelectedItem().toString()));
                t.setCantidad(Integer.parseInt(infoView.txtCantidad.getText()));
                t.setIdSubCat(querySubCat.obtenerIdSubCatPorNombre(infoView.cbbSubCategoria.getSelectedItem().toString()));
                ;
                queryVerT.modificarTransaccion(t, Integer.parseInt(infoView.labelNumT.getText()));
                JOptionPane.showMessageDialog(null, "Transacción N° " + infoView.labelNumT.getText() + " modificada");
                DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(1, 80), paginacion.ColumNames());
                this.menu.tablaTH.setModel(datos);
                
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
    
    public void iniciarComboBox() {
        iniciarComboBoxEmpresa();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarComboBoxSubCategoria();
    }
    
    public void iniciarComboBoxEmpresa() {
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        listEmpresas.add(0, e.getNombre());
        for (String emp : listEmpresas) {
            infoView.cbbEmpresa.addItem(emp);
        }
        AutoCompleteDecorator.decorate(infoView.cbbEmpresa);
    }
    
    public void iniciarComboBoxCuentas() {
        infoView.cbbCuenta.removeAllItems();
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for (String c : nombreCuentas) {
            infoView.cbbCuenta.addItem(c);
        }
        infoView.cbbCuenta.setRenderer(new PromptComboBoxRenderer("Pago Con..."));
        infoView.cbbCuenta.setSelectedIndex(-1);
        AutoCompleteDecorator.decorate(infoView.cbbCuenta);
    }
    
    public void iniciarComboBoxCategoria() {
        infoView.cbbCategoria.removeAllItems();
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        Categoria c = new Categoria();
        c.setNombre("");
        listCategoria.add(0, c.getNombre());
        for (String cat : listCategoria) {
            infoView.cbbCategoria.addItem(cat);
        }
        AutoCompleteDecorator.decorate(infoView.cbbCategoria);
    }
    
    public void accionCbbCuenta(ActionEvent e) {
        if (e.getSource() == infoView.cbbCuenta) {
            String nombre = queryCuentas.obtenerTipoCuenta(infoView.cbbCuenta.getSelectedItem().toString());
            infoView.labelTipoCuenta.setText(nombre);
        }
    }
    
    public void accionCbbCategoria(ActionEvent e) {
        if (e.getSource() == infoView.cbbCategoria) {
            String nombre = queryCategoria.obtenerNombreTC(infoView.cbbCategoria.getSelectedItem().toString());
            infoView.labelTipoCategoria.setText(nombre);
        }
    }

    public void iniciarComboBoxSubCategoria() {
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for (SubCategoria subCat : listSubCategoria) {
            infoView.cbbSubCategoria.addItem(subCat.getNombre());
        }
        AutoCompleteDecorator.decorate(infoView.cbbSubCategoria);
    }
    
    public void accionEditarCVI(ActionEvent e) throws ParseException {
        if (e.getSource() == infoView.btnEditCvi) {
            if (infoView.txtFecha.getDate() != null) {
                queryVerT.modificarCVI(createObjetCVI(), (Integer.parseInt(infoView.labelNumT.getText())));
                JOptionPane.showMessageDialog(null, "Modificación realizada con Éxito.");
                DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(1, 80), paginacion.ColumNames());
                this.menu.tablaTH.setModel(datos);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar datos.\n"
                        + "El campo fecha del apartado CompraVentaIva no debe estar vacio.");
                
            }
        }
    }
    
    public CompraVentaIva createObjetCVI() throws ParseException {
        CompraVentaIva cvi = new CompraVentaIva();
        
        cvi.setOperacion(infoView.txtOperacion.getText());
        
        java.sql.Date sqlDate = new java.sql.Date(infoView.txtFecha.getDate().getTime());
        cvi.setFecha(sqlDate);
        
        cvi.setTipo_comprobante(infoView.txtTipoComprobante.getText());
        
        cvi.setNumComprobante(infoView.txtNumComprobante.getText());
        
        cvi.setEmpresa(infoView.txtNombre.getText());
        
        cvi.setCuit(infoView.txtCuit.getText());
        
        NumberFormat f = NumberFormat.getInstance();
        
        cvi.setImp_neto_grav(Double.parseDouble(verificarBlanco(infoView.txtImpNetoGrav.getText())));
        
        cvi.setIva_facturado(Double.parseDouble(verificarBlanco(infoView.txtIvaFact.getText())));
        
        cvi.setImp_interno(Double.parseDouble(verificarBlanco(infoView.txtImpInterno.getText())));
        
        cvi.setConcep_no_grav(Double.parseDouble(verificarBlanco(infoView.txtConceptoNoGrav.getText())));
        
        cvi.setPercepcion_iva(Double.parseDouble(verificarBlanco(infoView.txtPercepcionIVA.getText())));
        
        cvi.setRet_ganancias(Double.parseDouble(verificarBlanco(infoView.txtRetGanan.getText())));
        
        cvi.setPerc_iibb_compra(Double.parseDouble(verificarBlanco(infoView.txtPercIvaC.getText())));
        
        cvi.setImp_total_fact(Double.parseDouble(verificarBlanco(infoView.txtImpTotalFact.getText())));
        
        cvi.setIte_iva_dere_reg(Double.parseDouble(verificarBlanco(infoView.txtIvaDereReg.getText())));
        
        cvi.setC_no_grav_sellos(Double.parseDouble(verificarBlanco(infoView.txtCNoGravSellos.getText())));
        
        cvi.setRet_iibb_venta(Double.parseDouble(verificarBlanco(infoView.txtRetIiBbV.getText())));
        
        cvi.setIva_rg_212(Double.parseDouble(verificarBlanco(infoView.txtIvaRg212.getText())));
        
        cvi.setGrav_ley_25413(Double.parseDouble(verificarBlanco(infoView.txtGravLey25413.getText())));
        
        cvi.setInt_numerales(Double.parseDouble(verificarBlanco(infoView.txtIntNumerales.getText())));
        
        cvi.setOtros(Double.parseDouble(verificarBlanco(infoView.txtOtros.getText())));
        
        cvi.setIdTransaccion(Integer.parseInt(infoView.labelNumT.getText()));
        
        cvi.setOperaciones_exentas(Double.parseDouble(verificarBlanco(infoView.txtOpExentas.getText())));
        
        cvi.setIng_brutos(Double.parseDouble(verificarBlanco(infoView.txtIngBrutos.getText())));
        
        cvi.setRet_iva(Double.parseDouble(verificarBlanco(infoView.txtRetIva.getText())));
        
        cvi.setImp_r_ing_brutos((Double.parseDouble(verificarBlanco(infoView.txtImpRIngBrutos.getText()))));
        cvi.setIva_facturado_21(Double.parseDouble(verificarBlanco(infoView.txtIvaFact21.getText())));
        cvi.setIva_facturado_27(Double.parseDouble(verificarBlanco(infoView.txtIvaFac27.getText())));
        return cvi;
    }

    /*Método para aquellas transacciones que no se le discriminó el IVA, entonces muestra un texto*/
    public void mensajeVerificacion(int idTransaccion) {
        if (!queryVerT.existeIdTransaccioncvi(idTransaccion)) {
            infoView.labelVerificacion.setText("No se discriminó COMPRA_VENTA_IVA para esta Transacción.");
            infoView.btnEditCvi.setEnabled(false);
        } else {
            infoView.labelVerificacion.setText("");
            infoView.btnEditCvi.setEnabled(true);
        }
        
    }
    
}
