/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Admin.CrudRutas;

import Models.PuntoDeControl;
import Models.Ruta;
import SQL.ManejoTabla;
import SQL.ActualizarDatos;
import SQL.Conexion;
import SQL.ObtenerDatos;
import SQL.RegistroPuntoControl;
import SQL.RegistroRuta;
import SQL.VerificarExistencias;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamcas
 */
public class CrearRuta extends javax.swing.JPanel {

    public static int TODOS_LOS_DESTINO = 11;
    public static int BUSCAR_DESTINO = 12;
    public static int TODOS_LOS_OPERADORES = 9;
    public static int BUSCAR_OPERADOR = 10;

    public CrearRuta() {
        initComponents();
        btnQuitar.setVisible(false);
        mostrarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorInfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreRuta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadPuntos = new javax.swing.JTextField();
        errorInfo = new javax.swing.JLabel();
        asignarPuntosControl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadPermitidos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTarifaOperacion = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        btnTarifaPropia = new javax.swing.JButton();
        btnTarifaGlobal = new javax.swing.JButton();
        errorAsignar = new javax.swing.JLabel();
        contenedorTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntosControl = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        contenedorAyuda = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabalaDestino = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtBuscarDestino = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCrearRuta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        contenedorInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        contenedorInfo.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Informacion General");
        contenedorInfo.add(jLabel4);
        jLabel4.setBounds(200, 40, 210, 70);

        jLabel5.setText("Nombre Destino:");
        contenedorInfo.add(jLabel5);
        jLabel5.setBounds(50, 130, 130, 40);

        txtDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contenedorInfo.add(txtDestino);
        txtDestino.setBounds(50, 170, 200, 50);

        jLabel6.setText("Nombre de la Ruta:");
        contenedorInfo.add(jLabel6);
        jLabel6.setBounds(310, 120, 130, 40);

        txtNombreRuta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contenedorInfo.add(txtNombreRuta);
        txtNombreRuta.setBounds(310, 170, 200, 50);

        jLabel7.setText("Cant de Puntos de control:");
        contenedorInfo.add(jLabel7);
        jLabel7.setBounds(210, 250, 160, 40);

        txtCantidadPuntos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadPuntos.setText("0");
        txtCantidadPuntos.setEnabled(false);
        contenedorInfo.add(txtCantidadPuntos);
        txtCantidadPuntos.setBounds(190, 290, 200, 50);

        errorInfo.setBackground(new java.awt.Color(255, 0, 0));
        errorInfo.setForeground(new java.awt.Color(255, 0, 0));
        contenedorInfo.add(errorInfo);
        errorInfo.setBounds(120, 350, 370, 50);

        add(contenedorInfo);
        contenedorInfo.setBounds(530, 30, 540, 410);

        asignarPuntosControl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        asignarPuntosControl.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Asignar Puntos de Control");
        asignarPuntosControl.add(jLabel9);
        jLabel9.setBounds(170, 20, 240, 70);

        jLabel12.setText("Usuario Encargado:");
        asignarPuntosControl.add(jLabel12);
        jLabel12.setBounds(90, 100, 130, 40);

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        asignarPuntosControl.add(txtUser);
        txtUser.setBounds(50, 140, 200, 50);

        jLabel11.setText("Cantidad de Paquetes Permitidos:");
        asignarPuntosControl.add(jLabel11);
        jLabel11.setBounds(330, 100, 210, 40);

        txtCantidadPermitidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        asignarPuntosControl.add(txtCantidadPermitidos);
        txtCantidadPermitidos.setBounds(340, 140, 160, 50);

        jLabel10.setText("Tarifa de Operacion");
        asignarPuntosControl.add(jLabel10);
        jLabel10.setBounds(90, 230, 130, 40);

        txtTarifaOperacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTarifaOperacion.setEnabled(false);
        asignarPuntosControl.add(txtTarifaOperacion);
        txtTarifaOperacion.setBounds(50, 270, 200, 50);

        btnAsignar.setText("Agregar Punto de control");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        asignarPuntosControl.add(btnAsignar);
        btnAsignar.setBounds(330, 270, 180, 100);

        btnTarifaPropia.setText("<html>Usar Tarifa Propia");
        btnTarifaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifaPropiaActionPerformed(evt);
            }
        });
        asignarPuntosControl.add(btnTarifaPropia);
        btnTarifaPropia.setBounds(150, 330, 110, 40);

        btnTarifaGlobal.setText("<html>Usar Tarifa Global");
        btnTarifaGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarifaGlobalActionPerformed(evt);
            }
        });
        asignarPuntosControl.add(btnTarifaGlobal);
        btnTarifaGlobal.setBounds(40, 330, 110, 40);

        errorAsignar.setBackground(new java.awt.Color(255, 0, 0));
        errorAsignar.setForeground(new java.awt.Color(255, 0, 0));
        asignarPuntosControl.add(errorAsignar);
        errorAsignar.setBounds(180, 390, 310, 50);

        add(asignarPuntosControl);
        asignarPuntosControl.setBounds(530, 450, 540, 450);

        contenedorTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        contenedorTabla.setLayout(null);

        tablaPuntosControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Usuario", "Tarifa Operacion", "Paquetes Permitidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPuntosControl.setDragEnabled(true);
        jScrollPane1.setViewportView(tablaPuntosControl);

        contenedorTabla.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 580, 320);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Puntos de control Asignados");
        contenedorTabla.add(jLabel13);
        jLabel13.setBounds(210, 10, 270, 70);

        btnQuitar.setText("Quitar punto de Control");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        contenedorTabla.add(btnQuitar);
        btnQuitar.setBounds(-20, 450, 170, 70);

        add(contenedorTabla);
        contenedorTabla.setBounds(1080, 30, 610, 550);

        contenedorAyuda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        contenedorAyuda.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Listado de usuarios");
        contenedorAyuda.add(jLabel8);
        jLabel8.setBounds(150, 450, 210, 70);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Listado de Destinos");
        contenedorAyuda.add(jLabel14);
        jLabel14.setBounds(160, 10, 180, 70);

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaUsuario);

        contenedorAyuda.add(jScrollPane2);
        jScrollPane2.setBounds(20, 510, 453, 270);

        tabalaDestino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabalaDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabalaDestinoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabalaDestino);

        contenedorAyuda.add(jScrollPane3);
        jScrollPane3.setBounds(20, 90, 453, 300);

        jLabel15.setText("Buscar Destino:");
        contenedorAyuda.add(jLabel15);
        jLabel15.setBounds(80, 400, 130, 40);

        txtBuscarDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarDestinoKeyPressed(evt);
            }
        });
        contenedorAyuda.add(txtBuscarDestino);
        txtBuscarDestino.setBounds(210, 400, 260, 40);

        jLabel16.setText("Buscar Usuario:");
        contenedorAyuda.add(jLabel16);
        jLabel16.setBounds(80, 800, 130, 40);

        txtBuscarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarusuarioKeyPressed(evt);
            }
        });
        contenedorAyuda.add(txtBuscarusuario);
        txtBuscarusuario.setBounds(210, 800, 260, 40);
        contenedorAyuda.add(jSeparator1);
        jSeparator1.setBounds(0, 460, 500, 10);

        add(contenedorAyuda);
        contenedorAyuda.setBounds(10, 30, 500, 870);

        btnCrearRuta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrearRuta.setText("Crear Ruta");
        btnCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutaActionPerformed(evt);
            }
        });
        add(btnCrearRuta);
        btnCrearRuta.setBounds(1310, 660, 230, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaPuntosControl.getModel();

        int filas = tablaPuntosControl.getSelectedRow();

        if (filas < 0) {

            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");

        } else {

            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");

            if (JOptionPane.OK_OPTION == confirmar) {

                model.removeRow(filas);

                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                txtCantidadPuntos.setText(String.valueOf(tablaPuntosControl.getRowCount()));
            }

        }
    }//GEN-LAST:event_btnQuitarActionPerformed


    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed

        String usuario = txtUser.getText();
        String tarifa = txtTarifaOperacion.getText();
        String cantidad = txtCantidadPermitidos.getText();

        try {

            if (usuario.isEmpty() || tarifa.isEmpty() || cantidad.isEmpty()) {

                errorAsignar.setText("Los Campos son obligatorios");

            } else {
                if (VerificarExistencias.existeUsuario(usuario) == 1) {

                    if (!tarifa.equals("0") && !cantidad.equals("0")) {

                        double tari = Double.parseDouble(tarifa);
                        double canti = Double.parseDouble(cantidad);

                        DefaultTableModel modelo = (DefaultTableModel) tablaPuntosControl.getModel();
                        tablaPuntosControl.setRowHeight(40);
                        tablaPuntosControl.getTableHeader().setReorderingAllowed(false);
                        modelo.fireTableDataChanged();

                        Object[] fila = new Object[4];
                        fila[0] = tablaPuntosControl.getRowCount() + 1;
                        fila[1] = usuario;
                        fila[2] = tarifa;
                        fila[3] = cantidad;

                        modelo.addRow(fila);

                        tablaPuntosControl.setModel(modelo);
                        limpiarAsignacion();
                        txtCantidadPuntos.setText(String.valueOf(tablaPuntosControl.getRowCount()));
                    } else {
                        errorAsignar.setText("Tarifa y cantidad no pueden ser 0");
                    }
                } else {
                    errorAsignar.setText("El usuario no existe");
                }

            }

        } catch (NumberFormatException e) {
            errorAsignar.setText("Tarifa y cantidad deben de ser numeros");
        }


    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnTarifaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifaPropiaActionPerformed
        btnTarifaPropia.setEnabled(false);
        btnTarifaGlobal.setEnabled(true);
        txtTarifaOperacion.setEnabled(true);
        txtTarifaOperacion.setText("");
        txtTarifaOperacion.requestFocusInWindow();
    }//GEN-LAST:event_btnTarifaPropiaActionPerformed

    private void btnTarifaGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarifaGlobalActionPerformed
        if (ObtenerDatos.obtonerTarifaOperacion() == null) {
            JOptionPane.showMessageDialog(null, "No se ha fijado una tarifa"
                    + "\n por favor ingrese una tarifa");
            btnTarifaGlobal.setEnabled(false);
            txtTarifaOperacion.setEnabled(true);
            btnTarifaPropia.setEnabled(false);
            txtTarifaOperacion.requestFocusInWindow();
        } else {
            txtTarifaOperacion.setText(ObtenerDatos.obtonerTarifaOperacion());
            btnTarifaGlobal.setEnabled(false);
            txtTarifaOperacion.setEnabled(false);
            btnTarifaPropia.setEnabled(true);
        }
    }//GEN-LAST:event_btnTarifaGlobalActionPerformed

    private void btnCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRutaActionPerformed

        String destino = txtDestino.getText();
        String nombre = txtNombreRuta.getText();
        String cantiPuntos = txtCantidadPuntos.getText();

        RegistroRuta registroRuta = new RegistroRuta();
        Ruta ruta = new Ruta();

        if (destino.isEmpty() || nombre.isEmpty()) {
            errorInfo.setText("Todos los campos son obligatorios");

        } else if (cantiPuntos.equals("0")) {

            errorInfo.setText("Deber asignar por lo menos un punto de control");

        } else {

            if (VerificarExistencias.existeDestino(destino) == 1) {

                if (VerificarExistencias.existeRuta(nombre, destino) == 0) {

                    ruta.setDestino(destino);
                    ruta.setEstado("ACTIVO");
                    ruta.setNombre(nombre);

                    if (registroRuta.crearRuta(ruta)) {

                        for (int i = 0; i < tablaPuntosControl.getRowCount(); i++) {
                            RegistroPuntoControl registroPunto = new RegistroPuntoControl();
                            PuntoDeControl punto = new PuntoDeControl();
                            punto.setEstado("ACTIVO");
                            punto.setId(Integer.parseInt(tablaPuntosControl.getValueAt(i, 0).toString()));
                            punto.setRuta(nombre);
                            punto.setCola(0);
                            punto.setUsuario((String) tablaPuntosControl.getValueAt(i, 1));
                            punto.setTarifaOperacion(Double.parseDouble(tablaPuntosControl.getValueAt(i, 2).toString()));
                            punto.setCantidadPaquetes(Integer.parseInt(tablaPuntosControl.getValueAt(i, 3).toString()));

                            if (registroPunto.crearPunto(punto)) {

                            } else {
                                JOptionPane.showMessageDialog(null, "algo ha salido mal");
                            }

                        }

                        JOptionPane.showMessageDialog(null, "Se ha creado la ruta con exito");
                        eliminar();
                        limpiarInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "algo ha salido mal");
                    }

                } else {
                    errorInfo.setText("La ruta ya existe");
                }

            } else {
                errorInfo.setText("El destino no existe");
            }
        }


    }//GEN-LAST:event_btnCrearRutaActionPerformed

    private void txtBuscarDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDestinoKeyPressed
        try {
            ManejoTabla.mostrarTablas(tabalaDestino, BUSCAR_DESTINO, txtBuscarDestino.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearRuta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarDestinoKeyPressed

    private void txtBuscarusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarusuarioKeyPressed
        try {
            ManejoTabla.mostrarTablas(tablaUsuario, BUSCAR_OPERADOR, txtBuscarusuario.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearRuta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarusuarioKeyPressed

    private void tabalaDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalaDestinoMouseClicked
        txtDestino.setText((String) tabalaDestino.getValueAt(tabalaDestino.getSelectedRow(), 0));
    }//GEN-LAST:event_tabalaDestinoMouseClicked

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        txtUser.setText((String) tablaUsuario.getValueAt(tablaUsuario.getSelectedRow(), 0));
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    private void limpiarAsignacion() {
        txtTarifaOperacion.setText("");
        txtCantidadPermitidos.setText("");
        txtUser.setText("");
        txtTarifaOperacion.setEnabled(false);
        errorAsignar.setText("");
        btnTarifaGlobal.setEnabled(true);
        btnTarifaPropia.setEnabled(true);
    }

    private void limpiarInfo() {
        txtNombreRuta.setText("");
        txtDestino.setText("");
        txtCantidadPuntos.setText("0");
        errorInfo.setText("");
    }

    private void eliminar() {
        DefaultTableModel tb = (DefaultTableModel) tablaPuntosControl.getModel();
        int a = tablaPuntosControl.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

    }

    private void mostrarTablas() {
        try {
            ManejoTabla.mostrarTablas(tabalaDestino, TODOS_LOS_DESTINO, null);
            ManejoTabla.mostrarTablas(tablaUsuario, TODOS_LOS_OPERADORES, null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearRuta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asignarPuntosControl;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCrearRuta;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnTarifaGlobal;
    private javax.swing.JButton btnTarifaPropia;
    private javax.swing.JPanel contenedorAyuda;
    private javax.swing.JPanel contenedorInfo;
    private javax.swing.JPanel contenedorTabla;
    private javax.swing.JLabel errorAsignar;
    private javax.swing.JLabel errorInfo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabalaDestino;
    private javax.swing.JTable tablaPuntosControl;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtBuscarDestino;
    private javax.swing.JTextField txtBuscarusuario;
    private javax.swing.JTextField txtCantidadPermitidos;
    private javax.swing.JTextField txtCantidadPuntos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNombreRuta;
    private javax.swing.JTextField txtTarifaOperacion;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
