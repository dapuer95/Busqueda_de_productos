package ventanas;

import java.awt.Color;

public class menu_alesador extends javax.swing.JFrame {

    public static menu_alesador obj = null;

    public menu_alesador() {
        initComponents();
        setTitle("Menu alesado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static menu_alesador getObj() {
        if (obj == null) {
            obj = new menu_alesador();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_alesador = new javax.swing.JButton();
        boton_mango = new javax.swing.JButton();
        boton_barra_alesador = new javax.swing.JButton();
        boton_inserto_alesador = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_alesador.setBackground(new java.awt.Color(102, 102, 255));
        boton_alesador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alesador_circulo.png"))); // NOI18N
        boton_alesador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton_alesador.setBorderPainted(false);
        boton_alesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_alesadorActionPerformed(evt);
            }
        });

        boton_mango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mango_alesador_circulo.png"))); // NOI18N
        boton_mango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mangoActionPerformed(evt);
            }
        });

        boton_barra_alesador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bara_alesador_circulo.png"))); // NOI18N
        boton_barra_alesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_barra_alesadorActionPerformed(evt);
            }
        });

        boton_inserto_alesador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inserto_alesado_circulo.png"))); // NOI18N
        boton_inserto_alesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inserto_alesadorActionPerformed(evt);
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
                .addComponent(boton_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_mango, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_barra_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_inserto_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_inserto_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_mango, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_barra_alesador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_alesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_alesadorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alesador.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_alesadorActionPerformed

    private void boton_mangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mangoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MangoAlesador.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_mangoActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_barra_alesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_barra_alesadorActionPerformed
        BarraAlesador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_barra_alesadorActionPerformed

    private void boton_inserto_alesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inserto_alesadorActionPerformed
        InsertoAlesado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_inserto_alesadorActionPerformed

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
            java.util.logging.Logger.getLogger(menu_alesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_alesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_alesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_alesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_alesador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_alesador;
    private javax.swing.JButton boton_barra_alesador;
    private javax.swing.JButton boton_inserto_alesador;
    private javax.swing.JButton boton_mango;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
