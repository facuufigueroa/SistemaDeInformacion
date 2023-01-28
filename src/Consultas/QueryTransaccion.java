
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
        String sql = "INSERT INTO transacciones(id_cuenta,cheque_fact,fecha,descripcion,id_orden_empresa,cantidad,id_categoria,id_subcategoria,salidas,entradas,a_impuestos_iva,a_iva) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getIdCuenta());
            ps.setString(2, t.getNumChequeFact());
            ps.setDate(3, (Date) t.getFecha());
            ps.setString(4, t.getDescripcion());
            ps.setInt(5, t.getIdOrdenEmp());
            ps.setInt(6,t.getCantidad());
            ps.setInt(7, t.getIdCat());
            ps.setInt(8, t.getIdSubCat());
            ps.setFloat(9, t.getSalida());
            ps.setFloat(10, t.getEntrada());
            ps.setBoolean(11, t.isA_impuesto());
            ps.setBoolean(12, t.isA_iva());
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
            String sql = "SELECT * FROM transacciones AS t ORDER BY t.fecha DESC";
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
}
