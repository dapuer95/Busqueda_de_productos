package ventanas;

import java.awt.Color;

public class menu_moldes extends javax.swing.JFrame {

    public static menu_moldes obj = null;

    public menu_moldes() {
        initComponents();
        setTitle("Menu accesorios para moldes y troqueles");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static menu_moldes getObj() {
        if (obj == null) {
            obj = new menu_moldes();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_pines = new javax.swing.JButton();
        boton_resortes = new javax.swing.JButton();
        boton_columnas = new javax.swing.JButton();
        boton_interlocks = new javax.swing.JButton();
        boton_postes = new javax.swing.JButton();
        boton_valulas = new javax.swing.JButton();
        boton_tapones = new javax.swing.JButton();
        boton_fechador = new javax.swing.JButton();
        boton_retenedores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_pines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pines_menu.png"))); // NOI18N
        boton_pines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pinesActionPerformed(evt);
            }
        });

        boton_resortes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resortes_menu.png"))); // NOI18N
        boton_resortes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_resortesActionPerformed(evt);
            }
        });

        boton_columnas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/columna_menu.png"))); // NOI18N
        boton_columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_columnasActionPerformed(evt);
            }
        });

        boton_interlocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interlocks_menu.png"))); // NOI18N
        boton_interlocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_interlocksActionPerformed(evt);
            }
        });

        boton_postes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poste_menu.png"))); // NOI18N
        boton_postes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_postesActionPerformed(evt);
            }
        });

        boton_valulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bujes_menu.png"))); // NOI18N
        boton_valulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_valulasActionPerformed(evt);
            }
        });

        boton_tapones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapones_menu.png"))); // NOI18N
        boton_tapones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_taponesActionPerformed(evt);
            }
        });

        boton_fechador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fechadores_menu.png"))); // NOI18N
        boton_fechador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fechadorActionPerformed(evt);
            }
        });

        boton_retenedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retenedor_menu.png"))); // NOI18N
        boton_retenedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_retenedoresActionPerformed(evt);
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_pines, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_resortes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_interlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_postes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_valulas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_tapones, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_retenedores, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_fechador, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_tapones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_retenedores, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_pines, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_resortes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_postes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_interlocks, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_columnas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_valulas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_fechador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_pinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pinesActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pines.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_pinesActionPerformed

    private void boton_resortesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_resortesActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Resortes.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_resortesActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_interlocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_interlocksActionPerformed
        Interlocks.getObj().setVisible(true);
    }//GEN-LAST:event_boton_interlocksActionPerformed

    private void boton_columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_columnasActionPerformed
        Columnas.getObj().setVisible(true);
    }//GEN-LAST:event_boton_columnasActionPerformed

    private void boton_postesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_postesActionPerformed
        Postes.getObj().setVisible(true);
    }//GEN-LAST:event_boton_postesActionPerformed

    private void boton_valulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_valulasActionPerformed
        Bujes.getObj().setVisible(true);
    }//GEN-LAST:event_boton_valulasActionPerformed

    private void boton_taponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_taponesActionPerformed
        Tapones.getObj().setVisible(true);
    }//GEN-LAST:event_boton_taponesActionPerformed

    private void boton_fechadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fechadorActionPerformed
        Fechador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_fechadorActionPerformed

    private void boton_retenedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_retenedoresActionPerformed
        RetenedorMolde.getObj().setVisible(true);
    }//GEN-LAST:event_boton_retenedoresActionPerformed

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
            java.util.logging.Logger.getLogger(menu_moldes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_moldes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_moldes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_moldes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_moldes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_columnas;
    private javax.swing.JButton boton_fechador;
    private javax.swing.JButton boton_interlocks;
    private javax.swing.JButton boton_pines;
    private javax.swing.JButton boton_postes;
    private javax.swing.JButton boton_resortes;
    private javax.swing.JButton boton_retenedores;
    private javax.swing.JButton boton_tapones;
    private javax.swing.JButton boton_valulas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
