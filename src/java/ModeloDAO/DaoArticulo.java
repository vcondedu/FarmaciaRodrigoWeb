/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.ClsConexion;
import Interfaces.InterfaceArticulo;
import Modelo.ClsArticulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class DaoArticulo  implements InterfaceArticulo{
    ClsConexion cn=new ClsConexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ClsArticulo articulo=new ClsArticulo();

    @Override
    public List listaarticulo() {
        ArrayList<ClsArticulo>list=new ArrayList<>(); 
        String query = "select * " +
                        "from articulo ar " +
                        "order by ar.codigo_articulo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while( rs.next() ){
                ClsArticulo articulo=new ClsArticulo();
                articulo.setCodigo_articulo(rs.getInt("codigo_articulo"));
                articulo.setNombre_articulo(rs.getString("nombre_articulo"));
                articulo.setCodigo_marca(rs.getInt("codigo_marca"));
                articulo.setCodigo_categoria(rs.getInt("codigo_categoria"));
                articulo.setCodigo_proveedor(rs.getInt("codigo_proveedor"));
                articulo.setDescripcion_articulo(rs.getString("descripcion_articulo"));
                articulo.setPrecio_articulo(rs.getFloat("precio_articulo"));
                articulo.setStock_articulo(rs.getInt("stock_articulo"));
                articulo.setStock_minimo_articulo(rs.getInt("stock_minimo_articulo"));
                articulo.setEstado_articulo(rs.getInt("estado_articulo"));
                list.add(articulo);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
        }
        return list;
    }

    @Override
    public ClsArticulo list(int idarticulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarArticulo(int idarticulo) {
        String query = "delete " +
                        "from articulo " +
                        "where codigo_articulo=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, idarticulo);
            
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
            return false;
        } finally {

        }
    }

    @Override
    public boolean EditarArticulo(int codigo_articulo, String nombre_articulo, int codigo_marca, int codigo_categoria, int codigo_proveedor, String descripcion_articulo, float precio_articulo, int stock_articulo, int stock_minimo_articulo, int estado_articulo) {
        String query = "update articulo set " +
                        "nombre_articulo = ? ,"+
                        "codigo_marca = ? ,"+
                        "codigo_categoria = ? ,"+
                        "codigo_proveedor = ? ,"+
                        "descripcion_articulo = ? ,"+
                        "precio_articulo = ? ,"+
                        "stock_articulo = ? ,"+
                        "stock_minimo_articulo = ? ,"+
                        "estado_articulo = ? "+
                        "where codigo_articulo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre_articulo);
            ps.setInt(2, codigo_marca);
            ps.setInt(3, codigo_categoria);
            ps.setInt(4, codigo_proveedor);
            ps.setString(5, descripcion_articulo);
            ps.setFloat(6, precio_articulo);
            ps.setInt(7, stock_articulo);
            ps.setInt(8, stock_minimo_articulo);
            ps.setInt(9, estado_articulo);
            ps.setInt(10, codigo_articulo);
            
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
            return false;
        } finally {
        }
    }

    @Override
    public List DetalleArticulo(int idarticulo) {
        ArrayList<ClsArticulo>detalle=new ArrayList<>(); 
        String query = "select * " +
                        "from articulo " +
                        "where codigo_articulo=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, idarticulo);
            rs = ps.executeQuery();
            while( rs.next() ){
                ClsArticulo articulo=new ClsArticulo();
                articulo.setCodigo_articulo(rs.getInt("codigo_articulo"));
                articulo.setNombre_articulo(rs.getString("nombre_articulo"));
                articulo.setCodigo_marca(rs.getInt("codigo_marca"));
                articulo.setCodigo_categoria(rs.getInt("codigo_categoria"));
                articulo.setCodigo_proveedor(rs.getInt("codigo_proveedor"));
                articulo.setDescripcion_articulo(rs.getString("descripcion_articulo"));
                articulo.setPrecio_articulo(rs.getFloat("precio_articulo"));
                articulo.setStock_articulo(rs.getInt("stock_articulo"));
                articulo.setStock_minimo_articulo(rs.getInt("stock_articulo"));
                articulo.setEstado_articulo(rs.getInt("estado_articulo"));
                detalle.add(articulo);
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
        } finally {
        }
        return detalle;
    }

    @Override
    public int MaxArticulo() {
        String query = "select ifnull(max(codigo_articulo), 0) + 1 as sgte_articulo from articulo";
        int articulomaximo=0;
        try {
            ClsArticulo articulo=new ClsArticulo();
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                articulomaximo = rs.getInt("sgte_articulo");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
            return 0;
        } finally {
        }
        return articulomaximo;
    }

    @Override
    public boolean RegistrarArticulo(int codigo_articulo, String nombre_articulo, int codigo_marca, int codigo_categoria, int codigo_proveedor, String descripcion_articulo, float precio_articulo, int stock_articulo, int stock_minimo_articulo, int estado_articulo) {
        String query = "insert into Articulo" +
                       "(nombre_articulo,imagen_articulo,codigo_marca,codigo_categoria,codigo_proveedor,descripcion_articulo,precio_articulo,stock_articulo,stock_minimo_articulo,estado_articulo) " + 
                       " values (" +
                       " ?,null,?,?,?,?,?,?,?,?"+
                       " )" ;
  
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre_articulo);
            ps.setInt(2, codigo_marca);
            ps.setInt(3, codigo_categoria);
            ps.setInt(4, codigo_proveedor);
            ps.setString(5, descripcion_articulo);
            ps.setFloat(6, precio_articulo);
            ps.setInt(7, stock_articulo);
            ps.setInt(8, stock_minimo_articulo);
            ps.setInt(9, estado_articulo);
            
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows > 0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime el mensaje de error en la consola
            return false;
        } finally {
        }
    }
}
