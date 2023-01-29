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

    private float imp_neto_grav;
    private float iva_facturado;
    private float imp_interno;
    private float concep_no_grav;
    private float percepcion_iva;
    private float ret_ganancias;
    private float perc_iibb_compra;
    private float imp_total_fact;
    private float ite_iva_dere_reg;
    private float c_no_grav_sellos;
    private float ret_iibb_venta;
    private float iva_rg_212;
    private float grav_ley_25413;
    private float int_numerales;
    private float otros;
    private float operaciones_exentas;
    private float ing_brutos;
    private float ret_iva;
    private float imp_r_ing_brutos;

    private String empresa;

    public CompraVentaIva() {
    }

    public CompraVentaIva(int idTransaccion, String operacion, Date fecha, String tipo_comprobante, String numComprobante, String cuit, float imp_neto_grav, float iva_facturado, float imp_interno, float concep_no_grav, float percepcion_iva, float ret_ganancias, float perc_iibb_compra, float imp_total_fact, float ite_iva_dere_reg, float c_no_grav_sellos, float ret_iibb_venta, float iva_rg_212, float grav_ley_25413, float int_numerales, float otros, float operaciones_exentas, float ing_brutos, float ret_iva, float imp_r_ing_brutos, String empresa) {
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

    public float getImp_neto_grav() {
        return imp_neto_grav;
    }

    public void setImp_neto_grav(float imp_neto_grav) {
        this.imp_neto_grav = imp_neto_grav;
    }

    public float getIva_facturado() {
        return iva_facturado;
    }

    public void setIva_facturado(float iva_facturado) {
        this.iva_facturado = iva_facturado;
    }

    public float getImp_interno() {
        return imp_interno;
    }

    public void setImp_interno(float imp_interno) {
        this.imp_interno = imp_interno;
    }

    public float getConcep_no_grav() {
        return concep_no_grav;
    }

    public void setConcep_no_grav(float concep_no_grav) {
        this.concep_no_grav = concep_no_grav;
    }

    public float getPercepcion_iva() {
        return percepcion_iva;
    }

    public void setPercepcion_iva(float percepcion_iva) {
        this.percepcion_iva = percepcion_iva;
    }

    public float getRet_ganancias() {
        return ret_ganancias;
    }

    public void setRet_ganancias(float ret_ganancias) {
        this.ret_ganancias = ret_ganancias;
    }

    public float getPerc_iibb_compra() {
        return perc_iibb_compra;
    }

    public void setPerc_iibb_compra(float perc_iibb_compra) {
        this.perc_iibb_compra = perc_iibb_compra;
    }

    public float getImp_total_fact() {
        return imp_total_fact;
    }

    public void setImp_total_fact(float imp_total_fact) {
        this.imp_total_fact = imp_total_fact;
    }

    public float getIte_iva_dere_reg() {
        return ite_iva_dere_reg;
    }

    public void setIte_iva_dere_reg(float ite_iva_dere_reg) {
        this.ite_iva_dere_reg = ite_iva_dere_reg;
    }

    public float getC_no_grav_sellos() {
        return c_no_grav_sellos;
    }

    public void setC_no_grav_sellos(float c_no_grav_sellos) {
        this.c_no_grav_sellos = c_no_grav_sellos;
    }

    public float getRet_iibb_venta() {
        return ret_iibb_venta;
    }

    public void setRet_iibb_venta(float ret_iibb_venta) {
        this.ret_iibb_venta = ret_iibb_venta;
    }

    public float getIva_rg_212() {
        return iva_rg_212;
    }

    public void setIva_rg_212(float iva_rg_212) {
        this.iva_rg_212 = iva_rg_212;
    }

    public float getGrav_ley_25413() {
        return grav_ley_25413;
    }

    public void setGrav_ley_25413(float grav_ley_25413) {
        this.grav_ley_25413 = grav_ley_25413;
    }

    public float getInt_numerales() {
        return int_numerales;
    }

    public void setInt_numerales(float int_numerales) {
        this.int_numerales = int_numerales;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getOperaciones_exentas() {
        return operaciones_exentas;
    }

    public void setOperaciones_exentas(float operaciones_exentas) {
        this.operaciones_exentas = operaciones_exentas;
    }

    public float getIng_brutos() {
        return ing_brutos;
    }

    public void setIng_brutos(float ing_brutos) {
        this.ing_brutos = ing_brutos;
    }

    public float getRet_iva() {
        return ret_iva;
    }

    public void setRet_iva(float ret_iva) {
        this.ret_iva = ret_iva;
    }

    public float getImp_r_ing_brutos() {
        return imp_r_ing_brutos;
    }

    public void setImp_r_ing_brutos(float imp_r_ing_brutos) {
        this.imp_r_ing_brutos = imp_r_ing_brutos;
    }

}
