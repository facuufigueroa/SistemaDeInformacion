
package Model;


public class Categoria {
    
    private String nombre;
    private String tipoCategoria;
    private int idCategoria;

    public Categoria(String nombre, String tipoCategoria, int idCategoria) {
        this.nombre = nombre;
        this.tipoCategoria = tipoCategoria;
        this.idCategoria = idCategoria;
    }

    public Categoria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
    
}
