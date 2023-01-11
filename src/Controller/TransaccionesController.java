
package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryTipoCategoria;
import Consultas.QueryTipoCuenta;
import Consultas.QueryTransaccion;
import Model.Categoria;
import Model.SubCategoria;
import Model.TipoCategoria;
import Model.TipoCuenta;
import Model.Transaccion;
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


public class TransaccionesController implements ActionListener{
    
  
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QueryTipoCuenta queryTCuenta = new QueryTipoCuenta();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryTipoCategoria queryTCat = new QueryTipoCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<String> listCategoria = queryCategoria.listarPorNombre();


  
    
    Transacciones transacciones = new Transacciones();
    CompraVentaIvaController compVentController = new CompraVentaIvaController();
    
    QueryTransaccion queryTransaccion = new QueryTransaccion();
   

    public TransaccionesController() {
        iniciarCamposEnCero();
        iniciarTabla();
        iniciarComboBoxTipoCuenta();
        iniciarComboBoxTipoCategoria();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarcomboBoxSubcategoria();
        iniciarComboBoxEmpresa();     
        this.transacciones.cbbCuentas.addActionListener(this);
        
        this.transacciones.btnCompraVentasIVA.addActionListener(this);
        this.transacciones.cbbCategorias.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        accionTipoCuenta(e);
        try {
            loadComprasVentas(e);
        } catch (ParseException ex) {
            Logger.getLogger(TransaccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        accionTipoCategoria(e);
    }
    
    public void loadNewTransaccion(){
       transacciones.setVisible(true);
       transacciones.setLocationRelativeTo(null);
    }
    
    public void iniciarComboBoxTipoCuenta(){
        ArrayList<TipoCuenta> listTipoCuentas = queryTCuenta.listarTipoCuentas();
        transacciones.cbbTipoCuenta.removeAllItems();
        for(TipoCuenta tc : listTipoCuentas){
            transacciones.cbbTipoCuenta.addItem(tc.getNombre());
        }
    }
    
    
    public void accionTipoCuenta(ActionEvent e){
        if(e.getSource() == transacciones.cbbCuentas){
            int id_tipo_cuenta = queryCuentas.obtenerIdTipoCuenta2((String) transacciones.cbbCuentas.getSelectedItem());
            transacciones.cbbTipoCuenta.setSelectedItem(queryCuentas.obtenerNombreTipoCuenta(id_tipo_cuenta));
        }
    }
    
    
    
    public void iniciarComboBoxCuentas(){
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        transacciones.cbbCuentas.removeAllItems();
        for(String c : nombreCuentas){
            transacciones.cbbCuentas.addItem(c);
        }
    }
    
    public void iniciarComboBoxTipoCategoria(){
        ArrayList<TipoCategoria> listTipoCategoria = queryTCat.listarTiposCat();
        for(TipoCategoria tcc : listTipoCategoria){
            transacciones.cbbTipoCategoria.addItem(tcc.getNombre());
        }
    }
    
    public void iniciarComboBoxCategoria(){
        transacciones.cbbCategorias.removeAllItems();
        for(String cat : listCategoria){
            transacciones.cbbCategorias.addItem(cat);
        }
    }
    
    public void iniciarcomboBoxSubcategoria(){
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for(SubCategoria subCat : listSubCategoria){
            transacciones.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }
    
    public void iniciarComboBoxEmpresa(){
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        for(String emp : listEmpresas){
            transacciones.cbbEmpresa.addItem(emp);
        }
    }
    
    public void iniciarTabla (){
        ArrayList<Transaccion> listTransac= queryTransaccion.listarTransacciones();
        modelo = new DefaultTableModel(){
            public boolean isCellEditable(int fila, int columna){
                if(columna == 1 && columna == 2 && columna == 3){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
       
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("Retenciones_g");
        modelo.addColumn("Ret. Ingresos Brutos");
        modelo.addColumn("A impuesto IVA");
        modelo.addColumn("A IVA");
        
        transacciones.tablaTransacciones.setRowHeight(15);
        transacciones.tablaTransacciones.setModel(modelo);
        transacciones.tablaTransacciones.setRowHeight(25);
       
        for(Transaccion t: listTransac){
            String[] dato = new String[9];
            dato[0] = t.getFecha().toString();
            dato[1] = t.getDescripcion();
            dato[2]= "$"+String.valueOf(t.getSalida());
            dato[3]= "$"+String.valueOf(t.getEntrada());
            dato[4]="$"+String.valueOf(t.getRetenciones_g());
            dato[5]="$"+String.valueOf(t.getRet_ing_brutos());
            dato[6]=convertAImpues(String.valueOf(t.isA_impuesto()));
            dato[7]=convertAIVA(String.valueOf(t.isA_iva()));
            modelo.addRow(dato);
        }
       
    }
    
    public String convertAImpues(String a_imp){
        if(a_imp.equals("true")){
            return "Si";
        }
        else{
           if(a_imp.equals("false")){
               return "No";
           }
        }
        return "";
    }
    
    public String convertAIVA(String a_iva){
        if(a_iva.equals("true")){
            return "Si";
        }
        else{
           if(a_iva.equals("false")){
               return "No";
           }
        }
        return "";
    }
    
   
    public void loadComprasVentas(ActionEvent e) throws ParseException{
        if(e.getSource() == transacciones.btnCompraVentasIVA){
            if(!verificarVacios()){
                queryTransaccion.addTransaccion(obtenerTransaccion());
                iniciarTabla();
                compVentController.loadComVentaIva();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"<html><p style = \"font:14px\"> Error al continuar con la Transacción - Campos incompletos.</p/</html> \n"
                +"<html><p style = \"font:12px\"> Verifique algunas de las siguientes opciones: </p/</html> \n"+
                        "<html><p style = \"font:12px\">1) Haya seleccionado una cuenta.</p/</html> \n"
                        +"<html><p style = \"font:12px\">2) Haya seleccionado un tipo de categoria.</p/</html> \n"
                        +"<html><p style = \"font:12px\">3) Haya seleccionado un tipo de cuenta.</p/</html> \n"
                        +"<html><p style = \"font:12px\">4) Haya seleccionado una fecha.</p/</html> \n"+
                        "<html><p style = \"font:12px\">5) Haya seleccionado una empresa/orden.</p/</html> \n"
                        +"<html><p style = \"font:12px\">6) Haya seleccionado una categoria.</p/</html> \n"+
                        "<html><p style = \"font:12px\">7) Haya seleccionado una sub-categoria.</p/</html> \n"+
                        "<html><p style = \"font:12px\">8) Haya escrito una descripción.</p/</html>\n"+
                        "<html><p style = \"font:12px\">9) Haya escrito un numero de cheque o numero de factura. </p/</html>","EROR, VERIFIQUE CAMPOS",0
                );
            }
        }   
    }
    
    public void updateComboBoxCategoria(ArrayList<Categoria> listCat){
        ArrayList<Categoria> listCategoria = listCat;
        for(Categoria cat : listCategoria){
            transacciones.cbbCategorias.addItem(cat.getNombre());
        }
    }
    
    public void accionTipoCategoria(ActionEvent e){
        if(e.getSource() == transacciones.cbbCategorias){
            int id_tipo_categoria = queryCategoria.obtenerIdTipoCat((String) transacciones.cbbCategorias.getSelectedItem());
            
            transacciones.cbbTipoCategoria.setSelectedItem(queryCategoria.obtenerNombreTipoCat(id_tipo_categoria));
        }
    }
    
    /*Es para qe no pueda modificar el tipo de cuenta para la cuenta correspondiente y
    para que no pueda modificar el tipo de categoria para la categoria correspondiente.
    */
    public void deshabilitarComboBox(){
        transacciones.cbbTipoCategoria.setEnabled(false);
        transacciones.cbbTipoCategoria.setEditable(false);
    }
    
    /*Método para crear el objeto transacción*/
    public Transaccion obtenerTransaccion() throws ParseException{
        Transaccion t = new Transaccion();
        t.setIdCuenta(queryCuentas.obtenerIdCuentaPorNombre((String) transacciones.cbbCuentas.getSelectedItem()));
        
        if("".equals(transacciones.txtNumCheque.getText())){
            t.setNumChequeFact(transacciones.txtNumFact.getText());
        }
      
        if("".equals(transacciones.txtNumFact.getText())){
            t.setNumChequeFact(transacciones.txtNumCheque.getText()); //Puede ser numCheque o
        }
       
        java.sql.Date sqlDate = new java.sql.Date(transacciones.txtFecha.getDate().getTime());
        t.setFecha(sqlDate);
        
        t.setDescripcion(transacciones.txtDescripcion.getText());
        
        t.setIdOrdenEmp(queryEO.obtenerIdEmpresaPorNombre((String) transacciones.cbbEmpresa.getSelectedItem()));
        
        t.setCantidad(parseInt(transacciones.txtCantidad.getText()));
        
        t.setIdCat(queryCategoria.obtenerIdCatePorNombre((String) transacciones.cbbCategorias.getSelectedItem()));
        
        t.setIdSubCat(querySubCat.obtenerIdSubCatPorNombre((String) transacciones.cbbSubCategoria.getSelectedItem()));
    
        NumberFormat f = NumberFormat.getInstance();
        t.setSalida((float) f.parse(transacciones.txtSalida.getText()).doubleValue());
        
        t.setEntrada((float) f.parse(transacciones.txtEntrada.getText()).doubleValue());
        
        t.setRetenciones_g((float) f.parse(transacciones.txtRetG.getText()).doubleValue());
        
        t.setRet_ing_brutos((float) f.parse(transacciones.txtRetIngBrut.getText()).doubleValue());
        
        t.setA_impuesto(obtenerSetImpuesto());
        
        t.setA_iva(a_iva());
        
        return t;
    }
            
    public boolean obtenerSetImpuesto(){
        if(transacciones.cbbImp.getSelectedItem() == "Sí"){
            return true;
        }
        return false;
    }
    
    public boolean a_iva(){
        if(transacciones.checkAIva.isSelected()){
            return true;
        }
        return false;
    }
    
    public boolean verificarVacios(){
        if( transacciones.cbbCuentas.getSelectedItem().equals("") ||
               transacciones.cbbTipoCategoria.getSelectedItem().equals("") ||
                transacciones.cbbTipoCuenta.getSelectedItem().equals("") ||
                transacciones.txtFecha.getDate() == null ||
                transacciones.cbbEmpresa.getSelectedItem().equals("") ||
                transacciones.cbbCategorias.getSelectedItem().equals("") ||
                transacciones.cbbSubCategoria.getSelectedItem().equals("") ||
                transacciones.txtDescripcion.getText().equals("") ||
                transacciones.txtNumCheque.getText().equals("") &&
                transacciones.txtNumFact.getText().equals("")
                )
            return true;
        return false;
    }
    
    public void iniciarCamposEnCero(){
        transacciones.txtCantidad.setText("0");
        transacciones.txtSalida.setText("0");
        transacciones.txtEntrada.setText("0");
        transacciones.txtRetG.setText("0");
        transacciones.txtRetIngBrut.setText("0");
        }
    
    public void setearCamposEnCero(){
        transacciones.txtCantidad.setText("0");
        transacciones.txtSalida.setText("0");
        transacciones.txtEntrada.setText("0");
        transacciones.txtRetG.setText("0");
        transacciones.txtRetIngBrut.setText("0");
        iniciarComboBoxTipoCuenta();
        iniciarComboBoxTipoCategoria();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarcomboBoxSubcategoria();
        iniciarComboBoxEmpresa();  
        transacciones.txtFecha.setDate(null);
        transacciones.txtDescripcion.setText("");
        }
}
