package ventanas;

import java.awt.Color;
import java.awt.Font;
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

public class Calibradores extends javax.swing.JFrame {

    public static int k = 0;
    public static Calibradores obj = null;
    public static String cod = "";
    public static String descripcion = new String();
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Info", "Cotizar"};
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
            if (columnas == 4) {
                return true;
            } else {
                return false;
            }
        }
    };

    public Calibradores() {
        initComponents();
        setTitle("Calibradores");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        check_mm.setSelected(true);
        PropiedadesTabla();
    }

    public static Calibradores getObj() {
        if (obj == null) {
            obj = new Calibradores();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_pie = new javax.swing.JButton();
        combo_rango = new javax.swing.JComboBox<>();
        Material = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        check_mm = new javax.swing.JCheckBox();
        check_plg = new javax.swing.JCheckBox();
        combo_espe = new javax.swing.JComboBox<>();
        Material1 = new javax.swing.JLabel();
        boton_altura = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        boton_espesor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        boton_interior = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione el tipo de calibrador ");

        boton_pie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cali_digital.png"))); // NOI18N
        boton_pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pieActionPerformed(evt);
            }
        });

        combo_rango.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_rangoItemStateChanged(evt);
            }
        });

        Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forma_icono.png"))); // NOI18N
        Material.setText("Estilo");

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Info", "Cotizar"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);
        if (tabla_resultados.getColumnModel().getColumnCount() > 0) {
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel5.setText("Pie de rey");

        check_mm.setText("mm");
        check_mm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_mmItemStateChanged(evt);
            }
        });

        check_plg.setText("plg");
        check_plg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_plgItemStateChanged(evt);
            }
        });

        combo_espe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espeItemStateChanged(evt);
            }
        });

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material1.setText("    Rango");

        boton_altura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calibrador de alturas menu.png"))); // NOI18N
        boton_altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_alturaActionPerformed(evt);
            }
        });

        jLabel6.setText("Alturas");

        boton_espesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calibrador de espesore menu.png"))); // NOI18N
        boton_espesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_espesorActionPerformed(evt);
            }
        });

        jLabel9.setText("Espesores");

        boton_interior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calibrador de interiores menu.png"))); // NOI18N
        boton_interior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_interiorActionPerformed(evt);
            }
        });

        jLabel10.setText("Interiores");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(64, 64, 64)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(173, 173, 173)
                                .addComponent(jLabel6)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_pie, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(boton_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Material))
                                .addGap(73, 73, 73)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_rango, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(check_mm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(check_plg))
                                    .addComponent(Material1))
                                .addGap(93, 93, 93))
                            .addComponent(boton_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(99, 99, 99))))
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_pie, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(Material1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_plg)
                            .addComponent(check_mm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PropiedadesTabla() {
        tabla_resultados.setDefaultRenderer(Object.class, new ImgTabla());
        tabla_resultados.getTableHeader().setPreferredSize(new java.awt.Dimension(20, 20));
        tabla_resultados.getTableHeader().setFont(new Font("Cooper Black", 1, 10));
    }

    private void boton_pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pieActionPerformed
        cod = "Pie de rey";
        cargar_espe();
    }//GEN-LAST:event_boton_pieActionPerformed

    private void check_mmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_mmItemStateChanged
        if (check_mm.isSelected() == true) {
            check_plg.setEnabled(false);
            cargar_rango();
        } else {
            check_plg.setEnabled(true);
        }
    }//GEN-LAST:event_check_mmItemStateChanged

    private void check_plgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_plgItemStateChanged
        if (check_plg.isSelected() == true) {
            check_mm.setEnabled(false);
            cargar_rango();
        } else {
            check_mm.setEnabled(true);
        }
    }//GEN-LAST:event_check_plgItemStateChanged

    private void combo_rangoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_rangoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_rangoItemStateChanged

    private void combo_espeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espeItemStateChanged
        cargar_rango();

    }//GEN-LAST:event_combo_espeItemStateChanged

    private void boton_alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_alturaActionPerformed
        cod = "Alturas";
        cargar_espe();
    }//GEN-LAST:event_boton_alturaActionPerformed

    private void boton_espesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_espesorActionPerformed
        cod = "Espesores";
        cargar_espe();
    }//GEN-LAST:event_boton_espesorActionPerformed

    private void boton_interiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_interiorActionPerformed
        cod = "Interiores";
        cargar_espe();
    }//GEN-LAST:event_boton_interiorActionPerformed

    private void cargar_espe() {
        combo_espe.removeAllItems();

        try {
            //Conexión con la base de datos
            Connection cn0 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst0 = cn0.prepareStatement("select distinct especificacion from pie where (tipo= ?) order by especificacion desc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
            pst0.setString(1, cod);
            //Declaración de la variable que alberga el resultado de la busqueda
            ResultSet rs0 = pst0.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs0.next()) {
                String espe = rs0.getString("especificacion");
                combo_espe.addItem(espe);
            }
            rs0.close();
            cn0.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar espe");
        }
    }

    private void cargar_rango() {
        combo_rango.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct rangoplg from pie where (tipo= ?) AND (especificacion= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst.setString(1, cod);
                pst.setString(2, combo_espe.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String rangoplg = rs.getString("rangoplg");
                    combo_rango.addItem(rangoplg);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_rango check_plg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct rangomm from pie where (tipo= ?) AND (especificacion= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, cod);
                pst2.setString(2, combo_espe.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String rangomm = rs2.getString("rangomm");
                    combo_rango.addItem(rangomm);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_rango check_plg");
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
        if (check_plg.isEnabled()) {
            try {

                //Conexión con la base de datos 
                Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst3 = cn3.prepareStatement("select * from pie where (tipo= ?) AND (especificacion= ?) AND (rangoplg= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst3.setString(1, cod);
                pst3.setString(2, combo_espe.getSelectedItem().toString());
                pst3.setString(3, combo_rango.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs3 = pst3.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);

                TableColumn columna = tabla_resultados.getColumn("Codigo");
                TableColumn desc = tabla_resultados.getColumn("Descripción");
                TableColumn info = tabla_resultados.getColumn("Info");
                TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
                columna.setMaxWidth(55);
                info.setMaxWidth(40);
                cotizar.setMaxWidth(60);
                tabla_resultados.setRowHeight(26);

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs3.next()) {

                    String cod = rs3.getString("codigo");
                    String estado = rs3.getString("descripcion");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos[] = {cod, estado};

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2});
                }
                rs3.close();
                cn3.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check_plg");
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
                        InformacionCalibradores informacioncalibradores = new InformacionCalibradores();
                        informacioncalibradores.setVisible(true);
                        codigo2 = "";
                    }

                    if (fila_point > -1 && columna_point == 3) {
                        pdf.contar();
                        if (pdf.limite <= 32) {
                            codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                            descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                            String canti = JOptionPane.showInputDialog("¿Cuantas unidades del codigo " + codigo2 + " desea agregar a la cotización");
                            if (isNumeric(canti)) {
                                pdf.AddRowToJTable(new Object[]{"", codigo2, "", "", "", "", canti});
                                pdf.cargar_nombre();
                                pdf.calcular_total();
                            } else {
                                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico", "Advertencia", HEIGHT);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No es posible agregar mas items a la cotización", "Advertencia", HEIGHT);
                        }
                    }
                }

            });
        }

        if (check_mm.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst4 = cn4.prepareStatement("select * from pie where (tipo= ?) AND (especificacion= ?) AND (rangomm= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst4.setString(1, cod);
                pst4.setString(2, combo_espe.getSelectedItem().toString());
                pst4.setString(3, combo_rango.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs4 = pst4.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);

                TableColumn columna = tabla_resultados.getColumn("Codigo");
                TableColumn desc = tabla_resultados.getColumn("Descripción");
                TableColumn info = tabla_resultados.getColumn("Info");
                TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
                columna.setMaxWidth(55);
                //desc.setMaxWidth(500);
                info.setMaxWidth(40);
                cotizar.setMaxWidth(60);
                tabla_resultados.setRowHeight(26);

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs4.next()) {

                    String cod = rs4.getString("codigo");
                    String estado = rs4.getString("descripcion");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos[] = {cod, estado};

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2});
                }
                rs4.close();
                cn4.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check_plg");
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
                        InformacionCalibradores informacioncalibradores = new InformacionCalibradores();
                        informacioncalibradores.setVisible(true);
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
            java.util.logging.Logger.getLogger(Calibradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calibradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calibradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calibradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calibradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material;
    private javax.swing.JLabel Material1;
    private javax.swing.JButton boton_altura;
    private javax.swing.JButton boton_espesor;
    private javax.swing.JButton boton_interior;
    private javax.swing.JButton boton_pie;
    private javax.swing.JCheckBox check_mm;
    private javax.swing.JCheckBox check_plg;
    private javax.swing.JComboBox<String> combo_espe;
    private javax.swing.JComboBox<String> combo_rango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
