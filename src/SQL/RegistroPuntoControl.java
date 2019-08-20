/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.PuntoDeControl;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class RegistroPuntoControl {
    
        public boolean crearPunto(PuntoDeControl punto) {

        PreparedStatement ps = null;

        String query = "INSERT INTO PUNTO_DE_CONTROL (tarifa_operacion,cantidad_paquetes,Usuario,Ruta,Estado) VALUES(?,?,?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setDouble(1, punto.getTarifaOperacion());
            ps.setDouble(2, punto.getCantidadPaquetes());
            ps.setString(3, punto.getUsuario());
            ps.setInt(4, punto.getRuta());
            ps.setString(5, punto.getEstado());

            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
}
