
package Paginacion;

import Consultas.QueryTransaccion;
import DataBase.Conexion;
import Model.Transaccion;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;



public class Paginacion {
     /* Variables para paginacion */     
    private int numPage=0;
    private int numPages=0;
    private String[] columnames =  {"N° Transacción","Codigo","Fecha","Descripción"};
    private Object[][] data;
    QueryTransaccion queryT = new QueryTransaccion();
   /**
 * Paginacion
 * @param numRegPagina Numero de registros por pagina
 * @param numPage Numero de Pagina
 * @return Matriz nxm con los registros que corresponde a Numero de Pagina dado por numPage
 */ 
   public Object[][]  getPagina( int numPage, int numRegPagina )
   {   
       ArrayList<Transaccion> tList = new ArrayList<>();
       Transaccion t = new Transaccion();
       //Numero de pagina 
       this.numPage = ( numPage<=1 )? 1 : numPage;        

       //Consulta SQL para obtener todos los registros
       String q  = "SELECT t.idtransacciones,t.codigo,t.fecha,\n" +
            "t.descripcion\n" +
            "FROM transacciones AS t ORDER BY t.fecha DESC"  ;
            
       Statement st;
       ResultSet rs;

        try {
            st = Conexion.getConnection().createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );            
            rs = st.executeQuery( q );

            //Obtiene la cantidad total de registros en la tabla
            rs.last();
            int numReg = rs.getRow();            
            rs.first();         

            //calcula posicion de registro de inicio de paginacion
            int fila = numRegPagina * ( this.numPage - 1 ) + 1;           
            this.numPages = numReg / numRegPagina + ((numReg%numRegPagina > 0)? 1 : 0);

            //obtencion de metadatos de la tabla
            //nombre de las columnas
            ResultSetMetaData md = rs.getMetaData(); 
            int numeroColumnas = md.getColumnCount();//numero de columnas de la tabla 
            //recorre las columnas de la tabla y asigna a array de columnas
            /*
            columnames = new String[numeroColumnas];
            for (int i = 1; i <= numeroColumnas; i++) 
            {                
                this.columnames[i-1] = md.getColumnName(i);                
            }*/
            //-- end metadatos

            //Inicia matriz para los registros
            this.data = new String[ numRegPagina ][ numeroColumnas ];
            int cont = 1;
            // Se mueve a la "fila" indicada y si hay datos llena la matriz con los registros
            if ( rs.absolute( fila ) && numRegPagina > 0 ) 
            {
                int f = 0;
                do {                    
                    for (int i = 1; i <= numeroColumnas; i++ ) 
                    {                        
                        data[f][i-1] = rs.getString( i );
                        
                    }                    
                    f++; cont++;
                }
                while ( rs.next() && ( cont <= numRegPagina ) );
            }                   

        } catch ( Exception e ) {
            System.err.println( "Error: "+ e.getMessage() );
        }  

        return data;
   }
   
   public Object[][]  getPagina2( int numPage, int numRegPagina,String fecha_desde, String fecha_hasta )
   {   
       ArrayList<Transaccion> tList = new ArrayList<>();
       Transaccion t = new Transaccion();
       //Numero de pagina 
       this.numPage = ( numPage<=1 )? 1 : numPage;        

       //Consulta SQL para obtener todos los registros
       String q  = "SELECT t.idtransacciones,t.codigo,t.fecha,\n" +
            "t.descripcion\n" +
            "FROM transacciones AS t WHERE t.fecha BETWEEN '" + fecha_desde + "'" + " AND '" + fecha_hasta + " ' ORDER BY t.fecha ASC";
            
       Statement st;
       ResultSet rs;

        try {
            st = Conexion.getConnection().createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );            
            rs = st.executeQuery( q );

            //Obtiene la cantidad total de registros en la tabla
            rs.last();
            int numReg = rs.getRow();            
            rs.first();         

            //calcula posicion de registro de inicio de paginacion
            int fila = numRegPagina * ( this.numPage - 1 ) + 1;           
            this.numPages = numReg / numRegPagina + ((numReg%numRegPagina > 0)? 1 : 0);

            //obtencion de metadatos de la tabla
            //nombre de las columnas
            ResultSetMetaData md = rs.getMetaData(); 
            int numeroColumnas = md.getColumnCount();//numero de columnas de la tabla 
            //recorre las columnas de la tabla y asigna a array de columnas
            /*
            columnames = new String[numeroColumnas];
            for (int i = 1; i <= numeroColumnas; i++) 
            {                
                this.columnames[i-1] = md.getColumnName(i);                
            }*/
            //-- end metadatos

            //Inicia matriz para los registros
            this.data = new String[ numRegPagina ][ numeroColumnas ];
            int cont = 1;
            // Se mueve a la "fila" indicada y si hay datos llena la matriz con los registros
            if ( rs.absolute( fila ) && numRegPagina > 0 ) 
            {
                int f = 0;
                do {                    
                    for (int i = 1; i <= numeroColumnas; i++ ) 
                    {                        
                        data[f][i-1] = rs.getString( i );
                        
                    }                    
                    f++; cont++;
                }
                while ( rs.next() && ( cont <= numRegPagina ) );
            }                   

        } catch ( Exception e ) {
            System.err.println( "Error: "+ e.getMessage() );
        }  

        return data;
   }

   /**
 * @return String[] Nombres de las columnas
 */   
   public String[] ColumNames()
   {       
       return columnames;
   }

   /**
 * @return Numero de pagina actual de paginacion
 */
   public int getNumPage()
   {
       return this.numPage;
   }

   /**
 * Numero total de paginas 
 */
   public int getNumPages()
   {
       return this.numPages;
   }

}//--> fin clase

