

package Controller;

import Consultas.QueryTipoCategoria;
import Model.TipoCategoria;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class TipoCategoriaController implements ActionListener{
    
    
    QueryTipoCategoria queryTC = new QueryTipoCategoria();
    DefaultTableModel modelo = new DefaultTableModel();
    MenuPrincipal tipoCatView = new MenuPrincipal();

    
    public TipoCategoriaController(MenuPrincipal menu) {
        this.tipoCatView=menu;
        iniciarTabla();
        centrarContenidoTabla(menu);
        tipoCatView.btnSaveTipoCat.addActionListener(this);
        
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
        tipoCatView.tablaTipoCategorias.setRowHeight(25);
        tipoCatView.tablaTipoCategorias.setModel(modelo);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        agregarTipoCat(e);
    }
    
    public void agregarTipoCat(ActionEvent e){
        if(e.getSource() == tipoCatView.btnSaveTipoCat){
            if(!verificarBlancos()){
                TipoCategoria tipoCat = new TipoCategoria();
                tipoCat.setNombre(tipoCatView.txtNomTipoCat.getText());
                queryTC.agregarTipoCat(tipoCat);
                JOptionPane.showMessageDialog(null, "Tipo Categoria "+tipoCatView.txtNomTipoCat.getText().toUpperCase()+" guardada con éxito");
                tipoCatView.txtNomTipoCat.setText("");
                iniciarTabla();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar. \n"
                        + "Verifique que el campo nombre del Tipo De Categoria \n"
                        + "no esté vacio.","Error - Verifique",0);
            }
        }
    }
    
    public boolean verificarBlancos(){
        if(tipoCatView.txtNomTipoCat.getText().isEmpty()){
            return true;
        }
        return false;
    }
}
