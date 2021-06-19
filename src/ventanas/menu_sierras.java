package ventanas;

import java.awt.Color;

public class menu_sierras extends javax.swing.JFrame {

    public static menu_sierras obj = null;

    public menu_sierras() {
        initComponents();
        setTitle("Menu alesado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static menu_sierras getObj() {
        if (obj == null) {
            obj = new menu_sierras();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_sierra_bimetal = new javax.swing.JButton();
        boton_sierra_circular = new javax.swing.JButton();
        boton_sierra_carbono = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Atras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_sierra_bimetal.setBackground(new java.awt.Color(102, 102, 255));
        boton_sierra_bimetal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sierra_circulo.png"))); // NOI18N
        boton_sierra_bimetal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton_sierra_bimetal.setBorderPainted(false);
        boton_sierra_bimetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sierra_bimetalActionPerformed(evt);
            }
        });

        boton_sierra_circular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sierra_circular_circulo.png"))); // NOI18N
        boton_sierra_circular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sierra_circularActionPerformed(evt);
            }
        });

        boton_sierra_carbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sierra_acero_circular.png"))); // NOI18N
        boton_sierra_carbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sierra_carbonoActionPerformed(evt);
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
                .addComponent(boton_sierra_bimetal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_sierra_circular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boton_sierra_carbono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_sierra_bimetal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_sierra_circular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_sierra_carbono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_sierra_bimetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sierra_bimetalActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sierras1.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_sierra_bimetalActionPerformed

    private void boton_sierra_circularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sierra_circularActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sierras.getObj().setVisible(true);
            }
        });
    }//GEN-LAST:event_boton_sierra_circularActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        new Principal_respaldo().setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void boton_sierra_carbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sierra_carbonoActionPerformed
        Sierras.getObj().setVisible(true);
    }//GEN-LAST:event_boton_sierra_carbonoActionPerformed

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
            java.util.logging.Logger.getLogger(menu_sierras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_sierras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_sierras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_sierras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_sierras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Atras;
    private javax.swing.JButton boton_sierra_bimetal;
    private javax.swing.JButton boton_sierra_carbono;
    private javax.swing.JButton boton_sierra_circular;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
