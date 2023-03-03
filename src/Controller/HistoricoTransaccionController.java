package Controller;

import Consultas.QueryVerTransacciones;
import Model.CompraVentaIva;
import Model.Transaccion;
import Model.TransaccionEditable;
import Paginacion.Paginacion;
import View.MenuPrincipal;
import View.VerInfoTransaccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistoricoTransaccionController implements ActionListener {

    private final MenuPrincipal menu;
    private Paginacion paginacion = new Paginacion();
    VerInfoTransaccion infoView = new VerInfoTransaccion();
    QueryVerTransacciones queryVerT = new QueryVerTransacciones();

    public HistoricoTransaccionController(MenuPrincipal menuP) {
        this.menu = menuP;
        this.menu.btnAnterior.addActionListener(this);
        this.menu.btnSiguiente.addActionListener(this);
        DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(1, 80), paginacion.ColumNames());
        this.menu.tablaTH.setModel(datos);
        this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        this.menu.tablaTH.setRowHeight(25);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        accionBtnAnterior(e);
        accionBtnSiguiente(e);
        //accionVerInfo(e); No hace falta
    }

    public void accionBtnAnterior(ActionEvent e) {
        if (e.getSource() == menu.btnAnterior) {
            DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(paginacion.getNumPage() - 1, 80), paginacion.ColumNames());
            this.menu.tablaTH.setModel(datos);
            this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        }
    }

    public void accionBtnSiguiente(ActionEvent e) {
        if (e.getSource() == menu.btnSiguiente) {
            DefaultTableModel datos = new DefaultTableModel(paginacion.getPagina(paginacion.getNumPage() + 1, 80), paginacion.ColumNames());
            this.menu.tablaTH.setModel(datos);
            this.menu.txtPaginacion.setText(paginacion.getNumPage() + " de " + paginacion.getNumPages());
        }
    }
    
    

}
