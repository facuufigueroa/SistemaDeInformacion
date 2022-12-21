
package Model;


public class TipoCuenta {
    private String nombre;
    private int idTipoCuenta;

    public TipoCuenta(String nombre, int idTipoCuenta) {
        this.nombre = nombre;
        this.idTipoCuenta = idTipoCuenta;
    }

    public TipoCuenta() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }
    
    
}
