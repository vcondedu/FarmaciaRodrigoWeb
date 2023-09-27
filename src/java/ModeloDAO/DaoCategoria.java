/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.ClsConexion;
import Interfaces.InterfaceCategoria;
import Modelo.ClsCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class DaoCategoria implements InterfaceCategoria{


    ClsConexion cn=new ClsConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listarcategoria() {
        ArrayList<ClsCategoria>list=new ArrayList<>(); 
        String query = "select * " +
                        "from categoria " +
                        "order by codigo_categoria";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while( rs.next() ){
                ClsCategoria categoria=new ClsCategoria();
                categoria.setCodigo_categoria(rs.getInt("codigo_categoria"));
                categoria.setNombre_categoria(rs.getString("nombre_categoria"));
                categoria.setDescripcion_categoria(rs.getString("descripcion_categoria"));
                categoria.setImagen_categoria(rs.getBytes("imagen_categoria"));
                list.add(categoria);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
        }
        return list;
    }
    
}
