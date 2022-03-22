/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author DIKA FAJAR RAMADAN
 */
public class lamanDaftar extends javax.swing.JFrame {

    public lamanDaftar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getLogin() {
        return Login;
    }

    public JButton getButtonBack() {
        return buttonBack;
    }

    public JTextField getPassword() {
        return Password;
    }

    public JTextField getEmail() {
        return email;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        NamaPengguna = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bckgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                                              Halaman Daftar");
        setLocation(new java.awt.Point(400, 200));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NAMA PENGGUNA  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 20));

        jLabel2.setText("EMAIL                        :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 20));

        jLabel5.setText("USERNAME              :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 210, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 210, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, -1));

        NamaPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPenggunaActionPerformed(evt);
            }
        });
        getContentPane().add(NamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, -1));

        jLabel4.setText("PASSWORD             :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        Login.setText("Daftar ");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/33.png"))); // NOI18N
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 30));

        jLabel3.setText("Buat akunmu dan jelajahi ilmu bersama kami");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Daftarkan Akun Anda! ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 40));

        bckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background sign up.jpeg"))); // NOI18N
        bckgrnd.setMaximumSize(new java.awt.Dimension(700, 406));
        bckgrnd.setPreferredSize(new java.awt.Dimension(700, 406));
        getContentPane().add(bckgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -210, 1190, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void NamaPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPenggunaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new lamanDaftar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField NamaPengguna;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel bckgrnd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
