package ventanas;

import java.awt.Color;

public class PortaTorneadoPrincipal extends javax.swing.JFrame {

    public static PortaTorneadoPrincipal obj = null;

    public PortaTorneadoPrincipal() {
        initComponents();
        setTitle("Portainsertos de torneado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static PortaTorneadoPrincipal getObj() {
        if (obj == null) {
            obj = new PortaTorneadoPrincipal();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_portaint = new javax.swing.JButton();
        boton_portaranurado = new javax.swing.JButton();
        boton_portaext = new javax.swing.JButton();
        boton_portaroscado = new javax.swing.JButton();
        boton_portataladrado = new javax.swing.JButton();
        boton_porta_lama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_portaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/torneado_interno_circulo.png"))); // NOI18N
        boton_portaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portaintActionPerformed(evt);
            }
        });

        boton_portaranurado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tronzado_porta_circulo.png"))); // NOI18N
        boton_portaranurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portaranuradoActionPerformed(evt);
            }
        });

        boton_portaext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/torneado_externo_circulo.png"))); // NOI18N
        boton_portaext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portaextActionPerformed(evt);
            }
        });

        boton_portaroscado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_roscado_circulo.png"))); // NOI18N
        boton_portaroscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portaroscadoActionPerformed(evt);
            }
        });

        boton_portataladrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_taladrado_circulo.png"))); // NOI18N
        boton_portataladrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portataladradoActionPerformed(evt);
            }
        });

        boton_porta_lama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_lama_portada.png"))); // NOI18N
        boton_porta_lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_porta_lamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(boton_portaext, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_portaint, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_portaroscado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_portaranurado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_porta_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_portataladrado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_portataladrado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_porta_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_portaint, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_portaext, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_portaranurado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_portaroscado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_portaroscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portaroscadoActionPerformed
        PortaRoscado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portaroscadoActionPerformed

    private void boton_portaextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portaextActionPerformed
        Portaexterno.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portaextActionPerformed

    private void boton_portaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portaintActionPerformed
        PortainternoT.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portaintActionPerformed

    private void boton_portaranuradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portaranuradoActionPerformed
        Portatronzado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portaranuradoActionPerformed

    private void boton_portataladradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portataladradoActionPerformed
        Porta_taladrado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portataladradoActionPerformed

    private void boton_porta_lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_porta_lamaActionPerformed
        PortaLama.getObj().setVisible(true);
    }//GEN-LAST:event_boton_porta_lamaActionPerformed

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
            java.util.logging.Logger.getLogger(PortaTorneadoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PortaTorneadoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PortaTorneadoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PortaTorneadoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PortaTorneadoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_porta_lama;
    private javax.swing.JButton boton_portaext;
    private javax.swing.JButton boton_portaint;
    private javax.swing.JButton boton_portaranurado;
    private javax.swing.JButton boton_portaroscado;
    private javax.swing.JButton boton_portataladrado;
    // End of variables declaration//GEN-END:variables
}
