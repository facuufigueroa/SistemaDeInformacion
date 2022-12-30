
package Controller;

import Consultas.QueryEmpresaOrden;
import Model.EmpresaOrden;
import View.FormEmpresaOrden;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EmpresaOrdenController {
        
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    FormEmpresaOrden formEO = new FormEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();
    MenuPrincipal empresaOrdenView = new MenuPrincipal();
    
    
    public EmpresaOrdenController(MenuPrincipal menu) {
        iniciarTabla(menu);
        centrarContenidoTabla(menu);
    }
    
   
    
    public void iniciarTabla (MenuPrincipal menu){
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
        modelo.addColumn("C-U-I-T");
        menu.tablaEmpresa.setRowHeight(25);
        menu.tablaEmpresa.setModel(modelo);
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
    
}
