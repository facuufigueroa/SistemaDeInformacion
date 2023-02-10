
package Controller;

import Consultas.QueryEmpresaOrden;
import Model.EmpresaOrden;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EmpresaOrdenController implements ActionListener{
        
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();
    MenuPrincipal empresaOrdenView = new MenuPrincipal();
    private DefaultTableModel dtm_datos = new DefaultTableModel();
    
    
    public EmpresaOrdenController(MenuPrincipal menu) {
        empresaOrdenView = menu;
        
        iniciarTabla();
        centrarContenidoTabla(menu);
        
        menu.btnGuardarEmpresa.addActionListener(this);
    }
    
   
    
    public void iniciarTabla (){
        ArrayList<EmpresaOrden> empresaOrdenList = queryEO.listarEmpresaOrden();
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
        modelo.addColumn("NOMBRE");
        modelo.addColumn("C.U.I.T");
        empresaOrdenView.tablaEmpresa.setRowHeight(25);
        empresaOrdenView.tablaEmpresa.setModel(modelo);
        for(EmpresaOrden eo : empresaOrdenList){
            String[] dato = new String[2];
            dato[0] = eo.getNombre().toUpperCase();
            dato[1] = eo.getCuit();
            modelo.addRow(dato);
        }
    }
    
    public void centrarContenidoTabla(MenuPrincipal menu){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        menu.tablaEmpresa.getColumnModel().getColumn(0).setCellRenderer(tcr);
  
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        insertarEmpresa(e);
    }
    
    public void insertarEmpresa(ActionEvent e){
        if(e.getSource() == empresaOrdenView.btnGuardarEmpresa){
            if(!verificarBlancos()){
                EmpresaOrden empresa = new EmpresaOrden();
                empresa.setNombre(empresaOrdenView.txtNombreEmpresa.getText());
                empresa.setCuit(empresaOrdenView.txtCuitEmpresa.getText());
                queryEO.agregarEmpresa(empresa);
                JOptionPane.showMessageDialog(null,"Empresa/Orden "+empresaOrdenView.txtNombreEmpresa.getText().toUpperCase() + " guardada con éxito" );
                iniciarTabla();
                empresaOrdenView.txtNombreEmpresa.setText("");
                empresaOrdenView.txtCuitEmpresa.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar. \n"
                        + "Hay campos sin completar, complete los campos. \n"
                        + "1) Verifique que el campo NOMBRE no esté vacio. \n"
                        + "2) Verifique que el campo CUIT no esté vacio","Error - Verifique",0);
            }
        }  
    }
    
    public boolean verificarBlancos(){
        if(empresaOrdenView.txtNombreEmpresa.getText().isEmpty() ||
                empresaOrdenView.txtCuitEmpresa.getText().isEmpty() ){
            return true;
            }
        return false;
    }

    

}
