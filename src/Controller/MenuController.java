
package Controller;


import Consultas.QueryReportes;
import Reportes.ReporteLibroVentasIVA;
import View.FormFechas;
import View.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;



public class MenuController implements ActionListener {
    
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    FormFechas formFecha = new FormFechas();
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
        this.formFecha.btnBuscar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        newTransaccion(e);
        reporteLibroVentas(e);
        loadReporteLibroVentas(e);
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
            formFecha.setVisible(true);
            
        }
    }
    
    public void loadReporteLibroVentas(ActionEvent e){
        if(e.getSource() == formFecha.btnBuscar){
            java.sql.Date fecha_desde = new java.sql.Date(formFecha.txtFechaDesde.getDate().getTime());
            java.sql.Date fecha_hasta = new java.sql.Date(formFecha.txtFechaHasta.getDate().getTime());
            
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
            formFecha.setVisible(false);
        }
    }
    
    
}
