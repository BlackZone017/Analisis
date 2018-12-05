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
public class Queries_Facturas {
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;
    
    
    public void buscar(JTable tabla){
        //Columnas a mostrarse en la tabla
        String [] columnas={"ID Factura","Cliente","Empleado", "Producto","Cantidad","Tipo Pago","fecha"};
        String [] registros=new String[7];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT * FROM factura"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idFactura");
                registros[1]=resultado.getString("idCliente");
                registros[2]=resultado.getString("idEmpleado");
                registros[3]=resultado.getString("idProducto");
                registros[4]=resultado.getString("cantidad");
                registros[5]=resultado.getString("tipoPago");
                registros[6]=resultado.getString("fecha");
                
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
            PreparedStatement pstm1 = conn.conexion().prepareStatement("DELETE FROM factura WHERE idFactura=?");
            pstm1.setString(1, codigo);
            pstm1.execute();
            pstm1.close();
            return true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
            return false;
        }
    }
    
    public void modificar(String codigo, String cliente, String empleado,String producto, String cantidad, String tipoPago,String fecha){
        conn.conexion();
        try{
            conn.conexion();
            Statement query = conn.conexion().createStatement();
            query.execute("update factura set idCliente = '"+cliente+"', idEmpleado = '"+empleado+
                   "', idProducto='"+producto+"', cantidad='"+cantidad+
                    "', tipoPago='"+tipoPago+"', fecha='"+fecha+"' where idFactura="+codigo);
            
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El error es: "+e);
        }
    }
}
