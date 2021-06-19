package ventanas;

import java.awt.Color;

public class menu_sujecion extends javax.swing.JFrame {

    public static menu_sujecion obj = null;

    public menu_sujecion() {
        initComponents();
        setTitle("Menu sujeción");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static menu_sujecion getObj() {
        if (obj == null) {
            obj = new menu_sujecion();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_arbol = new javax.swing.JButton();
        boton_boquilla = new javax.swing.JButton();
        boton_porta_broca = new javax.swing.JButton();
        boton_boquilla_afiladora = new javax.swing.JButton();
        boton_accesorios = new javax.swing.JButton();
        boton_madril_cnc = new javax.swing.JButton();
        boton_retenedor_arbol = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_arbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arbol_menu.png"))); // NOI18N
        boton_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_arbolActionPerformed(evt);
            }
        });

        boton_boquilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillas_menu.png"))); // NOI18N
        boton_boquilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_boquillaActionPerformed(evt);
            }
        });

        boton_porta_broca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_broca.png"))); // NOI18N
        boton_porta_broca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_porta_brocaActionPerformed(evt);
            }
        });

        boton_boquilla_afiladora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillas_afiladora_menu.png"))); // NOI18N
        boton_boquilla_afiladora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_boquilla_afiladoraActionPerformed(evt);
            }
        });

        boton_accesorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accesorios_porta_boquilla_menu.png"))); // NOI18N
        boton_accesorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accesoriosActionPerformed(evt);
            }
        });

        boton_madril_cnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mandril_broca_cnc.png"))); // NOI18N
        boton_madril_cnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_madril_cncActionPerformed(evt);
            }
        });

        boton_retenedor_arbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retenedor_arbol.png"))); // NOI18N
        boton_retenedor_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_retenedor_arbolActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_porta_broca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_boquilla, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_boquilla_afiladora, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_accesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_madril_cnc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_retenedor_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_arbol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_boquilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_accesorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_boquilla_afiladora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_porta_broca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_madril_cnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_retenedor_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_arbolActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu_arbol.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_arbolActionPerformed

    private void boton_boquillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_boquillaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                boquilla_fresadora.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_boquillaActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_boquilla_afiladoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_boquilla_afiladoraActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Boquilla_afiladora.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_boquilla_afiladoraActionPerformed

    private void boton_porta_brocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_porta_brocaActionPerformed
        PortaBroca.getObj().setVisible(true);
    }//GEN-LAST:event_boton_porta_brocaActionPerformed

    private void boton_accesoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accesoriosActionPerformed
        Accesorio_boquilla.getObj().setVisible(true);
    }//GEN-LAST:event_boton_accesoriosActionPerformed

    private void boton_madril_cncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_madril_cncActionPerformed
        Arbol_mandril_cnc.getObj().setVisible(true);
    }//GEN-LAST:event_boton_madril_cncActionPerformed

    private void boton_retenedor_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_retenedor_arbolActionPerformed
        RetenedorArbol.getObj().setVisible(true);
    }//GEN-LAST:event_boton_retenedor_arbolActionPerformed

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
            java.util.logging.Logger.getLogger(menu_sujecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_sujecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_sujecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_sujecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_sujecion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_accesorios;
    private javax.swing.JButton boton_arbol;
    private javax.swing.JButton boton_boquilla;
    private javax.swing.JButton boton_boquilla_afiladora;
    private javax.swing.JButton boton_madril_cnc;
    private javax.swing.JButton boton_porta_broca;
    private javax.swing.JButton boton_retenedor_arbol;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
