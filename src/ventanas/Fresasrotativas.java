package ventanas;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;

public class Fresasrotativas extends javax.swing.JFrame {

    double valor;
    public static Fresasrotativas obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String descripcion = new String();
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Info", "Cotizar", "Total", "Me", "Ca", "Bo", "Ma"};
    DefaultTableModel model = new DefaultTableModel(data, cabeza) {

        //Metodo que permite que no se púeda editar los valores de la tabla
        @Override
        public Class getColumnClass(int indiceColumna) {
            Object k = getValueAt(0, indiceColumna);
            if (k == null) {
                return Object.class;
            } else {
                return k.getClass();
            }
        }

        //Metodo que permite que no se púeda editar los valores de la tabla
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 9) {
                return true;
            } else {
                return false;
            }
        }
    };

    public Fresasrotativas() {
        initComponents();
        setTitle("Insertos de torneado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Fresasrotativas getObj() {
        if (obj == null) {
            obj = new Fresasrotativas();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_diametro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        botonsg = new javax.swing.JButton();
        botonse = new javax.swing.JButton();
        botonsa = new javax.swing.JButton();
        botonsd = new javax.swing.JButton();
        botonsb = new javax.swing.JButton();
        botonsc = new javax.swing.JButton();
        botonsf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        botonsm = new javax.swing.JButton();
        botonforalu = new javax.swing.JButton();
        botonsl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione la geometría de la fresa rotativa");

        combo_diametro.setToolTipText("");
        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        jLabel2.setText("Diámetro de corte");

        botonsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SG.png"))); // NOI18N
        botonsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsgActionPerformed(evt);
            }
        });

        botonse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SE.png"))); // NOI18N
        botonse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonseActionPerformed(evt);
            }
        });

        botonsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SA.png"))); // NOI18N
        botonsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsaActionPerformed(evt);
            }
        });

        botonsd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SD.png"))); // NOI18N
        botonsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsdActionPerformed(evt);
            }
        });

        botonsb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SB.png"))); // NOI18N
        botonsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsbActionPerformed(evt);
            }
        });

        botonsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SC.png"))); // NOI18N
        botonsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonscActionPerformed(evt);
            }
        });

        botonsf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SF.png"))); // NOI18N
        botonsf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsfActionPerformed(evt);
            }
        });

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Info", "Cotizar", "Total", "Me", "Ca", "Bo", "Ma"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);
        if (tabla_resultados.getColumnModel().getColumnCount() > 0) {
            tabla_resultados.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        botonsm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SM.png"))); // NOI18N
        botonsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsmActionPerformed(evt);
            }
        });

        botonforalu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FOR ALU.png"))); // NOI18N
        botonforalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonforaluActionPerformed(evt);
            }
        });

        botonsl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SL1.png"))); // NOI18N
        botonsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonslActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonsf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonforalu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonsa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonse, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonsa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonsf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonforalu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        botonse.getAccessibleContext().setAccessibleDescription("");
        botonsd.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PropiedadesTabla() {
        tabla_resultados.setRowHeight(26);
        TableColumn codigo = tabla_resultados.getColumn("Codigo");
        TableColumn desc = tabla_resultados.getColumn("Descripción");
        TableColumn info = tabla_resultados.getColumn("Info");
        TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
        TableColumn total = tabla_resultados.getColumn("Total");
        TableColumn me = tabla_resultados.getColumn("Me");
        TableColumn ca = tabla_resultados.getColumn("Ca");
        TableColumn bo = tabla_resultados.getColumn("Bo");
        TableColumn ma = tabla_resultados.getColumn("Ma");
        codigo.setMaxWidth(50);
        info.setMaxWidth(40);
        cotizar.setMaxWidth(50);
        total.setMaxWidth(38);
        me.setMaxWidth(27);
        bo.setMaxWidth(27);
        ca.setMaxWidth(27);
        ma.setMaxWidth(27);
    }

    private void botonsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsgActionPerformed
        cod = "G";
        llenar_diametro();
        buscar();

    }//GEN-LAST:event_botonsgActionPerformed

    private void botonseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonseActionPerformed
        cod = "E";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonseActionPerformed

    public void llenar_diametro() {
        combo_diametro.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct diametro from fresarotativa where (total > 0) AND (forma2 = ?) order by diametro asc");
            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 

            pst.setString(1, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {

                String dia = rs.getString("diametro");
                combo_diametro.addItem(dia);
                buscar();

            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            llenar_diametro();
        }

    }
    private void botonsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsdActionPerformed
        // TODO add your handling code here:
        cod = "D";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonsdActionPerformed

    private void botonsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsbActionPerformed
        // TODO add your handling code here:
        cod = "B";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonsbActionPerformed

    private void botonsfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsfActionPerformed
        // TODO add your handling code here:
        cod = "F";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonsfActionPerformed

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void buscar() {
        try {

            //Conexión con la base de datos 
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst2 = cn2.prepareStatement("select * from fresarotativa where (total > 0) AND (forma2 = ?) AND (diametro = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            String texto = combo_diametro.getSelectedItem().toString();
            valor = Double.parseDouble(texto);
            //float valor = Float.parseFloat(texto);    
            pst2.setString(1, cod);
            //pst.setString(2, combo_diametro.getSelectedItem().toString());
            pst2.setDouble(2, valor);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs2 = pst2.executeQuery();

            //Se limpian los componentes de la tabla luego de cada busqueda 
            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);
            PropiedadesTabla();
            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {

                //txt_codigo.setText(rs.getString("codigo"));
                String cod = rs2.getString("codigo");
                String estado = rs2.getString("descripcion");
                String total = rs2.getString("total");
                String me = rs2.getString("me");
                String ca = rs2.getString("ca");
                String bo = rs2.getString("bo");
                String ma = rs2.getString("ma");

                //Coloca los resultados encontrado en la tabla creada previamente
                String datos[] = {cod, estado};

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {

        }
        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click
        tabla_resultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int columna_point = tabla_resultados.columnAtPoint(e.getPoint());

                if (fila_point > -1 && columna_point == 2) {
                    codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                    InformacionFresasRotativas informacionfresasrotativas = new InformacionFresasRotativas();
                    informacionfresasrotativas.setVisible(true);
                    codigo2 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 49) {
                        codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog(null, "¿Cuantas unidades del codigo " + codigo2 + "\n     desea agregar a la cotización?", "Cantidad", JOptionPane.QUESTION_MESSAGE);
                        if (isNumeric(canti)) {
                            k = Integer.parseInt(canti);
                        } else {
                            System.out.println("no es posible transformar el string" + canti + "a un número entero");
                        }
                        boolean n = isNumeric(canti);
                        if (isNumeric(canti) && n == true && k > 0) {
                            pdf.AddRowToJTable(new Object[]{"", codigo2, "", "", "", "", canti});
                            pdf.cargar_nombre();
                            pdf.calcular_total();
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico mayor a 0", "Advertencia", HEIGHT);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No es posible agregar mas items a la cotización", "Advertencia", HEIGHT);
                    }
                }
            }
        });
    }
    private void botonsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsaActionPerformed
        cod = "A";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonsaActionPerformed

    private void botonsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsmActionPerformed
        cod = "M";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonsmActionPerformed

    private void botonforaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonforaluActionPerformed
        cod = "FOR ALU";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonforaluActionPerformed

    private void botonscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonscActionPerformed
        cod = "C";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonscActionPerformed

    private void botonslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonslActionPerformed
        cod = "L";
        llenar_diametro();
        buscar();
    }//GEN-LAST:event_botonslActionPerformed

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        buscar();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

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
            java.util.logging.Logger.getLogger(Fresasrotativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fresasrotativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fresasrotativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fresasrotativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fresasrotativas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonforalu;
    private javax.swing.JButton botonsa;
    private javax.swing.JButton botonsb;
    private javax.swing.JButton botonsc;
    private javax.swing.JButton botonsd;
    private javax.swing.JButton botonse;
    private javax.swing.JButton botonsf;
    private javax.swing.JButton botonsg;
    private javax.swing.JButton botonsl;
    private javax.swing.JButton botonsm;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
