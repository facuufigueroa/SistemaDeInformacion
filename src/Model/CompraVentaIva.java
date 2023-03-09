package Model;

import java.sql.Date;

public class CompraVentaIva {

    /*Attributes foreign keys*/
    private int idTransaccion;

    /*Common Attributes*/
    private String operacion;
    private Date fecha;
    private String tipo_comprobante;
    private String numComprobante;
    private String cuit;

    /*Ell atributo iva_facturado es del 10.5*/
    private double imp_neto_grav;
    private double iva_facturado;
    private double imp_interno;
    private double concep_no_grav;
    private double percepcion_iva;
    private double ret_ganancias;
    private double perc_iibb_compra;
    private double imp_total_fact;
    private double ite_iva_dere_reg;
    private double c_no_grav_sellos;
    private double ret_iibb_venta;
    private double iva_rg_212;
    private double grav_ley_25413;
    private double int_numerales;
    private double otros;
    private double operaciones_exentas;
    private double ing_brutos;
    private double ret_iva;
    private double imp_r_ing_brutos;
    private double iva_facturado_21;
    private double iva_facturado_27;

    private String empresa;

    public CompraVentaIva() {
    }

    public CompraVentaIva(int idTransaccion, String operacion, Date fecha, String tipo_comprobante, String numComprobante, String cuit, double imp_neto_grav, double iva_facturado, double imp_interno, double concep_no_grav, double percepcion_iva, double ret_ganancias, double perc_iibb_compra, double imp_total_fact, double ite_iva_dere_reg, double c_no_grav_sellos, double ret_iibb_venta, double iva_rg_212, double grav_ley_25413, double int_numerales, double otros, double operaciones_exentas, double ing_brutos, double ret_iva, double imp_r_ing_brutos, double iva_facturado_21, double iva_facturado_27, String empresa) {
        this.idTransaccion = idTransaccion;
        this.operacion = operacion;
        this.fecha = fecha;
        this.tipo_comprobante = tipo_comprobante;
        this.numComprobante = numComprobante;
        this.cuit = cuit;
        this.imp_neto_grav = imp_neto_grav;
        this.iva_facturado = iva_facturado;
        this.imp_interno = imp_interno;
        this.concep_no_grav = concep_no_grav;
        this.percepcion_iva = percepcion_iva;
        this.ret_ganancias = ret_ganancias;
        this.perc_iibb_compra = perc_iibb_compra;
        this.imp_total_fact = imp_total_fact;
        this.ite_iva_dere_reg = ite_iva_dere_reg;
        this.c_no_grav_sellos = c_no_grav_sellos;
        this.ret_iibb_venta = ret_iibb_venta;
        this.iva_rg_212 = iva_rg_212;
        this.grav_ley_25413 = grav_ley_25413;
        this.int_numerales = int_numerales;
        this.otros = otros;
        this.operaciones_exentas = operaciones_exentas;
        this.ing_brutos = ing_brutos;
        this.ret_iva = ret_iva;
        this.imp_r_ing_brutos = imp_r_ing_brutos;
        this.iva_facturado_21 = iva_facturado_21;
        this.iva_facturado_27 = iva_facturado_27;
        this.empresa = empresa;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public double getImp_neto_grav() {
        return imp_neto_grav;
    }

    public void setImp_neto_grav(double imp_neto_grav) {
        this.imp_neto_grav = imp_neto_grav;
    }

    public double getIva_facturado() {
        return iva_facturado;
    }

    public void setIva_facturado(double iva_facturado) {
        this.iva_facturado = iva_facturado;
    }

    public double getImp_interno() {
        return imp_interno;
    }

    public void setImp_interno(double imp_interno) {
        this.imp_interno = imp_interno;
    }

    public double getConcep_no_grav() {
        return concep_no_grav;
    }

    public void setConcep_no_grav(double concep_no_grav) {
        this.concep_no_grav = concep_no_grav;
    }

    public double getPercepcion_iva() {
        return percepcion_iva;
    }

    public void setPercepcion_iva(double percepcion_iva) {
        this.percepcion_iva = percepcion_iva;
    }

    public double getRet_ganancias() {
        return ret_ganancias;
    }

    public void setRet_ganancias(double ret_ganancias) {
        this.ret_ganancias = ret_ganancias;
    }

    public double getPerc_iibb_compra() {
        return perc_iibb_compra;
    }

    public void setPerc_iibb_compra(double perc_iibb_compra) {
        this.perc_iibb_compra = perc_iibb_compra;
    }

    public double getImp_total_fact() {
        return imp_total_fact;
    }

    public void setImp_total_fact(double imp_total_fact) {
        this.imp_total_fact = imp_total_fact;
    }

    public double getIte_iva_dere_reg() {
        return ite_iva_dere_reg;
    }

    public void setIte_iva_dere_reg(double ite_iva_dere_reg) {
        this.ite_iva_dere_reg = ite_iva_dere_reg;
    }

    public double getC_no_grav_sellos() {
        return c_no_grav_sellos;
    }

    public void setC_no_grav_sellos(double c_no_grav_sellos) {
        this.c_no_grav_sellos = c_no_grav_sellos;
    }

    public double getRet_iibb_venta() {
        return ret_iibb_venta;
    }

    public void setRet_iibb_venta(double ret_iibb_venta) {
        this.ret_iibb_venta = ret_iibb_venta;
    }

    public double getIva_rg_212() {
        return iva_rg_212;
    }

    public void setIva_rg_212(double iva_rg_212) {
        this.iva_rg_212 = iva_rg_212;
    }

    public double getGrav_ley_25413() {
        return grav_ley_25413;
    }

    public void setGrav_ley_25413(double grav_ley_25413) {
        this.grav_ley_25413 = grav_ley_25413;
    }

    public double getInt_numerales() {
        return int_numerales;
    }

    public void setInt_numerales(double int_numerales) {
        this.int_numerales = int_numerales;
    }

    public double getOtros() {
        return otros;
    }

    public void setOtros(double otros) {
        this.otros = otros;
    }

    public double getOperaciones_exentas() {
        return operaciones_exentas;
    }

    public void setOperaciones_exentas(double operaciones_exentas) {
        this.operaciones_exentas = operaciones_exentas;
    }

    public double getIng_brutos() {
        return ing_brutos;
    }

    public void setIng_brutos(double ing_brutos) {
        this.ing_brutos = ing_brutos;
    }

    public double getRet_iva() {
        return ret_iva;
    }

    public void setRet_iva(double ret_iva) {
        this.ret_iva = ret_iva;
    }

    public double getImp_r_ing_brutos() {
        return imp_r_ing_brutos;
    }

    public void setImp_r_ing_brutos(double imp_r_ing_brutos) {
        this.imp_r_ing_brutos = imp_r_ing_brutos;
    }

    public double getIva_facturado_21() {
        return iva_facturado_21;
    }

    public void setIva_facturado_21(double iva_facturado_21) {
        this.iva_facturado_21 = iva_facturado_21;
    }

    public double getIva_facturado_27() {
        return iva_facturado_27;
    }

    public void setIva_facturado_27(double iva_facturado_27) {
        this.iva_facturado_27 = iva_facturado_27;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    
    
}
