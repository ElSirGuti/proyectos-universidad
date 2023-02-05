package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
                cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/final?characterEncoding=utf8","root","123456789");
            System.out.println("Conectado");
                    
            }catch(Exception e){
            System.out.println("Error de Conexion BD: "+e);
        }
        return cn;
    }
}
