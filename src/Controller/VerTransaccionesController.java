
package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryVerTransacciones;
import Model.SubCategoria;
import Model.Transaccion;
import View.FormVerTransacciones;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Float.parseFloat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerTransaccionesController implements ActionListener{

    FormVerTransacciones formVerT = new FormVerTransacciones();
    MenuPrincipal viewMenu = new MenuPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    QueryVerTransacciones queryVerT = new QueryVerTransacciones();
    
    
    
    public VerTransaccionesController(MenuPrincipal menu) {
        formVerT.setLocationRelativeTo(null);
        this.viewMenu = menu;
        viewMenu.btnVerTransacciones.addActionListener(this);
        
        /*iniciarTabla();*/
        iniciarComboBoxBuscarCategoria();
        iniciarComboBoxBuscarCuentas();
        iniciarcomboBoxBuscarSubcategoria();
        iniciarComboBoxBuscarEmpresa();
        
        formVerT.cbbBuscarCategoria.addActionListener(this);
        formVerT.cbbSubCategoria.addActionListener(this);
        formVerT.cbbBuscarCuenta.addActionListener(this);
        formVerT.cbbEmpresa.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loadVerTransacciones(e);
        accionBuscarPorCat(e);
        accionBuscarPorSubCat(e);
        accionBuscarPorCuenta(e);
        accionBuscarPorEmpresa(e);
    }
    
    public void loadVerTransacciones(ActionEvent e){
        if(e.getSource() == viewMenu.btnVerTransacciones){
            formVerT.setVisible(true);
        }
    }

    public void iniciarTabla (ArrayList<Transaccion> listT){
      
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
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("A Impuesto ?");
        modelo.addColumn(" A IVA ?");
        modelo.addColumn("Empresa / Orden");
        
        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
        for(Transaccion t : listT){
            String[] dato = new String[9];
            dato[0] = t.getFecha().toString();
            dato[1] = t.getDescripcion();
            dato[2]= String.valueOf(t.getCantidad());
            dato[3]="$"+String.valueOf((float) t.getSalida());
            dato[4] = "$"+String.valueOf(t.getEntrada());
            dato[5]= cambiarFormatoIVA(t.isA_impuesto());
            dato[6] = cambiarFormatoIVA(t.isA_iva());
            String empresa = queryVerT.obtenerEmpresa(t.getIdOrdenEmp());
            dato[7] = empresa;
            modelo.addRow(dato);
        }
       
    }
    
    public void accionBuscarPorCat(ActionEvent e){
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if(e.getSource() == formVerT.cbbBuscarCategoria){
            formVerT.txtEntradas.setText(""); 
            formVerT.txtSalidas.setText("");
            if(formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null){
               
                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();
                
                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();
                
              
                String categoria = (String) formVerT.cbbBuscarCategoria.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorCategorias(categoria,fecha_desde,fecha_hasta);
                formVerT.txtBusqueda.setText(categoria);
                iniciarTabla(listTransacciones);  
                formVerT.txtEntradas.setText(obtenerSumaEntradas()); 
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }
    
    public void accionBuscarPorSubCat(ActionEvent e){
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if(e.getSource() == formVerT.cbbSubCategoria){
            formVerT.txtEntradas.setText(""); 
            formVerT.txtSalidas.setText("");
            if(formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null){
               
                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();
                
                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();
                
              
                String subcategoria = (String) formVerT.cbbSubCategoria.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorSubCategoria(subcategoria,fecha_desde,fecha_hasta);
                formVerT.txtBusqueda.setText(subcategoria);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas()); 
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }
    
    public void accionBuscarPorCuenta(ActionEvent e){
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if(e.getSource() == formVerT.cbbBuscarCuenta){
            formVerT.txtEntradas.setText(""); 
            formVerT.txtSalidas.setText("");
            if(formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null){
               
                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();
                
                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();
                
              
                String cuenta= (String) formVerT.cbbBuscarCuenta.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorCuenta(cuenta,fecha_desde,fecha_hasta);
                formVerT.txtBusqueda.setText(cuenta);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas()); 
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }
    
    public void accionBuscarPorEmpresa(ActionEvent e){
        ArrayList<Transaccion> listTransacciones = new ArrayList<>();
        if(e.getSource() == formVerT.cbbEmpresa){
            formVerT.txtEntradas.setText(""); 
            formVerT.txtSalidas.setText("");
            if(formVerT.txtFechaDesde.getDate() != null && formVerT.txtFechaHasta.getDate() != null){
               
                java.sql.Date sqlFechaDesde = new java.sql.Date(formVerT.txtFechaDesde.getDate().getTime());
                String fecha_desde = sqlFechaDesde.toString();
                
                java.sql.Date sqlFechaHasta = new java.sql.Date(formVerT.txtFechaHasta.getDate().getTime());
                String fecha_hasta = sqlFechaHasta.toString();
                
              
                String empresa= (String) formVerT.cbbEmpresa.getSelectedItem();
                listTransacciones = queryVerT.obtenerTransaccionesPorEmpresa(empresa,fecha_desde,fecha_hasta);
                formVerT.txtBusqueda.setText(empresa);
                iniciarTabla(listTransacciones);
                formVerT.txtEntradas.setText(obtenerSumaEntradas()); 
                formVerT.txtSalidas.setText(obtenerSumaSalidas());
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al buscar transacción. \n"
                        + "Verifique que haya seleccionado las fechas en los campos \n"
                        + "Fecha Desde y Fecha Hasta");
            }
        }
    }
    
    public String obtenerSumaEntradas(){
        String entradasString = "";
        float entradas=(float) 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {
            
            String entradaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 4)).toString().substring(1);
            entradas += parseFloat(entradaSin$);
        }
        entradasString = "$"+String.valueOf(entradas);
        return entradasString; 
    }
    
    public String obtenerSumaSalidas(){
        String salidasString = "";
        float salidas=(float) 0.0;
        for (int i = 0; i < formVerT.tablaVerTransacciones.getRowCount(); i++) {
            
            String salidaSin$ = (formVerT.tablaVerTransacciones.getValueAt(i, 3)).toString().substring(1);
            salidas += parseFloat(salidaSin$);
        }
        salidasString = "$"+String.valueOf(salidas);
        return salidasString; 
    }
    
    
    
    public String cambiarFormatoIVA(Boolean b){
        if(b.equals(true)){
            return "Si";
        }
        return "No";   
    }
    
    
    public void iniciarComboBoxBuscarCategoria(){
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        for(String c : listCategoria){
            formVerT.cbbBuscarCategoria.addItem(c);
        }
    }
    
    public void iniciarComboBoxBuscarCuentas(){
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for(String c : nombreCuentas){
            formVerT.cbbBuscarCuenta.addItem(c);
        }
    }
    
    public void iniciarcomboBoxBuscarSubcategoria(){
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for(SubCategoria subCat : listSubCategoria){
            formVerT.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }
    
    public void iniciarComboBoxBuscarEmpresa(){
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        for(String emp : listEmpresas){
            formVerT.cbbEmpresa.addItem(emp);
        }
    }
    
    
    
    
    
    
    
    public MenuPrincipal getViewMeu() {
        return viewMenu;
    }

    public void setViewMeu(MenuPrincipal viewMeu) {
        this.viewMenu = viewMeu;
    }
    
    
}
