
package Model;


public class TransaccionEditable {
    
    /*Modelo usado en edicion transacciones, para traer datos en especifico*/
    
    private String numeroCheque;
    private String numeroFactura;
    private String tipoFactura;
    private String categoria;
    private String cuenta;
    private String empresa;
    private String descripcion;
    private int cantidad;

    public TransaccionEditable(String numeroCheque, String numeroFactura, String categoria, String cuenta, String empresa,String descripcion,String tipoFactura,int cantidad) {
        this.numeroCheque = numeroCheque;
        this.numeroFactura = numeroFactura;
        this.categoria = categoria;
        this.cuenta = cuenta;
        this.empresa = empresa;
        this.descripcion=descripcion;
        this.tipoFactura=tipoFactura;
        this.cantidad = cantidad;
    }

    public TransaccionEditable(String numeroCheque, String numeroFactura, String categoria, String cuenta, String empresa, String descripcion) {
        this.numeroCheque = numeroCheque;
        this.numeroFactura = numeroFactura;
        this.categoria = categoria;
        this.cuenta = cuenta;
        this.empresa = empresa;
        this.descripcion = descripcion;
    }
    
    

    public TransaccionEditable() {
    }
    

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
