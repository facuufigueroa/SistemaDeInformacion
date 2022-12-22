
package Consultas;

import DataBase.Conexion;
import Model.Cuentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueryCuentas {
    
    
    
    
    
    
    public String obtenerTipoCuenta(int idTipoCuenta){
        String nombreTipoCuenta = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT tipo_cuenta FROM tipo_cuenta WHERE idtipo_cuenta = " + idTipoCuenta;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombreTipoCuenta = rs.getString("tipo_cuenta");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return nombreTipoCuenta;
    }
    
    public int obtenerIdCuentaPorNombre(String nombre){
        int id_cuenta=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT id_tipo_cuenta FROM cuentas WHERE nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_cuenta = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return id_cuenta;
    }
    
    public ArrayList<Cuentas> listarCuentas(){
        ArrayList<Cuentas> cuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM cuentas";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cuentas cuenta = new Cuentas();
                cuenta.setNombre(rs.getString("nombre"));
                cuenta.setTipoCuenta(obtenerTipoCuenta(obtenerIdCuentaPorNombre(cuenta.getNombre())));
                cuentas.add(cuenta);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return cuentas;
    }
    
    public ArrayList<String> listarPorNombre(){
        ArrayList<String> cuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT nombre FROM cuentas ORDER BY cuentas.nombre";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cuentas.add(rs.getString("nombre"));
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return cuentas;
    }
    
}
