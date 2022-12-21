

package Model;


public class EmpresaOrden {
    
    private String nombre;
    private String cuit;

    public EmpresaOrden(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public EmpresaOrden() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
}
