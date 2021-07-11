/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix.Vistas;

import com.grupo2.RedFlix.Modelos.Entidades.Usuario;
import com.grupo2.RedFlix.Modelos.Repositorios.UsuarioRepositorio;
import com.grupo2.RedFlix.Utilidades.SpringContext;
import java.util.Optional;
import javax.swing.JOptionPane;
/**
 *
 * @author felip
 */
public class VentanaUsuario extends javax.swing.JFrame {

    private String titulo;
    private UsuarioRepositorio usuarioRepositorio;
    private Usuario usuario;
    
    public VentanaUsuario(String titulo, boolean ventanaAgregar) {
        initComponents();
        usuarioRepositorio = SpringContext.getBean(UsuarioRepositorio.class);
        this.titulo = titulo;
        actualizarVentana(ventanaAgregar);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAliasUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreUsuario = new javax.swing.JTextField();
        campoApellidoUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoEmailUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoCelularUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoNacimientoUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonActualizarUsuario = new javax.swing.JButton();
        botonEliminarUsuario = new javax.swing.JButton();
        Contraseña = new javax.swing.JLabel();
        campoContrasenia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD Usuario");
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelAliasUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAliasUsuario.setText("Alias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        campoNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Formato: DD-MM-AAAA");

        botonActualizarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonActualizarUsuario.setText("Actualizar");
        botonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarUsuarioActionPerformed(evt);
            }
        });

        botonEliminarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEliminarUsuario.setText("Eliminar");
        botonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarUsuarioActionPerformed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Contraseña.setText("Contraseña:");

        campoContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(labelAliasUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Contraseña)
                    .addComponent(jLabel6)
                    .addComponent(campoCelularUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(campoNacimientoUsuario)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(campoEmailUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botonActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoContrasenia))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAliasUsuario)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(campoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(campoCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(campoNacimientoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarUsuario)
                    .addComponent(botonEliminarUsuario))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarUsuarioActionPerformed
        // TODO add your handling code here:
        usuario.setUsrNombre(campoNombreUsuario.getText());
        usuario.setUsrApellido(campoApellidoUsuario.getText());
        usuario.setUsrEmail(campoEmailUsuario.getText());
        usuario.setUsrCelular(campoCelularUsuario.getText());
        usuario.setUsrContrasenia(campoContrasenia.getText());
        usuario.setUsrFechaNacimiento(campoNacimientoUsuario.getText());
        usuarioRepositorio.save(usuario);
        if (botonActualizarUsuario.getText().equals("Crear")){
            JOptionPane.showMessageDialog(null,"Se creó correctamente el usuario");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Se actualizó correctamente el usuario");
            this.dispose();
        }
    }//GEN-LAST:event_botonActualizarUsuarioActionPerformed

    private void botonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        usuarioRepositorio.deleteById(titulo);
        JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
        this.dispose();
    }//GEN-LAST:event_botonEliminarUsuarioActionPerformed

    private void campoNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreUsuarioActionPerformed

    private void campoContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraseniaActionPerformed
     
    private void actualizarVentana(boolean ventanaAgregar)
    {
        usuario = new Usuario();
        labelAliasUsuario.setText(titulo);
        if (ventanaAgregar){
            usuario.setUsrAlias(titulo);
            botonActualizarUsuario.setText("Crear");
            botonEliminarUsuario.setVisible(false);
        }else{
            usuario = (Usuario) usuarioRepositorio.findById(titulo).get();
            campoNombreUsuario.setText(usuario.getUsrNombre());
            campoApellidoUsuario.setText(usuario.getUsrApellido());
            campoEmailUsuario.setText(usuario.getUsrEmail());
            campoCelularUsuario.setText(usuario.getUsrCelular());
            campoContrasenia.setText(usuario.getUsrContrasenia());
            campoNacimientoUsuario.setText(usuario.getUsrFechaNacimiento());
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton botonActualizarUsuario;
    private javax.swing.JButton botonEliminarUsuario;
    private javax.swing.JTextField campoApellidoUsuario;
    private javax.swing.JTextField campoCelularUsuario;
    private javax.swing.JTextField campoContrasenia;
    private javax.swing.JTextField campoEmailUsuario;
    private javax.swing.JTextField campoNacimientoUsuario;
    private javax.swing.JTextField campoNombreUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAliasUsuario;
    // End of variables declaration//GEN-END:variables
}
