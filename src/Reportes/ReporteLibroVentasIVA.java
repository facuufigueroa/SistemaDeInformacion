
package Reportes;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class ReporteLibroVentasIVA {
    
    
    public void conexionReporte(Date fecha_desde,Date fecha_hasta,
                                double totalImp_Neto_Grav, double total_ivaFact,
                                double total_ite_iva_dere_reg, double total_concepto_no_grav,
                                double total_ret_ii_bb_vent, double total_ret_ganancias,
                                double total_ret_iva, double total_imp_total_fac){
                           
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            HashMap parametro = new HashMap();
            
            
            parametro.put("fecha_desde", fecha_desde);
            parametro.put("fecha_hasta", fecha_hasta);
            parametro.put("totalImp_Neto_Grav", totalImp_Neto_Grav);
            parametro.put("total_ivaFact", total_ivaFact);
            parametro.put("total_ite_iva_dere_reg",total_ite_iva_dere_reg);
            parametro.put("total_concepto_no_grav", total_concepto_no_grav);
            parametro.put("total_ret_ii_bb_vent", total_ret_ii_bb_vent);
            parametro.put("total_ret_ganancias", total_ret_ganancias);
            parametro.put("total_ret_iva", total_ret_iva);
            parametro.put("total_imp_total_fac", total_imp_total_fac);
            
            
            JasperReport jasperMasterReport;
            jasperMasterReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/LibroIVA-Ventas.jasper"));
          
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jasperMasterReport,parametro, conn);
            JasperViewer reporteMaster = new JasperViewer(mostrarReporte,false);
            reporteMaster.setTitle("Libro IVA - VENTAS ");
            reporteMaster.setVisible(true);
           
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ">>" + ex);
        }
    }
}
