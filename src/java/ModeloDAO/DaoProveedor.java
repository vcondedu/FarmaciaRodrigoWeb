/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.ClsConexion;
import Interfaces.InterfaceProveedor;
import Modelo.ClsProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class DaoProveedor implements InterfaceProveedor{

    ClsConexion cn=new ClsConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listarproveedor() {
        ArrayList<ClsProveedor>list=new ArrayList<>(); 
        String query = "select * " +
                        "from proveedor " +
                        "order by codigo_proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while( rs.next() ){
                ClsProveedor proveedor=new ClsProveedor();
                proveedor.setCodigo_proveedor(rs.getInt("codigo_proveedor"));
                proveedor.setRuc_proveedor(rs.getString("ruc_proveedor"));
                proveedor.setNombre_proveedor(rs.getString("nombre_proveedor"));
                proveedor.setNombre_contacto_proveedor(rs.getString("nombre_contacto_proveedor"));
                proveedor.setTelefono_proveedor(rs.getString("telefono_proveedor"));
                proveedor.setCelular_proveedor(rs.getString("celular_proveedor"));
                proveedor.setUrlweb_proveedor(rs.getString("urlweb_proveedor"));
                proveedor.setDireccion_proveedor(rs.getString("direccion_proveedor"));
                proveedor.setCodigo_departamento(rs.getInt("codigo_departamento"));
                list.add(proveedor);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
        }
        return list;
    }


}
