
package Controller;

import Model.Categoria;
import View.FormVerTransacciones;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class VerTransaccionesController implements ActionListener{

    FormVerTransacciones formVerT = new FormVerTransacciones();
    MenuPrincipal viewMenu = new MenuPrincipal();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
    public VerTransaccionesController(MenuPrincipal menu) {
        formVerT.setLocationRelativeTo(null);
        this.viewMenu = menu;
        viewMenu.btnVerTransacciones.addActionListener(this);
        iniciarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loadVerTransacciones(e);
    }
    
    public void loadVerTransacciones(ActionEvent e){
        if(e.getSource() == viewMenu.btnVerTransacciones){
            System.out.println("hola");
            formVerT.setVisible(true);
        }
    }

    public void iniciarTabla (){
       // ArrayList<Categoria> categoriaLista = queryCat.listarCategorias();
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
       
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripción");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        
        formVerT.tablaVerTransacciones.setRowHeight(25);
        formVerT.tablaVerTransacciones.setModel(modelo);
       /* for(Categoria cat : categoriaLista){
            String[] dato = new String[2];
            dato[0] = cat.getNombre().toUpperCase();
            dato[1] = cat.getTipoCategoria().toUpperCase();
            modelo.addRow(dato);
        }*/
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public MenuPrincipal getViewMeu() {
        return viewMenu;
    }

    public void setViewMeu(MenuPrincipal viewMeu) {
        this.viewMenu = viewMeu;
    }
    
    
}
