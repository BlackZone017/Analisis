/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import proyecto.conectar;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class ConsultaClientes {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
    public boolean Buscar(JTable Tabla){
         
    String [] columnas={"id_Cliente","nom_cliente","ape_cliente", "Cedula","Direccion","Telefono","Correo"};
    String [] registros=new String[7];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
    SSQL = "SELECT * FROM Cliente";
        try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Cliente");
             registros[1]=rs.getString("nom_cliente");
             registros[2]=rs.getString("ape_cliente");
             registros[3]=rs.getString("Cedula");
             registros[4]=rs.getString("Direccion");
             registros[5]=rs.getString("Telefono");
             registros[6]=rs.getString("Correo");
           ModeloTabla.addRow(registros);
            
             }
             Tabla.setModel(ModeloTabla);   
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Er SQL "+e);
              
              }
    return false;
      }
     public boolean busquedaSimple(String valor,String cbo, JTable Tabla){

    String [] columnas={"id_Cliente","nom_cliente","ape_cliente", "Cedula","Direccion","Telefono","Correo"};
    String [] registros=new String[7];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Cliente WHERE "+cbo+"LIKE '%"+valor+"%'";
               try {

      
             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Cliente");
             registros[1]=rs.getString("nom_cliente");
             registros[2]=rs.getString("ape_cliente");
             registros[3]=rs.getString("Cedula");
             registros[4]=rs.getString("Direccion");
             registros[5]=rs.getString("Telefono");
             registros[6]=rs.getString("Correo");
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
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM Cliente WHERE id_Cliente=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}
