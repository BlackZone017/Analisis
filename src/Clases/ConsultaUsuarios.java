/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import proyecto.conectar;
import com.sun.istack.internal.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class ConsultaUsuarios {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
     public boolean Buscar(JTable Tabla){
         
    String [] columnas={"Nombre","Contraseña","Rol"};
    String [] registros=new String[3];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Usuarios";
               try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("nom_usu");
             registros[1]=rs.getString("contra_usu");
             registros[2]=rs.getString("tipo");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     
     public boolean busquedaSimple(String valor,String cbo, JTable Tabla){

    String [] columnas={"Nombre","Contraseña","Rol"};
    String [] registros=new String[3];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Usuarios WHERE "+cbo+"LIKE '%"+valor+"%'";
               try {

      
             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("nom_usu");
             registros[1]=rs.getString("contra_usu");
             registros[2]=rs.getString("tipo");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     
     public void deletePersona (String cod){
    
    conect=con.conexion();
    
    try{
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM Usuarios WHERE nom_usu=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}