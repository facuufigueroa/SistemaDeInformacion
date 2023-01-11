
package Controller;


import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();

       
    
    public MenuController() {
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);

        
        CuentaController cuentaC = new CuentaController(menuPrincipal);
        TipoCuentasController tc = new TipoCuentasController(menuPrincipal);
        EmpresaOrdenController eo = new EmpresaOrdenController(menuPrincipal);
        CategoriaController categoriaController = new CategoriaController(menuPrincipal);
        TipoCategoriaController tipoCatController = new TipoCategoriaController(menuPrincipal);
        SubCategoriaController subCatController = new SubCategoriaController(menuPrincipal);
            
        
        VerTransaccionesController verTransacciones = new VerTransaccionesController(menuPrincipal);

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        newTransaccion(e);
    }
    
    
    public void loadMenuPrincipal(){
       
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        
    }

        /*Metodo que abre la vista para generar nuevas transacciones*/
    public void newTransaccion(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnNewTransaccion){
            transaccionController.setearCamposEnCero();
            transaccionController.loadNewTransaccion();
        }
    } 
    
    
    
    
    public void verTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnVerTransacciones){
            
        }
    }
}
