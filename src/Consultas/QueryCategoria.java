
package Consultas;

import DataBase.Conexion;
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
        int id_categoria=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT id_tipo_categoria FROM categorias WHERE nombre = '" + nombre + "'";
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
    
    public ArrayList<Categoria> listarCategorias(){
        ArrayList<Categoria> categoriaList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM categorias";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setNombre(rs.getString("nombre"));
                categoria.setTipoCategoria(obtenerTipoCategoria(obtenerIdTipoCatPorNombre(categoria.getNombre())));
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
    
}
