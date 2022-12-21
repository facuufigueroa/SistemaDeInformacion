

package Controller;

import Consultas.QueryTipoCategoria;
import Model.TipoCategoria;
import Model.TipoCuenta;
import View.FormTipoCategoria;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class TipoCategoriaController {
    
    FormTipoCategoria formTipoCat = new FormTipoCategoria();
    QueryTipoCategoria queryTC = new QueryTipoCategoria();
    DefaultTableModel modelo = new DefaultTableModel();

    public void loadTipoCategoria(){
       formTipoCat.setVisible(true);
       formTipoCat.setLocationRelativeTo(null);
    }
    
   
    public TipoCategoriaController() {
        iniciarTabla();
        centrarContenidoTabla();
    }
    
    public void iniciarTabla (){
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
        formTipoCat.tablaTipoCategorias.setRowHeight(25);
        formTipoCat.tablaTipoCategorias.setModel(modelo);
        for(TipoCategoria tipoC : tipoCategoria){
            String[] dato = new String[1];
            dato[0] = tipoC.getNombre().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
    public void centrarContenidoTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        formTipoCat.tablaTipoCategorias.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
    
}
