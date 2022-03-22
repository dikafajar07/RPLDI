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
public class TampilkanPengguna extends javax.swing.JFrame {

    public TampilkanPengguna() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public JButton getButtonBack() {
        return buttonBack;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TPengguna = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        DataPenggunaLabel = new javax.swing.JLabel();
        bckgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                                             Data Pengguna");
        setLocation(new java.awt.Point(400, 200));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TPengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TPengguna);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 190));

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/33.png"))); // NOI18N
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 30));

        DataPenggunaLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DataPenggunaLabel.setText("Data Pengguna ");
        getContentPane().add(DataPenggunaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 140, 40));

        bckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background sign up.jpeg"))); // NOI18N
        bckgrnd.setMaximumSize(new java.awt.Dimension(700, 406));
        bckgrnd.setPreferredSize(new java.awt.Dimension(700, 406));
        getContentPane().add(bckgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -210, 1190, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TampilkanPengguna().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataPenggunaLabel;
    private javax.swing.JTable TPengguna;
    private javax.swing.JLabel bckgrnd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
