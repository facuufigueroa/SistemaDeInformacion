
package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Model.Categoria;
import Model.SubCategoria;
import Model.TipoCategoria;
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
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();

    
    
    public VerTransaccionesController(MenuPrincipal menu) {
        formVerT.setLocationRelativeTo(null);
        this.viewMenu = menu;
        viewMenu.btnVerTransacciones.addActionListener(this);
        
        iniciarTabla();
        iniciarComboBoxBuscarCategoria();
        iniciarComboBoxBuscarCuentas();
        iniciarcomboBoxBuscarSubcategoria();
        iniciarComboBoxBuscarEmpresa();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loadVerTransacciones(e);
    }
    
    public void loadVerTransacciones(ActionEvent e){
        if(e.getSource() == viewMenu.btnVerTransacciones){
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
    
    
    
    public void iniciarComboBoxBuscarCategoria(){
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
        for(String c : listCategoria){
            formVerT.cbbBuscarCategoria.addItem(c);
        }
    }
    
    public void iniciarComboBoxBuscarCuentas(){
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        for(String c : nombreCuentas){
            formVerT.cbbBuscarCuenta.addItem(c);
        }
    }
    
    public void iniciarcomboBoxBuscarSubcategoria(){
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for(SubCategoria subCat : listSubCategoria){
            formVerT.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }
    
    public void iniciarComboBoxBuscarEmpresa(){
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        for(String emp : listEmpresas){
            formVerT.cbbEmpresa.addItem(emp);
        }
    }
    
    
    
    
    
    
    
    public MenuPrincipal getViewMeu() {
        return viewMenu;
    }

    public void setViewMeu(MenuPrincipal viewMeu) {
        this.viewMenu = viewMeu;
    }
    
    
}
