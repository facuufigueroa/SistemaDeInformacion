
package Controller;

import Consultas.QueryCategoria;
import Model.Categoria;
import View.FormCategoria;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CategoriaController {
    
    FormCategoria formCat = new FormCategoria();
    QueryCategoria queryCat = new QueryCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriaController() {
        iniciarTabla();
        centrarContenidoTabla();
    }
    
    public void loadCatView(){
       formCat.setVisible(true);
       formCat.setLocationRelativeTo(null);
    }
    
    public void iniciarTabla (){
        ArrayList<Categoria> categoriaLista = queryCat.listarCategorias();
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
        modelo.addColumn("TIPO CATEGORIA");
        formCat.tablaCategoria.setRowHeight(25);
        formCat.tablaCategoria.setModel(modelo);
        for(Categoria cat : categoriaLista){
            String[] dato = new String[2];
            dato[0] = cat.getNombre().toUpperCase();
            dato[1] = cat.getTipoCategoria().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
    public void centrarContenidoTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        formCat.tablaCategoria.getColumnModel().getColumn(0).setCellRenderer(tcr);
        formCat.tablaCategoria.getColumnModel().getColumn(1).setCellRenderer(tcr);

    }
}
