
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class QueryCategoria {
    
    public String obtenerTipoCategoria(int idTipoCat){
        String nombreTipoCat = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT nombre FROM tipo_categoria WHERE idtipo_categoria = " + idTipoCat;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombreTipoCat = rs.getString("nombre");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return nombreTipoCat;
    }
    
    /* Obtener el id del tipo de categori por nombre de categoria*/
    public int obtenerIdTipoCatPorNombre(String nombre){
        int id_tipo_categoria=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT idtipo_categoria\n" +
                        "FROM tipo_categoria AS tc\n" +
                        "WHERE tc.nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_tipo_categoria = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return id_tipo_categoria;
    }
    
    public ArrayList<Categoria> listarCategorias(){
        ArrayList<Categoria> categoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT c.nombre as 'nom_categoria', t.nombre as 'nombre_tipo_cat'\n" +
                            "FROM categorias as c\n" +
                            "INNER JOIN tipo_categoria as t\n" +
                            "ON t.idtipo_categoria = c.id_tipo_categoria";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setNombre(rs.getString("nom_categoria"));
                categoria.setNombreString(rs.getString("nombre_tipo_cat"));
                categoriaList.add(categoria);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return categoriaList;
    }
    
    public ArrayList<String> listarPorNombre(){
        ArrayList<String> categoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT DISTINCT nombre FROM categorias ORDER BY categorias.nombre";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                categoriaList.add(rs.getString("nombre"));
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return categoriaList;
    }
    
    public void agregarCat(Categoria cat){
        PreparedStatement ps;
        Connection conn = getConnection();
        String sql = "INSERT INTO categorias(nombre,id_tipo_categoria) VALUES(?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cat.getNombre());
            ps.setInt(2, cat.getTipoCategoria());
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
    
    
    
    public ArrayList<Categoria> listarCategorias2(String nombreTipo){
        ArrayList<Categoria> categoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM categorias";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Categoria categoria = new Categoria();
            while (rs.next()) {
                
                categoria.setNombre(rs.getString("nombre"));
                
                categoria.setTipoCategoria((obtenerIdTipoCatPorNombre(nombreTipo)));
                
                categoriaList.add(categoria);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return categoriaList;
    }
    
    /* Traer la id  tipo categoria con el nombre de la categoria*/
    public int obtenerIdTipoCat(String nombre){
        int id_categoria=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT DISTINCT c.id_tipo_categoria \n" +
                            "FROM categorias as c \n" +
                            "WHERE c.nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_categoria = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return id_categoria;
    }
    
     public String obtenerNombreTipoCat(int idCat){
        String nombreTipoCat = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT t.nombre \n" +
                            "FROM tipo_categoria AS t \n" +
                            "WHERE t.idtipo_categoria = " + idCat;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombreTipoCat = rs.getString("nombre");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return nombreTipoCat;
    }
    
     public int obtenerIdCatePorNombre(String nombre){
        int id_cat=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT c.idcategorias \n" +
                            "FROM categorias AS c\n" +
                            "WHERE c.nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_cat = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return id_cat;
    }
}
