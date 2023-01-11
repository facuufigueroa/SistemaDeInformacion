
package Controller;

import Consultas.QueryCompraVentaIVA;
import Consultas.QueryEmpresaOrden;
import Consultas.QueryTransaccion;
import Model.CompraVentaIva;
import Model.EmpresaOrden;

import View.FormComprasVentasIVA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CompraVentaIvaController implements ActionListener{

    FormComprasVentasIVA formCVI = new FormComprasVentasIVA();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    QueryTransaccion queryT = new QueryTransaccion();
    QueryCompraVentaIVA queryCVI = new QueryCompraVentaIVA();
    private int id_transaccion;
    /*TransaccionesController tController = new TransaccionesController();*/
    
    public CompraVentaIvaController() {
        setearCamosEnCero();
        iniciarComboBoxEmpresa();
        iniciarComboBoxCuit();
        
        this.formCVI.cbbEmpresa.addActionListener(this);
        formCVI.labelIdTransaccion.setText(String.valueOf(queryT.obtenerMaxId()));
        
        this.formCVI.btnFinalizar.addActionListener(this);
    }

    public CompraVentaIvaController(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }
    
    
    
    
    
    public void loadComVentaIva(){
        formCVI.setVisible(true);
        formCVI.setLocationRelativeTo(null);
    }
    
    public void iniciarComboBoxEmpresa(){
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        listEmpresas.add(0, e.getNombre());
        for(String emp : listEmpresas){
            formCVI.cbbEmpresa.addItem(emp);
        }
    }
    
    /*Muestra el cuit y el nombre de la empresa juntos*/
    public void iniciarComboBoxCuit(){
        ArrayList<EmpresaOrden> listEmpresas = queryEO.listarEmpresaOrden();
        EmpresaOrden e = new EmpresaOrden();
        e.setNombre("");
        e.setCuit("");
        listEmpresas.add(0, e);
        for(EmpresaOrden emp : listEmpresas){
            formCVI.cbbCuitEmpresa.addItem(emp.getCuit());
        }
    }
    
    public void accionEmpresa(ActionEvent e){
        if(e.getSource() == formCVI.cbbEmpresa){
            String cuit = queryEO.obtenerCuitPorNombre(formCVI.cbbEmpresa.getSelectedItem().toString());
            formCVI.cbbCuitEmpresa.setSelectedItem(cuit);
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        accionEmpresa(e);
        try {
            accionCompraVenta(e);
        } catch (ParseException ex) {
            Logger.getLogger(CompraVentaIvaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void accionCompraVenta(ActionEvent e) throws ParseException{
        if(e.getSource() == formCVI.btnFinalizar){
            if(!verificarBlancos()){
                queryCVI.agregarCompraVenta(newCompraVenta());
                JOptionPane.showMessageDialog(null,"<html><p style = \"font:14px\"> El registro se efectuó correctamente </p/</html> \n","Operación Finalizada",1);
                formCVI.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"<html><p style = \"font:14px\"> Error - Campos incompletos.</p/</html> \n"
                        + "<html><p style = \"font:12px\">Verifique que: </p/</html>\n"
                        +"<html><p style = \"font:12px\">1) Haya seleccionado una Fecha </p/</html>\n"
                        +"<html><p style = \"font:12px\">2) Haya escrito un Tipo de Comprobante </p/</html>\n"
                        +"<html><p style = \"font:12px\">3) Haya escrito un Numero de Comprobante </p/</html>\n"
                        +"<html><p style = \"font:12px\">4) Haya seleccionado una Empresa/Orden </p/</html> \n"
                        +"<html><p style = \"font:12px\">¡ Una vez completado los campos faltantes </p/</html> \n"
                        + "<html><p style = \"font:12px\">  presione nuevamente el boton Finalizar Operación !</p/</html>"
                        + "","Eror - Verifique",0);
            }
        }
     
    }
    
    public CompraVentaIva newCompraVenta() throws ParseException{
        CompraVentaIva cvi = new CompraVentaIva();
        cvi.setOperacion(formCVI.txtOperacion.getText());
        
        java.sql.Date sqlDate = new java.sql.Date(formCVI.txtFecha.getDate().getTime());
        cvi.setFecha(sqlDate);
        
        cvi.setTipo_comprobante(formCVI.txtTipoComprobante.getText());
        
        cvi.setNumComprobante(parseInt(formCVI.txtNumComprobante.getText()));
        
        cvi.setEmpresa((String) formCVI.cbbEmpresa.getSelectedItem());
        
        cvi.setCuit((String) formCVI.cbbCuitEmpresa.getSelectedItem());
     
        
        NumberFormat f = NumberFormat.getInstance();
        cvi.setImp_neto_grav((float) f.parse(formCVI.txtImpNetoGrav.getText()).doubleValue());
        
        cvi.setIva_facturado((float) f.parse(formCVI.txtIvaFact.getText()).doubleValue());
        
        cvi.setImp_interno((float) f.parse(formCVI.txtImpInterno.getText()).doubleValue());
        
        cvi.setConcep_no_grav((float) f.parse(formCVI.txtConceptoNoGrav.getText()).doubleValue());
        
        cvi.setPercepcion_iva((float) f.parse(formCVI.txtPercepcionIVA.getText()).doubleValue());
        
        cvi.setRet_ganancias((float) f.parse(formCVI.txtRetGanan.getText()).doubleValue());
        
        cvi.setPerc_iibb_compra((float) f.parse(formCVI.txtPercIvaC.getText()).doubleValue());
        
        cvi.setImp_total_fact((float) f.parse(formCVI.txtImpTotalFact.getText()).doubleValue());
        
        cvi.setIte_iva_dere_reg((float) f.parse(formCVI.txtIvaDereReg.getText()).doubleValue());
        
        cvi.setC_no_grav_sellos((float) f.parse(formCVI.txtCNoGravSellos.getText()).doubleValue());
        
        cvi.setRet_iibb_venta((float) f.parse(formCVI.txtRetIiBbV.getText()).doubleValue());
        
        cvi.setIva_rg_212((float) f.parse(formCVI.txtIvaRg212.getText()).doubleValue());
        
        cvi.setGrav_ley_25413((float) f.parse(formCVI.txtGravLey25413.getText()).doubleValue());
        
        cvi.setInt_numerales((float) f.parse(formCVI.txtIntNumerales.getText()).doubleValue());
        
        cvi.setOtros((float) f.parse(formCVI.txtOtros.getText()).doubleValue());
        
        cvi.setIdTransaccion(queryT.obtenerMaxId());
        
        return cvi;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }
    
    public void setearCamosEnCero(){
        formCVI.txtNumComprobante.setText("0");
        formCVI.txtImpNetoGrav.setText("0");
        formCVI.txtIvaFact.setText("0");
        formCVI.txtImpInterno.setText("0");
        formCVI.txtConceptoNoGrav.setText("0");
        formCVI.txtPercepcionIVA.setText("0");
        formCVI.txtRetGanan.setText("0");
        formCVI.txtPercIvaC.setText("0");
        formCVI.txtImpTotalFact.setText("0");
        formCVI.txtIvaDereReg.setText("0");
        formCVI.txtCNoGravSellos.setText("0");
        formCVI.txtRetIiBbV.setText("0");
        formCVI.txtIvaRg212.setText("0");
        formCVI.txtGravLey25413.setText("0");
        formCVI.txtIntNumerales.setText("0");
        formCVI.txtOtros.setText("0");
    }
    
    public boolean verificarBlancos(){
        if(formCVI.txtFecha.getDate() == null || formCVI.txtOperacion.getText().equals("")
                || formCVI.txtTipoComprobante.getText().equals("") || 
                formCVI.txtNumComprobante.getText().equals("")
                || formCVI.cbbEmpresa.getSelectedItem().equals("")
                )
            return true;
        return false;
    }

    
    
    
}
