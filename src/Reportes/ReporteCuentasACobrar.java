
package Reportes;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class ReporteCuentasACobrar {
    
    
    public void openReportCuentasACobrar(double total_entradas, double total_salidas,Date fecha_desde, Date fecha_hasta){
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            HashMap parametro = new HashMap();
            
            parametro.put("total_entradas",total_entradas);
            parametro.put("total_salidas",total_salidas);
            parametro.put("fecha_desde", fecha_desde);
            parametro.put("fecha_hasta", fecha_hasta);
            JasperReport jasperMasterReport;
            jasperMasterReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Cuentas-A-Cobrar.jasper"));
          
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jasperMasterReport,parametro, conn);
            
            JasperViewer reporteMaster = new JasperViewer(mostrarReporte,false);
            reporteMaster.setTitle(" Cuentas a Cobrar ");
            reporteMaster.setVisible(true);
           
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ">>" + ex);
        }
    }
    
    
  
    
}
