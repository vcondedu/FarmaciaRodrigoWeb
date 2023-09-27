/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author victo
 */
public class ClsMarca {
    int codigo_marca;
    String nombre_marca;

    
    public ClsMarca() {
    }
    
    public ClsMarca(int codigo_marca, String nombre_marca) {
        this.codigo_marca = codigo_marca;
        this.nombre_marca = nombre_marca;
    }

    public int getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(int codigo_marca) {
        this.codigo_marca = codigo_marca;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }
    
}
