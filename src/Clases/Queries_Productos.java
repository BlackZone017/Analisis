/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gouripc
 */
public class Queries_Productos {
    
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;
    
    
    public void buscar(JTable tabla){
        //Columnas a mostrarse en la tabla
        String [] columnas={"ID Producto","Nombre","Precio", "Descripcion","Stock"};
        String [] registros=new String[5];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT * FROM producto"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idProducto");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("precio");
                registros[3]=resultado.getString("descripcion");
                registros[4]=resultado.getString("stock");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }

    }
    
    
    public boolean eliminar(String codigo){
        conn.conexion();
        try{
            Queries_Clientes borrar = new Queries_Clientes();
            //borrar.eliminar(codigo); 
            //como esta tabla tiene una relacion con asistencias, primero debemos borrar este registro
            //de asistencias, y luego de esta tabla, pues ya no habría relacion
            
            //Elimina el registro a traves del id del asistente
            PreparedStatement pstm1 = conn.conexion().prepareStatement("DELETE FROM producto WHERE idProducto=?");
            pstm1.setString(1, codigo);
            pstm1.execute();
            pstm1.close();
            return true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
            return false;
        }
    }
    
    public void modificar(String codigo, String nombre, String precio,String descripcion, String cantidad){
        conn.conexion();
        try{
            conn.conexion();
            Statement query = conn.conexion().createStatement();
            query.execute("update producto set nombre = '"+nombre+"', precio = '"+precio+
                   "', descripcion='"+descripcion+"', stock='"+cantidad+"' where idProducto="+codigo);
            
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
        }
    }
}
