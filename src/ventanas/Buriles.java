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

public class Buriles extends javax.swing.JFrame {

    public static Buriles obj = null;
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

    public Buriles() {
        initComponents();
        setTitle("Buriles");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Buriles getObj() {
        if (obj == null) {
            obj = new Buriles();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_sistema = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boton_cuchilla = new javax.swing.JButton();
        combo_diametro = new javax.swing.JComboBox<>();
        label_cuadrante = new javax.swing.JLabel();
        combo_material = new javax.swing.JComboBox<>();
        label_material = new javax.swing.JLabel();
        boton_cuadrado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boton_redondo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        boton_derecho = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        boton_izquierdo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        boton_recto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        boton_barra = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        boton_porta = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione el tipo de buril");

        combo_sistema.setToolTipText("");
        combo_sistema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_sistemaItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        jLabel2.setText("Sistema");

        boton_cuchilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_cuchilla.png"))); // NOI18N
        boton_cuchilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cuchillaActionPerformed(evt);
            }
        });

        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        label_cuadrante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        label_cuadrante.setText("Cudrante");

        combo_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_materialItemStateChanged(evt);
            }
        });

        label_material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material2_icono.png"))); // NOI18N
        label_material.setText("Material");

        boton_cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_cuadrado.png"))); // NOI18N
        boton_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cuadradoActionPerformed(evt);
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
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        jLabel4.setText("Cuadrado");

        jLabel5.setText("Cuchilla");

        boton_redondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_redondo.png"))); // NOI18N
        boton_redondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_redondoActionPerformed(evt);
            }
        });

        jLabel8.setText("Redondo");

        boton_derecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_derecho.png"))); // NOI18N
        boton_derecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_derechoActionPerformed(evt);
            }
        });

        jLabel9.setText("Derecho");

        boton_izquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_izquierdo.png"))); // NOI18N
        boton_izquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_izquierdoActionPerformed(evt);
            }
        });

        jLabel10.setText("Izquierdo");

        boton_recto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_recto.png"))); // NOI18N
        boton_recto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rectoActionPerformed(evt);
            }
        });

        jLabel11.setText("Recto (60°)");

        boton_barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_barra.png"))); // NOI18N
        boton_barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_barraActionPerformed(evt);
            }
        });

        jLabel12.setText("Barra interior");

        boton_porta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buril_porta.png"))); // NOI18N
        boton_porta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portaActionPerformed(evt);
            }
        });

        jLabel13.setText("Porta buril");

        jMenu1.setText("Opciones");

        menu_recargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.ALT_MASK));
        menu_recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar2_icono.png"))); // NOI18N
        menu_recargar.setText("Limpiar");
        menu_recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_recargarActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(boton_cuchilla, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton_cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(boton_redondo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(boton_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton_recto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel11)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(30, 30, 30)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(486, 486, 486))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_material, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(combo_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cuadrante))
                        .addGap(337, 337, 337))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_cuchilla, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_redondo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_recto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_cuadrante)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void menu_recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_recargarActionPerformed
        limpiar();
    }//GEN-LAST:event_menu_recargarActionPerformed

    private void boton_cuchillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cuchillaActionPerformed
        cod = "Cuchilla";
        label_cuadrante.setText("Cuadrante");
        llenar_material();
    }//GEN-LAST:event_boton_cuchillaActionPerformed

    private void boton_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cuadradoActionPerformed
        cod = "Cuadrado";
        label_cuadrante.setText("Cuadrante");
        llenar_material();
    }//GEN-LAST:event_boton_cuadradoActionPerformed

    private void boton_redondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_redondoActionPerformed
        cod = "Redondo";
        label_cuadrante.setText("Diámetro");
        llenar_material();
    }//GEN-LAST:event_boton_redondoActionPerformed

    private void boton_derechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_derechoActionPerformed
        cod = "Derecho";
        label_cuadrante.setText("Cuadrante");
        llenar_material();
    }//GEN-LAST:event_boton_derechoActionPerformed

    private void boton_izquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_izquierdoActionPerformed
        cod = "Izquierdo";
        label_cuadrante.setText("Cuadrante");
        llenar_material();
    }//GEN-LAST:event_boton_izquierdoActionPerformed

    private void boton_rectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rectoActionPerformed
        cod = "Recto";
        label_cuadrante.setText("Cuadrante");
        llenar_material();
    }//GEN-LAST:event_boton_rectoActionPerformed

    private void combo_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_materialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_sistema();
        }
    }//GEN-LAST:event_combo_materialItemStateChanged

    private void combo_sistemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_sistemaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_diametro();
        }
    }//GEN-LAST:event_combo_sistemaItemStateChanged

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

    private void boton_barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_barraActionPerformed
        cod = "Barra";
        label_cuadrante.setText("Diámetro");
        llenar_material();
    }//GEN-LAST:event_boton_barraActionPerformed

    private void boton_portaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portaActionPerformed
        cod = "Porta";
        label_material.setText("Tipo");
        llenar_material();
    }//GEN-LAST:event_boton_portaActionPerformed

    private void llenar_material() {
        combo_material.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct mat from buriles where (total > 0) AND (tipo = ?) order by mat desc");

            pst.setString(1, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String mat = rs.getString("mat");
                combo_material.addItem(mat);
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar material");
        }
    }

    private void llenar_sistema() {
        combo_sistema.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst2 = cn2.prepareStatement("select distinct unidad from buriles where (total > 0) AND (tipo = ?) AND (mat=?) order by unidad asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst2.setString(1, cod);
            pst2.setString(2, combo_material.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String unidad = rs2.getString("unidad");
                combo_sistema.addItem(unidad);
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar sistema");
            //llenar_sistema();
        }
    }

    private void llenar_diametro() {
        combo_diametro.removeAllItems();
        try {
            // se caraga con la condicion material 1 sin incluir la condición material 2 y en el otro try se carga la condición material 1
            //Conexión con la base de datos 
            Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst4 = cn4.prepareStatement("select distinct diametro from buriles where (total > 0) AND (tipo = ?) AND (mat=?) AND (unidad=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, combo_material.getSelectedItem().toString());
            pst4.setString(3, combo_sistema.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs4 = pst4.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs4.next()) {

                String diametro = rs4.getString("diametro");
                combo_diametro.addItem(diametro);
            }
            rs4.close();
            cn4.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar diametro");
        }
    }

    private void limpiar() {
        combo_sistema.removeAllItems();
        combo_diametro.removeAllItems();
        combo_material.removeAllItems();
        model.setRowCount(0);
        combo_material.setEnabled(false);
        combo_sistema.setEnabled(false);
        combo_diametro.setEnabled(false);
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

        try {
            //Conexión con la base de datos 
            Connection cn7 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst7 = cn7.prepareStatement("select * from buriles where (total > 0) AND (tipo = ?) AND (mat=?) AND (unidad=?) AND (diametro=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst7.setString(1, cod);
            pst7.setString(2, combo_material.getSelectedItem().toString());
            pst7.setString(3, combo_sistema.getSelectedItem().toString());
            pst7.setString(4, combo_diametro.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs7 = pst7.executeQuery();

            //Se limpian los componentes de la tabla luego de cada busqueda 
            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);
            PropiedadesTabla();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs7.next()) {

                String cod = rs7.getString("codigo");
                String estado = rs7.getString("descripcion");
                String total = rs7.getString("total");
                String me = rs7.getString("me");
                String ca = rs7.getString("ca");
                String bo = rs7.getString("bo");
                String ma = rs7.getString("ma");

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});

            }
            rs7.close();
            cn7.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con buscar en buscar");
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
                    InformacionBuriles informacionburiles = new InformacionBuriles();
                    informacionburiles.setVisible(true);
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
            java.util.logging.Logger.getLogger(Buriles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buriles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buriles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buriles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buriles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_barra;
    private javax.swing.JButton boton_cuadrado;
    private javax.swing.JButton boton_cuchilla;
    private javax.swing.JButton boton_derecho;
    private javax.swing.JButton boton_izquierdo;
    private javax.swing.JButton boton_porta;
    private javax.swing.JButton boton_recto;
    private javax.swing.JButton boton_redondo;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JComboBox<String> combo_material;
    private javax.swing.JComboBox<String> combo_sistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_cuadrante;
    private javax.swing.JLabel label_material;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
