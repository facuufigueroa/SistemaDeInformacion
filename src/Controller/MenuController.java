
package Controller;

import Consultas.QueryCuentas;
import Consultas.QueryTipoCuenta;
import Model.Cuentas;
import Model.TipoCuenta;
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
    
    
    
    QueryCuentas queryCuenta = new QueryCuentas();
    DefaultTableModel modelCuentas = new DefaultTableModel();
    
    
    QueryTipoCuenta queryTipoC = new QueryTipoCuenta();
    DefaultTableModel modelTipoCuentas = new DefaultTableModel();

    
    
    
    
    
    
    public MenuController() {
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);
        
        
        iniciarTablaCuentas();
        centrarCotenidoTablaCuentas(menuPrincipal.tablaCuentas);
        
        iniciarTablaTipoCuentas();
        centrarCotenidoTablaTipoCuentas(menuPrincipal.tablaTipoCuenta);
        
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
            transaccionController.loadNewTransaccion();
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
    
    public void centrarCotenidoTablaCuentas(JTable tabla){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
    }
    
    /*---------- Fin todo sobre CUENTAS ------------------------------------*/
    
    
    public void iniciarTablaTipoCuentas (){
        ArrayList<TipoCuenta> tipoCuentasLista = queryTipoC.listarTipoCuentas();
        modelTipoCuentas = new DefaultTableModel(){
            public boolean isCellEditable(int fila, int columna){
                if(columna == 1 && columna == 2 && columna == 3){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
        modelTipoCuentas.addColumn("Tipo Cuentas");
        menuPrincipal.tablaTipoCuenta.setRowHeight(25);
        menuPrincipal.tablaTipoCuenta.setModel(modelTipoCuentas);
        for(TipoCuenta tipoC : tipoCuentasLista){
            String[] dato = new String[1];
            dato[0] = tipoC.getNombre().toUpperCase();
            modelTipoCuentas.addRow(dato);
        }
    }
    
    public void centrarCotenidoTablaTipoCuentas(JTable tabla){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
    
    public void verTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnVerTransacciones){
            
        }
    }
}
