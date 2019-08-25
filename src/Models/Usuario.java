/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gamcas
 */
public class Usuario {

    private int tipo;
    private String nombre;
    private String estado;
    private String contrasena;
    private String usuario;
    private String apellido;
 


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
