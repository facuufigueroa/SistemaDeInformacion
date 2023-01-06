
package Controller;

import Consultas.QueryCuentas;
import Consultas.QueryTipoCuenta;
import Model.Cuentas;
import Model.TipoCuenta;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CuentaController implements ActionListener {
    
    QueryCuentas queryCuenta = new QueryCuentas();
    DefaultTableModel modelCuentas = new DefaultTableModel();
    MenuPrincipal cuentaView = new MenuPrincipal();
    QueryTipoCuenta queryT  = new QueryTipoCuenta();
    
    public CuentaController(MenuPrincipal menu) {
        this.cuentaView=menu;
        iniciarTablaCuentas();
        iniciarCbbTipoCuenta();
        
        this.cuentaView.btnGuardarCuenta.addActionListener(this);
    }
    
    public void iniciarCbbTipoCuenta(){
        ArrayList<TipoCuenta> listTipoCuenta = queryT.listarTipoCuentas();
        TipoCuenta tCuenta = new TipoCuenta();
        tCuenta.setNombre("");
        cuentaView.cbbTipoCuenta.removeAllItems();
        listTipoCuenta.add(0, tCuenta);
        for(TipoCuenta tc : listTipoCuenta){
            cuentaView.cbbTipoCuenta.addItem(tc.getNombre());
        }
        
    }

    public void iniciarTablaCuentas (){
        ArrayList<Cuentas> cuentasLista = queryCuenta.listarCuentas2();
        
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
        
        cuentaView.tablaCuentas.setRowHeight(25);
        cuentaView.tablaCuentas.setModel(modelCuentas);
        for(Cuentas cuenta : cuentasLista){
            String[] dato = new String[2];
            dato[0] = cuenta.getNombre().toUpperCase();
            dato[1] = cuenta.getTipoCuenta().toUpperCase();
            modelCuentas.addRow(dato);
        }
       
    }
    
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
        addCuenta(e);
    }
    
    public void addCuenta(ActionEvent e){
        if(e.getSource() == cuentaView.btnGuardarCuenta){
            if(!verificarBlanco()){
                Cuentas cuenta = new Cuentas();
                cuenta.setNombre(cuentaView.txtNomCuenta.getText());
                int id_tipoCuenta = queryCuenta.obtenerIdTipoCuentaPorNombre(cuentaView.cbbTipoCuenta.getSelectedItem().toString());
                cuenta.setId_tipoCuenta(id_tipoCuenta);
                queryCuenta.agregarCuenta(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta "+cuentaView.txtNomCuenta.getText().toUpperCase()+" agregada con éxito");
                iniciarTablaCuentas();
                iniciarCbbTipoCuenta();
                cuentaView.txtNomCuenta.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al intentar agregar una cuenta. \n"
                        + "1 ) Verifique que haya escrito un nombre en el campo 'Nombre Cuenta' \n"
                        + "2 ) Verifique que haya seleccionado un tipo de cuenta");
            }
        }
    }
    
    public boolean verificarBlanco(){
       if(cuentaView.txtNomCuenta.getText().isEmpty() 
               || cuentaView.cbbTipoCuenta.getSelectedItem().equals("")){
           return true;
       }
       return false;
   }
    
    
    
}
