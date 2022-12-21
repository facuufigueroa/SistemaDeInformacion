
package Controller;

import Consultas.QuerySubCategoria;
import Model.SubCategoria;
import Model.TipoCuenta;
import View.FormSubCategoria;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class SubCategoriaController {
    
    FormSubCategoria formSubCat = new FormSubCategoria();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    public SubCategoriaController() {
        iniciarTabla();
        centrarContenidoTabla();
    }
    
    
    
    public void loadFormSubCat(){
       formSubCat.setVisible(true);
       formSubCat.setLocationRelativeTo(null);
    }
    
    public void iniciarTabla (){
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
        formSubCat.tablaSubCategoria.setRowHeight(25);
        formSubCat.tablaSubCategoria.setModel(modelo);
        for(SubCategoria subC : subCatList){
            String[] dato = new String[1];
            dato[0] = subC.getNombre().toUpperCase();
            modelo.addRow(dato);
        }
    }
    
    public void centrarContenidoTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        formSubCat.tablaSubCategoria.getColumnModel().getColumn(0).setCellRenderer(tcr);
  
    }
}
