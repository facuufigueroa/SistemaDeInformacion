package Controller;

import APIGoogleDrive.GoogleDriveBackup;
import Consultas.QueryReportes;
import Reportes.CategoriasReport;
import Reportes.ReportByT;
import Reportes.ReportJMRContador;
import Reportes.ReportMarContador;
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
import com.formdev.flatlaf.FlatLightLaf;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MenuController implements ActionListener {

    static MenuPrincipal menuPrincipal = new MenuPrincipal();
    TransaccionesController transaccionController = new TransaccionesController();
    FormFechas formFechaVentas = new FormFechas();
    FormFechas formFechaCompras = new FormFechas();
    FormFechas formFechaReportCAC = new FormFechas();
    FormFechas formFechaReportCAP = new FormFechas();
    FormFechas formFechaReportJMR = new FormFechas();
    FormFechas formFechaReportElRocio = new FormFechas();
    FormFechas formFechaReportMar = new FormFechas();
    FormFechas formFechaReportElRocioContador = new FormFechas();
    FormFechas formFechaReportJMRContador = new FormFechas();
    FormFechas formFechaReportMARContador = new FormFechas();
    FormFechas formFechaReportByT = new FormFechas();
    QueryReportes queryReport = new QueryReportes();

    public MenuController() {
        obtenerAño();
        this.menuPrincipal.btnNewTransaccion.addActionListener(this);

        CuentaController cuentaC = new CuentaController(menuPrincipal);
        TipoCuentasController tc = new TipoCuentasController(menuPrincipal);
        EmpresaOrdenController eo = new EmpresaOrdenController(menuPrincipal);
        CategoriaController categoriaController = new CategoriaController(menuPrincipal);
        TipoCategoriaController tipoCatController = new TipoCategoriaController(menuPrincipal);
        SubCategoriaController subCatController = new SubCategoriaController(menuPrincipal);
        VerTransaccionesController verTransacciones = new VerTransaccionesController(menuPrincipal);
        MantenimientoController mantController = new MantenimientoController(menuPrincipal);
        
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

        this.menuPrincipal.btnJmrContador.addActionListener(this);
        this.formFechaReportJMRContador.btnBuscar.addActionListener(this);

        this.menuPrincipal.btnMARContador.addActionListener(this);
        this.formFechaReportMARContador.btnBuscar.addActionListener(this);
    
        this.menuPrincipal.btnByT.addActionListener(this);
        this.formFechaReportByT.btnBuscar.addActionListener(this);
        
        this.menuPrincipal.btnBackup.addActionListener(this);
        HistoricoTransaccionController htController = new  HistoricoTransaccionController(menuPrincipal);
        
        this.menuPrincipal.btnPrintCategoria.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
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
            accionVerJMRContador(e);
            loadReporteJMRContador(e);
            accionVerMARContador(e);
            loadReporteMARContador(e);
            accionVerBancosYTarjetas(e);
            loadReportByT(e);
            accionImprimirCategorias(e);
            realizarBackup(e);
        } catch (ParseException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadMenuPrincipal() {

        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);

    }
    
    /*public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        } catch (Exception e) {
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menuPrincipal.setVisible(true);
                menuPrincipal.setLocationRelativeTo(null);
            }
        });
    }*/
    public void realizarBackup(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnBackup){
            //JOptionPane.showMessageDialog(null, "Creando copia de seguridad, aguarde...");

            // Crear una nueva instancia de GoogleDriveBackup
            GoogleDriveBackup backup = new GoogleDriveBackup();

            JOptionPane optionPane = new JOptionPane("Creando copia de seguridad, aguarde...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        final JDialog dialog = optionPane.createDialog("Por favor espere");

        // Utilizar SwingWorker para ejecutar la tarea en un hilo de fondo
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws IOException, GeneralSecurityException {
                backup.backupDatabase();
                return null;
            }

            @Override
            protected void done() {
                // Cerrar el diálogo de espera
                dialog.dispose();
                try {
                    // Verificar si ocurrió una excepción
                    get();
                    JOptionPane.showMessageDialog(null, "Backup realizado con éxito.");
                } catch (Exception ex) {
                    // Mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, "Error al realizar el backup: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        };

        // Mostrar el diálogo de espera y ejecutar el SwingWorker
        worker.execute();
        dialog.setVisible(true);
    }

    }
    
    public static void main(String args[]) {
        try {
            // Configura el Look and Feel de FlatLaf
            UIManager.setLookAndFeel(new FlatLightLaf());  // Utiliza FlatDarkLaf para el tema oscuro, o FlatLightLaf para el tema claro
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        menuPrincipal.setVisible(true);
                        menuPrincipal.setLocationRelativeTo(null);
                    }
                });
                // Resto del código de tu aplicación...
    }

    /*Metodo que abre la vista para generar nuevas transacciones*/
    public void newTransaccion(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnNewTransaccion) {
            transaccionController.setearCamposEnCero();
            transaccionController.loadNewTransaccion();
        }
    }

    public void verTransacciones(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnVerTransacciones) {

        }
    }

    public void reporteLibroVentas(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnLibroVentas) {
            formFechaVentas.setVisible(true);
            formFechaVentas.setLocationRelativeTo(null);    
        }
    }

    public void loadReporteLibroVentas(ActionEvent e) throws ParseException {

        if (e.getSource() == formFechaVentas.btnBuscar) {

            if (!verificacionFechas(formFechaVentas.txtFechaDesde, formFechaVentas.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaVentas.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaVentas.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {


                    ReporteLibroVentasIVA reportLVI = new ReporteLibroVentasIVA();
                    reportLVI.conexionReporte(fecha_desde, fecha_hasta);
                    nullFechas(formFechaVentas);
                    formFechaVentas.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }

        }
    }

    public void reporteLibroCompras(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnLibroIvaCompras) {
            formFechaCompras.setVisible(true);
            formFechaCompras.setLocationRelativeTo(null);
        }
    }

    public void loadReporteLibroCompras(ActionEvent e) throws ParseException {

        if (e.getSource() == formFechaCompras.btnBuscar) {
            if (!verificacionFechas(formFechaCompras.txtFechaDesde, formFechaCompras.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaCompras.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaCompras.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    

                    ReporteLibroComprasIVA reportLCI = new ReporteLibroComprasIVA();
                    reportLCI.openReportCompras(fecha_desde, fecha_hasta);
                    nullFechas(formFechaCompras);
                    formFechaCompras.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }

        }
    }

    public void accionVerCuentasACobrar(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnReportCuentasAC) {
            formFechaReportCAC.setVisible(true);
            formFechaReportCAC.setLocationRelativeTo(null);
        }
    }

    public void loadReporteCuentasACobrar(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportCAC.btnBuscar) {
            
            if (!verificacionFechas(formFechaReportCAC.txtFechaDesde, formFechaReportCAC.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportCAC.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportCAC.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    ArrayList<Double> array = queryReport.totales(fecha_desde, fecha_hasta);
                    double total_e = array.get(0);
                    double total_s = array.get(1);
                    ReporteCuentasACobrar reportC = new ReporteCuentasACobrar();
                    reportC.openReportCuentasACobrar(total_e, total_s, fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportCAC);
                    formFechaReportCAC.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }

    public void accionVerCuentasAPagar(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnCuentasAPagar) {
            formFechaReportCAP.setVisible(true);
            formFechaReportCAP.setLocationRelativeTo(null);
        }
    }

    public void loadReporteCuentasAPagar(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportCAP.btnBuscar) {
            if (!verificacionFechas(formFechaReportCAP.txtFechaDesde, formFechaReportCAP.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportCAP.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportCAP.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    ArrayList<Double> array = queryReport.totales_c_ap(fecha_desde, fecha_hasta);
                    double total_e = array.get(0);
                    double total_s = array.get(1);
                    ReporteCuentaAPagar reportAP = new ReporteCuentaAPagar();
                    reportAP.openReportCuentasAPagar(total_e, total_s, fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportCAP);
                    formFechaReportCAP.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }

    public void accionVerJMRTransacciones(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnJMRT) {
            formFechaReportJMR.setVisible(true);
            formFechaReportJMR.setLocationRelativeTo(null);
        }
    }

    public void loadReporteJMRT(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportJMR.btnBuscar) {
            
            if (!verificacionFechas(formFechaReportJMR.txtFechaDesde, formFechaReportJMR.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportJMR.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportJMR.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportJMR.setVisible(false);

                    ArrayList<Double> array = queryReport.totales_jmr(fecha_desde, fecha_hasta);
                    double total_e = array.get(0);
                    double total_s = array.get(1);
                    ReporteJMRT reportJMR = new ReporteJMRT();
                    reportJMR.openReportJMRTransacciones(total_e, total_s, fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportJMR);
                    formFechaReportJMR.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }

    public void accionVerElRocioTransacciones(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnElRocioT) {
            formFechaReportElRocio.setVisible(true);
            formFechaReportElRocio.setLocationRelativeTo(null);
        }
    }

    public void loadReporteElRocio(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportElRocio.btnBuscar) {
            if (!verificacionFechas(formFechaReportElRocio.txtFechaDesde, formFechaReportElRocio.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportElRocio.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportElRocio.txtFechaHasta.getDate().getTime());
            
                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportElRocio.setVisible(false);
                    ReporteElRocioT reportElRocio = new ReporteElRocioT();
                    reportElRocio.openReportElRocio(fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportElRocio);
                    formFechaReportElRocio.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }

        }
    }

    public void nullFechas(FormFechas fecha) {
        fecha.txtFechaDesde.setDate(null);
        fecha.txtFechaHasta.setDate(null);
    }

    public void accionVerMarTransacciones(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnMarT) {
            formFechaReportMar.setVisible(true);
            formFechaReportMar.setLocationRelativeTo(null);
        }
    }

    public void loadReporteMar(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportMar.btnBuscar) {
            if (!verificacionFechas(formFechaReportMar.txtFechaDesde, formFechaReportMar.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportMar.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportMar.txtFechaHasta.getDate().getTime());
                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportMar.setVisible(false);
                    ReportMarTransaccion reportMar = new ReportMarTransaccion();
                    reportMar.openReportMarTransacciones(fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportMar);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }

    public void accionVerElRocioContador(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnRocioContador) {
            formFechaReportElRocioContador.setVisible(true);
            formFechaReportElRocioContador.setLocationRelativeTo(null);
        }
    }

    public void loadReporteElRocioContador(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportElRocioContador.btnBuscar) {
            if (!verificacionFechas(formFechaReportElRocioContador.txtFechaDesde, formFechaReportElRocioContador.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportElRocioContador.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportElRocioContador.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportElRocioContador.setVisible(false);
                    ReportRocioContador reportRoContador = new ReportRocioContador();
                    reportRoContador.openReportElRocioContador(fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportElRocioContador);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }

        }
    }

    public void accionVerJMRContador(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnJmrContador) {
            formFechaReportJMRContador.setVisible(true);
            formFechaReportJMRContador.setLocationRelativeTo(null);
        }
    }

    public void loadReporteJMRContador(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportJMRContador.btnBuscar) {
            if (!verificacionFechas(formFechaReportJMRContador.txtFechaDesde, formFechaReportJMRContador.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportJMRContador.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportJMRContador.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportJMRContador.setVisible(false);
                    ReportJMRContador reportJMRCont = new ReportJMRContador();
                    reportJMRCont.openReportJMRContador(fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportJMRContador);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }

        }
    }

    public void accionVerMARContador(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnMARContador) {
            formFechaReportMARContador.setVisible(true);
            formFechaReportMARContador.setLocationRelativeTo(null);
        }
    }

    public void loadReporteMARContador(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportMARContador.btnBuscar) {
            if (!verificacionFechas(formFechaReportMARContador.txtFechaDesde, formFechaReportMARContador.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportMARContador.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportMARContador.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportMARContador.setVisible(false);

                    ReportMarContador reportMarCont = new ReportMarContador();
                    reportMarCont.openReportMARContador(fecha_desde, fecha_hasta);
                    nullFechas(formFechaReportMARContador);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }

    public boolean verificacionFechas(JDateChooser txtFechaDesde, JDateChooser txtFechaHasta) throws ParseException {
        return txtFechaDesde.getDate() == null || txtFechaHasta.getDate() == null;
    }
    
    public void accionVerBancosYTarjetas(ActionEvent e) {
        if (e.getSource() == menuPrincipal.btnByT) {
            formFechaReportByT.setVisible(true);
            formFechaReportByT.setLocationRelativeTo(null);
        }
    }

    public void loadReportByT(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaReportByT.btnBuscar) {
            if (!verificacionFechas(formFechaReportByT.txtFechaDesde, formFechaReportByT.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaReportByT.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaReportByT.txtFechaHasta.getDate().getTime());

                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaReportByT.setVisible(false);

                    ReportByT reportByT = new ReportByT();
                    reportByT.openReportByT(fecha_desde, fecha_hasta);
                    
                    nullFechas(formFechaReportByT);
                } else {
                    JOptionPane.showMessageDialog(null, "Error con la elección de fechas. \n"
                            + "1)Verifique que no haya seleccionado una fecha desde MAYOR a fecha hasta. \n"
                            + "2) Verifique que no haya seleccionado una fecha hasta MENOR a fecha desde");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo fecha_desde o fecha_hasta estan vacio. \n"
                        + "Complete los campos y nuevamente presione el boton Buscar.");
            }
        }
    }
    
    public void obtenerAño(){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);  
        menuPrincipal.labelAño.setText("  AÑO: "+String.valueOf(año));
    }
    
    /*Método para imprimir categorias junto a su tipo de categoria registradas en el sistema*/
    public void accionImprimirCategorias(ActionEvent e){
        if(e.getSource() == menuPrincipal.btnPrintCategoria){
            CategoriasReport catReport = new CategoriasReport();
            catReport.openReportCategorias();
        }
    }
}
