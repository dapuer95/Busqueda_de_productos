package ventanas;

import java.awt.Color;

public class fresasprincipal extends javax.swing.JFrame {

    public static fresasprincipal obj = null;

    public fresasprincipal() {
        initComponents();
        setTitle("Menu fresas solidas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);

    }

    public static fresasprincipal getObj() {
        if (obj == null) {
            obj = new fresasprincipal();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_torneado = new javax.swing.JButton();
        boton_fresado = new javax.swing.JButton();
        boton_modulo = new javax.swing.JButton();
        boton_chavetero = new javax.swing.JButton();
        boton_circular = new javax.swing.JButton();
        boton_avellanador = new javax.swing.JButton();
        boton_fresa_radios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_torneado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/solid end mill.PNG"))); // NOI18N
        boton_torneado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_torneadoActionPerformed(evt);
            }
        });

        boton_fresado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lima rotativa.PNG"))); // NOI18N
        boton_fresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fresadoActionPerformed(evt);
            }
        });

        boton_modulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_engranaje.png"))); // NOI18N
        boton_modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_moduloActionPerformed(evt);
            }
        });

        boton_chavetero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_chavetero.png"))); // NOI18N
        boton_chavetero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_chaveteroActionPerformed(evt);
            }
        });

        boton_circular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_circular_portada.png"))); // NOI18N
        boton_circular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_circularActionPerformed(evt);
            }
        });

        boton_avellanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avellanador_portada.png"))); // NOI18N
        boton_avellanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_avellanadorActionPerformed(evt);
            }
        });

        boton_fresa_radios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_radios_portada.png"))); // NOI18N
        boton_fresa_radios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fresa_radiosActionPerformed(evt);
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
                    .addComponent(boton_torneado, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_fresado, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_chavetero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_circular, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_fresa_radios, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_avellanador, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_torneado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_fresado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_circular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_fresa_radios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_chavetero, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_avellanador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_torneadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_torneadoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fresasverticales2.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_torneadoActionPerformed

    private void boton_fresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fresadoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fresasrotativas.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_fresadoActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_chaveteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_chaveteroActionPerformed
        FresaChavetero.getObj().setVisible(true);
    }//GEN-LAST:event_boton_chaveteroActionPerformed

    private void boton_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_moduloActionPerformed
        FresaModulo.getObj().setVisible(true);
    }//GEN-LAST:event_boton_moduloActionPerformed

    private void boton_circularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_circularActionPerformed
        Fresa_Circular.getObj().setVisible(true);
    }//GEN-LAST:event_boton_circularActionPerformed

    private void boton_avellanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_avellanadorActionPerformed
        Avellanador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_avellanadorActionPerformed

    private void boton_fresa_radiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fresa_radiosActionPerformed
        FresaRadios.getObj().setVisible(true);
    }//GEN-LAST:event_boton_fresa_radiosActionPerformed

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
            java.util.logging.Logger.getLogger(fresasprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fresasprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fresasprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fresasprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fresasprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_avellanador;
    private javax.swing.JButton boton_chavetero;
    private javax.swing.JButton boton_circular;
    private javax.swing.JButton boton_fresa_radios;
    private javax.swing.JButton boton_fresado;
    private javax.swing.JButton boton_modulo;
    private javax.swing.JButton boton_torneado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
