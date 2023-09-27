/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author victo
 */
public class ClsArticulo {
    int codigo_articulo;
    String nombre_articulo;
    byte[] imagen_articulo;
    int codigo_marca;
    int codigo_categoria;
    int codigo_proveedor;
    String descripcion_articulo;
    float precio_articulo;
    int stock_articulo;
    int stock_minimo_articulo;
    int estado_articulo;

    public ClsArticulo(){
    }    
    
    public ClsArticulo(int codigo_articulo, String nombre_articulo, byte[] imagen_articulo, int codigo_marca, int codigo_categoria, int codigo_proveedor, String descripcion_articulo, float precio_articulo, int stock_articulo, int stock_minimo_articulo, int estado_articulo) {
        this.codigo_articulo = codigo_articulo;
        this.nombre_articulo = nombre_articulo;
        this.imagen_articulo = imagen_articulo;
        this.codigo_marca = codigo_marca;
        this.codigo_categoria = codigo_categoria;
        this.codigo_proveedor = codigo_proveedor;
        this.descripcion_articulo = descripcion_articulo;
        this.precio_articulo = precio_articulo;
        this.stock_articulo = stock_articulo;
        this.stock_minimo_articulo = stock_minimo_articulo;
        this.estado_articulo = estado_articulo;
    }

    public int getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public byte[] getImagen_articulo() {
        return imagen_articulo;
    }

    public void setImagen_articulo(byte[] imagen_articulo) {
        this.imagen_articulo = imagen_articulo;
    }

    public int getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(int codigo_marca) {
        this.codigo_marca = codigo_marca;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public float getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(float precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public int getStock_articulo() {
        return stock_articulo;
    }

    public void setStock_articulo(int stock_articulo) {
        this.stock_articulo = stock_articulo;
    }

    public int getStock_minimo_articulo() {
        return stock_minimo_articulo;
    }

    public void setStock_minimo_articulo(int stock_minimo_articulo) {
        this.stock_minimo_articulo = stock_minimo_articulo;
    }

    public int getEstado_articulo() {
        return estado_articulo;
    }

    public void setEstado_articulo(int estado_articulo) {
        this.estado_articulo = estado_articulo;
    }
    
    
}
