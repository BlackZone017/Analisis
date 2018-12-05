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
public class Queries_DetalleFactura {
    
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;
    
    
    public void buscar(JTable tabla){
        //Columnas a mostrarse en la tabla
        String [] columnas={"ID Factura","Cliente","Empleado", "Producto","Cantidad","Precio","Total","Tipo Pago","fecha"};
        String [] registros=new String[9];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT f.idFactura,c.nombre 'Cliente', e.nombre 'Empleado',p.nombre 'Producto',\n" +
"f.cantidad, p.precio, (f.cantidad*p.precio) 'Total', f.tipoPago, f.fecha FROM Factura f \n" +
"JOIN Cliente c on (c.idCliente=f.idCliente) JOIN Empleado e on (e.idEmpleado=f.idEmpleado) \n" +
"JOIN Producto p on (p.idProducto=f.idProducto)"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idFactura");
                registros[1]=resultado.getString("Cliente");
                registros[2]=resultado.getString("Empleado");
                registros[3]=resultado.getString("Producto");
                registros[4]=resultado.getString("cantidad");
                registros[5]=resultado.getString("Precio");
                registros[6]=resultado.getString("Total");
                registros[7]=resultado.getString("TipoPago");
                registros[8]=resultado.getString("fecha");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }

    }
    
    public void buscarPor(String valor,String cbo, JTable tabla){
        String [] columnas={"ID Factura","Cliente","Empleado", "Producto","Cantidad","Precio","Total","Tipo Pago","fecha"};
        String [] registros=new String[9];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT f.idFactura,c.nombre 'Cliente', e.nombre 'Empleado',p.nombre 'Producto',\n" +
            "f.cantidad, p.precio, (f.cantidad*p.precio) 'Total', f.tipoPago, f.fecha FROM Factura f \n" +
            "JOIN Cliente c on (c.idCliente=f.idCliente) JOIN Empleado e on (e.idEmpleado=f.idEmpleado) \n" +
            "JOIN Producto p on (p.idProducto=f.idProducto) WHERE "+cbo+" LIKE '%"+valor+"%';"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("idFactura");
                registros[1]=resultado.getString("Cliente");
                registros[2]=resultado.getString("Empleado");
                registros[3]=resultado.getString("Producto");
                registros[4]=resultado.getString("cantidad");
                registros[5]=resultado.getString("Precio");
                registros[6]=resultado.getString("Total");
                registros[7]=resultado.getString("TipoPago");
                registros[8]=resultado.getString("fecha");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
        
        
    }
    
}
