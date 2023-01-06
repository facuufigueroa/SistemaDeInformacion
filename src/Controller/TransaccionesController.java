
package Controller;

import Consultas.QueryCategoria;
import Consultas.QueryCuentas;
import Consultas.QueryEmpresaOrden;
import Consultas.QuerySubCategoria;
import Consultas.QueryTipoCategoria;
import Consultas.QueryTipoCuenta;
import Model.Categoria;
import Model.SubCategoria;
import Model.TipoCategoria;
import Model.TipoCuenta;
import View.Transacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TransaccionesController implements ActionListener{
    
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QueryTipoCuenta queryTCuenta = new QueryTipoCuenta();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryTipoCategoria queryTCat = new QueryTipoCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
    
    Transacciones transacciones = new Transacciones();
    CompraVentaIvaController compVentController = new CompraVentaIvaController();

    public TransaccionesController() {
        iniciarTabla();
        iniciarComboBoxTipoCuenta();
        iniciarComboBoxTipoCategoria();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarcomboBoxSubcategoria();
        iniciarComboBoxEmpresa();     
        this.transacciones.cbbCuentas.addActionListener(this);
        
        this.transacciones.btnCompraVentasIVA.addActionListener(this);
    }
    
   
    
    public void loadNewTransaccion(){
       transacciones.setVisible(true);
       transacciones.setLocationRelativeTo(null);
    }
    
    public void iniciarComboBoxTipoCuenta(){
        ArrayList<TipoCuenta> listTipoCuentas = queryTCuenta.listarTipoCuentas();
        transacciones.cbbTipoCuenta.removeAllItems();
        for(TipoCuenta tc : listTipoCuentas){
            transacciones.cbbTipoCuenta.addItem(tc.getNombre());
        }
    }
    
    
    public void accionTipoCuenta(ActionEvent e){
        if(e.getSource() == transacciones.cbbCuentas){
            int id_tipo_cuenta = queryCuentas.obtenerIdTipoCuenta2((String) transacciones.cbbCuentas.getSelectedItem());
            transacciones.cbbTipoCuenta.setSelectedItem(queryCuentas.obtenerNombreTipoCuenta(id_tipo_cuenta));
        }
   
    }
    
    
    
    public void iniciarComboBoxCuentas(){
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
        transacciones.cbbCuentas.removeAllItems();
        for(String c : nombreCuentas){
            transacciones.cbbCuentas.addItem(c);
        }
  
    }
    
    public void iniciarComboBoxTipoCategoria(){
        ArrayList<TipoCategoria> listTipoCategoria = queryTCat.listarTiposCat();
        for(TipoCategoria tcc : listTipoCategoria){
            transacciones.cbbTipoCategoria.addItem(tcc.getNombre());
        }
    }
    
    public void iniciarComboBoxCategoria(){
        transacciones.cbbCategorias.removeAllItems();
        for(String cat : listCategoria){
            transacciones.cbbCategorias.addItem(cat);
        }
    }
    
    public void iniciarcomboBoxSubcategoria(){
        ArrayList<SubCategoria> listSubCategoria = querySubCat.listarSubCat();
        for(SubCategoria subCat : listSubCategoria){
            transacciones.cbbSubCategoria.addItem(subCat.getNombre());
        }
    }
    
    public void iniciarComboBoxEmpresa(){
        ArrayList<String> listEmpresas = queryEO.listarPorNombre();
        for(String emp : listEmpresas){
            transacciones.cbbEmpresa.addItem(emp);
        }
    }
    
    public void iniciarTabla (){
        //ArrayList<Categoria> categoriaLista = queryCat.listarCategorias();
        modelo = new DefaultTableModel(){
            public boolean isCellEditable(int fila, int columna){
                if(columna == 1 && columna == 2 && columna == 3){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
       
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Salidas");
        modelo.addColumn("Entradas");
        modelo.addColumn("Retenciones_g");
        modelo.addColumn("Ret. Ingresos Brutos");
        modelo.addColumn("A impuesto IVA");
        modelo.addColumn("A IVA");
        
        transacciones.tablaTransacciones.setRowHeight(15);
        transacciones.tablaTransacciones.setModel(modelo);
        /*for(Categoria cat : categoriaLista){
            String[] dato = new String[2];
            dato[0] = cat.getNombre().toUpperCase();
            dato[1] = cat.getTipoCategoria().toUpperCase();
            modelo.addRow(dato);
        }*/
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        accionTipoCuenta(e);
        loadComprasVentas(e);
    }
    
    
    public void loadComprasVentas(ActionEvent e){
        if(e.getSource() == transacciones.btnCompraVentasIVA){
            compVentController.loadComVentaIva();
        }
    }
    
    public void updateComboBoxCategoria(ArrayList<Categoria> listCat){
        ArrayList<Categoria> listCategoria = listCat;
        for(Categoria cat : listCategoria){
            transacciones.cbbCategorias.addItem(cat.getNombre());
        }
    }
}
