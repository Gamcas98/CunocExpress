package SQL;

import Models.Paquete;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistroPaquete {

    public static boolean crearPaquete(Paquete paquete) {
        PreparedStatement ps = null;

        String query = "INSERT INTO PAQUETE (nit_cliente,Estado,tarifa_Prioridad,tarifa_libra,tarifa_destino"
                + ",Peso,Destino,Punto_control,costo,ruta,horas_en_ruta,fecha_ingreso ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        Date date = Date.valueOf(paquete.getFechaIngreso());
        
        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setInt(1, paquete.getCliente());
            ps.setString(2, paquete.getEstado());
            ps.setDouble(3, paquete.getTarifaPrioridad());
            ps.setDouble(4, paquete.getTarifaLibra());
            ps.setDouble(5, paquete.getTarifaDestino());
            ps.setInt(6, paquete.getPeso());
            ps.setString(7, paquete.getDestino());
            ps.setObject(8, paquete.getIdPuntoControl());
            ps.setDouble(9, paquete.getCosto());
            ps.setString(10, paquete.getRuta());
            ps.setInt(11, paquete.getHorasInRuta());
            ps.setDate(12, date);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
           ex.printStackTrace();
            return false;
        }
    }

    public static boolean buscarUbicacion(String Destino) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(*) FROM PAQUETE WHERE Estado= ? AND Destino= ?";
        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, "Bodega");
            ps.setString(2, Destino);
            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt(1) > 0) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean buscarPrioridad(String Destino) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT COUNT(*) FROM PAQUETE WHERE Estado= ? AND Destino= ? AND tarifa_Prioridad>0";
        try {
            ps = Conexion.getConection().prepareStatement(query);
            ps.setString(1, "Bodega");
            ps.setString(2, Destino);
            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt(1) > 0) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
