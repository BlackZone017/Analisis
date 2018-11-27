
package proyecto;

import java.sql.*;
import javax.swing.*;

public class conectar {
    
    Connection conect=null;

public Connection conexion(){
    
    try {
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        String strConect="jdbc:ucanaccess://"+"C:/proyecto/VentaRepuestos.accdb";
        conect=DriverManager.getConnection(strConect,"","");
    } catch (Exception ex){
        JOptionPane.showMessageDialog(null, "Error en la conexión a la Base de Datos"+ex);
        
    }
    
    return conect;
     }

}
