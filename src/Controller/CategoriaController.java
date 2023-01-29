package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryTipoCategoria;
import Model.Categoria;
import Model.TipoCategoria;
import View.MenuPrincipal;
import View.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CategoriaController implements ActionListener {

    QueryCategoria queryCat = new QueryCategoria();
    DefaultTableModel modelo = new DefaultTableModel();
    MenuPrincipal catView = new MenuPrincipal();
    QueryTipoCategoria queryTCat = new QueryTipoCategoria();
    Transacciones transacciones = new Transacciones();
    TransaccionesController tc = new TransaccionesController();

    public CategoriaController(MenuPrincipal menu) {
        this.catView = menu;

        iniciarTabla();
        centrarContenidoTabla();
        catView.btnSaveCat.addActionListener(this);
        iniciarComboBoxTipoCategoria();
    }

    public void iniciarComboBoxTipoCategoria() {
        ArrayList<TipoCategoria> listTipoCategoria = queryTCat.listarTiposCat();
        TipoCategoria tipoCatNull = new TipoCategoria();
        tipoCatNull.setNombre("");
        listTipoCategoria.add(0, tipoCatNull);
        for (TipoCategoria tcc : listTipoCategoria) {
            catView.cbbTipoCat.addItem(tcc.getNombre());
        }

    }

    public void iniciarTabla() {
        ArrayList<Categoria> categoriaLista = queryCat.listarCategorias();
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                if (columna == 1 && columna == 2 && columna == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIPO CATEGORIA");
        catView.tablaCategoria.setRowHeight(25);
        catView.tablaCategoria.setModel(modelo);
        for (Categoria cat : categoriaLista) {
            String[] dato = new String[2];
            dato[0] = cat.getNombre().toUpperCase();
            dato[1] = cat.getNombreString().toUpperCase(); //Se refiere al nombre del tipo de categoria
            modelo.addRow(dato);
        }

    }

    public void centrarContenidoTabla() {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        catView.tablaCategoria.getColumnModel().getColumn(0).setCellRenderer(tcr);
        catView.tablaCategoria.getColumnModel().getColumn(1).setCellRenderer(tcr);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        agregarCat(e);
    }

    public void agregarCat(ActionEvent e) {
        if (e.getSource() == catView.btnSaveCat) {
            if (!verificarBlanco()) {
                Categoria cat = new Categoria();
                cat.setNombre(catView.txtNomCat.getText());
                String nombreTipoCat = catView.cbbTipoCat.getSelectedItem().toString();
                cat.setTipoCategoria(queryCat.obtenerIdTipoCatPorNombre(catView.cbbTipoCat.getSelectedItem().toString()));
                queryCat.agregarCat(cat);
                JOptionPane.showMessageDialog(null, "Categoria " + catView.txtNomCat.getText() + " guardada con éxito");
                iniciarTabla();
                centrarContenidoTabla();

                //arreglar
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar agregar Categoria \n"
                        + "1 ) Verifique que haya escrito un nombre para la categoria \n"
                        + "2 ) Verifique que haya seleccionado un tipo de categoria", "Error - Verifique", 0);
            }
        }
    }

    public boolean verificarBlanco() {
        if (catView.txtNomCat.getText().isEmpty()
                || catView.cbbTipoCat.getSelectedItem().equals("")) {
            return true;
        }
        return false;
    }

}
