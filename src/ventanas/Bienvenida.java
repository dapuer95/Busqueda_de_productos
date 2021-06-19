package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();
        setSize(950, 400);
        setTitle("Bienvenido");
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        ImageIcon imagen1 = new ImageIcon("src/images/herratec.png");
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(label_herratec.getWidth(), label_herratec.getHeight(), Image.SCALE_DEFAULT));
        label_herratec.setIcon(icono1);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_continuar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        label_herratec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_continuar.setText("Continuar");
        boton_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 30));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al asistente de ingeniería");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        getContentPane().add(label_herratec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_comunicacion() {
        Runtime app = Runtime.getRuntime();
        try {
            app.exec("C:/xampp/xampp-control.exe");
        } catch (Exception e) {
            System.out.println("no funciona");
        }
    }

    private void boton_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_continuarActionPerformed
        // TODO add your handling code here:
        abrir_comunicacion();

        new Principal().setVisible(true);
        pdf.getObj().setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_continuarActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_herratec;
    // End of variables declaration//GEN-END:variables
}
