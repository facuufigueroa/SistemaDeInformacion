
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.Transaccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryTransaccion {
    
     public void addTransaccion(Transaccion t){
        PreparedStatement ps;
        Connection conn = getConnection();
        String sql = "INSERT INTO transacciones(codigo,id_cuenta,cheque,num_fact,fecha,descripcion,id_orden_empresa,cantidad,id_categoria,id_subcategoria,salidas,entradas,a_impuestos_iva,a_iva) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getCodigo());
            ps.setInt(2, t.getIdCuenta());
            ps.setString(3, t.getNumCheque());
            ps.setString(4, t.getNumFactura());
            ps.setDate(5, (Date) t.getFecha());
            ps.setString(6, t.getDescripcion());
            ps.setInt(7, t.getIdOrdenEmp());
            ps.setInt(8,t.getCantidad());
            ps.setInt(9, t.getIdCat());
            ps.setInt(10, t.getIdSubCat());
            ps.setFloat(11, t.getSalida());
            ps.setFloat(12, t.getEntrada());
            ps.setBoolean(13, t.isA_impuesto());
            ps.setBoolean(14, t.isA_iva());
            ps.execute();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
     
    public ArrayList<Transaccion> listarTransacciones(){
        ArrayList<Transaccion> tList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM transacciones AS t ORDER BY t.idtransacciones DESC";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                tList.add(t);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return tList;
    }
    
    public int obtenerMaxId(){
        int max_id=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT MAX(idtransacciones)\n" +
                            "FROM transacciones";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                max_id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return max_id ;
    }
    
    public void eliminarTransaccion(){
        PreparedStatement ps = null;
        Connection conn = getConnection();

        String sql = "DELETE FROM transacciones WHERE idtransacciones = ?";

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
    
     public void modificarTransaccion(Transaccion t, String idtransaccion){
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE transacciones SET fecha = ?,salidas = ? , entradas = ? WHERE idtransacciones = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) t.getFecha());
            ps.setFloat(2,t.getSalida());
            ps.setFloat(2,t.getEntrada());
            ps.setInt(4, t.getIdTransaccion());
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
     
    public int obtenerIdTransaccion(String codigo){
        int id=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT idtransacciones\n" +
                            "FROM transacciones AS t WHERE t.codigo = "+codigo+"'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return id ;
    }
    
    public boolean verificarCodigoT(String codigo){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT *" +
                            "FROM transacciones AS t WHERE t.codigo = '"+codigo.toUpperCase()+"'";
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
    
    public boolean verificarNumFactura(String numFact){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT *" +
                            "FROM transacciones AS t WHERE t.num_fact = '"+numFact+"'";
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
    
    public boolean verificarNumCheque(String numCheque){
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT *" +
                            "FROM transacciones AS t WHERE t.cheque = '"+numCheque+"'";
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
}
