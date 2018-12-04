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
import Clases.conectar;
/**
 *
 * @author gouripc
 */
public class Queries_Clientes {
    
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;
            
//    public boolean validarEmail(String email){
//        String registros;     
//        query = "SELECT usuario FROM cliente"; //Query que ejecutare
//       
//        try{
//            conn.conexion(); //hago la conexion
//            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
//            resultado=ejecutar.executeQuery(query);
//            
//            //bucle para evaluar todos los datos que hay en el campo email
//            while (resultado.next()){               
//                registros = resultado.getString("u");
//                
//                //Condicion que me evalua cada resultado de la consulta, y que si existe al menos un email creado
//                //me diga que este email ya existe
//                if(registros.equals(email)){
//                    return true;
//                }
//            }
//        }catch(Exception w){
//            return false;
//        }
//        return false;
//    }
    
    
    public void buscar(JTable tabla){
        //Columnas a mostrarse en la tabla
        String [] columnas={"ID Cliente","Nombre","Cedula", "Direccion","Telefono","Correo","Sexo"};
        String [] registros=new String[7];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT * FROM cliente"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idCliente");
                registros[1]=resultado.getString("nombre");
                registros[2]=resultado.getString("cedula");
                registros[3]=resultado.getString("direccion");
                registros[4]=resultado.getString("telefono");
                registros[5]=resultado.getString("correo");
                registros[6]=resultado.getString("sexo");
                
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
            
            PreparedStatement pstm = conn.conexion().prepareStatement("DELETE FROM cliente WHERE idCliente=?");
            pstm.setString(1, codigo);
            pstm.execute();
            pstm.close();
            //Elimina el registro a traves del id del asistente
            PreparedStatement pstm1 = conn.conexion().prepareStatement("DELETE FROM cliente WHERE idCliente=?");
            pstm1.setString(1, codigo);
            pstm1.execute();
            pstm1.close();
            return true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
            return false;
        }
    }
    
    public void modificar(String codigo, String nombre, String cedula, String direccion, String telefono, String correo, String sexo){
        conn.conexion();
        try{
            conn.conexion();
            Statement query = conn.conexion().createStatement();
            query.execute("update cliente set nombre = '"+nombre+"', cedula = '"+cedula+
                   "', direccion='"+direccion+"', telefono='"+telefono+"', correo='"+correo+"', sexo='"
                   +sexo+"' where idCliente="+codigo);
            
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
        }
    }
//    
//    public void buscarPor(String valor,String cbo, JTable tabla){
//        String [] columnas={"ID Asistente","Nombre","Apellido", "Telefono","Calle","Sector","Numero","Sexo","Email"};
//        String [] registros=new String[9];
//        ModeloTabla=new DefaultTableModel(null,columnas);
//        
//        query = "SELECT * FROM cliente WHERE "+cbo+" LIKE '"+valor+"%';"; //Query que ejecutare
//        
//        try{
//            conn.conexion(); //hago la conexion
//            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
//            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
//            
//            while(resultado.next()){
//                registros[0]=resultado.getString("id");
//                registros[1]=resultado.getString("nombre");
//                registros[2]=resultado.getString("apellido");
//                registros[3]=resultado.getString("telefono");
//                registros[4]=resultado.getString("calle");
//                registros[5]=resultado.getString("sector");
//                registros[6]=resultado.getString("numero");
//                registros[7]=resultado.getString("sexo");
//                registros[8]=resultado.getString("email");
//                
//                ModeloTabla.addRow(registros);
//            }
//            tabla.setModel(ModeloTabla);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
//        }
//        
//        
//    }
    
    
}
