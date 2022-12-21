
package Consultas;

import DataBase.Conexion;
import Model.TipoCuenta;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class QueryTipoCuenta {
        
    public ArrayList<TipoCuenta> listarTipoCuentas(){
        ArrayList<TipoCuenta> tipoCuentas = new ArrayList<>();
        Connection conn = Conexion.getConnection();
        Statement st;
        try {
            String sql = "SELECT * FROM tipo_cuenta";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                TipoCuenta tipoCuenta = new TipoCuenta();
                tipoCuenta.setIdTipoCuenta(parseInt(rs.getString("idtipo_cuenta")));
                tipoCuenta.setNombre(rs.getString("tipo_cuenta"));
                tipoCuentas.add(tipoCuenta);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
       return tipoCuentas;
    }
    
    
    
    
    
}
