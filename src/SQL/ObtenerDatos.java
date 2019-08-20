/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class ObtenerDatos {

    public static String obtenerContra(String usuario) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT Contrasena FROM USUARIO WHERE Usuario=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                String contra = rs.getString(1);//varibale para almacenar el dato que nos trae rs
                return contra;//y retornamos el valor para manejarlo afuera
            }

            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            return null;
        }

    }

    public static String obtonerTarifaOperacion() {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT tarifa_operacion FROM cuotas_punto_control ORDER BY id_cuota DESC LIMIT 1";

            ps = Conexion.getConection().prepareStatement(query);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                String tarifa = rs.getString(1);//varibale para almacenar el dato que nos trae rs
                return tarifa;//y retornamos el valor para manejarlo afuera
            }

            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            return null;
        }

    }
    
    
    public static String obtenerTarifaLibra() {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT precio_libra FROM cuotas_punto_control ORDER BY id_cuota DESC LIMIT 1";

            ps = Conexion.getConection().prepareStatement(query);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                String tarifa = rs.getString(1);//varibale para almacenar el dato que nos trae rs
                return tarifa;//y retornamos el valor para manejarlo afuera
            }

            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            return null;
        }

    }

    public static String obtenerIdRuta(String nombre,String destino) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT id_ruta FROM RUTA WHERE Nombre =? AND Destino=?";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, destino);
            rs = ps.executeQuery();
//si rs nos trae datos
            if (rs.next()) {
                String ID = rs.getString(1);//varibale para almacenar el dato que nos trae rs
                return ID;//y retornamos el valor para manejarlo afuera
            }

            return null;
        } catch (SQLException | ClassNotFoundException ex) {
            return null;
        }

    }

    public static int obtenerPuntosUsuario(String nombre) {

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
//consulta para ver el ultimo caso que se ingreso
            String query = "SELECT COUNT(usuario) FROM punto_de_control WHERE usuario=?";

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
}