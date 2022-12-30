

package Controller;

import Consultas.QueryTipoCategoria;
import Model.TipoCategoria;
import View.FormTipoCategoria;
import View.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class TipoCategoriaController {
    
    FormTipoCategoria formTipoCat = new FormTipoCategoria();
    QueryTipoCategoria queryTC = new QueryTipoCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    
    public TipoCategoriaController(MenuPrincipal menu) {
        iniciarTabla(menu);
        centrarContenidoTabla(menu);
    }
    
    public void iniciarTabla (MenuPrincipal menu){
        ArrayList<TipoCategoria> tipoCategoria = queryTC.listarTiposCat();
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
        modelo.addColumn("TIPO CATEGORIAS");
        menu.tablaTipoCategorias.setRowHeight(25);
        menu.tablaTipoCategorias.setModel(modelo);
        for(TipoCategoria tipoC : tipoCategoria){
            String[] dato = new String[1];
            dato[0] = tipoC.getNombre().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
    public void centrarContenidoTabla(MenuPrincipal menu){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        menu.tablaTipoCategorias.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
    
}
