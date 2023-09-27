/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author victo
 */
public class ClsCategoria {
    int codigo_categoria;
    String nombre_categoria;
    String descripcion_categoria;
    byte[] imagen_categoria;

    public ClsCategoria(){
    }    
    
    public ClsCategoria(int codigo_categoria, String nombre_categoria, String descripcion_categoria, byte[] imagen_categoria) {
        this.codigo_categoria = codigo_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion_categoria = descripcion_categoria;
        this.imagen_categoria = imagen_categoria;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public byte[] getImagen_categoria() {
        return imagen_categoria;
    }

    public void setImagen_categoria(byte[] imagen_categoria) {
        this.imagen_categoria = imagen_categoria;
    }
    
    
    
}
