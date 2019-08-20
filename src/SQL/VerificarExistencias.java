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
public class VerificarExistencias {

    public static int existeUsuario(String nombre) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(Usuario) FROM USUARIO WHERE Usuario= ? AND TIPO=2 AND Estado='ACTIVO'";

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

    public static int existeRuta(String nombreRuta,String destino) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(Nombre) FROM RUTA WHERE Nombre= ? AND Destino=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, nombreRuta);
            ps.setString(2, destino);
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

    public static int existeDestino(String nombre) {

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
