
package Controller;


import Consultas.QueryReportes;
import Reportes.ReporteCuentasACobrar;
import Reportes.ReporteLibroComprasIVA;
import Reportes.ReporteLibroVentasIVA;
import View.FormFechas;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    FormFechas formFechaVentas = new FormFechas();
    FormFechas formFechaCompras = new FormFechas();
    FormFechas formFechaReportCAC = new FormFechas();
    QueryReportes queryReport = new QueryReportes();
       
    
    public MenuController() {
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);

        
        CuentaController cuentaC = new CuentaController(menuPrincipal);
        TipoCuentasController tc = new TipoCuentasController(menuPrincipal);
        EmpresaOrdenController eo = new EmpresaOrdenController(menuPrincipal);
        CategoriaController categoriaController = new CategoriaController(menuPrincipal);
        TipoCategoriaController tipoCatController = new TipoCategoriaController(menuPrincipal);
        SubCategoriaController subCatController = new SubCategoriaController(menuPrincipal);
            
        
        VerTransaccionesController verTransacciones = new VerTransaccionesController(menuPrincipal);
        
        this.menuPrincipal.btnLibroVentas.addActionListener(this);
        
        this.formFechaVentas.btnBuscar.addActionListener(this);
        

        this.menuPrincipal.btnLibroIvaCompras.addActionListener(this);
        this.formFechaCompras.btnBuscar.addActionListener(this);
        
        
        this.menuPrincipal.btnReportCuentasAC.addActionListener(this);
        this.formFechaReportCAC.btnBuscar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        newTransaccion(e);
        reporteLibroVentas(e);
        reporteLibroCompras(e);
        loadReporteLibroVentas(e);
        loadReporteLibroCompras(e);
        loadReporteCuentasACobrar(e);
        accionVerCuentasACobrar(e);
    }
    
    
    public void loadMenuPrincipal(){
       
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        
    }

        /*Metodo que abre la vista para generar nuevas transacciones*/
    public void newTransaccion(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnNewTransaccion){
            transaccionController.setearCamposEnCero();
            transaccionController.loadNewTransaccion();
        }
    } 
    
    
    
    
    public void verTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnVerTransacciones){
            
        }
    }
    
    public void reporteLibroVentas(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnLibroVentas){
            formFechaVentas.setVisible(true);
            
        }
    }
    
    public void loadReporteLibroVentas(ActionEvent e){
        
        if(e.getSource() == formFechaVentas.btnBuscar){
            java.sql.Date fecha_desde = new java.sql.Date(formFechaVentas.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaVentas.txtFechaHasta.getDate().getTime());
            
            /*Total Imp_Neto_Grav*/
            double t1 = queryReport.totalImp_Neto_Grav();
            /*Total total_ivaFact*/
            double t2 = queryReport.total_ivaFact();
            /* Total total_ite_iva_dere_reg*/
            double t3= queryReport.total_ite_iva_dere_reg();
            /* Total total_concepto_no_grav*/
            double t4 = queryReport.total_concepto_no_grav_sellos();
            /* Total total_ret_ii_bb_vent*/
            double t5 = queryReport.total_ret_ii_bb_vent();
            /* Total total_ret_ganancias */
            double t6 = queryReport.total_ret_ganancias();
            /* Total total_ret_iva() */
            double t7 = queryReport.total_ret_iva();
            /* Total total_imp_total_fac() */
            double t8= queryReport.total_imp_total_fac();
            
            ReporteLibroVentasIVA reportLVI = new ReporteLibroVentasIVA();
            reportLVI.conexionReporte(fecha_desde,fecha_hasta,t1,t2,t3,t4,t5,t6,t7,t8);
            formFechaVentas.setVisible(false);
        }
    }
    
    public void reporteLibroCompras(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnLibroIvaCompras){
            formFechaCompras.setVisible(true);
        }
    }
    
    public void loadReporteLibroCompras(ActionEvent e){
     
        if(e.getSource() == formFechaCompras.btnBuscar){
            
            java.sql.Date fecha_desde = new java.sql.Date(formFechaCompras.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaCompras.txtFechaHasta.getDate().getTime());
            
            /*Total Imp_Neto_Grav*/
            double t1 = queryReport.totalImp_Neto_Grav_c();
            /*Total total_ivaFact*/
            double t2 = queryReport.total_ivaFact_c();
            /* Total total_ite_iva_dere_reg*/
            double t3= queryReport.total_imp_interno_c();
            /* Total total_concepto_no_grav*/
            double t4 = queryReport.total_concepto_no_grav_c();
            /* Total total_ret_ii_bb_vent*/
            double t5 = queryReport.total_perc_iibb_compra_c();
            /* Total total_ret_ganancias */
            double t6 = queryReport.total_ret_ganancias_c();
            /* Total total_ret_iva() */
            double t7 = queryReport.total_ret_iva_c();
            /* Total total_imp_total_fac() */
            double t8= queryReport.total_imp_total_fac_c();
           
            ReporteLibroComprasIVA reportLCI = new ReporteLibroComprasIVA();
            reportLCI.openReportCompras(fecha_desde,fecha_hasta,t1,t2,t3,t4,t5,t6,t7,t8);
            formFechaCompras.setVisible(false);
        }
    }
    
    public void accionVerCuentasACobrar(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnReportCuentasAC){
            formFechaReportCAC.setVisible(true);
        }
    }
    
    public void loadReporteCuentasACobrar(ActionEvent e){
        if(e.getSource() == formFechaReportCAC.btnBuscar){
            
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportCAC.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportCAC.txtFechaHasta.getDate().getTime());
            
            ArrayList<Double> array = queryReport.totales();
            double total_e = array.get(0);
            double total_s = array.get(1);
            ReporteCuentasACobrar reportC = new ReporteCuentasACobrar();
            reportC.openReportCuentasACobrar(total_e,total_s,fecha_desde,fecha_hasta);
        }
    }
    
     
    

}
