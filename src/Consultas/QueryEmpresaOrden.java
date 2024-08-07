
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
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
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
        finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
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
    
    
    public int obtenerIdEmpresaPorNombre(String nombre){
        int id_emp=0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT e.idempresa_orden \n" +
                            "FROM empresa_orden AS e\n" +
                            "WHERE e.empresa = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_emp = rs.getInt(1);
            }

        } catch (Exception e) {
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

        return id_emp;
    }
    
    public String obtenerCuitPorNombre(String nombre){
        String cuit = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT e.cuit \n" +
                            "FROM empresa_orden AS e\n" +
                            "WHERE e.empresa = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                cuit = rs.getString("cuit");
            }

        } catch (Exception e) {
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

        return cuit;
    }
    
    public EmpresaOrden obtenerEmpresaPorId(int idE){
        /*String empresa = "";*/
        EmpresaOrden empresa = new EmpresaOrden();
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT * \n" +
                            "FROM empresa_orden as e\n" +
                            "WHERE e.idempresa_orden = "+idE;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                empresa.setNombre(rs.getString("empresa"));
                empresa.setCuit(rs.getString("cuit"));
            }

        } catch (Exception e) {
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

        return empresa;
    }


}
