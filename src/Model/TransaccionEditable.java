
package Model;

import java.sql.Date;


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
    
    private String subCategoria;
    private int idtransaccion;
    private double entradas;
    private double salidas;
    private Date fecha;
    private boolean a_iva;
    private boolean a_impuesto;
    

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

    public TransaccionEditable(String numeroCheque, String numeroFactura, String categoria, String cuenta, String empresa, String descripcion, int cantidad, String subCategoria, int idtransaccion, double entradas, double salidas, Date fecha, boolean a_iva, boolean a_impuesto) {
        this.numeroCheque = numeroCheque;
        this.numeroFactura = numeroFactura;
        this.categoria = categoria;
        this.cuenta = cuenta;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.subCategoria = subCategoria;
        this.idtransaccion = idtransaccion;
        this.entradas = entradas;
        this.salidas = salidas;
        this.fecha = fecha;
        this.a_iva = a_iva;
        this.a_impuesto = a_impuesto;
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

    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getSalidas() {
        return salidas;
    }

    public void setSalidas(double salidas) {
        this.salidas = salidas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isA_iva() {
        return a_iva;
    }

    public void setA_iva(boolean a_iva) {
        this.a_iva = a_iva;
    }

    public boolean isA_impuesto() {
        return a_impuesto;
    }

    public void setA_impuesto(boolean a_impuesto) {
        this.a_impuesto = a_impuesto;
    }

    public int getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(int idtransaccion) {
        this.idtransaccion = idtransaccion;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
    
    
    
    
}
