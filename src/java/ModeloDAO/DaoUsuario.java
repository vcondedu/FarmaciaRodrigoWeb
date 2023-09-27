/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.ClsConexion;
import Interfaces.Interfaces;
import Modelo.ClsUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DaoUsuario implements Interfaces{
    
    ClsConexion cn=new ClsConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ClsUsuario usuario=new ClsUsuario();
    
    @Override
    public ClsUsuario list(int id_usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClsUsuario valida_usuario(String id_usuario,String password_usuario) {
        //int existe = 0;
        int codigo_usuario = 0;
        String query = "SELECT * FROM usuario where id_usuario = ? and pass_usuario = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, id_usuario);
            ps.setString(2, password_usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setCodigo_usuario(rs.getInt("codigo_usuario"));
                codigo_usuario = usuario.getCodigo_usuario();
                usuario.setId_usuario(rs.getString("id_usuario"));
                usuario.setPass_usuario(rs.getString("pass_usuario"));
                usuario.setNombre_usuario(rs.getString("nombre_usuario"));
                usuario.setApellido_usuario(rs.getString("apellido_usuario"));
                usuario.setDni_usuario(rs.getString("dni_usuario"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                usuario.setFoto_usuario(rs.getString("foto_usuario"));
                usuario.setTelefono_usuario(rs.getString("telefono_usuario"));
                usuario.setCelular_usuario(rs.getString("celular_usuario"));
                usuario.setEstado_usuario(rs.getString("estado_usuario"));
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
            // Cerrar recursos (Connection, PreparedStatement, ResultSet) aquí si es necesario
        }
        return usuario;
    }
    
}
