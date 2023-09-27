/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author victo
 */
public class ClsProveedor {
    int codigo_proveedor;
    String ruc_proveedor; 
    String nombre_proveedor; 
    String nombre_contacto_proveedor; 
    String telefono_proveedor; 
    String celular_proveedor; 
    String urlweb_proveedor; 
    String direccion_proveedor; 
    int codigo_departamento;

    public ClsProveedor(){
    }    
    
    public ClsProveedor(int codigo_proveedor, String ruc_proveedor, String nombre_proveedor, String nombre_contacto_proveedor, String telefono_proveedor, String celular_proveedor, String urlweb_proveedor, String direccion_proveedor, int codigo_departamento) {
        this.codigo_proveedor = codigo_proveedor;
        this.ruc_proveedor = ruc_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.nombre_contacto_proveedor = nombre_contacto_proveedor;
        this.telefono_proveedor = telefono_proveedor;
        this.celular_proveedor = celular_proveedor;
        this.urlweb_proveedor = urlweb_proveedor;
        this.direccion_proveedor = direccion_proveedor;
        this.codigo_departamento = codigo_departamento;
    }

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getRuc_proveedor() {
        return ruc_proveedor;
    }

    public void setRuc_proveedor(String ruc_proveedor) {
        this.ruc_proveedor = ruc_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getNombre_contacto_proveedor() {
        return nombre_contacto_proveedor;
    }

    public void setNombre_contacto_proveedor(String nombre_contacto_proveedor) {
        this.nombre_contacto_proveedor = nombre_contacto_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getCelular_proveedor() {
        return celular_proveedor;
    }

    public void setCelular_proveedor(String celular_proveedor) {
        this.celular_proveedor = celular_proveedor;
    }

    public String getUrlweb_proveedor() {
        return urlweb_proveedor;
    }

    public void setUrlweb_proveedor(String urlweb_proveedor) {
        this.urlweb_proveedor = urlweb_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public int getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(int codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }
    
}
