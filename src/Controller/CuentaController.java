package Controller;

import Consultas.QueryCuentas;
import Model.Cuentas;
import View.CuentasView;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class CuentaController {
    
    QueryCuentas queryCuenta = new QueryCuentas();
    CuentasView cuentaView = new CuentasView();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public void loadCuentasView(){
       cuentaView.setVisible(true);
       cuentaView.setLocationRelativeTo(null);
    }

    public CuentaController() {
        iniciarTabla();
        centrarCotenidoTabla();
    }
    
    public void iniciarTabla (){
        ArrayList<Cuentas> cuentasLista = queryCuenta.listarCuentas();
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
       
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIPO CUENTA");
        cuentaView.tablaCuentas.setRowHeight(25);
        cuentaView.tablaCuentas.setModel(modelo);
        for(Cuentas cuenta : cuentasLista){
            String[] dato = new String[2];
            dato[0] = cuenta.getNombre().toUpperCase();
            dato[1] = cuenta.getTipoCuenta().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
    public void centrarCotenidoTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        cuentaView.tablaCuentas.getColumnModel().getColumn(0).setCellRenderer(tcr);
        cuentaView.tablaCuentas.getColumnModel().getColumn(1).setCellRenderer(tcr);

    }
    
}
