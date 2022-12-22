
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
import java.util.ArrayList;


public class TransaccionesController {
    
    QueryCategoria queryCategoria = new QueryCategoria();
    QueryCuentas queryCuentas = new QueryCuentas();
    QueryTipoCuenta queryTCuenta = new QueryTipoCuenta();
    QuerySubCategoria querySubCat = new QuerySubCategoria();
    QueryTipoCategoria queryTCat = new QueryTipoCategoria();
    QueryEmpresaOrden queryEO = new QueryEmpresaOrden();
    
    
    Transacciones transacciones = new Transacciones();
    

    public TransaccionesController() {
        iniciarComboBoxTipoCuenta();
        iniciarComboBoxTipoCategoria();
        iniciarComboBoxCuentas();
        iniciarComboBoxCategoria();
        iniciarcomboBoxSubcategoria();
        iniciarComboBoxEmpresa();        
    }
    
    
    
    public void loadNewTransaccion(){
       transacciones.setVisible(true);
       transacciones.setLocationRelativeTo(null);
    }
    
    public void iniciarComboBoxTipoCuenta(){
        ArrayList<TipoCuenta> listTipoCuentas = queryTCuenta.listarTipoCuentas();
        for(TipoCuenta tc : listTipoCuentas){
            transacciones.cbbTipoCuenta.addItem(tc.getNombre());
        }
    }
    
    public void iniciarComboBoxCuentas(){
        ArrayList<String> nombreCuentas = queryCuentas.listarPorNombre();
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
        ArrayList<String> listCategoria = queryCategoria.listarPorNombre();
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
    
    
}
