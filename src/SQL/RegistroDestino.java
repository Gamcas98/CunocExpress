/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.Destino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class RegistroDestino {

    public boolean crearDestino(Destino Destino) {

        PreparedStatement ps = null;

        String query = "INSERT INTO DESTINO (nombre_destino, cuota_destino) VALUES(?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, Destino.getNombreDestino());
            ps.setDouble(2, Destino.getCuota());
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return false;
        }
    }

    public int existeDestino(String nombre) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(nombre_destino) FROM DESTINO WHERE nombre_destino= ?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return 1;
        }
    }

}
