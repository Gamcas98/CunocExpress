/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UiAdmin;

import UI.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Gamcas
 */
public class FormAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FormAdministrador
     */
    ImageIcon icono = new ImageIcon("src/Imagenes/usuario.png");
    info info = new info();
    edituser edit = new edituser();
    crearUser crear = new crearUser();

    public FormAdministrador() {
        initComponents();
        this.setIconImage(icono.getImage());
        this.setTitle("Administrador");
        this.setExtendedState(MAXIMIZED_BOTH);
        JpInfo.removeAll();
        JpInfo.add(info, BorderLayout.CENTER);
        JpInfo.revalidate();
        JpInfo.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        ContenedorPrincipal = new javax.swing.JPanel();
        JpMenu = new javax.swing.JPanel();
        iconUserInSesion = new javax.swing.JLabel();
        UserInSesion = new javax.swing.JLabel();
        separarUserInSesion = new javax.swing.JSeparator();
        iconCreateUser = new javax.swing.JLabel();
        iconEditUser = new javax.swing.JLabel();
        iconDIsabledUser = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JLabel();
        btnDesUsuario = new javax.swing.JLabel();
        separarUsuarios = new javax.swing.JSeparator();
        iconNewDestino = new javax.swing.JLabel();
        btnNuevoDestino = new javax.swing.JLabel();
        iconNewRuta = new javax.swing.JLabel();
        btnNuevaRuta = new javax.swing.JLabel();
        iconDisabledRuta = new javax.swing.JLabel();
        btnDesactivarRuta = new javax.swing.JLabel();
        separarRutas = new javax.swing.JSeparator();
        iconNewPuntoControl = new javax.swing.JLabel();
        btnAddPuntoControl = new javax.swing.JLabel();
        iconModiPuntoControl = new javax.swing.JLabel();
        btnModificarPuntoControl = new javax.swing.JLabel();
        iconQuitPuntoControl = new javax.swing.JLabel();
        btnQuitPuntoControl = new javax.swing.JLabel();
        separarPuntosControl = new javax.swing.JSeparator();
        iconTarifaOperacion = new javax.swing.JLabel();
        btnTarifaOperacion = new javax.swing.JLabel();
        iconTarifaLibra = new javax.swing.JLabel();
        btnTarifaLibra = new javax.swing.JLabel();
        iconTarifaDestino = new javax.swing.JLabel();
        btnTarifaDestino = new javax.swing.JLabel();
        iconTarifaPrioridad = new javax.swing.JLabel();
        btnTarifaPrioridad = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnCerrarSesion = new javax.swing.JButton();
        JpContenedor = new javax.swing.JPanel();
        JpTitulo = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JpInfo = new javax.swing.JPanel();

        jLabel6.setText("fin");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContenedorPrincipal.setLayout(new java.awt.BorderLayout());

        JpMenu.setBackground(new java.awt.Color(102, 102, 102));
        JpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        JpMenu.setPreferredSize(new java.awt.Dimension(200, 712));
        JpMenu.setLayout(null);

        iconUserInSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userinSe.png"))); // NOI18N
        JpMenu.add(iconUserInSesion);
        iconUserInSesion.setBounds(30, 20, 40, 40);

        UserInSesion.setForeground(new java.awt.Color(255, 255, 255));
        UserInSesion.setText("Nombre Usuario");
        JpMenu.add(UserInSesion);
        UserInSesion.setBounds(70, 20, 110, 40);

        separarUserInSesion.setBackground(new java.awt.Color(0, 0, 0));
        separarUserInSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JpMenu.add(separarUserInSesion);
        separarUserInSesion.setBounds(0, 0, 200, 80);

        iconCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crearUser.png"))); // NOI18N
        JpMenu.add(iconCreateUser);
        iconCreateUser.setBounds(10, 100, 40, 40);

        iconEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editUser.png"))); // NOI18N
        JpMenu.add(iconEditUser);
        iconEditUser.setBounds(10, 150, 40, 40);

        iconDIsabledUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desusuario.png"))); // NOI18N
        JpMenu.add(iconDIsabledUser);
        iconDIsabledUser.setBounds(10, 200, 40, 40);

        btnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearUsuarioMouseExited(evt);
            }
        });
        JpMenu.add(btnCrearUsuario);
        btnCrearUsuario.setBounds(50, 100, 140, 40);

        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarUsuarioMouseExited(evt);
            }
        });
        JpMenu.add(btnEditarUsuario);
        btnEditarUsuario.setBounds(50, 150, 140, 40);

        btnDesUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnDesUsuario.setText("Desactivar Usuario");
        btnDesUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDesUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDesUsuarioMouseExited(evt);
            }
        });
        JpMenu.add(btnDesUsuario);
        btnDesUsuario.setBounds(50, 200, 140, 40);

        separarUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        JpMenu.add(separarUsuarios);
        separarUsuarios.setBounds(0, 260, 200, 20);

        iconNewDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevoDestino.png"))); // NOI18N
        JpMenu.add(iconNewDestino);
        iconNewDestino.setBounds(10, 280, 40, 40);

        btnNuevoDestino.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoDestino.setText("Nuevo Destino");
        btnNuevoDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoDestinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoDestinoMouseExited(evt);
            }
        });
        JpMenu.add(btnNuevoDestino);
        btnNuevoDestino.setBounds(50, 280, 140, 40);

        iconNewRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevaRuta.png"))); // NOI18N
        JpMenu.add(iconNewRuta);
        iconNewRuta.setBounds(10, 330, 40, 40);

        btnNuevaRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaRuta.setText("Nueva Ruta");
        btnNuevaRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaRutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaRutaMouseExited(evt);
            }
        });
        JpMenu.add(btnNuevaRuta);
        btnNuevaRuta.setBounds(50, 330, 140, 40);

        iconDisabledRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desRuta.png"))); // NOI18N
        JpMenu.add(iconDisabledRuta);
        iconDisabledRuta.setBounds(10, 380, 40, 40);

        btnDesactivarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnDesactivarRuta.setText("Desactivar Rutas");
        btnDesactivarRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDesactivarRutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDesactivarRutaMouseExited(evt);
            }
        });
        JpMenu.add(btnDesactivarRuta);
        btnDesactivarRuta.setBounds(50, 380, 140, 40);

        separarRutas.setBackground(new java.awt.Color(0, 0, 0));
        JpMenu.add(separarRutas);
        separarRutas.setBounds(0, 430, 200, 20);

        iconNewPuntoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addPuntoControl.png"))); // NOI18N
        JpMenu.add(iconNewPuntoControl);
        iconNewPuntoControl.setBounds(10, 450, 40, 40);

        btnAddPuntoControl.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnAddPuntoControl.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPuntoControl.setText("Agregar Puntos de Control");
        btnAddPuntoControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPuntoControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPuntoControlMouseExited(evt);
            }
        });
        JpMenu.add(btnAddPuntoControl);
        btnAddPuntoControl.setBounds(50, 450, 140, 40);

        iconModiPuntoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modiPuntoControl.png"))); // NOI18N
        JpMenu.add(iconModiPuntoControl);
        iconModiPuntoControl.setBounds(10, 500, 40, 40);

        btnModificarPuntoControl.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnModificarPuntoControl.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPuntoControl.setText("Modificar Puntos de control");
        btnModificarPuntoControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarPuntoControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarPuntoControlMouseExited(evt);
            }
        });
        JpMenu.add(btnModificarPuntoControl);
        btnModificarPuntoControl.setBounds(50, 500, 140, 40);

        iconQuitPuntoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitPuntoControl.png"))); // NOI18N
        JpMenu.add(iconQuitPuntoControl);
        iconQuitPuntoControl.setBounds(10, 550, 40, 40);

        btnQuitPuntoControl.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnQuitPuntoControl.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitPuntoControl.setText("Quitar Puntos de Control");
        btnQuitPuntoControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitPuntoControlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitPuntoControlMouseExited(evt);
            }
        });
        JpMenu.add(btnQuitPuntoControl);
        btnQuitPuntoControl.setBounds(50, 550, 140, 40);

        separarPuntosControl.setBackground(new java.awt.Color(0, 0, 0));
        JpMenu.add(separarPuntosControl);
        separarPuntosControl.setBounds(0, 600, 200, 20);

        iconTarifaOperacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarifaOperacion.png"))); // NOI18N
        JpMenu.add(iconTarifaOperacion);
        iconTarifaOperacion.setBounds(10, 620, 40, 40);

        btnTarifaOperacion.setForeground(new java.awt.Color(255, 255, 255));
        btnTarifaOperacion.setText("Tarifa de Operacion");
        btnTarifaOperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTarifaOperacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTarifaOperacionMouseExited(evt);
            }
        });
        JpMenu.add(btnTarifaOperacion);
        btnTarifaOperacion.setBounds(50, 620, 130, 40);

        iconTarifaLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarifaLibra.png"))); // NOI18N
        JpMenu.add(iconTarifaLibra);
        iconTarifaLibra.setBounds(10, 670, 40, 40);

        btnTarifaLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnTarifaLibra.setText("Tarifa por Libra");
        btnTarifaLibra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTarifaLibraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTarifaLibraMouseExited(evt);
            }
        });
        JpMenu.add(btnTarifaLibra);
        btnTarifaLibra.setBounds(50, 670, 130, 40);

        iconTarifaDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarifaDestino.png"))); // NOI18N
        JpMenu.add(iconTarifaDestino);
        iconTarifaDestino.setBounds(10, 720, 40, 40);

        btnTarifaDestino.setForeground(new java.awt.Color(255, 255, 255));
        btnTarifaDestino.setText("Tarifa de Destino");
        btnTarifaDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTarifaDestinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTarifaDestinoMouseExited(evt);
            }
        });
        JpMenu.add(btnTarifaDestino);
        btnTarifaDestino.setBounds(50, 720, 130, 40);

        iconTarifaPrioridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarifaPrioridad.png"))); // NOI18N
        JpMenu.add(iconTarifaPrioridad);
        iconTarifaPrioridad.setBounds(10, 770, 40, 40);

        btnTarifaPrioridad.setForeground(new java.awt.Color(255, 255, 255));
        btnTarifaPrioridad.setText("Tarifa de Prioridad");
        btnTarifaPrioridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTarifaPrioridadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTarifaPrioridadMouseExited(evt);
            }
        });
        JpMenu.add(btnTarifaPrioridad);
        btnTarifaPrioridad.setBounds(50, 770, 130, 40);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        JpMenu.add(jSeparator7);
        jSeparator7.setBounds(0, 810, 200, 20);

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        JpMenu.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(30, 890, 130, 60);

        ContenedorPrincipal.add(JpMenu, java.awt.BorderLayout.LINE_START);

        JpContenedor.setLayout(new java.awt.BorderLayout());

        JpTitulo.setBackground(new java.awt.Color(255, 255, 255));
        JpTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        JpTitulo.setPreferredSize(new java.awt.Dimension(750, 80));
        JpTitulo.setLayout(null);

        tituloPrincipal.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        tituloPrincipal.setText("Pantalla Principal");
        JpTitulo.add(tituloPrincipal);
        tituloPrincipal.setBounds(770, 10, 260, 50);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JpTitulo.add(jSeparator1);
        jSeparator1.setBounds(-10, 0, 1780, 80);

        JpContenedor.add(JpTitulo, java.awt.BorderLayout.PAGE_START);

        JpInfo.setBackground(new java.awt.Color(255, 255, 255));
        JpInfo.setLayout(new java.awt.BorderLayout());
        JpContenedor.add(JpInfo, java.awt.BorderLayout.CENTER);

        ContenedorPrincipal.add(JpContenedor, java.awt.BorderLayout.CENTER);

        getContentPane().add(ContenedorPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesUsuarioMouseEntered
        btnDesUsuario.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnDesUsuarioMouseEntered

    private void btnDesUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesUsuarioMouseExited
        btnDesUsuario.setForeground(Color.white);
    }//GEN-LAST:event_btnDesUsuarioMouseExited

    private void btnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseEntered
        btnCrearUsuario.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnCrearUsuarioMouseEntered

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
        btnCrearUsuario.setForeground(Color.white);
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void btnEditarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarUsuarioMouseEntered
        btnEditarUsuario.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnEditarUsuarioMouseEntered

    private void btnEditarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarUsuarioMouseExited
        btnEditarUsuario.setForeground(Color.white);
    }//GEN-LAST:event_btnEditarUsuarioMouseExited

    private void btnNuevoDestinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoDestinoMouseEntered
        btnNuevoDestino.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnNuevoDestinoMouseEntered

    private void btnNuevoDestinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoDestinoMouseExited
        btnNuevoDestino.setForeground(Color.white);
    }//GEN-LAST:event_btnNuevoDestinoMouseExited

    private void btnNuevaRutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaRutaMouseEntered
        btnNuevaRuta.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnNuevaRutaMouseEntered

    private void btnNuevaRutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaRutaMouseExited
        btnNuevaRuta.setForeground(Color.white);
    }//GEN-LAST:event_btnNuevaRutaMouseExited

    private void btnDesactivarRutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivarRutaMouseEntered
        btnDesactivarRuta.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnDesactivarRutaMouseEntered

    private void btnDesactivarRutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivarRutaMouseExited
        btnDesactivarRuta.setForeground(Color.white);
    }//GEN-LAST:event_btnDesactivarRutaMouseExited

    private void btnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseClicked
        tituloPrincipal.setText("Creando Usuario...");
        JpInfo.removeAll();
        JpInfo.add(crear, BorderLayout.CENTER);
        JpInfo.revalidate();
        JpInfo.repaint();

    }//GEN-LAST:event_btnCrearUsuarioMouseClicked

    private void btnAddPuntoControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPuntoControlMouseEntered
        btnAddPuntoControl.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnAddPuntoControlMouseEntered

    private void btnAddPuntoControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPuntoControlMouseExited
        btnAddPuntoControl.setForeground(Color.white);
    }//GEN-LAST:event_btnAddPuntoControlMouseExited

    private void btnQuitPuntoControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitPuntoControlMouseEntered
        btnQuitPuntoControl.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnQuitPuntoControlMouseEntered

    private void btnQuitPuntoControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitPuntoControlMouseExited
        btnQuitPuntoControl.setForeground(Color.white);
    }//GEN-LAST:event_btnQuitPuntoControlMouseExited

    private void btnTarifaDestinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaDestinoMouseEntered
        btnTarifaDestino.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnTarifaDestinoMouseEntered

    private void btnTarifaDestinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaDestinoMouseExited
        btnTarifaDestino.setForeground(Color.white);
    }//GEN-LAST:event_btnTarifaDestinoMouseExited

    private void btnTarifaLibraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaLibraMouseEntered
        btnTarifaLibra.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnTarifaLibraMouseEntered

    private void btnTarifaLibraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaLibraMouseExited
        btnTarifaLibra.setForeground(Color.white);
    }//GEN-LAST:event_btnTarifaLibraMouseExited

    private void btnTarifaOperacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaOperacionMouseEntered
        btnTarifaOperacion.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnTarifaOperacionMouseEntered

    private void btnTarifaOperacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaOperacionMouseExited
        btnTarifaOperacion.setForeground(Color.white);
    }//GEN-LAST:event_btnTarifaOperacionMouseExited

    private void btnModificarPuntoControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPuntoControlMouseEntered
        btnModificarPuntoControl.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnModificarPuntoControlMouseEntered

    private void btnModificarPuntoControlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarPuntoControlMouseExited
        btnModificarPuntoControl.setForeground(Color.white);
    }//GEN-LAST:event_btnModificarPuntoControlMouseExited

    private void btnEditarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarUsuarioMouseClicked
        tituloPrincipal.setText("Editando Usuario...");
        JpInfo.removeAll();
        JpInfo.add(edit, BorderLayout.CENTER);
        JpInfo.revalidate();
        JpInfo.repaint();

    }//GEN-LAST:event_btnEditarUsuarioMouseClicked

    private void btnTarifaPrioridadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaPrioridadMouseEntered
        btnTarifaPrioridad.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnTarifaPrioridadMouseEntered

    private void btnTarifaPrioridadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaPrioridadMouseExited
        btnTarifaPrioridad.setForeground(Color.white);
    }//GEN-LAST:event_btnTarifaPrioridadMouseExited

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnDesUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesUsuarioMouseClicked
        tituloPrincipal.setText("Desactivando Usuario...");
        JpInfo.removeAll();
        JpInfo.add(edit, BorderLayout.CENTER);
        JpInfo.revalidate();
        JpInfo.repaint();
    }//GEN-LAST:event_btnDesUsuarioMouseClicked

    public void setText(String string) {
        UserInSesion.setText(string);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorPrincipal;
    private javax.swing.JPanel JpContenedor;
    private javax.swing.JPanel JpInfo;
    private javax.swing.JPanel JpMenu;
    private javax.swing.JPanel JpTitulo;
    private javax.swing.JLabel UserInSesion;
    private javax.swing.JLabel btnAddPuntoControl;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel btnCrearUsuario;
    private javax.swing.JLabel btnDesUsuario;
    private javax.swing.JLabel btnDesactivarRuta;
    private javax.swing.JLabel btnEditarUsuario;
    private javax.swing.JLabel btnModificarPuntoControl;
    private javax.swing.JLabel btnNuevaRuta;
    private javax.swing.JLabel btnNuevoDestino;
    private javax.swing.JLabel btnQuitPuntoControl;
    private javax.swing.JLabel btnTarifaDestino;
    private javax.swing.JLabel btnTarifaLibra;
    private javax.swing.JLabel btnTarifaOperacion;
    private javax.swing.JLabel btnTarifaPrioridad;
    private javax.swing.JLabel iconCreateUser;
    private javax.swing.JLabel iconDIsabledUser;
    private javax.swing.JLabel iconDisabledRuta;
    private javax.swing.JLabel iconEditUser;
    private javax.swing.JLabel iconModiPuntoControl;
    private javax.swing.JLabel iconNewDestino;
    private javax.swing.JLabel iconNewPuntoControl;
    private javax.swing.JLabel iconNewRuta;
    private javax.swing.JLabel iconQuitPuntoControl;
    private javax.swing.JLabel iconTarifaDestino;
    private javax.swing.JLabel iconTarifaLibra;
    private javax.swing.JLabel iconTarifaOperacion;
    private javax.swing.JLabel iconTarifaPrioridad;
    private javax.swing.JLabel iconUserInSesion;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator separarPuntosControl;
    private javax.swing.JSeparator separarRutas;
    private javax.swing.JSeparator separarUserInSesion;
    private javax.swing.JSeparator separarUsuarios;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
