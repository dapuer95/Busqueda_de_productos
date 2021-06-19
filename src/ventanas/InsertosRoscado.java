package ventanas;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class InsertosRoscado extends javax.swing.JFrame {

    public static InsertosRoscado obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String pas = "";
    public static String cod2 = "";
    public static String descripcion = new String();
    double valor;
    double valor2;
    double valor1;
    double valor21;

    public String port = new String();
    public static String codigo2 = new String();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Rango mm", "Rango TPI", "Info", "Cotizar", "Total", "Me", "Ca", "Bo", "Ma"};
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
            if (columnas == 11) {
                return true;
            } else {
                return false;
            }
        }
    };

    /**
     * Creates new form InsertosRoscado2
     */
    public InsertosRoscado() {
        initComponents();
        setTitle("Insertos de roscado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static InsertosRoscado getObj() {
        if (obj == null) {
            obj = new InsertosRoscado();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_paso = new javax.swing.JLabel();
        check_mm = new javax.swing.JCheckBox();
        check_tpi = new javax.swing.JCheckBox();
        txt_paso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo_longitud = new javax.swing.JComboBox<>();
        combo_material = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_paso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paso_icono.png"))); // NOI18N
        label_paso.setText("Paso");

        check_mm.setText("mm");
        check_mm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_mmItemStateChanged(evt);
            }
        });

        check_tpi.setText("TPI");
        check_tpi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_tpiItemStateChanged(evt);
            }
        });

        txt_paso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pasoKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        jLabel2.setText("Longitud");

        combo_longitud.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_longitudItemStateChanged(evt);
            }
        });

        combo_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_materialItemStateChanged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material2_icono.png"))); // NOI18N
        jLabel3.setText("Material");

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Rango mm", "Rango TPI", "Info", "Cotizar", "Total", "Me", "Ca", "Bo", "Ma"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);
        if (tabla_resultados.getColumnModel().getColumnCount() > 0) {
            tabla_resultados.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(70);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(70);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(9).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(10).setMaxWidth(27);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_mm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_tpi))
                            .addComponent(txt_paso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(label_paso)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_paso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_mm)
                            .addComponent(check_tpi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_paso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PropiedadesTabla() {
        tabla_resultados.setRowHeight(26);
        TableColumn codigo = tabla_resultados.getColumn("Codigo");
        TableColumn desc = tabla_resultados.getColumn("Descripción");
        TableColumn rangmm = tabla_resultados.getColumn("Rango mm");
        TableColumn rangplg = tabla_resultados.getColumn("Rango TPI");
        TableColumn info = tabla_resultados.getColumn("Info");
        TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
        TableColumn total = tabla_resultados.getColumn("Total");
        TableColumn me = tabla_resultados.getColumn("Me");
        TableColumn ca = tabla_resultados.getColumn("Ca");
        TableColumn bo = tabla_resultados.getColumn("Bo");
        TableColumn ma = tabla_resultados.getColumn("Ma");
        codigo.setMaxWidth(50);
        rangmm.setMaxWidth(75);
        rangplg.setMaxWidth(70);
        info.setMaxWidth(40);
        cotizar.setMaxWidth(50);
        total.setMaxWidth(38);
        me.setMaxWidth(27);
        bo.setMaxWidth(27);
        ca.setMaxWidth(27);
        ma.setMaxWidth(27);
    }


    private void check_mmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_mmItemStateChanged
        if (check_mm.isSelected() == true) {
            check_tpi.setEnabled(false);
            txt_paso.setEnabled(true);
            label_paso.setText("Paso");
        } else {
            check_tpi.setEnabled(true);
        }
        if (check_mm.isSelected() == false && check_tpi.isSelected() == false) {
            txt_paso.setEnabled(false);
        }
    }//GEN-LAST:event_check_mmItemStateChanged

    private void check_tpiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_tpiItemStateChanged
        if (check_tpi.isSelected() == true) {
            check_mm.setEnabled(false);
            txt_paso.setEnabled(true);
            label_paso.setText("TPI");
        } else {
            check_mm.setEnabled(true);
        }
        if (check_mm.isSelected() == false && check_tpi.isSelected() == false) {
            txt_paso.setEnabled(false);
        }

    }//GEN-LAST:event_check_tpiItemStateChanged

    private void combo_longitudItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_longitudItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_material();
        }
    }//GEN-LAST:event_combo_longitudItemStateChanged

    private void combo_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_materialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_materialItemStateChanged

    private void txt_pasoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pasoKeyReleased
        cargar_paso();
    }//GEN-LAST:event_txt_pasoKeyReleased

    private void cargar_longitud() {
        combo_longitud.removeAllItems();
        if (check_tpi.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct longitud from insertosr where (total > 0) AND (tpiminimo <= ?) AND (tpimaximo >= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_paso.getText();
                String texto2 = txt_paso.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                System.out.println(valor);
                System.out.println(valor2);

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {

                    String lon = rs.getString("longitud");
                    //listalon.add(lon);
                    combo_longitud.addItem(lon);
                    System.out.println(lon);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar longitud check tpi");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct longitud from insertosr where (total > 0) AND (pasominimo <= ?) AND (pasomaximo >= ?) ");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_paso.getText();
                String texto2 = txt_paso.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst2.setDouble(1, valor);
                pst2.setDouble(2, valor2);
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String lon = rs2.getString("longitud");
                    combo_longitud.addItem(lon);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar longitud check mm");
            }
        }
    }

    private void cargar_material() {
        combo_material.removeAllItems();
        if (check_mm.isEnabled()) {
            try {
                //Conexión con la base de datos
                Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst3 = cn3.prepareStatement("select distinct material1 from insertosr where (total > 0) AND (pasominimo <= ?) AND (pasomaximo >= ?) AND (longitud = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_paso.getText();
                String texto2 = txt_paso.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst3.setDouble(1, valor);
                pst3.setDouble(2, valor2);
                pst3.setString(3, combo_longitud.getSelectedItem().toString());

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
                System.out.println("Se perdio la conexión en cargar_material check mm");
            }
        }

        if (check_tpi.isEnabled()) {
            try {
                //Conexión con la base de datos
                Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst4 = cn4.prepareStatement("select distinct material1 from insertosr where (total > 0) AND (tpiminimo <= ?) AND (tpimaximo >= ?) AND (longitud = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_paso.getText();
                String texto2 = txt_paso.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst4.setDouble(1, valor);
                pst4.setDouble(2, valor2);
                pst4.setString(3, combo_longitud.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs4 = pst4.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs4.next()) {
                    String mat = rs4.getString("material1");
                    combo_material.addItem(mat);
                }
                rs4.close();
                cn4.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_material check pti");
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
        if (check_tpi.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst5 = cn5.prepareStatement("select * from insertosr where (total > 0) AND (tpiminimo <= ?) AND (tpimaximo >= ?) AND (longitud = ?) AND (material1 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst5.setDouble(1, valor);
                pst5.setDouble(2, valor2);
                pst5.setString(3, combo_longitud.getSelectedItem().toString());
                pst5.setString(4, combo_material.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs5 = pst5.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs5.getString("codigo");
                    String estado = rs5.getString("descripcion");
                    String rpaso = rs5.getString("rangopaso");
                    String rtpi = rs5.getString("rangotpi");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos[] = {cod, estado, rpaso, rtpi};
                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, rpaso, rtpi, icono1, icono2, total, me, ca, bo, ma});
                }

                PreparedStatement pst6 = cn5.prepareStatement("select * from insertosr where (total > 0) AND (tpiminimo <= ?) AND (tpimaximo >= ?) AND (longitud = ?) AND (material2 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst6.setDouble(1, valor);
                pst6.setDouble(2, valor2);
                pst6.setString(3, combo_longitud.getSelectedItem().toString());
                pst6.setString(4, combo_material.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs6 = pst6.executeQuery();

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs6.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs6.getString("codigo");
                    String estado = rs6.getString("descripcion");
                    String rpaso = rs6.getString("rangopaso");
                    String rtpi = rs6.getString("rangotpi");
                    String total = rs6.getString("total");
                    String me = rs6.getString("me");
                    String ca = rs6.getString("ca");
                    String bo = rs6.getString("bo");
                    String ma = rs6.getString("ma");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos2[] = {cod, estado, rpaso, rtpi};
                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, rpaso, rtpi, icono1, icono2, total, me, ca, bo, ma});
                    //model.addRow(datos2);
                }
                rs5.close();
                rs6.close();
                cn5.close();
            } catch (Exception e) {

            }
            //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click
            tabla_resultados.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                    int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                    int columna_point = tabla_resultados.columnAtPoint(e.getPoint());

                    if (fila_point > -1 && columna_point == 4) {
                        codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        InformacionInsertosr informacioninsertos = new InformacionInsertosr();
                        informacioninsertos.setVisible(true);
                        codigo2 = "";
                    }

                    if (fila_point > -1 && columna_point == 5) {
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

        if (check_mm.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn7 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst7 = cn7.prepareStatement("select * from insertosr where (total > 0) AND (pasominimo <= ?) AND (pasomaximo >= ?) AND (longitud = ?) AND (material1 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst7.setDouble(1, valor);
                pst7.setDouble(2, valor2);
                pst7.setString(3, combo_longitud.getSelectedItem().toString());
                pst7.setString(4, combo_material.getSelectedItem().toString());

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
                    String rpaso = rs7.getString("rangopaso");
                    String rtpi = rs7.getString("rangotpi");
                    String total = rs7.getString("total");
                    String me = rs7.getString("me");
                    String ca = rs7.getString("ca");
                    String bo = rs7.getString("bo");
                    String ma = rs7.getString("ma");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos[] = {cod, estado, rpaso, rtpi};
                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, rpaso, rtpi, icono1, icono2, total, me, ca, bo, ma});

                }

                PreparedStatement pst8 = cn7.prepareStatement("select * from insertosr where (total > 0) AND (pasominimo <= ?) AND (pasomaximo >= ?) AND (longitud = ?) AND (material2 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst8.setDouble(1, valor);
                pst8.setDouble(2, valor2);
                pst8.setString(3, combo_longitud.getSelectedItem().toString());
                pst8.setString(4, combo_material.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs8 = pst8.executeQuery();

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs8.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs8.getString("codigo");
                    String estado = rs8.getString("descripcion");
                    String rpaso = rs8.getString("rangopaso");
                    String rtpi = rs8.getString("rangotpi");
                    String total = rs8.getString("total");
                    String me = rs8.getString("me");
                    String ca = rs8.getString("ca");
                    String bo = rs8.getString("bo");
                    String ma = rs8.getString("ma");

                    //Coloca los resultados encontrado en la tabla creada previamente
                    String datos2[] = {cod, estado, rpaso, rtpi};
                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, rpaso, rtpi, icono1, icono2, total, me, ca, bo, ma});
                    //model.addRow(datos2);
                }
                rs7.close();
                rs8.close();
                cn7.close();
            } catch (Exception e) {
            }
            //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click
            tabla_resultados.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                    int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                    int columna_point = tabla_resultados.columnAtPoint(e.getPoint());

                    if (fila_point > -1 && columna_point == 4) {
                        codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        InformacionInsertosr informacioninsertos = new InformacionInsertosr();
                        informacioninsertos.setVisible(true);
                        codigo2 = "";
                    }

                    if (fila_point > -1 && columna_point == 5) {
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

    private void cargar_paso() {
        if (check_mm.isEnabled() == true) {
            cargar_longitud();
        }
        if (check_tpi.isEnabled() == true) {
            cargar_longitud();
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
            java.util.logging.Logger.getLogger(InsertosRoscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertosRoscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertosRoscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertosRoscado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertosRoscado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_mm;
    private javax.swing.JCheckBox check_tpi;
    private javax.swing.JComboBox<String> combo_longitud;
    private javax.swing.JComboBox<String> combo_material;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_paso;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_paso;
    // End of variables declaration//GEN-END:variables
}
