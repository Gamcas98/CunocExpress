/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.Tarifas;

import UI.Admin.CrudUsuarios.*;
import Models.Usuario;
import SQL.ActualizarDatos;
import SQL.ManejoTabla;
import SQL.ObtenerDatos;
import SQL.RegistrarUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gamcas
 */
public class EditTarifaDestino extends javax.swing.JPanel {

    /**
     * Creates new form crearUser
     */
    public static int TODOS_LOS_USUARIOS = 7;
    public static int MOSTRAR_USUARIO_BUSCADO = 8;

    public EditTarifaDestino() {
        initComponents();
        mostrarDestinos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDestinos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        errorTarifa = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtNuevaTarifa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTarifaActual = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Destino:");
        add(jLabel2);
        jLabel2.setBounds(250, 50, 220, 60);

        tablaDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDestinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDestinos);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 680, 670);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Destino:");
        add(jLabel1);
        jLabel1.setBounds(380, 810, 130, 40);

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        add(txtBusqueda);
        txtBusqueda.setBounds(510, 810, 190, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        errorTarifa.setBackground(new java.awt.Color(255, 0, 0));
        errorTarifa.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTarifa);
        errorTarifa.setBounds(250, 340, 350, 60);

        lblContra.setText("Nueva Tarifa");
        jPanel1.add(lblContra);
        lblContra.setBounds(500, 210, 120, 40);
        jPanel1.add(txtNuevaTarifa);
        txtNuevaTarifa.setBounds(440, 240, 200, 50);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cambio de tarifa");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 10, 150, 80);

        txtDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDestino.setEnabled(false);
        jPanel1.add(txtDestino);
        txtDestino.setBounds(280, 130, 200, 50);

        jLabel4.setText("Destino");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 90, 70, 40);

        btnSave.setText("Cambiar Tarifa");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(310, 440, 160, 70);

        jLabel7.setText("Tarifa Actual");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 210, 72, 40);

        txtTarifaActual.setEnabled(false);
        jPanel1.add(txtTarifaActual);
        txtTarifaActual.setBounds(130, 250, 200, 50);

        add(jPanel1);
        jPanel1.setBounds(740, 130, 770, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        try {
            ManejoTabla.mostrarTablas(tablaDestinos, MOSTRAR_USUARIO_BUSCADO, txtBusqueda.getText());
        } catch (ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void tablaDestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDestinosMouseClicked
        int fila = tablaDestinos.getSelectedRow();
        txtDestino.setText((String) tablaDestinos.getValueAt(fila, 0));
        txtTarifaActual.setText(String.valueOf(tablaDestinos.getValueAt(fila, 1).toString()));
    }//GEN-LAST:event_tablaDestinosMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String destino = txtDestino.getText();
        String nueva = txtNuevaTarifa.getText();

        if (destino.isEmpty()) {
            errorTarifa.setText("seleccione un destino");
        } else {
            try {
                if (nueva.equals("0") || nueva.isEmpty()) {
                    errorTarifa.setText("La tarifa no puede esta vacia, tampoco puede ser 0");
                } else {
                    ActualizarDatos.setTarifaDestino(Double.parseDouble(nueva), destino);
                    JOptionPane.showMessageDialog(null, "Tarfia cambiada con exito");
                    limpiar();
                    mostrarDestinos();
                }

            } catch (NumberFormatException e) {
                errorTarifa.setText("La tarifa debe de ser un numero");
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void limpiar() {
        txtBusqueda.setText("");
        txtNuevaTarifa.setText("");
        txtNuevaTarifa.setText("");
        txtDestino.setText("");
        errorTarifa.setText("");
        txtTarifaActual.setText("");
    }

    private void mostrarDestinos() {
        try {
            ManejoTabla.mostrarTablas(tablaDestinos, TODOS_LOS_USUARIOS, null);
        } catch (ClassNotFoundException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel errorTarifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContra;
    private javax.swing.JTable tablaDestinos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNuevaTarifa;
    private javax.swing.JTextField txtTarifaActual;
    // End of variables declaration//GEN-END:variables
}
