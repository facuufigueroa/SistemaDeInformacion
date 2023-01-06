
package Model;


public class Categoria {
    
    private String nombre;
    private int tipoCategoria;
    private int idCategoria;
    private String nombreString;
    

    public Categoria(String nombre, int tipoCategoria, int idCategoria, String nombreS) {
        this.nombre = nombre;
        this.tipoCategoria = tipoCategoria;
        this.idCategoria = idCategoria;
        this.nombreString=nombreS;
    }
    
   public Categoria(String nombre, int tipoCategoria){
       this.nombre=nombre;
       this.tipoCategoria = tipoCategoria;
   }

    public Categoria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(int tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreString() {
        return nombreString;
    }

    public void setNombreString(String nombreString) {
        this.nombreString = nombreString;
    }
    
    
    
    
    
}
