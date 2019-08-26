/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Gamcas
 */
public class ManejoReportes {

    public static List<String> obtenerRutas() {
        List<String> ruta = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "SELECT Nombre FROM Ruta";

            ps = Conexion.getConection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                ruta.add(rs.getString(1));
            }

            return ruta;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }

    }

    public static List<Object> query(String ruta) {

        List<Object> rutaa = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "SELECT Ruta, count(id_paquete) FROM paquete WHERE Ruta=? AND ESTADO='RUTA'";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, ruta);
            rs = ps.executeQuery();

            while (rs.next()) {
                rutaa.add(rs.getString(1));
                rutaa.add(rs.getInt(2));
            }

            return rutaa;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }

    public static List<Object> query2(String ruta) {

        List<Object> rutaa = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "SELECT Ruta, count(id_paquete) FROM paquete WHERE Ruta=? AND ESTADO='DESTINO' OR Estado='Entregado'";

            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, ruta);
            rs = ps.executeQuery();

            while (rs.next()) {
                rutaa.add(rs.getString(1));
                rutaa.add(rs.getInt(2));
            }

            return rutaa;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }

    public static List<Object> main() {
        List<Object> rutaa = new ArrayList<>();

        for (int i = 0; i < obtenerRutas().size(); i++) {

            if (!(query(obtenerRutas().get(i))).toString().contains("0")) {

                System.out.println(query(obtenerRutas().get(i)));
                
                
                rutaa.add(query(obtenerRutas().get(i)).get(0));
                rutaa.add(query(obtenerRutas().get(i)).get(1));
                System.out.println(rutaa.get(i));
            }

        }
        return rutaa;
    }

}
