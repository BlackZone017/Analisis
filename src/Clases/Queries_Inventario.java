/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gouripc
 */
public class Queries_Inventario {
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;
    
    public void buscar(JTable tabla){
        //Columnas a mostrarse en la tabla
        String [] columnas={"ID Producto","Nombre","Descripcion","Stock"};
        String [] registros=new String[5];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT idProducto,nombre,descripcion,stock FROM producto"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idProducto");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("descripcion");
                registros[3]=resultado.getString("stock");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }

    }
    
    public void buscarPor(String valor,String cbo, JTable tabla){
        String [] columnas={"ID Producto","Nombre","Descripcion","Stock"};
        String [] registros=new String[5];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT * FROM producto WHERE "+cbo+" LIKE '%"+valor+"%';"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idProducto");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("descripcion");
                registros[3]=resultado.getString("stock");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
        
        
    }
}
