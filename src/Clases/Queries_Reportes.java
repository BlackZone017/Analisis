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
public class Queries_Reportes {
    DefaultTableModel ModeloTabla; //Objeto para llenar la tabla
    conectar conn=new conectar();
    
    Statement ejecutar;
    ResultSet resultado;
    String query;

    public void productosPorMes(JTable tabla){
        String [] columnas={"Mes","Año","ID Producto","Producto"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT DISTINCT DATENAME(month,f.fecha)as 'Mes', YEAR(f.fecha) as 'Año',f.idProducto,p.nombre \n"+
                "FROM factura f JOIN producto p on (p.idProducto = f.idProducto) \n"+
                "WHERE p.idProducto = f.idProducto \n" +
                "GROUP BY DATEPART(month,f.fecha),f.idProducto,p.nombre,f.fecha \n"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Mes");
                registros[1]=resultado.getString("Año");
                registros[2]=resultado.getString("idProducto");
                registros[3]=resultado.getString("Nombre");
                
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
    
    
    public void masVendido(JTable tabla){
        String [] columnas={"Producto","Mes","Año","Cantidad"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT p.nombre 'Producto',DATENAME(month,f.fecha) 'Mes',YEAR(f.fecha) as 'Año' ,f.cantidad  \n"+
                "FROM factura f JOIN producto p on (p.idProducto = f.idProducto)\n" +
                "GROUP BY DATENAME(month,f.fecha),YEAR(f.fecha),p.nombre ,f.cantidad,p.nombre \n"+
                "HAVING MAX(f.cantidad) = (SELECT MAX(cantidad) FROM factura) \n"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Producto");
                registros[1]=resultado.getString("Mes");
                registros[2]=resultado.getString("Año");
                registros[3]=resultado.getString("Cantidad");
                    
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
    
    public void totalVendidoHoy(JTable tabla){
        String [] columnas={"Total Vendido","Fecha Actual"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT sum(f.cantidad*p.precio) 'Total Vendido',f.fecha 'Fecha Actual' FROM factura f\n" +
                "JOIN producto p on (p.idProducto = f.idProducto)\n" +
                "WHERE f.fecha=CONVERT (date, GETDATE()) AND p.idProducto = f.idProducto\n" +
                "GROUP BY f.fecha"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Total Vendido");
                registros[1]=resultado.getString("Fecha Actual");
                    
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
    
    public void totalVendidoMesual(JTable tabla){
        String [] columnas={"Total Vendido","Mes","Año"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT sum(f.cantidad*p.precio) 'Total Vendido',DATENAME(month,f.fecha) 'Mes',YEAR(f.fecha) 'Año'\n" +
        "FROM factura f JOIN producto p on (p.idProducto = f.idProducto)\n" +
        "WHERE p.idProducto = f.idProducto GROUP BY DATENAME(month,f.fecha), YEAR(f.fecha)"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Total Vendido");
                registros[1]=resultado.getString("Mes");
                registros[2]=resultado.getString("Año");
                    
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
    
    public void cantClientesHoy(JTable tabla){
        String [] columnas={"Cant. Clientes","Fecha Actual"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT COUNT(idCliente) 'Cant. Clientes',fecha 'Fecha Actual' FROM factura\n" +
                "WHERE fecha = CONVERT (date, GETDATE())\n" +
                "GROUP BY fecha;"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Cant. Clientes");
                registros[1]=resultado.getString("Fecha Actual");
                    
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
    
    public void cantClientesPorMes(JTable tabla){
        String [] columnas={"Cant. Clientes","Mes","Año"};
        String [] registros=new String[4];
        ModeloTabla=new DefaultTableModel(null,columnas);
        
        query = "SELECT COUNT(idCliente) 'Cant. Clientes',DATENAME(month,fecha) 'Mes',YEAR(fecha) 'Año'\n" +
                "FROM factura GROUP BY DATENAME(month,fecha), YEAR(fecha);"; //Query que ejecutare
        
        try{
            conn.conexion(); //hago la conexion
            ejecutar = conn.conexion().createStatement(); //creo mi declaracion
            resultado=ejecutar.executeQuery(query); //le paso la query a mi declaracion y le paso los valores al result set
            
            while(resultado.next()){
                registros[0]=resultado.getString("Cant. Clientes");
                registros[1]=resultado.getString("Mes");
                registros[2]=resultado.getString("Año");
                    
                ModeloTabla.addRow(registros);
            }
            tabla.setModel(ModeloTabla);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la tabla SQL: "+e);
        }
    }
}
