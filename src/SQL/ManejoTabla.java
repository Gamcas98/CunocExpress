/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Gamcas
 */
public class ManejoTabla {

    public static void mostrarTablas(JTable tabla, int consulta, String nombre) throws ClassNotFoundException {

        DefaultTaBleModel modelo = new DefaultTaBleModel();
        tabla.setModel(modelo);
        modelo.fireTableDataChanged();
        tabla.getTableHeader().setReorderingAllowed(false);
        PreparedStatement ps = null;
        ResultSet rs = null;

        //variables para almacenar la sentencia sql segun la necesidad de la tabla a mostrar
        //se explica para que se usa cada varibale en el case correspondiente
        
        String queryUsuarios = "SELECT  Usuario, Nombre, Apellido FROM USUARIO ORDER BY Usuario ASC";

        String queryBusquedaUsuarios = "SELECT  Usuario, Nombre, Apellido FROM USUARIO WHERE Usuario LIKE ? ORDER BY Usuario ASC";

        String queryActivarDesactivar = "SELECT  Usuario, Nombre, Apellido FROM USUARIO"
                + " WHERE estado_operacion='INACTIVO' AND Estado=?"
                + "ORDER BY Usuario ASC";

        String queryBusquedaActivosInactivos = "SELECT  Usuario, Nombre, Apellido FROM USUARIO"
                + " WHERE estado_operacion='INACTIVO' AND Estado=? AND Usuario LIKE ?"
                + "ORDER BY Usuario ASC";
        try {

            switch (consulta) {
                //muestra todos los usuarios
                case 1:
                    ps = Conexion.getConection().prepareStatement(queryUsuarios);
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;
                //muestra una busqueda de todos los usuarios
                case 2:
                    ps = Conexion.getConection().prepareStatement(queryBusquedaUsuarios);
                    ps.setString(1, "%" + nombre + "%");
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;
                //muestra todos los usuarios activos
                case 3:
                    ps = Conexion.getConection().prepareStatement(queryActivarDesactivar);
                    ps.setString(1, "ACTIVO");
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;
                //muestra todos los usuarios inactivos
                case 4:
                    ps = Conexion.getConection().prepareStatement(queryActivarDesactivar);
                    ps.setString(1, "INACTIVO");
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;
                //muestra una busqueda de todos los usuarios activos
                case 5:
                    ps = Conexion.getConection().prepareStatement(queryBusquedaActivosInactivos);
                    ps.setString(1, "ACTIVO");
                    ps.setString(2, "%" + nombre + "%");
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;
                //muestra una busqueda de  todos los usuarios inactivos
                case 6:
                    ps = Conexion.getConection().prepareStatement(queryBusquedaActivosInactivos);
                    ps.setString(1, "INACTIVO");
                    ps.setString(2, "%" + nombre + "%");
                    rs = ps.executeQuery();
                    modelo.addColumn("Usuario");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    break;

            }

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

            }

        } catch (SQLException ex) {
        }
    }

}
