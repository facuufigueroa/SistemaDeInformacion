
package Controller;

import Consultas.QueryTipoCuenta;
import Model.TipoCuenta;
import View.TipoCuentas;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class TipoCuentasController {
    
    TipoCuentas tipoCuentasView = new TipoCuentas();
    QueryTipoCuenta queryTipoCuenta = new QueryTipoCuenta();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public void loadTipoCuenta(){
       tipoCuentasView.setVisible(true);
       tipoCuentasView.setLocationRelativeTo(null);
    }

    public TipoCuentasController() {
        iniciarTabla();
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tipoCuentasView.tablaTipoCuenta.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }
    
    public void iniciarTabla (){
        ArrayList<TipoCuenta> tipoCuentasLista = queryTipoCuenta.listarTipoCuentas();
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
        modelo.addColumn("TIPO CUENTAS");
        tipoCuentasView.tablaTipoCuenta.setRowHeight(25);
        tipoCuentasView.tablaTipoCuenta.setModel(modelo);
        for(TipoCuenta tipoC : tipoCuentasLista){
            String[] dato = new String[1];
            dato[0] = tipoC.getNombre().toUpperCase();
            modelo.addRow(dato);
        }
       
    }
    
  
    
    
    
}
