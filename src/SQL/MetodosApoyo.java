/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gamcas
 */
public class MetodosApoyo {

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
}
