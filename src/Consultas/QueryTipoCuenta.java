
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.TipoCategoria;
import Model.TipoCuenta;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryTipoCuenta {
        
    public ArrayList<TipoCuenta> listarTipoCuentas(){
        ArrayList<TipoCuenta> tipoCuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM tipo_cuenta";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoCuenta tipoCuenta = new TipoCuenta();
                tipoCuenta.setIdTipoCuenta(parseInt(rs.getString("idtipo_cuenta")));
                tipoCuenta.setNombre(rs.getString("tipo_cuenta"));
                tipoCuentas.add(tipoCuenta);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        finally {
        // Cerrar la conexión en el bloque finally para asegurar que se cierre incluso si ocurre una excepción.
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
       return tipoCuentas;
    }
    
   public void agregarTipoCuenta(TipoCuenta tipoCuenta){
        PreparedStatement ps = null;
        Connection conn = getConnection();
        String sql = "INSERT INTO tipo_cuenta (tipo_cuenta) VALUES(?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoCuenta.getNombre());
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
    
    
}
