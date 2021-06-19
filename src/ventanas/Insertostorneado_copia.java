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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Insertostorneado_copia extends javax.swing.JFrame {

    public static Insertostorneado_copia obj = null;

    public static String cod = "";
    public static String marca = "";
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Marca"};
    DefaultTableModel model = new DefaultTableModel(data, cabeza) {

        //Metodo que permite que no se púeda editar los valores de la tabla
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 3) {
                return true;
            } else {
                return false;
            }
        }
    };

    public Insertostorneado_copia() {
        initComponents();
        setTitle("Insertos de torneado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Insertostorneado_copia getObj() {
        if (obj == null) {
            obj = new Insertostorneado_copia();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_longitud = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        botonw = new javax.swing.JButton();
        botond = new javax.swing.JButton();
        combo_radio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combo_material = new javax.swing.JComboBox<>();
        Material = new javax.swing.JLabel();
        botonv = new javax.swing.JButton();
        botonc = new javax.swing.JButton();
        botonr = new javax.swing.JButton();
        botons = new javax.swing.JButton();
        botont = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        check_korloy = new javax.swing.JCheckBox();
        check_yg = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione la geometría del inserto");

        combo_longitud.setToolTipText("");
        combo_longitud.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_longitudItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        jLabel2.setText("Longitud");

        botonw.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\W2.PNG")); // NOI18N
        botonw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonwActionPerformed(evt);
            }
        });

        botond.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\D2.PNG")); // NOI18N
        botond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondActionPerformed(evt);
            }
        });

        combo_radio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_radioItemStateChanged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/radio_icono.png"))); // NOI18N
        jLabel3.setText("Radio");

        combo_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_materialItemStateChanged(evt);
            }
        });

        Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material2_icono.png"))); // NOI18N
        Material.setText("Material");

        botonv.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\V2.PNG")); // NOI18N
        botonv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvActionPerformed(evt);
            }
        });

        botonc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\C2.PNG")); // NOI18N
        botonc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncActionPerformed(evt);
            }
        });

        botonr.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\R2.PNG")); // NOI18N
        botonr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrActionPerformed(evt);
            }
        });

        botons.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\S2.PNG")); // NOI18N
        botons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsActionPerformed(evt);
            }
        });

        botont.setIcon(new javax.swing.ImageIcon("C:\\Users\\Investigacion2\\Documents\\NetBeansProjects\\sistema_de_busqueda\\images\\T2.PNG")); // NOI18N
        botont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontActionPerformed(evt);
            }
        });

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Marca"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);

        check_korloy.setText("Korloy");
        check_korloy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_korloyItemStateChanged(evt);
            }
        });

        check_yg.setText("YG-1");
        check_yg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_ygItemStateChanged(evt);
            }
        });

        jLabel4.setText("Seleccione la marca del inserto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(combo_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Material))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botond, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botont, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonw, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botons, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_korloy)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(check_yg)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_korloy)
                    .addComponent(check_yg))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botont, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonw, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botons, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonr, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Material)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botonv))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonwActionPerformed
        cod = "W";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botonwActionPerformed

    private void botondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondActionPerformed
        cod = "D";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botondActionPerformed

    private void botonvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvActionPerformed
        cod = "V";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botonvActionPerformed

    private void botoncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncActionPerformed
        cod = "C";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botoncActionPerformed

    private void botonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsActionPerformed
        cod = "S";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botonsActionPerformed

    private void botonrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrActionPerformed
        cod = "R";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botonrActionPerformed

    private void botontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontActionPerformed
        cod = "t";
        System.out.println(cod);
        cargar_longitud();
    }//GEN-LAST:event_botontActionPerformed

    private void combo_longitudItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_longitudItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_radio();
        }
    }//GEN-LAST:event_combo_longitudItemStateChanged

    private void combo_radioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_radioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_material();
        }
    }//GEN-LAST:event_combo_radioItemStateChanged

    private void combo_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_materialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_materialItemStateChanged

    private void check_korloyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_korloyItemStateChanged
        marca = "Korloy";
        if (check_korloy.isSelected() == true) {
            check_yg.setEnabled(false);
        } else {
            check_yg.setEnabled(true);
        }
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_longitud();
        }
    }//GEN-LAST:event_check_korloyItemStateChanged

    private void check_ygItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_ygItemStateChanged
        marca = "YG-1";
        if (check_yg.isSelected() == true) {
            check_korloy.setEnabled(false);
        } else {
            check_korloy.setEnabled(true);
        }
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_longitud();
        }
    }//GEN-LAST:event_check_ygItemStateChanged

    private void cargar_longitud() {
        combo_longitud.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct longitud from insertos where (forma = ?) AND (marca = ?) order by longitud asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos          
            pst.setString(1, cod);
            pst.setString(2, marca);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String lon = rs.getString("longitud");
                combo_longitud.addItem(lon);
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_longitud");
        }
    }

    private void cargar_radio() {
        combo_radio.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst2 = cn2.prepareStatement("select distinct radio from insertos where (forma = ?) AND (marca = ?) AND (longitud=?) order by radio asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst2.setString(1, cod);
            pst2.setString(2, marca);
            pst2.setString(3, combo_longitud.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String rad = rs2.getString("radio");
                combo_radio.addItem(rad);
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_radio");
        }
    }

    private void cargar_material() {
        combo_material.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst3 = cn3.prepareStatement("select distinct material1 from insertos where (forma= ?) AND (marca = ?) AND (longitud= ?) AND (radio= ?) order by material1 asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst3.setString(1, cod);
            pst3.setString(2, marca);
            pst3.setString(3, combo_longitud.getSelectedItem().toString());
            pst3.setString(4, combo_radio.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs3 = pst3.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs3.next()) {

                String mat = rs3.getString("material1");
                combo_material.addItem(mat);
            }
            rs3.close();
            cn3.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_material");
        }
    }

    private void buscar() {
        try {
            //Conexión con la base de datos 
            Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst4 = cn4.prepareStatement("select * from insertos where (forma = ?) AND (marca = ?) AND (longitud = ?) AND (radio = ?) AND (material1 = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, marca);
            pst4.setString(3, combo_longitud.getSelectedItem().toString());
            pst4.setString(4, combo_radio.getSelectedItem().toString());
            pst4.setString(5, combo_material.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs4 = pst4.executeQuery();

            //Se limpian los componentes de la tabla luego de cada busqueda 
            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);

            TableColumn columna_codigo = tabla_resultados.getColumn("Codigo");
            TableColumn columna_marca = tabla_resultados.getColumn("Marca");
            columna_codigo.setMaxWidth(60);
            columna_marca.setMaxWidth(60);

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs4.next()) {

                //txt_codigo.setText(rs.getString("codigo"));
                String cod = rs4.getString("codigo");
                String estado = rs4.getString("descripcion");
                String marca = rs4.getString("marca");

                //Coloca los resultados encontrado en la tabla creada previamente
                String datos[] = {cod, estado, marca};
                model.addRow(datos);

                System.out.println();
            }

            PreparedStatement pst5 = cn4.prepareStatement("select * from insertos where (forma = ?) AND (marcar = ?) AND (longitud = ?) AND (radio = ?) AND (material2 = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            // pst.setString(1, txt_nombre.getText().trim());
            pst5.setString(1, cod);
            pst5.setString(2, marca);
            pst5.setString(3, combo_longitud.getSelectedItem().toString());
            pst5.setString(4, combo_radio.getSelectedItem().toString());
            pst5.setString(5, combo_material.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs5 = pst5.executeQuery();

            String jh = combo_material.getSelectedItem().toString();

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);

            TableColumn columna2_codigo = tabla_resultados.getColumn("Codigo");
            TableColumn columna2_marca = tabla_resultados.getColumn("Marca");
            columna2_codigo.setMaxWidth(60);
            columna2_marca.setMaxWidth(60);

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs5.next()) {

                //txt_codigo.setText(rs.getString("codigo"));
                String cod1 = rs5.getString("codigo");
                String estado1 = rs5.getString("descripcion");
                String marca1 = rs5.getString("marca");

                //Coloca los resultados encontrado en la tabla creada previamente
                String datos2[] = {cod1, estado1, marca1};
                model.addRow(datos2);
            }
            rs4.close();
            rs5.close();
            cn4.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en buscar");
        }
        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click
        tabla_resultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    codigo2 = (String) model.getValueAt(fila_point, columna_point);
                    InformacionInsertost informacioninsertos = new InformacionInsertost();
                    informacioninsertos.setVisible(true);
                    //System.out.println("codigo2");
                    codigo2 = "";
                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(Insertostorneado_copia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertostorneado_copia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertostorneado_copia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertostorneado_copia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertostorneado_copia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material;
    private javax.swing.JButton botonc;
    private javax.swing.JButton botond;
    private javax.swing.JButton botonr;
    private javax.swing.JButton botons;
    private javax.swing.JButton botont;
    private javax.swing.JButton botonv;
    private javax.swing.JButton botonw;
    private javax.swing.JCheckBox check_korloy;
    private javax.swing.JCheckBox check_yg;
    private javax.swing.JComboBox<String> combo_longitud;
    private javax.swing.JComboBox<String> combo_material;
    private javax.swing.JComboBox<String> combo_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
