
package Controller;

import View.Transacciones;


public class TransaccionesController {
    
    Transacciones transacciones = new Transacciones();
    
    public void loadNewTransaccion(){
       transacciones.setVisible(true);
       transacciones.setLocationRelativeTo(null);
    }
    
    
}
