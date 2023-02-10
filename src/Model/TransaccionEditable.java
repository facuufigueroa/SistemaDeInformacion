
package Model;


public class TransaccionEditable {
    
    /*Modelo usado en edicion transacciones, para traer datos en especifico*/
    
    private String numeroCheque;
    private String numeroFactura;
    private String categoria;
    private String cuenta;
    private String empresa;

    public TransaccionEditable(String numeroCheque, String numeroFactura, String categoria, String cuenta, String empresa) {
        this.numeroCheque = numeroCheque;
        this.numeroFactura = numeroFactura;
        this.categoria = categoria;
        this.cuenta = cuenta;
        this.empresa = empresa;
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
    
    
}
