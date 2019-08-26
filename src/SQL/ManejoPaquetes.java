/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class ManejoPaquetes {

    public static int obtenerTarifaPunto(String nombre, int id) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT tarifa_operacion FROM punto_de_control WHERE Ruta=? AND id_punto_control=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, nombre);
            ps.setInt(2, id);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                int numero = rs.getInt(1);//varibale para almacenar el dato que nos trae rs
                return numero;//y retornamos el valor para manejarlo afuera
            }

            return 0;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }

    }

    public static int obtenerPrimerPaquete(String ruta, int id) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT id_paquete FROM PAQUETE WHERE Ruta=? AND punto_control=? AND Estado='Ruta' ORDER BY fecha_ingreso ASC LIMIT 1";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, ruta);
            ps.setInt(2, id);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                int numero = rs.getInt(1);//varibale para almacenar el dato que nos trae rs
                return numero;//y retornamos el valor para manejarlo afuera
            }

            return 0;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }

    }

    public static boolean moverPaquete(Object punto, int destino, int horas, double costo,String estado) {

        PreparedStatement ps = null;

        String query = "UPDATE PAQUETE SET punto_control=?,horas_en_ruta=?,costo=?,Estado=? WHERE id_paquete=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setObject(1, punto);
            ps.setInt(2, horas);
            ps.setDouble(3, costo);
            ps.setString(4, estado);
            ps.setInt(5, destino);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static int obtenerPuntosrRuta(String nombre) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT COUNT(id_punto_control) FROM punto_de_control WHERE Ruta=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                int numero = rs.getInt(1);//varibale para almacenar el dato que nos trae rs
                return numero;//y retornamos el valor para manejarlo afuera
            }

            return 0;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }

    }

    public static int obtenerHoras(int paquete) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT horas_en_ruta FROM PAQUETE WHERE id_paquete=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, paquete);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                int numero = rs.getInt(1);//varibale para almacenar el dato que nos trae rs
                return numero;//y retornamos el valor para manejarlo afuera
            }

            return 0;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }

    }

    public static int obtenerCosto(int paquete) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT costo FROM PAQUETE WHERE id_paquete=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, paquete);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                int numero = rs.getInt(1);//varibale para almacenar el dato que nos trae rs
                return numero;//y retornamos el valor para manejarlo afuera
            }

            return 0;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }

    }
    
        public Cliente recuperarPaquete(int nit){
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT Nit,Nombre,Telefono,Direccion FROM CLIENTE WHERE Nit=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, nit);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
               cliente.setNit(rs.getInt(1));
               cliente.setNombre(rs.getString(2));
               cliente.setTelefono(rs.getInt(3));
               cliente.setDireccion(rs.getString(4));
               
               return cliente;
            }

            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            return null;
        }
    }

}
