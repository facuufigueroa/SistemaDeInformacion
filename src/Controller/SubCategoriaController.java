
package Controller;

import Consultas.QuerySubCategoria;
import Model.SubCategoria;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class SubCategoriaController {

    QuerySubCategoria querySubCat = new QuerySubCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    public SubCategoriaController(MenuPrincipal menu) {
        iniciarTabla(menu);
        centrarContenidoTabla(menu);
    }
    
    
    public void iniciarTabla (MenuPrincipal menu){
        ArrayList<SubCategoria> subCatList = querySubCat.listarSubCat();
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
        modelo.addColumn("SUB-CATEGORIAS");
        menu.tablaSubCategoria.setRowHeight(25);
        menu.tablaSubCategoria.setModel(modelo);
        for(SubCategoria subC : subCatList){
            String[] dato = new String[1];
            dato[0] = subC.getNombre().toUpperCase();
            modelo.addRow(dato);
        }
    }
    
    public void centrarContenidoTabla(MenuPrincipal menu){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        menu.tablaSubCategoria.getColumnModel().getColumn(0).setCellRenderer(tcr);
  
    }
}
