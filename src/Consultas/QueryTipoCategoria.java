
package Consultas;

import DataBase.Conexion;
import Model.TipoCategoria;
import java.sql.Connection;
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
       return tipoCategoriaList;
    }
    
    
}
