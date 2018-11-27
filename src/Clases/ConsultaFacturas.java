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

public class ConsultaFacturas {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
     public boolean Buscar(JTable Tabla){
         
    String [] columnas={"id_Facturas","id_Clientes","id_Empleado", "id_Servicios","Articulo","Cantidad","Precio","Total"};
    String [] registros=new String[8];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM FacturaArticulos";
               try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Facturas");
             registros[1]=rs.getString("id_Clientes");
             registros[2]=rs.getString("id_Empleado");
             registros[3]=rs.getString("id_Servicios");
             registros[4]=rs.getString("Articulo");
             registros[5]=rs.getString("Cantidad");
             registros[6]=rs.getString("Precio");
             registros[7]=rs.getString("Total");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     public boolean busquedaSimple(String valor,String cbo, JTable Tabla){

    String [] columnas={"id_Facturas","id_Clientes","id_Empleado", "id_Servicios","Articulo","Cantidad","Precio","Total"};
    String [] registros=new String[8];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM FacturaArticulos WHERE "+cbo+"LIKE '%"+valor+"%'";
               try {

      
             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Facturas");
             registros[1]=rs.getString("id_Clientes");
             registros[2]=rs.getString("id_Empleado");
             registros[3]=rs.getString("id_Servicios");
             registros[4]=rs.getString("Articulo");
             registros[5]=rs.getString("Cantidad");
             registros[6]=rs.getString("Precio");
             registros[7]=rs.getString("Total");
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
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM FacturaArticulos WHERE id_Facturas=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}