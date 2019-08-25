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
public class PuntoDeControl {

    private double tarifaOperacion;
    private int cantidadPaquetes;
    private String usuario;
    private String ruta;
    private String estado;
    private int id;
    private int cola;

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTarifaOperacion(double tarifaOperacion) {
        this.tarifaOperacion = tarifaOperacion;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTarifaOperacion() {
        return tarifaOperacion;
    }

    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRuta() {
        return ruta;
    }

    public String getEstado() {
        return estado;
    }

}
