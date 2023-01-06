
package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.EmpresaOrden;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryEmpresaOrden {
    
     public ArrayList<EmpresaOrden> listarEmpresaOrden(){
        ArrayList<EmpresaOrden> empresaOrdenList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM empresa_orden";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                EmpresaOrden empresaOrden = new EmpresaOrden();
                empresaOrden.setNombre(rs.getString("empresa"));
                empresaOrden.setCuit(rs.getString("cuit"));
                empresaOrdenList.add(empresaOrden);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return empresaOrdenList;
    }

     public ArrayList<String> listarPorNombre(){
        ArrayList<String> empresaOrdenList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT empresa FROM empresa_orden";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                empresaOrdenList.add(rs.getString("empresa"));
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return empresaOrdenList;
    }

    public void agregarEmpresa(EmpresaOrden empresa){
        PreparedStatement ps = null;
        Connection conn = getConnection();
        String sql = "INSERT INTO empresa_orden (empresa,cuit) VALUES(?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, empresa.getNombre());
            ps.setString(2, empresa.getCuit());
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
    
    public EmpresaOrden buscarPorNombre(String nombre){
        String[] dato = new String[3];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = getConnection();
        EmpresaOrden eo = new EmpresaOrden();

        String sql = "SELECT * FROM empresa_orden WHERE empresa = '" + nombre + "' ORDER BY empresa";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                eo.setNombre(rs.getString("nombre"));
                eo.setCuit(rs.getString("cuit"));
            }
        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return eo;
    }
    
    
    
    
    


}
