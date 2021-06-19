package ventanas;

import java.awt.Color;

public class insertosprincipal extends javax.swing.JFrame {

    public static insertosprincipal obj = null;

    public insertosprincipal() {
        initComponents();
        setTitle("Menu insertos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static insertosprincipal getObj() {
        if (obj == null) {
            obj = new insertosprincipal();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_torneado = new javax.swing.JButton();
        boton_fresado = new javax.swing.JButton();
        boton_roscado = new javax.swing.JButton();
        boton_tronzado = new javax.swing.JButton();
        boton_taladrado = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_torneado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/torneado.png"))); // NOI18N
        boton_torneado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_torneadoActionPerformed(evt);
            }
        });

        boton_fresado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresado.png"))); // NOI18N
        boton_fresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fresadoActionPerformed(evt);
            }
        });

        boton_roscado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roscado.png"))); // NOI18N
        boton_roscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_roscadoActionPerformed(evt);
            }
        });

        boton_tronzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tronzado.png"))); // NOI18N
        boton_tronzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tronzadoActionPerformed(evt);
            }
        });

        boton_taladrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insertos_taladrado.png"))); // NOI18N
        boton_taladrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_taladradoActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jMenu1.add(Atras);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(boton_torneado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_fresado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_taladrado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_roscado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_tronzado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_tronzado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_roscado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_torneado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_fresado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_taladrado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_torneadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_torneadoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insertostorneado.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_torneadoActionPerformed

    private void boton_fresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fresadoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertosFresado.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_fresadoActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_tronzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tronzadoActionPerformed
        Insertostronzado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_tronzadoActionPerformed

    private void boton_roscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_roscadoActionPerformed
        InsertosRoscado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_roscadoActionPerformed

    private void boton_taladradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_taladradoActionPerformed
        InsertosTaladradoMenu.getObj().setVisible(true);
    }//GEN-LAST:event_boton_taladradoActionPerformed

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
            java.util.logging.Logger.getLogger(insertosprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertosprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertosprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertosprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertosprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_fresado;
    private javax.swing.JButton boton_roscado;
    private javax.swing.JButton boton_taladrado;
    private javax.swing.JButton boton_torneado;
    private javax.swing.JButton boton_tronzado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
