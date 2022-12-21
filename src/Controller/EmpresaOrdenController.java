
package Controller;

import Consultas.QueryEmpresaOrden;
import Model.EmpresaOrden;
import View.FormEmpresaOrden;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EmpresaOrdenController {
        
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    FormEmpresaOrden formEO = new FormEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public void loadEmpresa(){
        formEO.setVisible(true);
        formEO.setLocationRelativeTo(null);
    }
    
    public EmpresaOrdenController() {
        iniciarTabla();
        centrarContenidoTabla();
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
        modelo.addColumn("C-U-I-T");
        formEO.tablaEmpresa.setRowHeight(25);
        formEO.tablaEmpresa.setModel(modelo);
        for(EmpresaOrden eo : empresaOrdenList){
            String[] dato = new String[2];
            dato[0] = eo.getNombre().toUpperCase();
            dato[1] = eo.getCuit();
            modelo.addRow(dato);
        }
    }
    
    public void centrarContenidoTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        formEO.tablaEmpresa.getColumnModel().getColumn(0).setCellRenderer(tcr);
  
    }
    
}
