/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Models.Usuario;
import SQL.Conexion;
import SQL.RegistrarUsuario;
import UI.Admin.PrincipalAdmin;
import UI.Operador.PrincipalOperado1;
import UI.Recepcionista.PrincipalRecepcionista;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Gamcas
 */
public class Login extends javax.swing.JFrame {

    final int ADMIN = 1;
    final int OPERARIO = 2;
    final int RECEPCIONISTA = 3;

    /**
     * Creates new form Login
     */
    ImageIcon icono = new ImageIcon("src/Imagenes/usuario.png");

    private Usuario usuario;
    private RegistrarUsuario registro;

    public Login() {
        initComponents();
        this.setIconImage(icono.getImage());
        this.setTitle("Login");
        this.setSize(891, 650);
        this.setLocationRelativeTo(null);
        try {
            Conexion.getConection();
        } catch (SQLException | ClassNotFoundException ex) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpContenedor = new javax.swing.JPanel();
        JpInfo = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JpLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblContraNombre = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        alert = new javax.swing.JLabel();
        mostrarContra = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JpContenedor.setLayout(new java.awt.BorderLayout());

        JpInfo.setBackground(new java.awt.Color(255, 255, 255));
        JpInfo.setPreferredSize(new java.awt.Dimension(300, 499));
        JpInfo.setLayout(null);

        jLabel.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 51, 255));
        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion.jpg"))); // NOI18N
        JpInfo.add(jLabel);
        jLabel.setBounds(120, 330, 50, 60);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Aerolinea");
        JpInfo.add(jLabel3);
        jLabel3.setBounds(40, 210, 240, 60);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Carrillo");
        JpInfo.add(jLabel4);
        jLabel4.setBounds(60, 270, 168, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-tecnologico-geometrico-color-azul_1055-1907.jpg"))); // NOI18N
        JpInfo.add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 800);

        JpContenedor.add(JpInfo, java.awt.BorderLayout.LINE_START);

        JpLogin.setBackground(new java.awt.Color(255, 255, 255));
        JpLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel1.setText("Sign In");
        JpLogin.add(jLabel1);
        jLabel1.setBounds(240, 60, 140, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        JpLogin.add(jLabel5);
        jLabel5.setBounds(140, 180, 40, 50);
        JpLogin.add(txtUser);
        txtUser.setBounds(180, 180, 230, 50);

        jLabel6.setText("UserName:");
        JpLogin.add(jLabel6);
        jLabel6.setBounds(260, 150, 90, 20);

        lblContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contra.png"))); // NOI18N
        JpLogin.add(lblContra);
        lblContra.setBounds(140, 310, 40, 50);

        lblContraNombre.setText("Password:");
        JpLogin.add(lblContraNombre);
        lblContraNombre.setBounds(260, 280, 90, 20);

        btnIngreso.setBackground(new java.awt.Color(255, 255, 255));
        btnIngreso.setFont(new java.awt.Font("Lucida Handwriting", 2, 18)); // NOI18N
        btnIngreso.setForeground(new java.awt.Color(0, 0, 0));
        btnIngreso.setText("Ingresar");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        JpLogin.add(btnIngreso);
        btnIngreso.setBounds(200, 420, 180, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/copyr.jpg"))); // NOI18N
        JpLogin.add(jLabel9);
        jLabel9.setBounds(130, 540, 70, 60);

        jLabel10.setText("Todos los derechos reservados 2019");
        JpLogin.add(jLabel10);
        jLabel10.setBounds(200, 540, 260, 20);

        jLabel11.setText("Diseno y Desarrollo por: Gamcas");
        JpLogin.add(jLabel11);
        jLabel11.setBounds(210, 560, 200, 20);

        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });
        JpLogin.add(txtContra);
        txtContra.setBounds(180, 310, 230, 50);

        alert.setBackground(new java.awt.Color(255, 51, 51));
        alert.setForeground(new java.awt.Color(255, 51, 51));
        JpLogin.add(alert);
        alert.setBounds(210, 370, 200, 30);

        mostrarContra.setBackground(new java.awt.Color(255, 255, 255));
        mostrarContra.setText("Show Password");
        mostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContraActionPerformed(evt);
            }
        });
        JpLogin.add(mostrarContra);
        mostrarContra.setBounds(420, 320, 130, 30);

        JpContenedor.add(JpLogin, java.awt.BorderLayout.CENTER);

        getContentPane().add(JpContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void mostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContraActionPerformed
        if (mostrarContra.isSelected()) {
            txtContra.setEchoChar((char) 0);
        } else {
            txtContra.setEchoChar('•');
        }
    }//GEN-LAST:event_mostrarContraActionPerformed

    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }//GEN-LAST:event_txtContraKeyPressed

    private void limpiar() {
        txtContra.setText("");
        txtUser.setText("");
        txtUser.requestFocus();
    }

    private void iniciarSesion() {

        usuario = new Usuario();
        registro = new RegistrarUsuario();

        String user = txtUser.getText();
        String pass = new String(txtContra.getPassword());

        if (!user.equals("") && !pass.equals("")) {

            usuario.setUsuario(user);
            usuario.setContrasena(pass);

            if (registro.login(usuario)) {
                this.dispose();

                switch (usuario.getTipo()) {
                    case ADMIN:
                        PrincipalAdmin frAdmin = new PrincipalAdmin();
                        frAdmin.setText(user);
                        frAdmin.setVisible(true);

                        break;
                    case OPERARIO:
                        PrincipalOperado1 operador = new PrincipalOperado1();
                        operador.setText(user);
                        operador.setVisible(true);
                        break;
                    case RECEPCIONISTA:
                        PrincipalRecepcionista recepcionista = new PrincipalRecepcionista();
                        recepcionista.setText(user);
                        recepcionista.setVisible(true);
                        break;
                    default:
                        break;
                }
            } else {
                alert.setText("Verifique los datos");
            }

        } else {
            alert.setText("Por favor verifique los campos");
        }

        limpiar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpContenedor;
    private javax.swing.JPanel JpInfo;
    private javax.swing.JPanel JpLogin;
    private javax.swing.JLabel alert;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblContraNombre;
    private javax.swing.JCheckBox mostrarContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
