
package Reportes;

import DataBase.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class CategoriasReport {
    
    public void openReportCategorias(){
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            JasperReport jasperMasterReport;
            jasperMasterReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/categorias.jasper"));
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jasperMasterReport,null, conn);
            JasperViewer reporteMaster = new JasperViewer(mostrarReporte,false);
            reporteMaster.setTitle(" JMR - Categorias y Tipo de Categorias ");
            reporteMaster.setVisible(true);
           
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ">>" + ex);
        }
    }
}
