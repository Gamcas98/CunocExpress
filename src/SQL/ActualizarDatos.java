/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gamcas
 */
public class ActualizarDatos {


    public static boolean setTarifasPaquetes(Object tarifa, Object precio, Date fecha) {

        PreparedStatement ps = null;

        String query = "INSERT INTO CUOTAS_PAQUETES (tarifa_prioridad,precio_libra,fecha) VALUES(?,?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setObject(1, tarifa);
            ps.setObject(2, precio);
            ps.setDate(3, fecha);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static boolean setTarifaOperacion(double tarifa, Date fecha) {

        PreparedStatement ps = null;

        String query = "INSERT INTO CUOTAS_PUNTO_CONTROL (tarifa_operacion,fecha) VALUES(?,?)";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setDouble(1, tarifa);
            ps.setDate(2, fecha);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static boolean setTarifaDestino(double cuota, String destino) {

        PreparedStatement ps = null;

        String query = "UPDATE DESTINO SET cuota_destino=? WHERE nombre_destino=?";

        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setDouble(1, cuota);
            ps.setString(2, destino);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

    }
}
