/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.ClsUsuario;
import java.util.List;

/**
 *
 * @author victo
 */
public interface Interfaces {
    public ClsUsuario  valida_usuario(String id_usuario,String password_usuario);
    public ClsUsuario list(int id_usuario);
}
