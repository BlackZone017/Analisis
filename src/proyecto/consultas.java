
package proyecto;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class consultas {
    conectar con=new conectar();
    
    Connection conect=null;
    Statement st=null;
    ResultSet rs=null;
    String query;
    
    public boolean verificar (String user,String pwr, String tipo){
        
        int sw=0;
        query="Select * from Usuarios where nom_usu='"+user+"'and contra_usu='"+pwr+"'and tipo='"+tipo+"'";
        try{
            conect=con.conexion();
            st=conect.createStatement();
            rs=st.executeQuery(query);
            while(rs.next()){
                if(rs.getString(1)==null)
                    sw=0;
                else
                    sw=1;
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error SQL "+ex);
        }
        if (sw==1) return true;
        else return false;
}
}