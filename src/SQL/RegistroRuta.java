
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.PuntoDeControl;
import Models.Ruta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class RegistroRuta {

    public boolean crearRuta(Ruta ruta) {

        PreparedStatement ps = null;

        String query = "INSERT INTO RUTA (Nombre,Estado,Destino) VALUES(?,?,?)";

        try {

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, ruta.getNombre());
            ps.setString(2, ruta.getEstado());
            ps.setString(3, ruta.getDestino());

            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error");
            return false;
        }
    }
    
    public static PuntoDeControl buscarDestinos(String destino){
        PuntoDeControl pcontrol=null;
        PreparedStatement ps=null;
        ResultSet rs =null;
        
        String query ="SELECT Nombre FROM RUTA WHERE Destino=? AND Estado='Activo'";
        try{
            ps=Conexion.getConection().prepareStatement(query);
            ps.setString(1, destino);
            rs = ps.executeQuery();
            while(rs.next()&&pcontrol==null){
                pcontrol=RegistroPuntoControl.buscarPuntoControlDisponible(rs.getString(1));                
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return pcontrol;
    }
}
