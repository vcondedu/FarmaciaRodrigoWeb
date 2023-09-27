/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.*;

public class ClsConexion {
    
    Connection con;
    public ClsConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tu_farma?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }catch (Exception e){
            System.err.println("Error " + e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    
}
