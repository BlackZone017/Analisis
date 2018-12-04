
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectar {
    
Connection conect=null;

    //Metodo para la conexion de la Base de Datos
    public Connection conexion(){

        try {
            //Url de la conexion Base de Datos
            String connectionUrl = "jdbc:sqlserver://;database=sFacturacion;integratedSecurity=true;";
            conect = DriverManager.getConnection(connectionUrl);
           System.out.println("Conectado.");
            
        } catch (Exception ex){
            System.out.println("Error en la conexión a la Base de Datos: "+ex);
            //JOptionPane.showMessageDialog(null, "Error en la conexión a la Base de Datos: "+ex);

        }

        return conect;
    }


}
