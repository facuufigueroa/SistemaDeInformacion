package Consultas;

import DataBase.Conexion;
import static DataBase.Conexion.getConnection;
import Model.Cuentas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueryCuentas {

    public ArrayList<String> listarPorNombre() {
        ArrayList<String> cuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT nombre FROM cuentas ORDER BY cuentas.nombre";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cuentas.add(rs.getString("nombre"));
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
        return cuentas;
    }

    public ArrayList<Cuentas> listarCuentas2() {
        ArrayList<Cuentas> cuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT c.nombre as 'nom_cuenta', t.tipo_cuenta as 'nombre_tipo_cuenta'\n"
                    + "FROM cuentas as c\n"
                    + "INNER JOIN tipo_cuenta as t\n"
                    + "ON t.idtipo_cuenta = c.id_tipo_cuenta";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cuentas cuenta = new Cuentas();
                cuenta.setNombre(rs.getString("nom_cuenta"));
                cuenta.setTipoCuenta(rs.getString("nombre_tipo_cuenta"));
                cuentas.add(cuenta);
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
        return cuentas;
    }

    public void agregarCuenta(Cuentas cuenta) {
        PreparedStatement ps;
        Connection conn = getConnection();
        String sql = "INSERT INTO cuentas(nombre,id_tipo_cuenta) VALUES(?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cuenta.getNombre());
            ps.setInt(2, cuenta.getId_tipoCuenta());
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

    public int obtenerIdCuentaPorNombre(String nombre) {
        int id_cuenta = 0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT c.idcuenta \n"
                    + "FROM cuentas AS c\n"
                    + "WHERE c.nombre = '" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_cuenta = rs.getInt(1);
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
        return id_cuenta;
    }

    public String obtenerNombreTipoCuenta(int id_cuenta) {
        String nombreTipoCuenta = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT t.tipo_cuenta as nombre_tipo_cuenta \n"
                    + "FROM tipo_cuenta as t\n"
                    + "WHERE t.idtipo_cuenta = " + id_cuenta;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombreTipoCuenta = rs.getString(1);
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

        return nombreTipoCuenta;
    }

    public int obtenerIdTipoCuenta(String nombre) {
        int id_tipo_cuenta = 0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT t.idtipo_cuenta\n"
                    + "FROM tipo_cuenta as t\n"
                    + "WHERE t.tipo_cuenta ='" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_tipo_cuenta = rs.getInt(1);
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

        return id_tipo_cuenta;
    }

    public int obtenerIdTipoCuenta2(String nombre) {
        int id_tipo_cuenta = 0;
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT t.idtipo_cuenta\n"
                    + "FROM cuentas AS c\n"
                    + "INNER JOIN tipo_cuenta AS t\n"
                    + "ON t.idtipo_cuenta = c.id_tipo_cuenta\n"
                    + "WHERE c.nombre ='" + nombre + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                id_tipo_cuenta = rs.getInt(1);
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

        return id_tipo_cuenta;
    }

    /*Obtiene el nombre del tipo de cuenta por transacción,usado en la vista EditView*/
    public String obtenerTipoCuenta(String nombreCuenta) {
        String nombreTipoCuenta = "";
        PreparedStatement ps = null;
        Connection conn = Conexion.getConnection();
        try {
            String sql = "SELECT tc.tipo_cuenta AS nombre_tc\n"
                    + "FROM tipo_cuenta AS tc\n"
                    + "INNER JOIN cuentas AS c ON c.id_tipo_cuenta = tc.idtipo_cuenta\n"
                    + "WHERE c.nombre ='" + nombreCuenta + "'";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                nombreTipoCuenta = rs.getString("nombre_tc");
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

        return nombreTipoCuenta;
    }

}
