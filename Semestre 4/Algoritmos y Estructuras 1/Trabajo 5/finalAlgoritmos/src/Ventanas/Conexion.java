/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;
import java.sql.*;

public class Conexion {
   Connection con;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/final?characterEncoding=utf8","root","123456789");
            System.out.println("Conectado");
                    
            }catch(Exception e){
            System.out.println("Error de Conexion BD: "+e);
        }
        return con;
    }
}
