
package Model;


public class Cuentas {
    
    private String nombre;
    private String tipoCuenta;
    private int id_tipoCuenta;

    public Cuentas() {
    }
    
    
    public Cuentas(String nombre, String tipoCuenta) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
    }

    public Cuentas(String nombre, String tipoCuenta, int id_tipoCuenta) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.id_tipoCuenta = id_tipoCuenta;
    }

    public int getId_tipoCuenta() {
        return id_tipoCuenta;
    }

    public void setId_tipoCuenta(int id_tipoCuenta) {
        this.id_tipoCuenta = id_tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
   
    
}
