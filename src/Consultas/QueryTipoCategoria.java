
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.TipoCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryTipoCategoria {
    
    
    public ArrayList<TipoCategoria> listarTiposCat(){
        ArrayList<TipoCategoria> tipoCategoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM tipo_categoria";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoCategoria tipoCategoria = new TipoCategoria();
                tipoCategoria.setNombre(rs.getString("nombre"));
                tipoCategoriaList.add(tipoCategoria);
            }
        } catch (NumberFormatException | SQLException e) {
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
       return tipoCategoriaList;
    }
    
    public void agregarTipoCat(TipoCategoria tipoCat){
        PreparedStatement ps = null;
        Connection conn = getConnection();
        String sql = "INSERT INTO tipo_categoria (nombre) VALUES(?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoCat.getNombre());
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
