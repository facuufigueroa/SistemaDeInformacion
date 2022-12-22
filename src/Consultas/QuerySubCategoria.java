
package Consultas;

import DataBase.Conexion;
import Model.SubCategoria;
import Model.TipoCategoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QuerySubCategoria {
    
    
    public ArrayList<SubCategoria> listarSubCat(){
        ArrayList<SubCategoria> subCategoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM subcategorias ORDER BY subcategorias.nombre";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SubCategoria subCategoria = new SubCategoria();
                subCategoria.setNombre(rs.getString("nombre"));
                subCategoriaList.add(subCategoria);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return subCategoriaList;
    }
}
