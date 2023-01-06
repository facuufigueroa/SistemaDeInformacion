
package Controller;

import Consultas.QuerySubCategoria;
import Model.SubCategoria;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class SubCategoriaController implements ActionListener{

    QuerySubCategoria querySubCat = new QuerySubCategoria();
    DefaultTableModel modelo = new DefaultTableModel();
    MenuPrincipal menuSubCat = new MenuPrincipal();
    
    
    public SubCategoriaController(MenuPrincipal menu) {
        menuSubCat = menu;
        iniciarTabla();
        centrarContenidoTabla(menu);
        
        menuSubCat.btnGuardarSubCat.addActionListener(this);
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
        menuSubCat.tablaSubCategoria.setRowHeight(25);
        menuSubCat.tablaSubCategoria.setModel(modelo);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        agregarSubCat(e);
    }
    
    public void agregarSubCat(ActionEvent e){
        if(e.getSource() == menuSubCat.btnGuardarSubCat){
            if(!verificarBlanco()){
                SubCategoria subcat = new SubCategoria();
                subcat.setNombre(menuSubCat.txtNomSubCat.getText());
                querySubCat.agregarSubcategoria(subcat);
                iniciarTabla();
                JOptionPane.showMessageDialog(null, "SubCategoria "+menuSubCat.txtNomSubCat.getText().toUpperCase() + " guardada con éxito");
                menuSubCat.txtNomSubCat.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al guardar. \n"
                        + "Verifique que el campo del nombre de la subcategoria \n"
                        + "este completo.");
            }
        }
    }
    
    public boolean verificarBlanco(){
        if(menuSubCat.txtNomSubCat.getText().isEmpty()){
            return true;
        }
        return false;
    }
}
