package Controller;

import Consultas.QueryMantenimiento;
import View.FormFechas;
import View.MenuPrincipal;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MantenimientoController implements ActionListener {

    QueryMantenimiento queryM = new QueryMantenimiento();
    MenuPrincipal menu = new MenuPrincipal();
    FormFechas formFechaMant = new FormFechas();

    public MantenimientoController(MenuPrincipal menuP) {
        this.menu = menuP;

        this.menu.btnEliminar.addActionListener(this);
        this.formFechaMant.btnBuscar.addActionListener(this);
        this.formFechaMant.btnBuscar.setText("Borrar");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        accionBtnEliminar(e);
        try {
            accionBuscar(e);
        } catch (ParseException ex) {
            Logger.getLogger(MantenimientoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void accionBtnEliminar(ActionEvent e) {
        if (e.getSource() == menu.btnEliminar) {
            formFechaMant.setVisible(true);
            formFechaMant.setLocationRelativeTo(null);
        }
    }

    public void accionBuscar(ActionEvent e) throws ParseException {
        if (e.getSource() == formFechaMant.btnBuscar) {
            if (!verificacionFechas(formFechaMant.txtFechaDesde, formFechaMant.txtFechaHasta)) {
                java.sql.Date fecha_desde = new java.sql.Date(formFechaMant.txtFechaDesde.getDate().getTime());
                java.sql.Date fecha_hasta = new java.sql.Date(formFechaMant.txtFechaHasta.getDate().getTime());
                if ((fecha_desde.compareTo(fecha_hasta) < 0) || (fecha_hasta.compareTo(fecha_desde) > 0)) {

                    formFechaMant.setVisible(false);
                    queryM.eliminarTransacciones(fecha_desde.toString(), fecha_hasta.toString());
                    JOptionPane.showMessageDialog(null, "Transacciones con fecha desde: " + fecha_desde + "\n"
                            + " y fecha hasta: " + fecha_hasta + "\n"
                            + " eliminadas correctamente.");
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
}
