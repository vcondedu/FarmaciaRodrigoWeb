/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author victo
 */
public class ClsUsuario {
    int codigo_usuario;
    String id_usuario;
    String pass_usuario;
    String nombre_usuario;
    String apellido_usuario;
    String dni_usuario;
    String tipo_usuario;
    String foto_usuario;
    String telefono_usuario;
    String celular_usuario;
    String estado_usuario;

    public ClsUsuario(){
    }

    public ClsUsuario(int codigo_usuario, String id_usuario, String pass_usuario, String nombre_usuario, String apellido_usuario, String dni_usuario, String tipo_usuario, String foto_usuario, String telefono_usuario, String celular_usuario, String estado_usuario) {
        this.codigo_usuario = codigo_usuario;
        this.id_usuario = id_usuario;
        this.pass_usuario = pass_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.dni_usuario = dni_usuario;
        this.tipo_usuario = tipo_usuario;
        this.foto_usuario = foto_usuario;
        this.telefono_usuario = telefono_usuario;
        this.celular_usuario = celular_usuario;
        this.estado_usuario = estado_usuario;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getFoto_usuario() {
        return foto_usuario;
    }

    public void setFoto_usuario(String foto_usuario) {
        this.foto_usuario = foto_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getCelular_usuario() {
        return celular_usuario;
    }

    public void setCelular_usuario(String celular_usuario) {
        this.celular_usuario = celular_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    
    
}
