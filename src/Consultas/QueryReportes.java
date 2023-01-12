
package Consultas;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        return total;
    }
}
