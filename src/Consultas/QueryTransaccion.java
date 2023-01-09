
package Consultas;

import static DataBase.Conexion.getConnection;
import Model.Categoria;
import Model.Transaccion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class QueryTransaccion {
    
     public void addTransaccion(Transaccion t){
        PreparedStatement ps;
        Connection conn = getConnection();
        String sql = "INSERT INTO transacciones(id_cuenta,cheque_fact,fecha,descripcion,id_orden_empresa,cantidad,id_categoria,id_subcategoria,salidas,entradas,retenciones_g,ret_ingresos_brutos,a_impuestos_iva,a_iva) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getIdCuenta());
            ps.setString(2, t.getNumChequeFact());
            ps.setDate(3, (Date) t.getFecha());
            ps.setString(4, t.getDescripcion());
            ps.setInt(5, t.getIdOrdenEmp());
            ps.setInt(6,t.getCantidad());
            ps.setInt(7, t.getIdCat());
            ps.setInt(8, t.getIdSubCat());
            ps.setFloat(9, t.getSalida());
            ps.setFloat(10, t.getEntrada());
            ps.setFloat(11, t.getRetenciones_g());
            ps.setFloat(12, t.getRet_ing_brutos());
            ps.setBoolean(13, t.isA_impuesto());
            ps.setBoolean(14, t.isA_iva());
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
}
