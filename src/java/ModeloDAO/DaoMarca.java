/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.ClsConexion;
import Interfaces.InterfaceMarca;
import Modelo.ClsMarca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class DaoMarca implements InterfaceMarca{
    ClsConexion cn=new ClsConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listarmarca() {
        ArrayList<ClsMarca>list=new ArrayList<>(); 
        String query = "select * " +
                        "from marca " +
                        "order by codigo_marca";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while( rs.next() ){
                ClsMarca marca=new ClsMarca();
                marca.setCodigo_marca(rs.getInt("codigo_marca"));
                marca.setNombre_marca(rs.getString("nombre_marca"));
                list.add(marca);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
        }
        return list;
    }
    
}
