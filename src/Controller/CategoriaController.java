
package Controller;

import Consultas.QueryCategoria;
import Model.Categoria;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CategoriaController {
    
    QueryCategoria queryCat = new QueryCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriaController(MenuPrincipal menu) {
        iniciarTabla(menu);
        centrarContenidoTabla(menu);
    }
    
    
    
    public void iniciarTabla (MenuPrincipal menu){
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
        menu.tablaCategoria.setRowHeight(25);
        menu.tablaCategoria.setModel(modelo);
        for(Categoria cat : categoriaLista){
            String[] dato = new String[2];
            dato[0] = cat.getNombre().toUpperCase();
            dato[1] = cat.getTipoCategoria().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
    public void centrarContenidoTabla(MenuPrincipal menu){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        menu.tablaCategoria.getColumnModel().getColumn(0).setCellRenderer(tcr);
        menu.tablaCategoria.getColumnModel().getColumn(1).setCellRenderer(tcr);

    }
}
