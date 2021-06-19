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

public class fresasverticales2 extends javax.swing.JFrame {

    public static fresasverticales2 obj = null;
    public static String cod = "";
    public static String descripcion = new String();
    public static String codigo2 = new String();
    public static int k = 0;
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

    public fresasverticales2() {
        initComponents();
        setTitle("Fresas verticales");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static fresasverticales2 getObj() {
        if (obj == null) {
            obj = new fresasverticales2();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_sistema = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boton_hss = new javax.swing.JButton();
        combo_diametro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combo_material = new javax.swing.JComboBox<>();
        Material = new javax.swing.JLabel();
        boton_carburo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_filos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combo_punta = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione el material base de la fresa solida");

        combo_sistema.setToolTipText("");
        combo_sistema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_sistemaItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        jLabel2.setText("Sistema");

        boton_hss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hss.png"))); // NOI18N
        boton_hss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_hssActionPerformed(evt);
            }
        });

        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        jLabel3.setText("Diámetro");

        combo_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_materialItemStateChanged(evt);
            }
        });

        Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material2_icono.png"))); // NOI18N
        Material.setText("Material de trabajo");

        boton_carburo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carburo.png"))); // NOI18N
        boton_carburo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_carburoActionPerformed(evt);
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

        jLabel4.setText("Carburo");

        jLabel5.setText("HSS");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filos_icono.png"))); // NOI18N
        jLabel6.setText("Filos");

        combo_filos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_filosItemStateChanged(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        jLabel7.setText("Punta");

        combo_punta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_puntaItemStateChanged(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Material)
                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(combo_punta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(combo_filos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boton_hss, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(boton_carburo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_hss, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_carburo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_filos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combo_punta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combo_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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

    private void boton_hssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_hssActionPerformed
        cod = "HSS";
        llenar_material();
    }//GEN-LAST:event_boton_hssActionPerformed

    private void boton_carburoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_carburoActionPerformed
        cod = "Carburo";
        llenar_material();
    }//GEN-LAST:event_boton_carburoActionPerformed

    private void combo_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_materialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_sistema();
        }
    }//GEN-LAST:event_combo_materialItemStateChanged

    private void combo_sistemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_sistemaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_punta();
        }
    }//GEN-LAST:event_combo_sistemaItemStateChanged

    private void combo_puntaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_puntaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_diametro();
        }
    }//GEN-LAST:event_combo_puntaItemStateChanged

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            llenar_filos();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

    private void combo_filosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_filosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_filosItemStateChanged

    private void llenar_material() {
        combo_material.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct material1 from fresav where (total > 0) AND (materialsimp = ?)   union  select distinct material2 from fresav where (total > 0) AND (materialsimp = ?) order by material1 asc");
            //PreparedStatement pst = cn.prepareStatement("select distinct material1 from fresav where (materialsimp = ?) order by material1 asc");
            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst.setString(1, cod);
            pst.setString(2, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {

                String mat1 = rs.getString("material1");

                combo_material.addItem(mat1);
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
            PreparedStatement pst2 = cn2.prepareStatement("select distinct unidad from fresav where (total > 0) AND (materialsimp = ?) AND (material1=?)  union  select distinct unidad from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst2.setString(1, cod);
            pst2.setString(2, combo_material.getSelectedItem().toString());
            pst2.setString(3, cod);
            pst2.setString(4, combo_material.getSelectedItem().toString());

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

    private void llenar_punta() {
        combo_punta.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst3 = cn3.prepareStatement("select distinct punta from fresav where (total > 0) AND (materialsimp = ?) AND (material1=?) AND (unidad=?)  union  select distinct punta from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?) AND (unidad=?) order by punta asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst3.setString(1, cod);
            pst3.setString(2, combo_material.getSelectedItem().toString());
            pst3.setString(3, combo_sistema.getSelectedItem().toString());
            pst3.setString(4, cod);
            pst3.setString(5, combo_material.getSelectedItem().toString());
            pst3.setString(6, combo_sistema.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs3 = pst3.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs3.next()) {
                String punta = rs3.getString("punta");
                combo_punta.addItem(punta);
            }
            rs3.close();
            cn3.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar punta");
        }
    }

    private void llenar_diametro() {
        combo_diametro.removeAllItems();
        try {
            // se caraga con la condicion material 1 sin incluir la condición material 2 y en el otro try se carga la condición material 1
            //Conexión con la base de datos 
            Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            //PreparedStatement pst2 = cn.prepareStatement("select distinct diametro from fresav where (materialsimp = ?) AND (material1=?) AND (unidad=?)");
            PreparedStatement pst4 = cn4.prepareStatement("select distinct diametro from fresav where (total > 0) AND (materialsimp = ?) AND (material1=?) AND (unidad=?) AND (punta=?)  except  select distinct diametro from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?) AND (unidad=?) AND (punta=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, combo_material.getSelectedItem().toString());
            pst4.setString(3, combo_sistema.getSelectedItem().toString());
            pst4.setString(4, combo_punta.getSelectedItem().toString());
            pst4.setString(5, cod);
            pst4.setString(6, combo_material.getSelectedItem().toString());
            pst4.setString(7, combo_sistema.getSelectedItem().toString());
            pst4.setString(8, combo_punta.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs4 = pst4.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs4.next()) {

                String diametro = rs4.getString("diametro");
                combo_diametro.addItem(diametro);
            }

            PreparedStatement pst5 = cn4.prepareStatement("select distinct diametro from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?) AND (unidad=?) AND (punta=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst5.setString(1, cod);
            pst5.setString(2, combo_material.getSelectedItem().toString());
            pst5.setString(3, combo_sistema.getSelectedItem().toString());
            pst5.setString(4, combo_punta.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs5 = pst5.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs5.next()) {
                String diametro = rs5.getString("diametro");
                combo_diametro.addItem(diametro);
            }
            rs4.close();
            rs5.close();
            cn4.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar diametro");
        }
    }

    private void llenar_filos() {
        combo_filos.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn6 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            //PreparedStatement pst2 = cn.prepareStatement("select distinct filos from fresav where (materialsimp = ?) AND (material1=?) AND (unidad=?) AND (diametro=?)");
            PreparedStatement pst6 = cn6.prepareStatement("select distinct filos from fresav where (total > 0) AND (materialsimp = ?) AND (material1=?) AND (unidad=?) AND (punta=?) AND (diametro=?) union  select distinct filos from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?) AND (unidad=?) AND (punta=?) AND (diametro=?) order by filos asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst6.setString(1, cod);
            pst6.setString(2, combo_material.getSelectedItem().toString());
            pst6.setString(3, combo_sistema.getSelectedItem().toString());
            pst6.setString(4, combo_punta.getSelectedItem().toString());
            pst6.setString(5, combo_diametro.getSelectedItem().toString());
            pst6.setString(6, cod);
            pst6.setString(7, combo_material.getSelectedItem().toString());
            pst6.setString(8, combo_sistema.getSelectedItem().toString());
            pst6.setString(9, combo_punta.getSelectedItem().toString());
            pst6.setString(10, combo_diametro.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs6 = pst6.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs6.next()) {

                String filo = rs6.getString("filos");
                combo_filos.addItem(filo);

            }
            rs6.close();
            cn6.close();
        } catch (Exception e) {
            System.out.println("Se ha perdido la conexión con llenar filos");
        }
    }

    private void limpiar() {
        combo_sistema.removeAllItems();
        combo_diametro.removeAllItems();
        combo_filos.removeAllItems();
        combo_material.removeAllItems();
        model.setRowCount(0);

        combo_material.setEnabled(false);
        combo_sistema.setEnabled(false);
        combo_diametro.setEnabled(false);
        combo_filos.setEnabled(false);
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
            PreparedStatement pst7 = cn7.prepareStatement("select * from fresav where (total > 0) AND (materialsimp = ?) AND (material1=?) AND (unidad=?) AND (punta=?) AND (diametro=?) AND (filos=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst7.setString(1, cod);
            pst7.setString(2, combo_material.getSelectedItem().toString());
            pst7.setString(3, combo_sistema.getSelectedItem().toString());
            pst7.setString(4, combo_punta.getSelectedItem().toString());
            pst7.setString(5, combo_diametro.getSelectedItem().toString());
            pst7.setString(6, combo_filos.getSelectedItem().toString());

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

                //txt_codigo.setText(rs.getString("codigo"));
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

            PreparedStatement pst8 = cn7.prepareStatement("select * from fresav where (total > 0) AND (materialsimp = ?) AND (material2=?) AND (unidad=?) AND (punta=?) AND (diametro=?) AND (filos=?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst8.setString(1, cod);
            pst8.setString(2, combo_material.getSelectedItem().toString());
            pst8.setString(3, combo_sistema.getSelectedItem().toString());
            pst8.setString(4, combo_punta.getSelectedItem().toString());
            pst8.setString(5, combo_diametro.getSelectedItem().toString());
            pst8.setString(6, combo_filos.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs8 = pst8.executeQuery();

            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);
            PropiedadesTabla();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs8.next()) {

                //txt_codigo.setText(rs.getString("codigo"));
                String cod = rs8.getString("codigo");
                String estado = rs8.getString("descripcion");
                String total = rs8.getString("total");
                String me = rs8.getString("me");
                String ca = rs8.getString("ca");
                String bo = rs8.getString("bo");
                String ma = rs8.getString("ma");

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
            }
            rs7.close();
            rs8.close();
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
                    InformacionFresasVerticales informacionfresasverticales = new InformacionFresasVerticales();
                    informacionfresasverticales.setVisible(true);
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
                            System.out.println("no es posible transformar el string " + canti + " a un número entero");
                        }
                        boolean n = isNumeric(canti);
                        //String canti = JOptionPane.showInputDialog(null, "¿Cuantas unidades del codigo " + codigo2 + "\n     desea agregar a la cotización?", "Cantidad",  JOptionPane.QUESTION_MESSAGE);
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
            java.util.logging.Logger.getLogger(fresasverticales2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fresasverticales2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fresasverticales2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fresasverticales2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fresasverticales2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material;
    private javax.swing.JButton boton_carburo;
    private javax.swing.JButton boton_hss;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JComboBox<String> combo_filos;
    private javax.swing.JComboBox<String> combo_material;
    private javax.swing.JComboBox<String> combo_punta;
    private javax.swing.JComboBox<String> combo_sistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
