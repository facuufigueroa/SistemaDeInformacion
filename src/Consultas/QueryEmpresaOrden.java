
package Consultas;

import DataBase.Conexion;
import Model.EmpresaOrden;
import java.sql.Connection;
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




}
