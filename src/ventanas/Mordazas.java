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

public class Mordazas extends javax.swing.JFrame {

    public static Mordazas obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String dia = "";
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

    public Mordazas() {
        initComponents();
        setTitle("Copa / Mandril");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        check_plg.setSelected(true);
    }

    public static Mordazas getObj() {
        if (obj == null) {
            obj = new Mordazas();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_autocentrante = new javax.swing.JButton();
        boton_independiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boton_hidraulica = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combo_diametro = new javax.swing.JComboBox<>();
        Material1 = new javax.swing.JLabel();
        check_plg = new javax.swing.JCheckBox();
        check_mm = new javax.swing.JCheckBox();
        combo_mordazas = new javax.swing.JComboBox<>();
        Material2 = new javax.swing.JLabel();
        Material3 = new javax.swing.JLabel();
        combo_espe = new javax.swing.JComboBox<>();
        Material4 = new javax.swing.JLabel();
        combo_marca = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione el tipo de copa");

        boton_autocentrante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa_autocentrante.png"))); // NOI18N
        boton_autocentrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_autocentranteActionPerformed(evt);
            }
        });

        boton_independiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa_independiente.png"))); // NOI18N
        boton_independiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_independienteActionPerformed(evt);
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
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        jLabel4.setText("Independiente");

        jLabel5.setText("Autocentrante");

        boton_hidraulica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa_autoindependiente.png"))); // NOI18N
        boton_hidraulica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_hidraulicaActionPerformed(evt);
            }
        });

        jLabel7.setText("Hidraulica");

        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        Material1.setText("Diámetro copa");

        check_plg.setText("plg");
        check_plg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_plgItemStateChanged(evt);
            }
        });

        check_mm.setText("mm");
        check_mm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_mmItemStateChanged(evt);
            }
        });

        combo_mordazas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_mordazasItemStateChanged(evt);
            }
        });

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cantidad_icono.png"))); // NOI18N
        Material2.setText("# Mordazas");

        Material3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/especificacion_icono.png"))); // NOI18N
        Material3.setText("Tipo de mordaza");

        combo_espe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espeItemStateChanged(evt);
            }
        });

        Material4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marca_icono.png"))); // NOI18N
        Material4.setText("Marca");

        combo_marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_marcaItemStateChanged(evt);
            }
        });

        jMenu1.setText("Opciones");

        menu_recargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.ALT_MASK));
        menu_recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar2_icono.png"))); // NOI18N
        menu_recargar.setText("Limpiar");
        jMenu1.add(menu_recargar);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recargar_icono.png"))); // NOI18N
        jMenuItem2.setText("Regargar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(boton_autocentrante, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boton_independiente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_hidraulica, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Material1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(check_plg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(check_mm))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Material2)
                            .addComponent(combo_mordazas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Material3)
                            .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Material4)
                            .addComponent(combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_autocentrante, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_independiente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_hidraulica, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Material2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(combo_mordazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Material4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Material1)
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(check_plg)
                                .addComponent(check_mm))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Material3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

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

    private void boton_autocentranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_autocentranteActionPerformed
        cod = "Autocentrante";
        cargar_diametro();
    }//GEN-LAST:event_boton_autocentranteActionPerformed

    private void boton_independienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_independienteActionPerformed
        cod = "Independiente";
        cargar_diametro();
    }//GEN-LAST:event_boton_independienteActionPerformed

    private void boton_hidraulicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_hidraulicaActionPerformed
        cod = "Hidraulica";
        cargar_diametro();
    }//GEN-LAST:event_boton_hidraulicaActionPerformed

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_mordazas();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

    private void check_plgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_plgItemStateChanged
        if (check_plg.isSelected() == true) {
            check_mm.setEnabled(false);
            cargar_diametro();
        } else {
            check_mm.setEnabled(true);
        }
    }//GEN-LAST:event_check_plgItemStateChanged

    private void check_mmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_mmItemStateChanged
        if (check_mm.isSelected() == true) {
            check_plg.setEnabled(false);
            cargar_diametro();
        } else {
            check_plg.setEnabled(true);
        }
    }//GEN-LAST:event_check_mmItemStateChanged

    private void combo_mordazasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_mordazasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_espe();
        }
    }//GEN-LAST:event_combo_mordazasItemStateChanged

    private void combo_espeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_marca();
        }
    }//GEN-LAST:event_combo_espeItemStateChanged

    private void combo_marcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_marcaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_marcaItemStateChanged

    private void cargar_diametro() {
        combo_diametro.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct diaplg from mordazas where (total > 0) AND (tipo= ?) order by diaplg asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, cod);
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String diametro = rs2.getString("diaplg");
                    combo_diametro.addItem(diametro);

                    dia = rs2.getString("diaplg");
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_diametro");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct diamm from mordazas where (total > 0) AND (tipo= ?) order by diamm asc ");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, cod);
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String diametro = rs2.getString("diamm");
                    combo_diametro.addItem(diametro);
                    dia = rs2.getString("diamm");
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_diametro");
            }
        }
    }

    private void cargar_mordazas() {
        combo_mordazas.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst3 = cn3.prepareStatement("select distinct nmordaza from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) order by nmordaza asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst3.setString(1, cod);
                pst3.setString(2, combo_diametro.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs3 = pst3.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs3.next()) {
                    String mordazas = rs3.getString("nmordaza");
                    combo_mordazas.addItem(mordazas);
                }
                rs3.close();
                cn3.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_mordazaplg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst4 = cn4.prepareStatement("select distinct nmordaza from mordazas where (total > 0) AND (tipo= ?) AND (diamm= ?) order by nmordaza asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst4.setString(1, cod);
                pst4.setString(2, combo_diametro.getSelectedItem().toString());

                ResultSet rs4 = pst4.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs4.next()) {
                    String mordazas = rs4.getString("nmordaza");
                    combo_mordazas.addItem(mordazas);
                }
                rs4.close();
                cn4.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_mordazamm");
            }
        }
    }

    private void cargar_espe() {
        combo_espe.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select distinct especificacion from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) AND (nmordaza= ?) order by especificacion asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst5.setString(1, cod);
                pst5.setString(2, combo_diametro.getSelectedItem().toString());
                pst5.setString(3, combo_mordazas.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs5 = pst5.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {
                    String espe = rs5.getString("especificacion");
                    combo_espe.addItem(espe);
                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espeplg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn6 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst6 = cn6.prepareStatement("select distinct especificacion from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) AND (nmordaza= ?) order by especificacion asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst6.setString(1, cod);
                pst6.setString(2, combo_diametro.getSelectedItem().toString());
                pst6.setString(3, combo_mordazas.getSelectedItem().toString());
                ResultSet rs6 = pst6.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs6.next()) {
                    String espe = rs6.getString("especificacion");
                    combo_espe.addItem(espe);
                }
                rs6.close();
                cn6.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espemm");
            }
        }
    }

    private void cargar_marca() {
        combo_marca.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn7 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst7 = cn7.prepareStatement("select distinct para from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) AND (nmordaza= ?) AND (especificacion= ?) order by para asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst7.setString(1, cod);
                pst7.setString(2, combo_diametro.getSelectedItem().toString());
                pst7.setString(3, combo_mordazas.getSelectedItem().toString());
                pst7.setString(4, combo_espe.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs7 = pst7.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs7.next()) {
                    String marca = rs7.getString("para");
                    combo_marca.addItem(marca);
                }
                rs7.close();
                cn7.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espeplg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn8 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst8 = cn8.prepareStatement("select distinct para from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) AND (nmordaza= ?) AND (especificacion= ?) order by para asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst8.setString(1, cod);
                pst8.setString(2, combo_diametro.getSelectedItem().toString());
                pst8.setString(3, combo_mordazas.getSelectedItem().toString());
                pst8.setString(4, combo_espe.getSelectedItem().toString());

                ResultSet rs8 = pst8.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs8.next()) {
                    String marca = rs8.getString("para");
                    combo_marca.addItem(marca);
                }
                rs8.close();
                cn8.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espemm");
            }
        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void buscar() {
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos 
                Connection cn9 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst9 = cn9.prepareStatement("select * from mordazas where (total > 0) AND (tipo= ?) AND (diaplg= ?) AND (nmordaza= ?) AND (especificacion= ?) AND (para= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst9.setString(1, cod);
                pst9.setString(2, combo_diametro.getSelectedItem().toString());
                pst9.setString(3, combo_mordazas.getSelectedItem().toString());
                pst9.setString(4, combo_espe.getSelectedItem().toString());
                pst9.setString(5, combo_marca.getSelectedItem().toString());
                // Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs9 = pst9.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs9.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs9.getString("codigo");
                    String estado = rs9.getString("descripcion");
                    String total = rs9.getString("total");
                    String me = rs9.getString("me");
                    String ca = rs9.getString("ca");
                    String bo = rs9.getString("bo");
                    String ma = rs9.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
                }
                rs9.close();
                cn9.close();
            } catch (Exception e) {
                System.out.println("no hay conexion en buscar");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos 
                Connection cn10 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst10 = cn10.prepareStatement("select * from mordazas where (total > 0) AND (tipo= ?) AND (diamm= ?) AND (nmordaza= ?) AND (especificacion= ?) AND (para= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst10.setString(1, cod);
                pst10.setString(2, combo_diametro.getSelectedItem().toString());
                pst10.setString(3, combo_mordazas.getSelectedItem().toString());
                pst10.setString(4, combo_espe.getSelectedItem().toString());
                pst10.setString(5, combo_marca.getSelectedItem().toString());

                // Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs10 = pst10.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();
                //Metodo para que busque todos los resultados posible con las condiciones dadas

                while (rs10.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs10.getString("codigo");
                    String estado = rs10.getString("descripcion");
                    String total = rs10.getString("total");
                    String me = rs10.getString("me");
                    String ca = rs10.getString("ca");
                    String bo = rs10.getString("bo");
                    String ma = rs10.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
                }
                rs10.close();
                cn10.close();
            } catch (Exception e) {
                System.out.println("no hay conexion en buscar");
            }
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
                    InformacionMordazas informacionmordazas = new InformacionMordazas();
                    informacionmordazas.setVisible(true);
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
            java.util.logging.Logger.getLogger(Mordazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mordazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mordazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mordazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mordazas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material1;
    private javax.swing.JLabel Material2;
    private javax.swing.JLabel Material3;
    private javax.swing.JLabel Material4;
    private javax.swing.JButton boton_autocentrante;
    private javax.swing.JButton boton_hidraulica;
    private javax.swing.JButton boton_independiente;
    private javax.swing.JCheckBox check_mm;
    private javax.swing.JCheckBox check_plg;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JComboBox<String> combo_espe;
    private javax.swing.JComboBox<String> combo_marca;
    private javax.swing.JComboBox<String> combo_mordazas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
