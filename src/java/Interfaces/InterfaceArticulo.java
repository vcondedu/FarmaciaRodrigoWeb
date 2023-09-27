/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.ClsArticulo;
import java.util.List;

/**
 *
 * @author victo
 */
public interface InterfaceArticulo {
    public List listaarticulo();
    public ClsArticulo list(int idarticulo);
    public List DetalleArticulo(int idarticulo);
    public boolean EliminarArticulo(int idarticulo);
    public boolean EditarArticulo(int codigo_articulo, String nombre_articulo, int codigo_marca, int codigo_categoria, int codigo_proveedor, String descripcion_articulo, float precio_articulo, int stock_articulo, int stock_minimo_articulo, int estado_articulo);
    public boolean RegistrarArticulo(int codigo_articulo, String nombre_articulo, int codigo_marca, int codigo_categoria, int codigo_proveedor, String descripcion_articulo, float precio_articulo, int stock_articulo, int stock_minimo_articulo, int estado_articulo);
    public int MaxArticulo();
}
