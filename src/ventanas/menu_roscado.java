package ventanas;

import java.awt.Color;

public class menu_roscado extends javax.swing.JFrame {

    public static menu_roscado obj = null;

    public menu_roscado() {
        initComponents();
        setTitle("Menu herramientas de roscado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static menu_roscado getObj() {
        if (obj == null) {
            obj = new menu_roscado();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_machuelos = new javax.swing.JButton();
        boton_dado = new javax.swing.JButton();
        boton_volvedor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_machuelos.setBackground(new java.awt.Color(102, 102, 255));
        boton_machuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/machuelos_menu.png"))); // NOI18N
        boton_machuelos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton_machuelos.setBorderPainted(false);
        boton_machuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_machuelosActionPerformed(evt);
            }
        });

        boton_dado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dados_menu.png"))); // NOI18N
        boton_dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_dadoActionPerformed(evt);
            }
        });

        boton_volvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volvedor_menu.png"))); // NOI18N
        boton_volvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volvedorActionPerformed(evt);
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
                .addComponent(boton_machuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_dado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_volvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_machuelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_dado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_volvedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_machuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_machuelosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Machuelos.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_machuelosActionPerformed

    private void boton_dadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dadoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dados.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_dadoActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_volvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volvedorActionPerformed
        Volvedor.getObj().setVisible(true);
    }//GEN-LAST:event_boton_volvedorActionPerformed

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
            java.util.logging.Logger.getLogger(menu_roscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_roscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_roscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_roscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_roscado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_dado;
    private javax.swing.JButton boton_machuelos;
    private javax.swing.JButton boton_volvedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
