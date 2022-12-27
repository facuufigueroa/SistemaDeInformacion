
package Controller;

import Consultas.QueryCuentas;
import Model.Cuentas;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    TipoCuentasController tipoCuentaController = new TipoCuentasController();
    TipoCategoriaController tipoCatController = new TipoCategoriaController();
    SubCategoriaController subCatController = new SubCategoriaController();
    CategoriaController categoriaController = new CategoriaController();
    EmpresaOrdenController EOController = new EmpresaOrdenController();
    
    
    
    /*--------- CUENTAS ----------------------------------------------------------*/
    QueryCuentas queryCuenta = new QueryCuentas();
    DefaultTableModel modelCuentas = new DefaultTableModel();
    /*----------- FIN CUENTAS -----------------------------------------------------*/
    
    
    
    
    
    public MenuController() {
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);
        this.menuPrincipal.btnTipoCuenta.addActionListener(this);
        this.menuPrincipal.btnTipoCategoria.addActionListener(this);
        this.menuPrincipal.btnSubCategoria.addActionListener(this);
        this.menuPrincipal.btnCategoria.addActionListener(this);
        this.menuPrincipal.btnEmpresaOrden.addActionListener(this);
        
        iniciarTablaCuentas();
        centrarCotenidoTabla(menuPrincipal.tablaCuentas);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        newTransaccion(e);
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
    
    /*------------------- Todo sobre cuentas ---------------------------------*/
    
    public void iniciarTablaCuentas (){
        ArrayList<Cuentas> cuentasLista = queryCuenta.listarCuentas();
        modelCuentas = new DefaultTableModel(){
            public boolean isCellEditable(int fila, int columna){
                if(columna == 1 && columna == 2 && columna == 3){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
       
        modelCuentas.addColumn("NOMBRE");
        modelCuentas.addColumn("TIPO CUENTA");
        
        menuPrincipal.tablaCuentas.setRowHeight(25);
        menuPrincipal.tablaCuentas.setModel(modelCuentas);
        for(Cuentas cuenta : cuentasLista){
            String[] dato = new String[2];
            dato[0] = cuenta.getNombre().toUpperCase();
            dato[1] = cuenta.getTipoCuenta().toUpperCase();
            modelCuentas.addRow(dato);
        }
       
    }
    
    public void centrarCotenidoTabla(JTable tabla){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);

    }
    
    /*---------- Fin todo sobre CUENTAS ------------------------------------*/
    
}
