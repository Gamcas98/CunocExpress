/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.PuntoDeControl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class RegistroPuntoControl {

    public boolean crearPunto(PuntoDeControl punto) {

        PreparedStatement ps = null;

        String query = "INSERT INTO PUNTO_DE_CONTROL (tarifa_operacion,cantidad_paquetes,Usuario,Ruta,Estado,id_punto_control,cola) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setDouble(1, punto.getTarifaOperacion());
            ps.setDouble(2, punto.getCantidadPaquetes());
            ps.setString(3, punto.getUsuario());
            ps.setString(4, punto.getRuta());
            ps.setString(5, punto.getEstado());
            ps.setInt(6, punto.getId());
            ps.setInt(7, punto.getCola());
            ps.execute();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static PuntoDeControl buscarPuntoControlDisponible(String ruta) {
        PuntoDeControl pcontrol = new PuntoDeControl();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT id_punto_control,tarifa_operacion,cantidad_paquetes,cola FROM PUNTO_DE_CONTROL WHERE Ruta=? AND Estado='Activo'";
        try {

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, ruta);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getInt(3) > rs.getInt(4)) {
                    pcontrol.setId(rs.getInt(1));
                    pcontrol.setRuta(ruta);
                    pcontrol.setTarifaOperacion(rs.getDouble(2));
                    AumentarCola(rs.getInt(1), rs.getInt(4) + 1, ruta);
                    return pcontrol;
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void AumentarCola(int id, int cola, String ruta) {
        PreparedStatement ps = null;
        String query = "UPDATE PUNTO_DE_CONTROL SET Cola=? WHERE id_punto_control=? AND Ruta=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, cola);
            ps.setInt(2, id);
            ps.setString(3, ruta);
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }


}
