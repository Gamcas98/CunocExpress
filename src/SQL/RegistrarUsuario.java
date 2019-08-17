/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class RegistrarUsuario {

    public boolean crearUsuarios(Usuario usuario) {

        PreparedStatement ps = null;

        String query = "INSERT INTO USUARIO (Usuario,Contrasena,Tipo) VALUES(?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContrasena());
            ps.setInt(3, usuario.getTipo());
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return false;
        }
    }

    //metodo para que comprueba si el nombre de usuario ya existe
    public int existeUsuario(String nombre) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(Usuario) FROM USUARIO WHERE Usuario= ?";

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

    //metodo para iniciar sesion
    public boolean login(Usuario usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT Usuario, Contrasena, Tipo FROM USUARIO WHERE Usuario= ?";
        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usuario.getContrasena().equals(rs.getString(2))) {
                    usuario.setUsuario(rs.getString(1));
                    usuario.setContrasena(rs.getString(2));
                    usuario.setTipo(rs.getInt(3));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
