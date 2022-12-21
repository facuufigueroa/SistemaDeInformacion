
package Controller;

import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    CuentaController cuentaController = new CuentaController();
    TipoCuentasController tipoCuentaController = new TipoCuentasController();
    TipoCategoriaController tipoCatController = new TipoCategoriaController();
    SubCategoriaController subCatController = new SubCategoriaController();
    CategoriaController categoriaController = new CategoriaController();
    EmpresaOrdenController EOController = new EmpresaOrdenController();
    
    public MenuController() {
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);
        this.menuPrincipal.btnCuentas.addActionListener(this);
        this.menuPrincipal.btnTipoCuenta.addActionListener(this);
        this.menuPrincipal.btnTipoCategoria.addActionListener(this);
        this.menuPrincipal.btnSubCategoria.addActionListener(this);
        this.menuPrincipal.btnCategoria.addActionListener(this);
        this.menuPrincipal.btnEmpresaOrden.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        newTransaccion(e);
        adminCuentas(e);
        adminTipoCuentas(e);
        adminTipoCategoria(e);
        adminSubCategoria(e);
        adminCategoria(e);
        adminEmpresaOrden(e);
    }
    
    
    public void loadMenuPrincipal(){
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
    }

        /*Metodo que abre la vista para generar nuevas transacciones*/
    public void newTransaccion(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnNewTransaccion){
            transaccionController.loadNewTransaccion();
        }
    }
    
    /*Metodo que abre la vista de las cuentas*/
    public void adminCuentas(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnCuentas){
            cuentaController.loadCuentasView();
        }
    }
    
    public void adminTipoCuentas(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnTipoCuenta){
            tipoCuentaController.loadTipoCuenta();
        }
    }
    
    public void adminTipoCategoria(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnTipoCategoria){
            tipoCatController.loadTipoCategoria();
        }
    }
    
    public void adminSubCategoria(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnSubCategoria){
            subCatController.loadFormSubCat();
        }
    }
    
    public void adminCategoria(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnCategoria){
            categoriaController.loadCatView();
        }
    }
    
    public void adminEmpresaOrden(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnEmpresaOrden){
            EOController.loadEmpresa();
        }
    }
    
}
