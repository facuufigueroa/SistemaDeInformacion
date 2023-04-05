package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.CompraVentaIva;
import Model.Transaccion;
import Model.TransaccionEditable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class QueryVerTransacciones {

    private Conexion conexion = new Conexion();
    private QueryEmpresaOrden queryEO = new QueryEmpresaOrden();

    public String obtenerEmpresa(int idEmpresa) {
        String nombre = "";
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        try {
            String sql = "SELECT e.empresa \n"
                    + "FROM empresa_orden AS e\n"
                    + "WHERE e.idempresa_orden = " + idEmpresa;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombre = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return nombre;
    }

    public ArrayList<Transaccion> obtenerTransaccionesPorCategorias(String categoria, String fecha_desde, String fecha_hasta) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n"
                    + "transacciones as t\n"
                    + "INNER JOIN categorias as c ON t.id_categoria = c.idcategorias\n"
                    + "WHERE c.nombre = '" + categoria + "' AND t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                t.setVerificada(rs.getBoolean("verificada"));

                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }

    public ArrayList<Transaccion> obtenerTransaccionesPorSubCategoria(String SubCategoria, String fecha_desde, String fecha_hasta) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n"
                    + "transacciones as t\n"
                    + "INNER JOIN subcategorias as sc ON t.id_subcategoria = sc.idsubcategorias\n"
                    + "WHERE sc.nombre = '" + SubCategoria + "' AND t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                t.setVerificada(rs.getBoolean("verificada"));

                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }

    public ArrayList<Transaccion> obtenerTransaccionesPorCuenta(String cuenta, String fecha_desde, String fecha_hasta) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n"
                    + "transacciones as t\n"
                    + "INNER JOIN cuentas as c ON t.id_cuenta = c.idcuenta\n"
                    + "WHERE c.nombre = '" + cuenta + "' AND t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                t.setVerificada(rs.getBoolean("verificada"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }

    public ArrayList<Transaccion> obtenerTransaccionesPorEmpresa(String empresa, String fecha_desde, String fecha_hasta) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n"
                    + "transacciones as t\n"
                    + "INNER JOIN empresa_orden as e ON t.id_orden_empresa = e.idempresa_orden\n"
                    + "WHERE e.empresa = '" + empresa + "' AND t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                t.setVerificada(rs.getBoolean("verificada"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }

    public Transaccion obtenerTransaccion(int numT) {
        String nombre = "";
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        Transaccion trans = new Transaccion();
        try {
            String sql = "SELECT t.idtransacciones,t.codigo,t.fecha,t.descripcion,t.salidas,t.entradas,t.a_impuestos_iva,t.a_iva FROM transacciones as t WHERE t.idtransacciones= " + numT;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                trans.setIdTransaccion(rs.getInt("idtransacciones"));
                trans.setCodigo(rs.getString("codigo"));
                trans.setDescripcion(rs.getString("descripcion"));
                trans.setFecha(rs.getDate("fecha"));
                trans.setSalida(rs.getFloat("salidas"));
                trans.setEntrada(rs.getFloat("entradas"));
                trans.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                trans.setA_iva(rs.getBoolean("a_iva"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return trans;
    }

    public ArrayList<Transaccion> listarTransacciones() {
        ArrayList<Transaccion> tList = new ArrayList<>();
        Calendar fecha = new GregorianCalendar();
        String añoActual = String.valueOf(fecha.get(Calendar.YEAR));
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM transacciones AS t \n"
                    + "WHERE YEAR(t.fecha)=" + añoActual + "\n"
                    + "ORDER BY t.idtransacciones DESC";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setSalida(rs.getDouble("salidas"));
                t.setEntrada(rs.getDouble("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setVerificada(rs.getBoolean("verificada"));
                tList.add(t);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        return tList;
    }

    public boolean existeIdTransaccion(int id) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        try {
            String sql = "SELECT * FROM transacciones as t WHERE t.idtransacciones =" + id;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public CompraVentaIva obtenerCompraVenta(int idtransaccion) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        CompraVentaIva cvi = new CompraVentaIva();
        try {
            String sql = "SELECT c.operacion,c.fecha,c.tipo_comprobante,c.nro_comprobante,c.cuit,c.imp_neto_grav,c.iva_facturado_10,c.concepto_no_grav,c.imp_interno,c.percepcion_iva,\n"
                    + "c.ret_ganancias,c.perc_iibb_compra,c.imp_total_fac,c.ite_iva_dere_reg,c.c_no_grav_sellos,c.ret_ii_bb_venta,c.iva_rg_212, c.grav_ley_25413,\n"
                    + "c.int_numerales,c.otros,c.nombre,c.operaciones_exentas,c.ing_brutos,c.ret_iva,c.imp_r_ing_brutos,c.iva_facturado_21,c.iva_facturado_27\n"
                    + "FROM compra_ventas_iva as c \n"
                    + "WHERE c.id_transaccion =" + idtransaccion;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                cvi.setFecha(rs.getDate("fecha"));
                cvi.setOperacion(rs.getString("operacion"));
                cvi.setTipo_comprobante(rs.getString("tipo_comprobante"));
                cvi.setNumComprobante(rs.getString("nro_comprobante"));
                cvi.setCuit(rs.getString("cuit"));
                cvi.setEmpresa(rs.getString("nombre"));
                cvi.setImp_neto_grav(rs.getDouble("imp_neto_grav"));
                cvi.setIva_facturado(rs.getDouble("iva_facturado_10"));
                cvi.setImp_interno(rs.getDouble("imp_interno"));
                cvi.setConcep_no_grav(rs.getDouble("concepto_no_grav"));
                cvi.setPercepcion_iva(rs.getDouble("percepcion_iva"));
                cvi.setRet_ganancias(rs.getDouble("ret_ganancias"));
                cvi.setPerc_iibb_compra(rs.getDouble("perc_iibb_compra"));
                cvi.setImp_total_fact(rs.getDouble("imp_total_fac"));
                cvi.setIte_iva_dere_reg(rs.getDouble("ite_iva_dere_reg"));
                cvi.setC_no_grav_sellos(rs.getDouble("c_no_grav_sellos"));
                cvi.setRet_iibb_venta(rs.getDouble("ret_ii_bb_venta"));
                cvi.setIva_rg_212(rs.getDouble("iva_rg_212"));
                cvi.setGrav_ley_25413(rs.getDouble("grav_ley_25413"));
                cvi.setInt_numerales(rs.getDouble("int_numerales"));
                cvi.setOtros(rs.getDouble("otros"));
                cvi.setOperaciones_exentas(rs.getDouble("operaciones_exentas"));
                cvi.setIng_brutos(rs.getDouble("ing_brutos"));
                cvi.setRet_iva(rs.getDouble("ret_iva"));
                cvi.setImp_r_ing_brutos(rs.getDouble("imp_r_ing_brutos"));
                cvi.setIva_facturado_21(rs.getDouble("iva_facturado_21"));
                cvi.setIva_facturado_27(rs.getDouble("iva_facturado_27"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return cvi;
    }
    
   

    public void modificarTransaccion(Transaccion t, int id) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE transacciones AS t SET t.fecha = ? , t.salidas = ?, t.entradas = ?,t.descripcion= ?,t.id_categoria= ?,t.id_orden_empresa=?,t.id_cuenta=?,t.cantidad=?,t.id_subcategoria=? WHERE t.idtransacciones = " + id;

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) t.getFecha());
            ps.setDouble(2, t.getSalida());
            ps.setDouble(3, t.getEntrada());
            ps.setString(4, t.getDescripcion());
            ps.setInt(5, t.getIdCat());
            ps.setInt(6, t.getIdOrdenEmp());
            ps.setInt(7, t.getIdCuenta());
            ps.setInt(8, t.getCantidad());
            ps.setInt(9, t.getIdSubCat());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void modificarCVI(CompraVentaIva cvi, int id) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE compra_ventas_iva AS c\n"
                + "set c.fecha = ? , c.tipo_comprobante=?, c.nro_comprobante = ?, c.imp_neto_grav = ?, c.iva_facturado_10=?,\n"
                + "c.imp_interno = ?, c.concepto_no_grav =?, c.percepcion_iva = ?, c.ret_ganancias =?,c.perc_iibb_compra = ?,c.imp_total_fac =?, c.ite_iva_dere_reg =?,\n"
                + "c.c_no_grav_sellos = ?,c.ret_ii_bb_venta=?,c.iva_rg_212=?,c.grav_ley_25413 =?, c.int_numerales=?, c.otros =?,c.operaciones_exentas =?,\n"
                + "c.ing_brutos = ?, c.ret_iva =?,c.imp_r_ing_brutos = ?,c.iva_facturado_21=?,c.iva_facturado_27=? WHERE c.id_transaccion =  " + id;

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) cvi.getFecha());
            ps.setString(2, cvi.getTipo_comprobante());
            ps.setString(3, cvi.getNumComprobante());
            ps.setDouble(4, cvi.getImp_neto_grav());
            ps.setDouble(5, cvi.getIva_facturado());
            ps.setDouble(6, cvi.getImp_interno());
            ps.setDouble(7, cvi.getConcep_no_grav());
            ps.setDouble(8, cvi.getPercepcion_iva());
            ps.setDouble(9, cvi.getRet_ganancias());
            ps.setDouble(10, cvi.getPerc_iibb_compra());
            ps.setDouble(11, cvi.getImp_total_fact());
            ps.setDouble(12, cvi.getIte_iva_dere_reg());
            ps.setDouble(13, cvi.getC_no_grav_sellos());
            ps.setDouble(14, cvi.getRet_iibb_venta());
            ps.setDouble(15, cvi.getIva_rg_212());
            ps.setDouble(16, cvi.getGrav_ley_25413());
            ps.setDouble(17, cvi.getInt_numerales());
            ps.setDouble(18, cvi.getOtros());
            ps.setDouble(19, cvi.getOperaciones_exentas());
            ps.setDouble(20, cvi.getIng_brutos());
            ps.setDouble(21, cvi.getRet_iva());
            ps.setDouble(22, cvi.getImp_r_ing_brutos());
            ps.setDouble(23, cvi.getIva_facturado_21());
            ps.setDouble(24, cvi.getIva_facturado_27());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public void eliminarTransaccion(String idtransaccion) {
        PreparedStatement ps = null;
        Connection conn = getConnection();

        String sql = "DELETE FROM transacciones AS t WHERE t.idtransacciones = '" + idtransaccion + "'";

        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);

        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }

    public void eliminarCvi(String idtransaccion) {
        PreparedStatement ps = null;
        Connection conn = getConnection();

        String sql = "DELETE FROM compra_ventas_iva AS cvi WHERE cvi.id_transaccion = '" + idtransaccion + "'";

        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);

        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    }

    public boolean existeIdTransaccioncvi(int id) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        try {
            String sql = "SELECT * FROM compra_ventas_iva as cvi WHERE cvi.id_transaccion =" + id;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    /*Método para obtener otros datos de la transaccion (cuenta,categoria,empresa,numeroCheque,numeroEmpresa)*/
    public TransaccionEditable obtenerDatosT(int idTransaccion) {
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        TransaccionEditable t = new TransaccionEditable();
        try {
            String sql = "SELECT cat.nombre AS categoria,e.empresa AS empresa,c.nombre AS cuenta,t.cheque AS cheque,\n"
                    + "t.num_fact AS factura,t.descripcion AS descripcion,t.cantidad AS cantidad,sub.nombre AS subcategoria\n"
                    + "FROM transacciones AS t\n"
                    + "INNER JOIN categorias AS cat ON t.id_categoria = cat.idcategorias\n"
                    + "INNER JOIN empresa_orden AS e ON t.id_orden_empresa = e.idempresa_orden\n"
                    + "INNER JOIN cuentas as c ON t.id_cuenta = c.idcuenta\n"
                    + "INNER JOIN subcategorias as sub ON t.id_subcategoria = sub.idsubcategorias\n"
                    + "WHERE t.idtransacciones = " + idTransaccion;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                t.setCategoria(rs.getString("categoria"));
                t.setEmpresa(rs.getString("empresa"));
                t.setCuenta(rs.getString("cuenta"));
                t.setNumeroCheque(rs.getString("cheque"));
                t.setNumeroFactura(rs.getString("factura"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSubCategoria(rs.getString("subcategoria"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return t;
    }

    public TransaccionEditable obtenerDatosT2(int idTransaccion) {
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        TransaccionEditable t = new TransaccionEditable();
        try {
            String sql = "SELECT cat.nombre AS categoria,t.salidas,t.entradas,e.empresa AS empresa,c.nombre AS cuenta,t.cheque AS cheque,t.num_fact AS factura,t.descripcion AS descripcion,t.cantidad AS cantidad\n"
                    + "FROM transacciones AS t\n"
                    + "INNER JOIN categorias AS cat ON t.id_categoria = cat.idcategorias\n"
                    + "INNER JOIN empresa_orden AS e ON t.id_orden_empresa = e.idempresa_orden\n"
                    + "INNER JOIN cuentas as c ON t.id_cuenta = c.idcuenta\n"
                    + "WHERE t.idtransacciones = " + idTransaccion;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                t.setCategoria(rs.getString("categoria"));
                t.setEmpresa(rs.getString("empresa"));
                t.setCuenta(rs.getString("cuenta"));
                t.setSalidas(rs.getDouble("salidas"));
                t.setEntradas(rs.getDouble("entradas"));
                t.setNumeroCheque(rs.getString("cheque"));
                t.setNumeroFactura(rs.getString("factura"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return t;
    }

    public ArrayList<Transaccion> obtenerTransaccionesPorFecha(String fecha_desde, String fecha_hasta) {

        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n"
                    + "transacciones as t\n"
                    + "WHERE t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                t.setVerificada(rs.getBoolean("verificada"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }

    public void setStateTransaccion(boolean estado, int id) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE transacciones AS t SET t.verificada = ? WHERE t.idtransacciones = "+id;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.execute();
        } catch (SQLException e) {
            System.err.println(e);
        } 
    }
}
