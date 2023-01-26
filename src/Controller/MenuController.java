
package Controller;


import Consultas.QueryReportes;
import Reportes.ReportMarTransaccion;
import Reportes.ReportRocioContador;
import Reportes.ReporteCuentaAPagar;
import Reportes.ReporteCuentasACobrar;
import Reportes.ReporteElRocioT;
import Reportes.ReporteJMRT;
import Reportes.ReporteLibroComprasIVA;
import Reportes.ReporteLibroVentasIVA;
import View.FormFechas;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    FormFechas formFechaVentas = new FormFechas();
    FormFechas formFechaCompras = new FormFechas();
    FormFechas formFechaReportCAC = new FormFechas();
    FormFechas formFechaReportCAP = new FormFechas();
    FormFechas formFechaReportJMR = new FormFechas();
    FormFechas formFechaReportElRocio = new FormFechas();
    FormFechas formFechaReportMar = new FormFechas();
    FormFechas formFechaReportElRocioContador = new FormFechas();
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
    
        this.menuPrincipal.btnCuentasAPagar.addActionListener(this);
        this.formFechaReportCAP.btnBuscar.addActionListener(this);
        
        this.formFechaReportJMR.btnBuscar.addActionListener(this);
        this.menuPrincipal.btnJMRT.addActionListener(this);
        
        this.formFechaReportElRocio.btnBuscar.addActionListener(this);
        this.menuPrincipal.btnElRocioT.addActionListener(this);
        
        this.formFechaReportMar.btnBuscar.addActionListener(this);
        this.menuPrincipal.btnMarT.addActionListener(this);
        
        this.menuPrincipal.btnRocioContador.addActionListener(this);
        this.formFechaReportElRocioContador.btnBuscar.addActionListener(this);
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
        accionVerCuentasAPagar(e);
        loadReporteCuentasAPagar(e);
        accionVerJMRTransacciones(e);
        loadReporteJMRT(e);
        accionVerElRocioTransacciones(e);
        loadReporteElRocio(e);
        accionVerMarTransacciones(e);
        loadReporteMar(e);
        accionVerElRocioContador(e);
        loadReporteElRocioContador(e);
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
            nullFechas(formFechaVentas);
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
            nullFechas(formFechaCompras);
            formFechaCompras.setVisible(false);
           
        }
    }
    
    public void accionVerCuentasACobrar(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnReportCuentasAC){
            formFechaReportCAC.setVisible(true);
            formFechaReportCAC.setLocationRelativeTo(null);
        }
    }
    
    public void loadReporteCuentasACobrar(ActionEvent e){
        if(e.getSource() == formFechaReportCAC.btnBuscar){
            
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportCAC.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportCAC.txtFechaHasta.getDate().getTime());
            
            ArrayList<Double> array = queryReport.totales(fecha_desde,fecha_hasta);
            double total_e = array.get(0);
            double total_s = array.get(1);
            ReporteCuentasACobrar reportC = new ReporteCuentasACobrar();
            reportC.openReportCuentasACobrar(total_e,total_s,fecha_desde,fecha_hasta);
            nullFechas(formFechaReportCAC);
            formFechaReportCAC.setVisible(false);
        }
    }
    
     public void accionVerCuentasAPagar(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnCuentasAPagar){
            formFechaReportCAP.setVisible(true);
            formFechaReportCAP.setLocationRelativeTo(null);
        }
    }
    
    public void loadReporteCuentasAPagar(ActionEvent e){
        if(e.getSource() == formFechaReportCAP.btnBuscar){
            
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportCAP.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportCAP.txtFechaHasta.getDate().getTime());
            
            ArrayList<Double> array = queryReport.totales_c_ap(fecha_desde,fecha_hasta);
            double total_e = array.get(0);
            double total_s = array.get(1);
            ReporteCuentaAPagar reportAP = new ReporteCuentaAPagar();
            reportAP.openReportCuentasAPagar(total_e,total_s,fecha_desde,fecha_hasta);
            nullFechas(formFechaReportCAP);
            formFechaReportCAP.setVisible(false);
        }
    } 
     
    public void accionVerJMRTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnJMRT){
            formFechaReportJMR.setVisible(true);
            formFechaReportJMR.setLocationRelativeTo(null);
        }
    }
    
    public void loadReporteJMRT(ActionEvent e){
        if(e.getSource() == formFechaReportJMR.btnBuscar){
            formFechaReportJMR.setVisible(false);
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportJMR.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportJMR.txtFechaHasta.getDate().getTime());
            
            ArrayList<Double> array = queryReport.totales_jmr(fecha_desde,fecha_hasta);
            double total_e = array.get(0);
            double total_s = array.get(1);
            ReporteJMRT reportJMR = new ReporteJMRT();
            reportJMR.openReportJMRTransacciones(total_e,total_s,fecha_desde,fecha_hasta);
            nullFechas(formFechaReportJMR);
            formFechaReportJMR.setVisible(false);
        }
    } 
    
    public void accionVerElRocioTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnElRocioT){
            formFechaReportElRocio.setVisible(true);
            formFechaReportElRocio.setLocationRelativeTo(null);
        }
    }
    
    public void loadReporteElRocio(ActionEvent e){
        if(e.getSource() == formFechaReportElRocio.btnBuscar){
            formFechaReportElRocio.setVisible(false);
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportElRocio.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportElRocio.txtFechaHasta.getDate().getTime());
           
            ReporteElRocioT reportElRocio = new ReporteElRocioT();
            reportElRocio.openReportElRocio(fecha_desde,fecha_hasta);
            nullFechas(formFechaReportElRocio);
            formFechaReportElRocio.setVisible(false);
        }
    } 
    
    public void nullFechas(FormFechas fecha){
        fecha.txtFechaDesde.setDate(null);
        fecha.txtFechaHasta.setDate(null);
    }
    
     public void accionVerMarTransacciones(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnMarT){
            formFechaReportMar.setVisible(true);
            formFechaReportMar.setLocationRelativeTo(null);
        }
    }
     
    public void loadReporteMar(ActionEvent e){
        if(e.getSource() == formFechaReportMar.btnBuscar){
            formFechaReportMar.setVisible(false);
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportMar.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportMar.txtFechaHasta.getDate().getTime());
           
            ReportMarTransaccion reportMar = new ReportMarTransaccion();
            reportMar.openReportMarTransacciones(fecha_desde,fecha_hasta);
            nullFechas(formFechaReportMar);
           
        }
    } 
    
    public void accionVerElRocioContador(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnRocioContador){
            formFechaReportElRocioContador.setVisible(true);
            formFechaReportElRocioContador.setLocationRelativeTo(null);
        }
    }
     
    public void loadReporteElRocioContador(ActionEvent e){
        if(e.getSource() == formFechaReportElRocioContador.btnBuscar){
            formFechaReportElRocioContador.setVisible(false);
            java.sql.Date fecha_desde = new java.sql.Date(formFechaReportElRocioContador.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportElRocioContador.txtFechaHasta.getDate().getTime());
           
            ReportRocioContador reportRoContador = new ReportRocioContador();
            reportRoContador.openReportElRocioContador(fecha_desde,fecha_hasta);
            nullFechas(formFechaReportMar);
           
        }
    }
}
