
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.SubCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public void agregarSubcategoria(SubCategoria subcategoria){
        PreparedStatement ps = null;
        Connection conn = getConnection();
        String sql = "INSERT INTO subcategorias (nombre) VALUES(?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, subcategoria.getNombre());
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
    
    public int obtenerIdSubCatPorNombre(String nombre){
        int id_subCat=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT s.idsubcategorias \n" +
                            "FROM subcategorias AS s\n" +
                            "WHERE s.nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_subCat = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return id_subCat;
    }
    
    public String obtenerSubCatPorId(int idSubCat){
        String nombre = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT s.nombre \n" +
                            "FROM subcategorias AS s\n" +
                            "WHERE s.idsubcategorias = " +idSubCat;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombre = rs.getString("nombre");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return nombre;
    }
}
