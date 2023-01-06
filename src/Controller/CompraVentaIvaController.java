
package Controller;

import View.FormComprasVentasIVA;


public class CompraVentaIvaController {

    FormComprasVentasIVA formCVI = new FormComprasVentasIVA();
    
    public CompraVentaIvaController() {
    }
    
    public void loadComVentaIva(){
        formCVI.setVisible(true);
        formCVI.setLocationRelativeTo(null);
    }
}
