
package Consultas;

import static DataBase.Conexion.getConnection;
import Model.CompraVentaIva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class QueryCompraVentaIVA {
    
    public void agregarCompraVenta(CompraVentaIva cvi){
        PreparedStatement ps;
        Connection conn = getConnection();
        String sql = "INSERT INTO compra_ventas_iva (operacion,fecha,tipo_comprobante,nro_comprobante,cuit,imp_neto_grav,iva_facturado,imp_interno,concepto_no_grav,percepcion_iva,ret_ganancias,perc_iibb_compra,imp_total_fac,ite_iva_dere_reg,c_no_grav_sellos,ret_ii_bb_venta,iva_rg_212,grav_ley_25413,int_numerales,otros,id_transaccion,nombre,operaciones_exentas) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cvi.getOperacion());
            ps.setDate(2, cvi.getFecha());
            ps.setString(3,cvi.getTipo_comprobante());
            ps.setString(4, cvi.getNumComprobante());
            ps.setString(5, cvi.getCuit());
            ps.setFloat(6,cvi.getImp_neto_grav());
            ps.setFloat(7, cvi.getIva_facturado());
            ps.setFloat(8, cvi.getImp_interno());
            ps.setFloat(9, cvi.getConcep_no_grav());
            ps.setFloat(10, cvi.getPercepcion_iva());
            ps.setFloat(11, cvi.getRet_ganancias());
            ps.setFloat(12, cvi.getPerc_iibb_compra());
            ps.setFloat(13, cvi.getImp_total_fact());
            ps.setFloat(14, cvi.getIte_iva_dere_reg());
            ps.setFloat(15, cvi.getC_no_grav_sellos());
            ps.setFloat(16, cvi.getRet_iibb_venta());
            ps.setFloat(17, cvi.getIva_rg_212());
            ps.setFloat(18, cvi.getGrav_ley_25413());
            ps.setFloat(19, cvi.getInt_numerales());
            ps.setFloat(20, cvi.getOtros());
            
            ps.setInt(21, cvi.getIdTransaccion());
            
            ps.setString(22, cvi.getEmpresa());
            
            ps.setFloat(23, cvi.getOperaciones_exentas());
           
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
