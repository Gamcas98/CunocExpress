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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gamcas
 */
public class RegistrarUsuario {

    public boolean crearUsuarios(Usuario usuario) {

        PreparedStatement ps = null;

        String query = "INSERT INTO USUARIO (Usuario,Contrasena,Tipo,Nombre,Apellido,Estado,estado_operacion) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContrasena());
            ps.setInt(3, usuario.getTipo());
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getApellido());
            ps.setString(6, usuario.getEstado());
            ps.setString(7, usuario.getEstadoOperacion());
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return false;
        }
    }

    public void editarUsuario(Usuario usuario) {

        PreparedStatement ps = null;
        String query = "UPDATE USUARIO SET Nombre=?, Apellido=?,Contrasena=? WHERE Usuario=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getContrasena());
            ps.setString(4, usuario.getUsuario());
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    public void desactivarUsuario(Usuario usuario) {

        PreparedStatement ps = null;
        String query = "UPDATE USUARIO SET Estado=? WHERE Usuario=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getEstado());
            ps.setString(2, usuario.getUsuario());

            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
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

        String query = "SELECT Usuario, Contrasena,Estado, Tipo FROM USUARIO WHERE Usuario= ?";
        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, usuario.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usuario.getContrasena().equals(rs.getString(2))&& rs.getString(3).equals("ACTIVO")){
                    usuario.setUsuario(rs.getString(1));
                    usuario.setContrasena(rs.getString(2));
                    usuario.setTipo(rs.getInt(4));
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
