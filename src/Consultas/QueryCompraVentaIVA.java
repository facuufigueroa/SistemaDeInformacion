
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
        String sql = "INSERT INTO compra_ventas_iva (operacion,fecha,tipo_comprobante,nro_comprobante,cuit,imp_neto_grav,iva_facturado_10,imp_interno,concepto_no_grav,percepcion_iva,ret_ganancias,perc_iibb_compra,imp_total_fac,ite_iva_dere_reg,c_no_grav_sellos,ret_ii_bb_venta,iva_rg_212,grav_ley_25413,int_numerales,otros,id_transaccion,nombre,operaciones_exentas,ing_brutos,ret_iva,imp_r_ing_brutos,iva_facturado_21,iva_facturado_27, imp_pais, imp_pais_arg, perc_afip_rg_4815, perc_iibb_bsas) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cvi.getOperacion());
            ps.setDate(2, cvi.getFecha());
            ps.setString(3,cvi.getTipo_comprobante());
            ps.setString(4, cvi.getNumComprobante());
            ps.setString(5, cvi.getCuit());
            ps.setDouble(6,cvi.getImp_neto_grav());
            ps.setDouble(7, cvi.getIva_facturado()); /*IVA FACTURADO DEL 10.5*/
            ps.setDouble(8, cvi.getImp_interno());
            ps.setDouble(9, cvi.getConcep_no_grav());
            ps.setDouble(10, cvi.getPercepcion_iva());
            ps.setDouble(11, cvi.getRet_ganancias());
            ps.setDouble(12, cvi.getPerc_iibb_compra());
            ps.setDouble(13, cvi.getImp_total_fact());
            ps.setDouble(14, cvi.getIte_iva_dere_reg());
            ps.setDouble(15, cvi.getC_no_grav_sellos());
            ps.setDouble(16, cvi.getRet_iibb_venta());
            ps.setDouble(17, cvi.getIva_rg_212());
            ps.setDouble(18, cvi.getGrav_ley_25413());
            ps.setDouble(19, cvi.getInt_numerales());
            ps.setDouble(20, cvi.getOtros());
            
            ps.setInt(21, cvi.getIdTransaccion());
            
            ps.setString(22, cvi.getEmpresa());
            
            ps.setDouble(23, cvi.getOperaciones_exentas());
            
            ps.setDouble(24, cvi.getIng_brutos());
            
            ps.setDouble(25, cvi.getRet_iva());
            
            ps.setDouble(26, cvi.getImp_r_ing_brutos());
            
            ps.setDouble(27, cvi.getIva_facturado_21());
            
            ps.setDouble(28, cvi.getIva_facturado_27());
            
            ps.setDouble(29,cvi.getImp_pais());
            
            ps.setDouble(30, cvi.getImp_pais_arg());
            
            ps.setDouble(31, cvi.getPerc_afip_rg_4815());
            
            ps.setDouble(32, cvi.getPerc_iibb_bsas());
           
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
