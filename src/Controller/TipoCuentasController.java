
package Controller;

import Consultas.QueryTipoCuenta;
import Model.TipoCuenta;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class TipoCuentasController implements ActionListener{
    

    QueryTipoCuenta queryTipoC = new QueryTipoCuenta();
    DefaultTableModel modelTipoCuentas = new DefaultTableModel();
    MenuPrincipal tipoCuentaView = new MenuPrincipal();

    public TipoCuentasController(MenuPrincipal menu) {
        this.tipoCuentaView=menu;
        iniciarTablaTipoCuentas();
        centrarCotenidoTablaTipoCuentas(); 
        
        tipoCuentaView.btnGuardarTipoCuenta.addActionListener(this);
    }
    
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
        tipoCuentaView.tablaTipoCuenta.setRowHeight(25);
        tipoCuentaView.tablaTipoCuenta.setModel(modelTipoCuentas);
        for(TipoCuenta tipoC : tipoCuentasLista){
            String[] dato = new String[1];
            dato[0] = tipoC.getNombre().toUpperCase();
            modelTipoCuentas.addRow(dato);
        }
    }
    
    public void centrarCotenidoTablaTipoCuentas(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tipoCuentaView.tablaTipoCuenta.getColumnModel().getColumn(0).setCellRenderer(tcr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        agregarTipoCuenta(e);
    }
  
    public void agregarTipoCuenta(ActionEvent e){
        if(e.getSource() == tipoCuentaView.btnGuardarTipoCuenta){
            if(!verificarBlanco()){
                TipoCuenta tipoCuenta = new TipoCuenta();
                tipoCuenta.setNombre(tipoCuentaView.txtTipoCuenta.getText());
                queryTipoC.agregarTipoCuenta(tipoCuenta);
                iniciarTablaTipoCuentas();
                centrarCotenidoTablaTipoCuentas();
                JOptionPane.showMessageDialog(null, "Tipo De Cuenta "+tipoCuentaView.txtTipoCuenta.getText().toUpperCase()+" guardada con éxito");
                tipoCuentaView.txtTipoCuenta.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al intentar agregar un Tipo De Cuenta. \n"
                        + "Verifique que el campo nombre del tipo de cuenta no esté vacio.");
            }
        }
    }
    
    public boolean verificarBlanco(){
       if(tipoCuentaView.txtTipoCuenta.getText().isEmpty()){
           return true;
       }
       return false;
   }
}
