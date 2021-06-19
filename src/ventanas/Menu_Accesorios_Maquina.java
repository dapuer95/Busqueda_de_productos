package ventanas;

import java.awt.Color;

public class Menu_Accesorios_Maquina extends javax.swing.JFrame {

    public static Menu_Accesorios_Maquina obj = null;

    public Menu_Accesorios_Maquina() {
        initComponents();
        setTitle("Menu accesorios para máquina");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);

    }

    public static Menu_Accesorios_Maquina getObj() {
        if (obj == null) {
            obj = new Menu_Accesorios_Maquina();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_copa = new javax.swing.JButton();
        boton_prensas = new javax.swing.JButton();
        boton_regla = new javax.swing.JButton();
        boton_visualizador = new javax.swing.JButton();
        boton_mordazas = new javax.swing.JButton();
        boton_mesas = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        boton_capsula = new javax.swing.JButton();
        boton_bridas = new javax.swing.JButton();
        boton_divisor = new javax.swing.JButton();
        boton_bridas1 = new javax.swing.JButton();
        boton_lampara = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_copa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa_principal.png"))); // NOI18N
        boton_copa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_copaActionPerformed(evt);
            }
        });

        boton_prensas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prensa_muenu.png"))); // NOI18N
        boton_prensas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_prensasActionPerformed(evt);
            }
        });

        boton_regla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/regla_menu.png"))); // NOI18N
        boton_regla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reglaActionPerformed(evt);
            }
        });

        boton_visualizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vusualizador_menu.png"))); // NOI18N
        boton_visualizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_visualizadorActionPerformed(evt);
            }
        });

        boton_mordazas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_copas.png"))); // NOI18N
        boton_mordazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mordazasActionPerformed(evt);
            }
        });

        boton_mesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesas_portada_circulo.png"))); // NOI18N
        boton_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mesasActionPerformed(evt);
            }
        });

        boton_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punto_giratorio menu.png"))); // NOI18N
        boton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntoActionPerformed(evt);
            }
        });

        boton_capsula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capsula_reductora_menu.png"))); // NOI18N
        boton_capsula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_capsulaActionPerformed(evt);
            }
        });

        boton_bridas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brida_menu.png"))); // NOI18N
        boton_bridas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bridasActionPerformed(evt);
            }
        });

        boton_divisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/divisor_menu.png"))); // NOI18N
        boton_divisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisorActionPerformed(evt);
            }
        });

        boton_bridas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base_magnetica_menu.png"))); // NOI18N
        boton_bridas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bridas1ActionPerformed(evt);
            }
        });

        boton_lampara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lampara_circulo.png"))); // NOI18N
        boton_lampara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_lamparaActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_copa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_prensas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_regla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_mordazas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_bridas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_bridas1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_capsula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(boton_lampara, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_copa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_prensas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_mordazas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_punto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_bridas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_bridas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_regla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_capsula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_lampara, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_copaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_copaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Copas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_copaActionPerformed

    private void boton_prensasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_prensasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Prensas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_prensasActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_reglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reglaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReglaDigital.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_reglaActionPerformed

    private void boton_visualizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_visualizadorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Visualizador.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_visualizadorActionPerformed

    private void boton_mordazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mordazasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mordazas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_mordazasActionPerformed

    private void boton_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mesasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mesas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_mesasActionPerformed

    private void boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntoActionPerformed
        PuntoGiratorio.getObj().setVisible(true);
    }//GEN-LAST:event_boton_puntoActionPerformed

    private void boton_capsulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_capsulaActionPerformed
        CapsulaReductora.getObj().setVisible(true);
    }//GEN-LAST:event_boton_capsulaActionPerformed

    private void boton_bridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bridasActionPerformed
        BridasFresadora.getObj().setVisible(true);
    }//GEN-LAST:event_boton_bridasActionPerformed

    private void boton_divisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisorActionPerformed
        Divisor.getObj().setVisible(true);
    }//GEN-LAST:event_boton_divisorActionPerformed

    private void boton_bridas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bridas1ActionPerformed
        BaseMagnetica.getObj().setVisible(true);
    }//GEN-LAST:event_boton_bridas1ActionPerformed

    private void boton_lamparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_lamparaActionPerformed
        Lampara.getObj().setVisible(true);
    }//GEN-LAST:event_boton_lamparaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Accesorios_Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Accesorios_Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Accesorios_Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Accesorios_Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Accesorios_Maquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_bridas;
    private javax.swing.JButton boton_bridas1;
    private javax.swing.JButton boton_capsula;
    private javax.swing.JButton boton_copa;
    private javax.swing.JButton boton_divisor;
    private javax.swing.JButton boton_lampara;
    private javax.swing.JButton boton_mesas;
    private javax.swing.JButton boton_mordazas;
    private javax.swing.JButton boton_prensas;
    private javax.swing.JButton boton_punto;
    private javax.swing.JButton boton_regla;
    private javax.swing.JButton boton_visualizador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
