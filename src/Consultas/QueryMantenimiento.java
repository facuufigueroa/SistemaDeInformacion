package Consultas;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryMantenimiento {

    public void eliminarTransacciones(String fecha_desde, String fecha_hasta) {

        PreparedStatement ps2 = null;
        Connection conn = Conexion.getConnection();
        try {
            //sqlSetUpdate();
            String sql = "DELETE FROM transacciones AS t\n"
                    + "WHERE t.fecha BETWEEN '" + fecha_desde + "' AND '" + fecha_hasta + "';";

            ps2 = conn.prepareStatement(sql);

            // Ejecutar la eliminación
            ps2.executeUpdate(sql);
            // Use DELETE

            // sqlSetUpdate1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void sqlSetUpdate() {

        PreparedStatement ps1 = null;

        Connection conn = Conexion.getConnection();
        try {
            String sqlSetUpdate = "SET SQL_SAFE_UPDATES = 0;";
            ps1 = conn.prepareStatement(sqlSetUpdate);
            ResultSet rs = ps1.executeQuery(sqlSetUpdate);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void sqlSetUpdate1() {

        PreparedStatement ps3 = null;
        Connection conn = Conexion.getConnection();
        try {
            String sqlSetUpdate1 = "SET SQL_SAFE_UPDATES = 1";
            ps3 = conn.prepareStatement(sqlSetUpdate1);
            ResultSet rs3 = ps3.executeQuery(sqlSetUpdate1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
