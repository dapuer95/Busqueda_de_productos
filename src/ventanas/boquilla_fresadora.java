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

public class boquilla_fresadora extends javax.swing.JFrame {

    public static boquilla_fresadora obj = null;
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

    public boquilla_fresadora() {
        initComponents();
        setTitle("Boquilla6 para fresadora");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static boquilla_fresadora getObj() {
        if (obj == null) {
            obj = new boquilla_fresadora();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_5c = new javax.swing.JButton();
        combo_rango = new javax.swing.JComboBox<>();
        Material = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        boton_ssc = new javax.swing.JButton();
        boton_slc = new javax.swing.JButton();
        Material1 = new javax.swing.JLabel();
        combo_boquilla = new javax.swing.JComboBox<>();
        boton_er = new javax.swing.JButton();
        boton_oz = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Material2 = new javax.swing.JLabel();
        combo_unidad = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione el tipo de boquilla");

        boton_5c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquilla5c.png"))); // NOI18N
        boton_5c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5cActionPerformed(evt);
            }
        });

        combo_rango.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_rangoItemStateChanged(evt);
            }
        });

        Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        Material.setText("Rango");

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

        boton_ssc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillasssc.png"))); // NOI18N
        boton_ssc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sscActionPerformed(evt);
            }
        });

        boton_slc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillaslc.png"))); // NOI18N
        boton_slc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_slcActionPerformed(evt);
            }
        });

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material1.setText("Tamaño boquilla");

        combo_boquilla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_boquillaItemStateChanged(evt);
            }
        });

        boton_er.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillaer.png"))); // NOI18N
        boton_er.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_erActionPerformed(evt);
            }
        });

        boton_oz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boquillaoz.png"))); // NOI18N
        boton_oz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ozActionPerformed(evt);
            }
        });

        jLabel9.setText("ER");

        jLabel10.setText("OZ");

        jLabel11.setText("5C");

        jLabel12.setText("SSC");

        jLabel13.setText("SLC");

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        Material2.setText("Unidad");

        combo_unidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_unidadItemStateChanged(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Material1)
                            .addComponent(combo_boquilla, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Material2))
                            .addComponent(combo_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Material))
                            .addComponent(combo_rango, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(boton_er, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_oz, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_5c, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(206, 206, 206)
                                .addComponent(jLabel11)
                                .addGap(115, 115, 115)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_ssc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_slc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel12)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel13)))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_er, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_oz, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_5c, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_ssc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_slc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Material)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Material1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_boquilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Material2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    private void boton_5cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5cActionPerformed
        cod = "5C";
        cargar_boquilla();
    }//GEN-LAST:event_boton_5cActionPerformed

    private void boton_sscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sscActionPerformed
        cod = "SSC";
        cargar_boquilla();
    }//GEN-LAST:event_boton_sscActionPerformed

    private void boton_slcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_slcActionPerformed
        cod = "SLC";
        cargar_boquilla();
    }//GEN-LAST:event_boton_slcActionPerformed

    private void boton_erActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_erActionPerformed
        cod = "ER";
        cargar_boquilla();
    }//GEN-LAST:event_boton_erActionPerformed

    private void boton_ozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ozActionPerformed
        cod = "OZ";
        cargar_boquilla();
    }//GEN-LAST:event_boton_ozActionPerformed

    private void combo_boquillaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_boquillaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_unidad();
        }
    }//GEN-LAST:event_combo_boquillaItemStateChanged

    private void combo_rangoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_rangoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_rangoItemStateChanged

    private void combo_unidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_unidadItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_rango();
        }
    }//GEN-LAST:event_combo_unidadItemStateChanged

    private void cargar_boquilla() {
        combo_boquilla.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct tamaño from boquilla_fresadora where (total > 0) AND (tipo = ?) order by tamaño asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst.setString(1, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String tamaño = rs.getString("tamaño");
                combo_boquilla.addItem(tamaño);
            }
            rs.close();
            cn.close();

        } catch (Exception e) {
            System.out.println("no hay conexion en llenar_acople");
        }
    }

    private void cargar_unidad() {
        combo_unidad.removeAllItems();
        try {

            //Conexión con la base de datos 
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst2 = cn2.prepareStatement("select distinct unidad from boquilla_fresadora where (total > 0) AND (tipo = ?) AND (tamaño = ?) order by unidad asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst2.setString(1, cod);
            pst2.setString(2, combo_boquilla.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String unidad = rs2.getString("unidad");
                combo_unidad.addItem(unidad);
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("no hay conexion en llenar_rango");
        }
    }

    private void cargar_rango() {
        combo_rango.removeAllItems();
        try {

            //Conexión con la base de datos 
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst3 = cn3.prepareStatement("select distinct rango from boquilla_fresadora where (total > 0) AND (tipo = ?) AND (tamaño = ?) AND (unidad = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst3.setString(1, cod);
            pst3.setString(2, combo_boquilla.getSelectedItem().toString());
            pst3.setString(3, combo_unidad.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs3 = pst3.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs3.next()) {
                String rango = rs3.getString("rango");
                combo_rango.addItem(rango);
            }
            rs3.close();
            cn3.close();

        } catch (Exception e) {
            System.out.println("no hay conexion en llenar_rango");
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
        try {
            //Conexión con la base de datos 
            Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst4 = cn4.prepareStatement("select * from boquilla_fresadora where (total > 0) AND (tipo = ?) AND (tamaño = ?) AND (unidad = ?) AND (rango = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, combo_boquilla.getSelectedItem().toString());
            pst4.setString(3, combo_unidad.getSelectedItem().toString());
            pst4.setString(4, combo_rango.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs4 = pst4.executeQuery();

            //Se limpian los componentes de la tabla luego de cada busqueda 
            //combobox2.removeAllItems();
            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);
            PropiedadesTabla();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs4.next()) {

                //txt_codigo.setText(rs.getString("codigo"));
                String cod = rs4.getString("codigo");
                String estado = rs4.getString("descripcion");
                String total = rs4.getString("total");
                String me = rs4.getString("me");
                String ca = rs4.getString("ca");
                String bo = rs4.getString("bo");
                String ma = rs4.getString("ma");

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
            }
            rs4.close();
            cn4.close();
        } catch (Exception e) {
            System.out.println("no hay conexion en buscar");
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
                    InformacionBoquillaFresadora informacionboquillafresadora = new InformacionBoquillaFresadora();
                    informacionboquillafresadora.setVisible(true);
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
            java.util.logging.Logger.getLogger(boquilla_fresadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boquilla_fresadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boquilla_fresadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boquilla_fresadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boquilla_fresadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material;
    private javax.swing.JLabel Material1;
    private javax.swing.JLabel Material2;
    private javax.swing.JButton boton_5c;
    private javax.swing.JButton boton_er;
    private javax.swing.JButton boton_oz;
    private javax.swing.JButton boton_slc;
    private javax.swing.JButton boton_ssc;
    private javax.swing.JComboBox<String> combo_boquilla;
    private javax.swing.JComboBox<String> combo_rango;
    private javax.swing.JComboBox<String> combo_unidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
