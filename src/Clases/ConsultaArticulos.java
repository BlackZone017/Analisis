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

public class ConsultaArticulos {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
     public boolean Buscar(JTable Tabla){
         
    String [] columnas={"id_Articulo","nom_articulo","Costo", "precio","id_Proveedor"};
    String [] registros=new String[5];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Articulos";
               try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Articulo");
             registros[1]=rs.getString("nom_articulo");
             registros[2]=rs.getString("Costo");
             registros[3]=rs.getString("precio");
             registros[4]=rs.getString("id_Proveedor");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     
     public boolean BusquedaSimple(String valor,String cbo, JTable Tabla){

    String [] columnas={"id_Articulo","nom_articulo","Costo", "precio","id_Proveedor"};
    String [] registros=new String[5];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Articulos WHERE "+cbo+"LIKE '%"+valor+"%'";
               try {

      
             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Articulo");
             registros[1]=rs.getString("nom_articulo");
             registros[2]=rs.getString("Costo");
             registros[3]=rs.getString("precio");
             registros[4]=rs.getString("id_Proveedor");
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
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM Articulos WHERE id_Articulo=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}
