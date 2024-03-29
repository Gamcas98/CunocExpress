/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.Reportes;

import SQL.ManejoReportes;
import SQL.ManejoTabla;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamcas
 */
public class ReporteRutas extends javax.swing.JPanel {

    /**
     * Creates new form crearUser
     */
    public static int PAQUETES_EN_DESTINO = 16;

    public ReporteRutas() {
        initComponents();
        this.jCheckBox1.setSelected(true);
        mostrarPaquetes();
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
        tablaReportes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Ruta de Paquetes");
        add(jLabel2);
        jLabel2.setBounds(740, 10, 220, 60);

        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ruta", "Cantidad Paquetes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReportes);

        add(jScrollPane1);
        jScrollPane1.setBounds(380, 120, 930, 670);

        jLabel1.setText("Filtar Estado:");
        add(jLabel1);
        jLabel1.setBounds(390, 70, 100, 40);

        btnExportar.setText("Exportar a HTML");
        add(btnExportar);
        btnExportar.setBounds(790, 810, 150, 70);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        add(jComboBox1);
        jComboBox1.setBounds(470, 70, 140, 40);

        jLabel3.setText("Mostar Paquetes:");
        add(jLabel3);
        jLabel3.setBounds(890, 70, 120, 40);

        jCheckBox1.setText("En Ruta");
        add(jCheckBox1);
        jCheckBox1.setBounds(1010, 80, 80, 24);

        jCheckBox2.setText("Fuera de Ruta");
        add(jCheckBox2);
        jCheckBox2.setBounds(1120, 80, 120, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReportesMouseClicked

    }//GEN-LAST:event_tablaReportesMouseClicked

    private void mostrarPaquetes() {
        Object O[] = new Object[2];
        DefaultTableModel modelo = (DefaultTableModel) tablaReportes.getModel();
        tablaReportes.setRowHeight(40);
        tablaReportes.getTableHeader().setReorderingAllowed(false);

        for (int i = 0; i < ManejoReportes.main().size(); i++) {

            O[0] = ManejoReportes.main().get(0);
            O[1] = ManejoReportes.main().get(1);

        }
        modelo.addRow(O);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReportes;
    // End of variables declaration//GEN-END:variables
}
