package ventanas;

import java.awt.Color;
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

public class Sierras1 extends javax.swing.JFrame {

    public static Sierras1 obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String pas = "";
    public static String cod2 = "";
    public static String tip = "";
    public static String descripcion = new String();
    double valor;
    double valor2;
    double valor1;
    double valor21;

    //public String cod = new String();
    public String port = new String();
    public static String codigo2 = new String();

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

    public Sierras1() {
        initComponents();
        setTitle("sierras cinta");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        bloquear();
    }

    public static Sierras1 getObj() {
        if (obj == null) {
            obj = new Sierras1();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        check_dim = new javax.swing.JCheckBox();
        check_apli = new javax.swing.JCheckBox();
        txt_diametro = new javax.swing.JTextField();
        label_paso = new javax.swing.JLabel();
        combo_paso = new javax.swing.JComboBox<>();
        combo_ancho = new javax.swing.JComboBox<>();
        label_ancho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        label_diametro = new javax.swing.JLabel();
        label_espesor = new javax.swing.JLabel();
        combo_espesor = new javax.swing.JComboBox<>();
        boton_perfil = new javax.swing.JButton();
        boton_solido = new javax.swing.JButton();
        label_solido = new javax.swing.JLabel();
        label_perfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        check_dim.setText("Dimensiones");
        check_dim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_dimItemStateChanged(evt);
            }
        });

        check_apli.setText("Aplicación");
        check_apli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_apliItemStateChanged(evt);
            }
        });

        txt_diametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_diametroKeyReleased(evt);
            }
        });

        label_paso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dientes_sierra.png"))); // NOI18N
        label_paso.setText("Paso");

        combo_paso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_pasoItemStateChanged(evt);
            }
        });

        combo_ancho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_anchoItemStateChanged(evt);
            }
        });

        label_ancho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        label_ancho.setText("Ancho");

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

        label_diametro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        label_diametro.setText("Diámetro");

        label_espesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        label_espesor.setText("Espesor del perfil");

        combo_espesor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espesorItemStateChanged(evt);
            }
        });

        boton_perfil.setBackground(new java.awt.Color(255, 255, 255));
        boton_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tubo_icono.png"))); // NOI18N
        boton_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_perfilActionPerformed(evt);
            }
        });

        boton_solido.setBackground(new java.awt.Color(255, 255, 255));
        boton_solido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/solido_icono.png"))); // NOI18N
        boton_solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_solidoActionPerformed(evt);
            }
        });

        label_solido.setText("Solido");

        label_perfil.setText("Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_apli)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(label_solido)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_perfil)
                                    .addComponent(check_dim)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_solido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_diametro))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_espesor)
                                    .addComponent(combo_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_paso)
                                    .addComponent(combo_paso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_ancho)
                                    .addComponent(combo_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_dim)
                    .addComponent(check_apli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_solido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_perfil, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_solido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_diametro)
                                        .addComponent(label_espesor))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combo_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_ancho)
                                        .addGap(32, 32, 32))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_paso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo_paso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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
        total.setMaxWidth(50);
        me.setMaxWidth(50);
        bo.setMaxWidth(27);
        ca.setMaxWidth(27);
        ma.setMaxWidth(27);
    }


    private void check_dimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_dimItemStateChanged
        cargar_paso_dim();
        bloquear();
        if (check_dim.isSelected() == true) {
            check_apli.setEnabled(false);
            boton_solido.setEnabled(false);
            boton_perfil.setEnabled(false);
            txt_diametro.setEnabled(false);
            combo_espesor.setEnabled(false);
            combo_paso.setEnabled(true);
            combo_ancho.setEnabled(true);
            label_solido.setEnabled(false);
            label_perfil.setEnabled(false);
            label_diametro.setEnabled(false);
            label_paso.setEnabled(true);
            label_espesor.setEnabled(false);
            label_ancho.setEnabled(true);
        } else {
            check_apli.setEnabled(true);
        }
    }//GEN-LAST:event_check_dimItemStateChanged

    private void check_apliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_apliItemStateChanged
        bloquear();
        if (check_apli.isSelected() == true) {
            check_dim.setEnabled(false);
            boton_solido.setEnabled(true);
            boton_perfil.setEnabled(true);
            txt_diametro.setEnabled(true);
            combo_espesor.setEnabled(true);
            combo_paso.setEnabled(true);
            combo_ancho.setEnabled(true);
            label_solido.setEnabled(true);
            label_perfil.setEnabled(true);
            label_diametro.setEnabled(true);
            label_paso.setEnabled(true);
            label_espesor.setEnabled(true);
            label_ancho.setEnabled(true);
        } else {
            check_dim.setEnabled(true);
        }
    }//GEN-LAST:event_check_apliItemStateChanged

    private void bloquear() {
        if (check_apli.isSelected() == false && check_apli.isSelected() == false) {
            boton_solido.setEnabled(false);
            boton_perfil.setEnabled(false);
            txt_diametro.setEnabled(false);
            combo_espesor.setEnabled(false);
            combo_paso.setEnabled(false);
            combo_ancho.setEnabled(false);
            label_solido.setEnabled(false);
            label_perfil.setEnabled(false);
            label_diametro.setEnabled(false);
            label_paso.setEnabled(false);
            label_espesor.setEnabled(false);
            label_ancho.setEnabled(false);
        }
    }

    private void combo_pasoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_pasoItemStateChanged
        if (check_dim.isSelected() == true) {
            cargar_ancho_dim();
        }
        if (check_apli.isSelected() == true) {
            cargar_ancho();
        }
    }//GEN-LAST:event_combo_pasoItemStateChanged

    private void combo_anchoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_anchoItemStateChanged
        if (check_dim.isSelected() == true) {
            buscar_dim();
        }
        if (check_apli.isSelected() == true) {
            buscar();
        }
    }//GEN-LAST:event_combo_anchoItemStateChanged

    private void txt_diametroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diametroKeyReleased
        cargar_relleno();
    }//GEN-LAST:event_txt_diametroKeyReleased

    private void combo_espesorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espesorItemStateChanged
        cargar_paso();
    }//GEN-LAST:event_combo_espesorItemStateChanged

    private void boton_solidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_solidoActionPerformed
        tip = "Solido";
        boton_solido.setBackground(Color.blue);
        boton_perfil.setBackground(Color.white);
        combo_espesor.setEnabled(false);
    }//GEN-LAST:event_boton_solidoActionPerformed

    private void boton_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_perfilActionPerformed
        tip = "Perfil";
        boton_perfil.setBackground(Color.blue);
        boton_solido.setBackground(Color.white);
        combo_espesor.setEnabled(true);
    }//GEN-LAST:event_boton_perfilActionPerformed

    private void cargar_paso_dim() {
        String k = "Bimetalica";
        combo_paso.removeAllItems();
        if (check_dim.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct paso from sierra_cinta_esp_dim where (total > 0) AND (especificacion = ?)order by paso asc");

                pst.setString(1, k);
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String paso = rs.getString("paso");
                    combo_paso.addItem(paso);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_paso_dim");
            }
        }
    }

    private void cargar_ancho_dim() {
        String k = "Bimetalica";
        combo_ancho.removeAllItems();
        if (check_dim.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct ancho from sierra_cinta_esp_dim where (total > 0) AND (especificacion = ?) AND (paso = ?) order by ancho asc");

                pst.setString(1, k);
                pst.setString(2, combo_paso.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {

                    String ancho = rs.getString("ancho");
                    combo_ancho.addItem(ancho);
                    //System.out.println(paso);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_ancho_dim");
            }
        }
    }

    private void buscar_dim() {
        String kp = "Bimetalica";
        if (check_dim.isSelected() == true) {
            try {
                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst5 = cn5.prepareStatement("select * from sierra_cinta_esp_dim where (total > 0) AND (especificacion = ?) AND (paso = ?) AND (ancho = ?)");

                pst5.setString(1, kp);
                pst5.setString(2, combo_paso.getSelectedItem().toString());
                pst5.setString(3, combo_ancho.getSelectedItem().toString());

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

                    String cod = rs5.getString("codigo");
                    String estado = rs5.getString("descripcion");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});

                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {

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
                    InformacionInsertosr informacioninsertos = new InformacionInsertosr();
                    informacioninsertos.setVisible(true);
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

    private void cargar_paso() {
        combo_paso.removeAllItems();
        if (check_apli.isSelected() == true && tip.equals("Solido")) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct paso from sierra_cinta_esp where (total > 0) AND (mins <= ?) AND (maxs >= ?) AND (tipo = ?) order by paso asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                //cod2 = txt_paso.getText();
                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                pst.setString(3, tip);

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String paso = rs.getString("paso");
                    combo_paso.addItem(paso);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_paso");
            }
        }
        if (check_apli.isEnabled() == true && tip.equals("Perfil")) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct paso from sierra_cinta_esp where (total > 0) AND (minp <= ?) AND (maxp >= ?) AND (tipo = ?) AND (pared= ?) order by paso asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                pst.setString(3, tip);
                pst.setString(4, combo_espesor.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String paso = rs.getString("paso");
                    combo_paso.addItem(paso);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_paso_dim");
            }
        }
    }

    private void cargar_espesor() {
        combo_espesor.removeAllItems();
        if (check_apli.isEnabled() == true && tip.equals("Perfil")) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct pared from sierra_cinta_esp where (total > 0) AND (minp <= ?) AND (maxp >= ?) AND (tipo = ?) order by pared asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                pst.setString(3, tip);

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {

                    String espesor = rs.getString("pared");
                    combo_espesor.addItem(espesor);
                    //System.out.println(paso);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espesor_dim");
            }
        }
    }

    private void cargar_ancho() {
        combo_ancho.removeAllItems();
        if (check_apli.isSelected() == true && tip.equals("Solido")) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct ancho from sierra_cinta_esp where (total > 0) AND (mins <= ?) AND (maxs >= ?) AND (paso = ?) AND (tipo = ?) order by ancho asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                //cod2 = txt_paso.getText();
                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                pst.setString(3, combo_paso.getSelectedItem().toString());
                pst.setString(4, tip);

                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String ancho = rs.getString("ancho");
                    combo_ancho.addItem(ancho);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_ancho");
            }
        }

        if (check_apli.isEnabled() == true && tip.equals("Perfil")) {
            try {
                //Conexión con la base de datos
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst = cn.prepareStatement("select distinct ancho from sierra_cinta_esp where (total > 0) AND (minp <= ?) AND (maxp >= ?) AND (tipo = ?) AND (pared = ?) AND (paso = ?) order by ancho asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);

                pst.setDouble(1, valor);
                pst.setDouble(2, valor2);
                pst.setString(3, tip);
                pst.setString(4, combo_espesor.getSelectedItem().toString());
                pst.setString(5, combo_paso.getSelectedItem().toString());

                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String ancho = rs.getString("ancho");
                    combo_ancho.addItem(ancho);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_ancho_dim");
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
        if (check_apli.isSelected() == true && tip.equals("Solido")) {
            try {
                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst5 = cn5.prepareStatement("select * from sierra_cinta_esp where (total > 0) AND (mins <= ?) AND (maxs >= ?) AND (paso = ?) AND (ancho = ?) AND (tipo = ?)");

                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);
                pst5.setDouble(1, valor);
                pst5.setDouble(2, valor2);
                pst5.setString(3, combo_paso.getSelectedItem().toString());
                pst5.setString(4, combo_ancho.getSelectedItem().toString());
                pst5.setString(5, tip);

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

                    String cod = rs5.getString("codigo");
                    String estado = rs5.getString("descripcion");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});

                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {

            }
        }

        if (check_apli.isEnabled() == true && tip.equals("Perfil")) {
            try {

                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst5 = cn5.prepareStatement("select * from sierra_cinta_esp where (total > 0) AND (minp <= ?) AND (maxp >= ?) AND (paso = ?) AND (ancho = ?) AND (tipo = ?) AND (pared = ?)");

                String texto = txt_diametro.getText();
                String texto2 = txt_diametro.getText();

                valor = Double.parseDouble(texto);
                valor2 = Double.parseDouble(texto2);
                pst5.setDouble(1, valor);
                pst5.setDouble(2, valor2);
                pst5.setString(3, combo_paso.getSelectedItem().toString());
                pst5.setString(4, combo_ancho.getSelectedItem().toString());
                pst5.setString(5, tip);
                pst5.setString(6, combo_espesor.getSelectedItem().toString());

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

                    String cod = rs5.getString("codigo");
                    String estado = rs5.getString("descripcion");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});

                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {

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
                    InformacionInsertosr informacioninsertos = new InformacionInsertosr();
                    informacioninsertos.setVisible(true);
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

    private void cargar_relleno() {
        if (check_apli.isEnabled() == true && tip.equals("Solido")) {
            cargar_paso();
        }
        if (check_apli.isEnabled() == true && tip.equals("Perfil")) {
            cargar_espesor();
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
            java.util.logging.Logger.getLogger(Sierras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sierras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sierras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sierras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sierras1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_perfil;
    private javax.swing.JButton boton_solido;
    private javax.swing.JCheckBox check_apli;
    private javax.swing.JCheckBox check_dim;
    private javax.swing.JComboBox<String> combo_ancho;
    private javax.swing.JComboBox<String> combo_espesor;
    private javax.swing.JComboBox<String> combo_paso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_ancho;
    private javax.swing.JLabel label_diametro;
    private javax.swing.JLabel label_espesor;
    private javax.swing.JLabel label_paso;
    private javax.swing.JLabel label_perfil;
    private javax.swing.JLabel label_solido;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_diametro;
    // End of variables declaration//GEN-END:variables
}
