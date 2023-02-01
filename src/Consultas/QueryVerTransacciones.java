
package Consultas;

import DataBase.Conexion;
import Model.Transaccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueryVerTransacciones {
    
    private Conexion conexion = new Conexion();
    
    public String obtenerEmpresa(int idEmpresa){
        String nombre = "";
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        try {
            String sql = "SELECT e.empresa \n" +
                            "FROM empresa_orden AS e\n" +
                            "WHERE e.idempresa_orden = " + idEmpresa;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombre= rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return nombre;
    }
    
    
    
    public ArrayList<Transaccion> obtenerTransaccionesPorCategorias(String categoria,String fecha_desde, String fecha_hasta){
        
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n" +
                            "transacciones as t\n" +
                            "INNER JOIN categorias as c ON t.id_categoria = c.idcategorias\n" +
                            "WHERE c.nombre = '" +categoria +"' AND t.fecha BETWEEN '"+fecha_desde+"'"+" AND '"+fecha_hasta+ " ' ORDER BY t.fecha ASC" ;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion(); 
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }
    
    public ArrayList<Transaccion> obtenerTransaccionesPorSubCategoria(String SubCategoria,String fecha_desde, String fecha_hasta){
        
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n" +
                            "transacciones as t\n" +
                            "INNER JOIN subcategorias as sc ON t.id_subcategoria = sc.idsubcategorias\n" +
                            "WHERE sc.nombre = '" +SubCategoria+"' AND t.fecha BETWEEN '"+fecha_desde+"'"+" AND '"+fecha_hasta+ " ' ORDER BY t.fecha ASC" ;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion(); 
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }
    
    public ArrayList<Transaccion> obtenerTransaccionesPorCuenta(String cuenta,String fecha_desde, String fecha_hasta){
        
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n" +
                            "transacciones as t\n" +
                            "INNER JOIN cuentas as c ON t.id_cuenta = c.idcuenta\n" +
                            "WHERE c.nombre = '" +cuenta+"' AND t.fecha BETWEEN '"+fecha_desde+"'"+" AND '"+fecha_hasta+ " ' ORDER BY t.fecha ASC" ;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion(); 
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }
    
    public ArrayList<Transaccion> obtenerTransaccionesPorEmpresa(String empresa,String fecha_desde, String fecha_hasta){
        
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        ArrayList<Transaccion> transaccionesList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM \n" +
                            "transacciones as t\n" +
                            "INNER JOIN empresa_orden as e ON t.id_orden_empresa = e.idempresa_orden\n" +
                            "WHERE e.empresa = '" +empresa+"' AND t.fecha BETWEEN '"+fecha_desde+"'"+" AND '"+fecha_hasta+ " ' ORDER BY t.fecha ASC" ;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                Transaccion t = new Transaccion(); 
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                t.setIdOrdenEmp(rs.getInt("id_orden_empresa"));
                transaccionesList.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return transaccionesList;
    }
    
    public Transaccion obtenerTransaccion(int numT){
        String nombre = "";
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        Transaccion trans = new Transaccion();
        try {
            String sql = "SELECT t.idtransacciones,t.codigo,t.fecha,t.descripcion,t.salidas,t.entradas,t.a_impuestos_iva,t.a_iva FROM transacciones as t WHERE t.idtransacciones= " +numT;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                trans.setIdTransaccion(rs.getInt("idtransacciones"));
                trans.setCodigo(rs.getString("codigo"));
                trans.setDescripcion(rs.getString("descripcion"));
                trans.setFecha(rs.getDate("fecha"));
                trans.setSalida(rs.getFloat("salidas"));
                trans.setEntrada(rs.getFloat("entradas"));
                trans.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                trans.setA_iva(rs.getBoolean("a_iva"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return trans;
    }
    
    
    
    public ArrayList<Transaccion> listarTransacciones(){
        ArrayList<Transaccion> tList = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM transacciones AS t ORDER BY t.fecha ASC";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setIdTransaccion(rs.getInt("idtransacciones"));
                t.setCodigo(rs.getString("codigo"));
                t.setFecha(rs.getDate("fecha"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setSalida(rs.getFloat("salidas"));
                t.setEntrada(rs.getFloat("entradas"));
                t.setA_impuesto(rs.getBoolean("a_impuestos_iva"));
                t.setA_iva(rs.getBoolean("a_iva"));
                tList.add(t);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return tList;
    }
    
    public boolean existeIdTransaccion(int id){
        
        PreparedStatement ps = null;
        Connection conn = conexion.getConnection();
        try {
            String sql = "SELECT * FROM transacciones as t WHERE t.idtransacciones =" +id;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
    
}
