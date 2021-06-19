package ventanas;

import java.awt.Color;

public class Menu_metrologia extends javax.swing.JFrame {

    public static Menu_metrologia obj = null;

    public Menu_metrologia() {
        initComponents();
        setTitle("Menu metrólogia");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Menu_metrologia getObj() {
        if (obj == null) {
            obj = new Menu_metrologia();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_calibrador = new javax.swing.JButton();
        boton_indicadores = new javax.swing.JButton();
        boton_micrometros = new javax.swing.JButton();
        boton_galgas = new javax.swing.JButton();
        boton_profundimetro = new javax.swing.JButton();
        boton_escuadra = new javax.swing.JButton();
        boton_durometro = new javax.swing.JButton();
        boton_accesorios_medicion = new javax.swing.JButton();
        boton_nivel = new javax.swing.JButton();
        boton_flexometro = new javax.swing.JButton();
        boton_punta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_calibrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cali_menu.png"))); // NOI18N
        boton_calibrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_calibradorActionPerformed(evt);
            }
        });

        boton_indicadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/indicador_menu.png"))); // NOI18N
        boton_indicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_indicadoresActionPerformed(evt);
            }
        });

        boton_micrometros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/micrometro_menu.png"))); // NOI18N
        boton_micrometros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_micrometrosActionPerformed(evt);
            }
        });

        boton_galgas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/galgas_menu.png"))); // NOI18N
        boton_galgas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_galgasActionPerformed(evt);
            }
        });

        boton_profundimetro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profundimetro_menu.png"))); // NOI18N
        boton_profundimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_profundimetroActionPerformed(evt);
            }
        });

        boton_escuadra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escuadra_menu.png"))); // NOI18N
        boton_escuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_escuadraActionPerformed(evt);
            }
        });

        boton_durometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/durometro_menu.png"))); // NOI18N
        boton_durometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_durometroActionPerformed(evt);
            }
        });

        boton_accesorios_medicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accesorios_medicion_menu.png"))); // NOI18N
        boton_accesorios_medicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accesorios_medicionActionPerformed(evt);
            }
        });

        boton_nivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nivel_menu.png"))); // NOI18N
        boton_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nivelActionPerformed(evt);
            }
        });

        boton_flexometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flexometro_menu.png"))); // NOI18N
        boton_flexometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_flexometroActionPerformed(evt);
            }
        });

        boton_punta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/puntaindicador_menu.png"))); // NOI18N
        boton_punta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntaActionPerformed(evt);
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
                    .addComponent(boton_punta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_calibrador, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_micrometros, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_indicadores, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_galgas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_escuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_accesorios_medicion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_flexometro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_profundimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_durometro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_calibrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_indicadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_profundimetro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_durometro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_nivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_micrometros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_escuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_galgas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_accesorios_medicion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_flexometro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(boton_punta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        boton_calibrador.getAccessibleContext().setAccessibleDescription("");
        boton_indicadores.getAccessibleContext().setAccessibleDescription("");
        boton_micrometros.getAccessibleContext().setAccessibleDescription("");
        boton_galgas.getAccessibleContext().setAccessibleDescription("");
        boton_profundimetro.getAccessibleContext().setAccessibleDescription("");
        boton_escuadra.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_calibradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_calibradorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calibradores.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_calibradorActionPerformed

    private void boton_indicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_indicadoresActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Indicadores.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_indicadoresActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_galgasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_galgasActionPerformed
        new Galgas().setVisible(true);
    }//GEN-LAST:event_boton_galgasActionPerformed

    private void boton_micrometrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_micrometrosActionPerformed
        Micrometros.getObj().setVisible(true);
    }//GEN-LAST:event_boton_micrometrosActionPerformed

    private void boton_profundimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_profundimetroActionPerformed
        Profundimetro.getObj().setVisible(true);
    }//GEN-LAST:event_boton_profundimetroActionPerformed

    private void boton_escuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_escuadraActionPerformed
        Escuadra.getObj().setVisible(true);
    }//GEN-LAST:event_boton_escuadraActionPerformed

    private void boton_durometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_durometroActionPerformed
        Durometro.getObj().setVisible(true);
    }//GEN-LAST:event_boton_durometroActionPerformed

    private void boton_accesorios_medicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accesorios_medicionActionPerformed
        AccesoriosMedicion.getObj().setVisible(true);
    }//GEN-LAST:event_boton_accesorios_medicionActionPerformed

    private void boton_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nivelActionPerformed
        Nivel.getObj().setVisible(true);
    }//GEN-LAST:event_boton_nivelActionPerformed

    private void boton_flexometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_flexometroActionPerformed
        Flexometro.getObj().setVisible(true);
    }//GEN-LAST:event_boton_flexometroActionPerformed

    private void boton_puntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntaActionPerformed
        PuntaIndicador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_puntaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_metrologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_metrologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_metrologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_metrologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_metrologia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_accesorios_medicion;
    private javax.swing.JButton boton_calibrador;
    private javax.swing.JButton boton_durometro;
    private javax.swing.JButton boton_escuadra;
    private javax.swing.JButton boton_flexometro;
    private javax.swing.JButton boton_galgas;
    private javax.swing.JButton boton_indicadores;
    private javax.swing.JButton boton_micrometros;
    private javax.swing.JButton boton_nivel;
    private javax.swing.JButton boton_profundimetro;
    private javax.swing.JButton boton_punta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
