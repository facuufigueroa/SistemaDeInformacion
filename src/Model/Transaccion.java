
package Model;


import java.util.Date;


public class Transaccion {
    
    private int idTransaccion;
    private String codigo;
    /*Foreign Key*/
    private int idCuenta;
    private int idOrdenEmp;
    private int idCat;
    private int idSubCat;
    
    /*Attributes*/
    
    private String numCheque;
    private String numFactura;
    private Date fecha;
    private String descripcion;
    private int cantidad;
    private double salida;
    private double entrada;
    private float retenciones_g;
    private float ret_ing_brutos;
    private boolean a_iva;
    private boolean a_impuesto;
    private boolean verificada;
    
    public Transaccion(String codigo,int idTransaccion, int idCuenta, int idOrdenEmp, int idCat, int idSubCat, String numChequeFact, Date fecha, String descripcion, int cantidad,double salida,double entrada, float retenciones_g, float ret_ing_brutos, boolean a_iva, boolean a_impuesto,String numFactura) {
        this.codigo=codigo;
        this.idTransaccion = idTransaccion;
        this.idCuenta = idCuenta;
        this.idOrdenEmp = idOrdenEmp;
        this.idCat = idCat;
        this.idSubCat = idSubCat;
        this.numCheque = numChequeFact;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.salida = salida;
        this.entrada = entrada;
        this.retenciones_g = retenciones_g;
        this.ret_ing_brutos = ret_ing_brutos;
        this.a_iva = a_iva;
        this.a_impuesto = a_impuesto;
        this.numFactura=numFactura;
    }

    public Transaccion(int idCuenta, int idOrdenEmp, int idCat, int idSubCat, String numChequeFact, Date fecha, String descripcion, int cantidad,double salida, double entrada, float retenciones_g, float ret_ing_brutos, boolean a_iva, boolean a_impuesto) {
        this.idCuenta = idCuenta;
        this.idOrdenEmp = idOrdenEmp;
        this.idCat = idCat;
        this.idSubCat = idSubCat;
        this.numCheque = numChequeFact;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.salida = salida;
        this.entrada = entrada;
        this.retenciones_g = retenciones_g;
        this.ret_ing_brutos = ret_ing_brutos;
        this.a_iva = a_iva;
        this.a_impuesto = a_impuesto;
    }

    public Transaccion(int idTransaccion, String codigo, int idCuenta, int idOrdenEmp, int idCat, int idSubCat, String numCheque, String numFactura, Date fecha, String descripcion, int cantidad, double salida, double entrada, float retenciones_g, float ret_ing_brutos, boolean a_iva, boolean a_impuesto, boolean verificada) {
        this.idTransaccion = idTransaccion;
        this.codigo = codigo;
        this.idCuenta = idCuenta;
        this.idOrdenEmp = idOrdenEmp;
        this.idCat = idCat;
        this.idSubCat = idSubCat;
        this.numCheque = numCheque;
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.salida = salida;
        this.entrada = entrada;
        this.retenciones_g = retenciones_g;
        this.ret_ing_brutos = ret_ing_brutos;
        this.a_iva = a_iva;
        this.a_impuesto = a_impuesto;
        this.verificada = verificada;
    }
    
    

    public Transaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdOrdenEmp() {
        return idOrdenEmp;
    }

    public void setIdOrdenEmp(int idOrdenEmp) {
        this.idOrdenEmp = idOrdenEmp;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public int getIdSubCat() {
        return idSubCat;
    }

    public void setIdSubCat(int idSubCat) {
        this.idSubCat = idSubCat;
    }

    public String getNumChequeFact() {
        return numCheque;
    }

    public void setNumChequeFact(String numChequeFact) {
        this.numCheque = numChequeFact;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSalida() {
        return salida;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

   

    

    public float getRetenciones_g() {
        return retenciones_g;
    }

    public void setRetenciones_g(float retenciones_g) {
        this.retenciones_g = retenciones_g;
    }

    public float getRet_ing_brutos() {
        return ret_ing_brutos;
    }

    public void setRet_ing_brutos(float ret_ing_brutos) {
        this.ret_ing_brutos = ret_ing_brutos;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }
    
   
    
}
