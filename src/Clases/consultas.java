
package Clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class consultas {
    conectar con=new conectar();
    
    Connection conect=null;
    Statement st=null;
    ResultSet rs=null;
    String query;
    
    public void conectar(){
        // Implementacion Metodos de la Conexion
        try{
            conect= con.conexion();
            st=conect.createStatement();
            
        }catch(java.sql.SQLException ex){
            JOptionPane.showMessageDialog(null,"Error SQL "+ex);
        }
    }
    
    public boolean verificar(String usuario, String contra, String tipo){
        
        int retorno=0;
        query="SELECT usuario,password,rol FROM usuario WHERE usuario='"+usuario
                +"' AND password='"+contra+"' AND rol='"+tipo+"'";
        
        try{
            conect=con.conexion();
            st=conect.createStatement();
            rs=st.executeQuery(query);
            while(rs.next()){
                if(rs.getString(1)==null){
                    retorno=0;
                }else{
                    retorno=1;
                }
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        
        if(retorno==1){return true;}
        return false;
    }
//    
//    public void getRol(String user,String pwr){
//        int sw=0;
//        query="Select rol from Usuarios where nom_usu='"+user+"'and contra_usu='"+pwr+";";
//        try{
//            conect=con.conexion();
//            st=conect.createStatement();
//            rs=st.executeQuery(query);
//            String rol = rs.toString();
//            System.out.println("El rol es: "+rol);
////            while(rs.next()){
////                if(rs.getString(1)==null)
////                    sw=0;
////                else
////                    sw=1;
////                
////            }
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Error SQL "+ex);
//        }
//        
//    }
}