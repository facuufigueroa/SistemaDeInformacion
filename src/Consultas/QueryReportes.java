
package Consultas;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryReportes {
    
    public Double totalImp_Neto_Grav(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.imp_neto_grav),2) AS totalImpNetoGrav\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("totalImpNetoGrav");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ivaFact(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.iva_facturado),2) AS totalIva_fact\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("totalIva_fact");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ite_iva_dere_reg(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.ite_iva_dere_reg),2) AS ite_iva_dere_reg\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("ite_iva_dere_reg");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_concepto_no_grav_sellos(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.c_no_grav_sellos ),2) AS c_no_grav_sellos \n" +
                    "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("c_no_grav_sellos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ret_ii_bb_vent(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.ret_ii_bb_venta),2) AS ret_ii_bb_venta\n" +
                        "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("ret_ii_bb_venta");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ret_ganancias(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.ret_ganancias),2) AS ret_ganancias\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("ret_ganancias");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ret_iva(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.percepcion_iva),2) AS percepcion_iva\n" +
                "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("percepcion_iva");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_imp_total_fac(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.imp_total_fac),2) AS imp_total_fac\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='venta'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("imp_total_fac");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    
    
    
    /* PARA COMPRAS */
    public Double totalImp_Neto_Grav_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.imp_neto_grav),2) AS totalImpNetoGrav\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("totalImpNetoGrav");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ivaFact_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.iva_facturado),2) AS totalIva_fact\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("totalIva_fact");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_concepto_no_grav_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.concepto_no_grav ),2) AS concepto_no_grav\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("concepto_no_grav");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_imp_interno_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.imp_interno ),2) AS imp_interno\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra' ";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("imp_interno");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_perc_iibb_compra_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.perc_iibb_compra ),2) AS perc_iibb_compra\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("perc_iibb_compra");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ret_iva_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.percepcion_iva),2) AS percepcion_iva\n" +
                "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("percepcion_iva");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_imp_total_fac_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.imp_total_fac),2) AS imp_total_fac\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("imp_total_fac");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    public Double total_ret_ganancias_c(){
        double total = 0.0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT TRUNCATE(SUM(cvi.ret_ganancias),2) AS ret_ganancias\n" +
                            "FROM compra_ventas_iva as cvi WHERE cvi.operacion='compra'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                total = rs.getDouble("ret_ganancias");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return total;
    }
    
    
    /* Totales salidas y entradas de cuentas a cobrar*/
    public ArrayList totales(Date fecha_desde, Date fecha_hasta){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        ArrayList<Double> totalesArray = new ArrayList<>();
        try {
            String sql = "SELECT  DISTINCT TRUNCATE(SUM(t.salidas),2) as total_salidas,\n" +
                            "TRUNCATE(SUM(t.entradas),2) as total_entradas\n" +
                            "FROM empresa_orden as e\n" +
                            "INNER JOIN transacciones as t on t.id_orden_empresa = e.idempresa_orden\n" +
                            "INNER JOIN cuentas as c on c.idcuenta = t.id_cuenta\n" +
                            "WHERE c.idcuenta = 12 AND t.fecha BETWEEN '"+ fecha_desde + "' "+ " AND '" + fecha_hasta+"'";;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                totalesArray.add(0, rs.getDouble("total_entradas"));
                totalesArray.add(1, rs.getDouble("total_salidas"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return totalesArray;
    }
    
    /* Totales salidas y entradas de cuentas a Pagar*/
    public ArrayList totales_c_ap(Date fecha_desde, Date fecha_hasta){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        ArrayList<Double> totalesArray = new ArrayList<>();
        try {
            String sql = "SELECT  DISTINCT TRUNCATE(SUM(t.salidas),2) as total_salidas,\n" +
                            "TRUNCATE(SUM(t.entradas),2) as total_entradas\n" +
                            "FROM empresa_orden as e\n" +
                            "INNER JOIN transacciones as t on t.id_orden_empresa = e.idempresa_orden\n" +
                            "INNER JOIN cuentas as c on c.idcuenta = t.id_cuenta\n" +
                            "WHERE c.idcuenta = 13 AND t.fecha BETWEEN '"+ fecha_desde + "' "+ " AND '" + fecha_hasta+"'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                totalesArray.add(0, rs.getDouble("total_entradas"));
                totalesArray.add(1, rs.getDouble("total_salidas"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return totalesArray;
    }
    
    /* Totales salidas y entradas de JMR transacciones*/
    public ArrayList totales_jmr(Date fecha_desde, Date fecha_hasta){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        ArrayList<Double> totalesArray = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT TRUNCATE(SUM(t.salidas),2) as suma_salidas, TRUNCATE(SUM(t.entradas),2) as suma_entradas\n" +
                            "FROM categorias as c\n" +
                            "INNER JOIN tipo_categoria as tc ON c.id_tipo_categoria = tc.idtipo_categoria\n" +
                            "INNER JOIN transacciones as t ON t.id_categoria = c.idcategorias\n" +
                            "WHERE tc.idtipo_categoria=40\n" +
                            "Or tc.idtipo_categoria=32 \n" +
                            "Or tc.idtipo_categoria=33\n" +
                            "Or tc.idtipo_categoria=35\n" +
                            "Or tc.idtipo_categoria=37\n" +
                            "Or tc.idtipo_categoria=38\n" +
                            "And c.idcategorias<>121 \n" +
                            "And c.idcategorias<>138 AND t.fecha BETWEEN '"+ fecha_desde + "' "+ " AND '" + fecha_hasta+"'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                totalesArray.add(0, rs.getDouble("suma_entradas"));
                totalesArray.add(1, rs.getDouble("suma_salidas"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        return totalesArray;
    }
    
    
}
