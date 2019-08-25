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
public class RegistroCliente {

    public boolean crearCliente(Cliente cliente) {

        PreparedStatement ps = null;

        String query = "INSERT INTO CLIENTE (Nit,Nombre,Telefono,Direccion) VALUES(?,?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, cliente.getNit());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());

            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return false;
        }
    }

    public void editarCliente(Cliente cliente) {

        PreparedStatement ps = null;
        String query = "UPDATE CLIENTE SET Nombre=?, Direccion=?,Telefono=? WHERE Nit=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setInt(3, cliente.getTelefono());
            ps.setInt(4, cliente.getNit());
            ps.execute();
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    public int existeCliente(int nit) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(Nit) FROM CLIENTE WHERE nit= ?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, nit);
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
    
    public Cliente recuperarCliente(int nit){
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
