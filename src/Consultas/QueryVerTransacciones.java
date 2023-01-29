
package Consultas;

import DataBase.Conexion;
import Model.Transaccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
