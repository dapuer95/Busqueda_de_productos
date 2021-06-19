package ventanas;

import java.awt.Color;

public class Menu_Abrasivos extends javax.swing.JFrame {

    public static Menu_Abrasivos obj = null;

    public Menu_Abrasivos() {
        initComponents();
        setTitle("Menu abrasivos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Menu_Abrasivos getObj() {
        if (obj == null) {
            obj = new Menu_Abrasivos();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_ruedas = new javax.swing.JButton();
        boton_puntas_abrasivas = new javax.swing.JButton();
        boton_piedras = new javax.swing.JButton();
        boton_felpa = new javax.swing.JButton();
        boton_inyector = new javax.swing.JButton();
        boton_punta_diamante = new javax.swing.JButton();
        boton_punta_motortool = new javax.swing.JButton();
        boton_inyector1 = new javax.swing.JButton();
        boton_brochas = new javax.swing.JButton();
        boton_caucho = new javax.swing.JButton();
        boton_discos = new javax.swing.JButton();
        boton_piedra_ruedas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_ruedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ruedas_menu.png"))); // NOI18N
        boton_ruedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ruedasActionPerformed(evt);
            }
        });

        boton_puntas_abrasivas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/puntas_abrasivas_motortool.png"))); // NOI18N
        boton_puntas_abrasivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntas_abrasivasActionPerformed(evt);
            }
        });

        boton_piedras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/piedras_menu.png"))); // NOI18N
        boton_piedras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_piedrasActionPerformed(evt);
            }
        });

        boton_felpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felpa_portada.png"))); // NOI18N
        boton_felpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_felpaActionPerformed(evt);
            }
        });

        boton_inyector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inyector_diamante_menu.png"))); // NOI18N
        boton_inyector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inyectorActionPerformed(evt);
            }
        });

        boton_punta_diamante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punta_diamante_portada.png"))); // NOI18N
        boton_punta_diamante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_punta_diamanteActionPerformed(evt);
            }
        });

        boton_punta_motortool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punta_motortool_menu.png"))); // NOI18N
        boton_punta_motortool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_punta_motortoolActionPerformed(evt);
            }
        });

        boton_inyector1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lima_diamante_menu.png"))); // NOI18N
        boton_inyector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inyector1ActionPerformed(evt);
            }
        });

        boton_brochas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brochas_menu.png"))); // NOI18N
        boton_brochas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_brochasActionPerformed(evt);
            }
        });

        boton_caucho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caucho_menu.png"))); // NOI18N
        boton_caucho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cauchoActionPerformed(evt);
            }
        });

        boton_discos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/discos_menu.png"))); // NOI18N
        boton_discos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_discosActionPerformed(evt);
            }
        });

        boton_piedra_ruedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/piedra_ruedas_menu.png"))); // NOI18N
        boton_piedra_ruedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_piedra_ruedasActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_discos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_piedra_ruedas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_ruedas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_piedras, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_puntas_abrasivas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_felpa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_inyector, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_punta_motortool, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_brochas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_punta_diamante, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_inyector1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_caucho, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_ruedas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_puntas_abrasivas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_inyector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_punta_motortool, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_brochas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_piedras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_punta_diamante, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_felpa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_inyector1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_caucho, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_discos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_piedra_ruedas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ruedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ruedasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //dispose();
                Ruedas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_ruedasActionPerformed

    private void boton_puntas_abrasivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntas_abrasivasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //dispose();
                Puntas_Abrasivas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_puntas_abrasivasActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_felpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_felpaActionPerformed
        new FelpaPulir().setVisible(true);
    }//GEN-LAST:event_boton_felpaActionPerformed

    private void boton_piedrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_piedrasActionPerformed
        PiedraPulir.getObj().setVisible(true);
    }//GEN-LAST:event_boton_piedrasActionPerformed

    private void boton_inyectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inyectorActionPerformed
        Inyector.getObj().setVisible(true);
    }//GEN-LAST:event_boton_inyectorActionPerformed

    private void boton_punta_diamanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_punta_diamanteActionPerformed
        Punta_diamante.getObj().setVisible(true);
    }//GEN-LAST:event_boton_punta_diamanteActionPerformed

    private void boton_punta_motortoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_punta_motortoolActionPerformed
        PuntaMotortool.getObj().setVisible(true);
    }//GEN-LAST:event_boton_punta_motortoolActionPerformed

    private void boton_inyector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inyector1ActionPerformed
        LimaDiamantada.getObj().setVisible(true);
    }//GEN-LAST:event_boton_inyector1ActionPerformed

    private void boton_brochasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_brochasActionPerformed
        Brochas.getObj().setVisible(true);
    }//GEN-LAST:event_boton_brochasActionPerformed

    private void boton_cauchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cauchoActionPerformed
        CauchoAbrasivo.getObj().setVisible(true);
    }//GEN-LAST:event_boton_cauchoActionPerformed

    private void boton_discosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_discosActionPerformed
        Discos.getObj().setVisible(true);
    }//GEN-LAST:event_boton_discosActionPerformed

    private void boton_piedra_ruedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_piedra_ruedasActionPerformed
        PiedraRueda.getObj().setVisible(true);
    }//GEN-LAST:event_boton_piedra_ruedasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Abrasivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Abrasivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Abrasivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Abrasivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Abrasivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_brochas;
    private javax.swing.JButton boton_caucho;
    private javax.swing.JButton boton_discos;
    private javax.swing.JButton boton_felpa;
    private javax.swing.JButton boton_inyector;
    private javax.swing.JButton boton_inyector1;
    private javax.swing.JButton boton_piedra_ruedas;
    private javax.swing.JButton boton_piedras;
    private javax.swing.JButton boton_punta_diamante;
    private javax.swing.JButton boton_punta_motortool;
    private javax.swing.JButton boton_puntas_abrasivas;
    private javax.swing.JButton boton_ruedas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
