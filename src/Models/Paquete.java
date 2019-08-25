/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gamcas
 */
public class Paquete {
    

    private int horasInRuta;
    private double costo;
    private String estado;
    private LocalDate fechaIngreso;
    private LocalDate fechaRecepcion;
    private double tarifaPrioridad;
    private double tarifaLibra;
    private double tarifaDestino;
    private int peso;
    private int cliente;
    private Object idPuntoControl;
    private String ruta;
    private String destino;         
    
    public void setHorasInRuta(int horasInRuta) {
        this.horasInRuta = horasInRuta;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public void setTarifaPrioridad(double tarifaPrioridad) {
        this.tarifaPrioridad = tarifaPrioridad;
    }

    public void setTarifaLibra(double tarifaLibra) {
        this.tarifaLibra = tarifaLibra;
    }

    public void setTarifaDestino(double tarifaDestino) {
        this.tarifaDestino = tarifaDestino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setIdPuntoControl(Object idPuntoControl) {
        this.idPuntoControl = idPuntoControl;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getHorasInRuta() {
        return horasInRuta;
    }

    public double getCosto() {
        return costo;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public double getTarifaPrioridad() {
        return tarifaPrioridad;
    }

    public double getTarifaLibra() {
        return tarifaLibra;
    }

    public double getTarifaDestino() {
        return tarifaDestino;
    }

    public int getPeso() {
        return peso;
    }

    public int getCliente() {
        return cliente;
    }

    public Object getIdPuntoControl() {
        return idPuntoControl;
    }

    public String getRuta() {
        return ruta;
    }
    
    public static ArrayList<Paquete> ordenarPaquetesPrioridad(ArrayList<Paquete> lista){
        ArrayList<Paquete> listaArreglada=new ArrayList<>();
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getTarifaPrioridad()>0){
                listaArreglada.add(lista.get(i));
                lista.remove(i);
            }
        }
        for(int i=0;i<lista.size();i++){
            listaArreglada.add(lista.get(i));
        }
        return listaArreglada;
    }
    
    
    
}
