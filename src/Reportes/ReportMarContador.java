
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


public class ReportMarContador {
    
    public void openReportMARContador(Date fecha_desde, Date fecha_hasta){
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            HashMap parametro = new HashMap();
           
            parametro.put("fecha_desde", fecha_desde);
            parametro.put("fecha_hasta", fecha_hasta);
            JasperReport jasperMasterReport;
            jasperMasterReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/MAR-Contador.jasper"));
          
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jasperMasterReport,parametro, conn);
            
            JasperViewer reporteMaster = new JasperViewer(mostrarReporte,false);
            reporteMaster.setTitle(" María Amalia Roqués - Informe Contador ");
            reporteMaster.setVisible(true);
           
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ">>" + ex);
        }
    }
}
