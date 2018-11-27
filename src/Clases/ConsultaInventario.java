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

public class ConsultaInventario {
    
    DefaultTableModel ModeloTabla;
    conectar con=new conectar();
     
     Connection conect=null;
     Statement st=null;
     ResultSet rs=null;
     String SSQL;
     
     public boolean Buscar(JTable Tabla){
         
    String [] columnas={"id_Articulo","fecha_Entrada","Cantidad", "Tipo"};
    String [] registros=new String[4];
    ModeloTabla=new DefaultTableModel(null,columnas);      
    
     SSQL = "SELECT * FROM Inventario";
               try {

             conect=con.conexion();
             st=conect.createStatement();
             rs=st.executeQuery(SSQL);
        while (rs.next()){
             registros[0]=rs.getString("id_Articulo");
             registros[1]=rs.getString("fecha_Entrada");
             registros[2]=rs.getString("Cantidad");
             registros[3]=rs.getString("Tipo");
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
        PreparedStatement pstm = conect.prepareStatement("DELETE FROM Inventario WHERE id_Articulo=?");
        pstm.setString(1, cod);
        pstm.execute();
        pstm.close();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"El error es"+e);
    }
}
}
