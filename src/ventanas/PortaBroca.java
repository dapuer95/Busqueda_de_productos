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

public class PortaBroca extends javax.swing.JFrame {

    public static int k = 0;
    public String form = "";
    public static PortaBroca obj = null;
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

    public PortaBroca() {
        initComponents();
        setTitle("Porta broca");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        cargar_tipo();
        cargar_imagen();
    }

    public static PortaBroca getObj() {
        if (obj == null) {
            obj = new PortaBroca();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_rango = new javax.swing.JComboBox<>();
        Material = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        check_mm = new javax.swing.JCheckBox();
        check_plg = new javax.swing.JCheckBox();
        Material1 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        Material2 = new javax.swing.JLabel();
        combo_sujecion = new javax.swing.JComboBox<>();
        label_dim = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione los parámetros del porta broca ");

        combo_rango.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_rangoItemStateChanged(evt);
            }
        });

        Material.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material.setText("    Rango");

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

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material1.setText("Tipo");

        combo_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipoItemStateChanged(evt);
            }
        });

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        Material2.setText("Sujeción");

        combo_sujecion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_sujecionItemStateChanged(evt);
            }
        });

        label_dim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ajuste rapido.png"))); // NOI18N

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
                .addGap(29, 29, 29)
                .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Material1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check_mm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_plg))
                            .addComponent(combo_rango, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Material)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_sujecion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Material2))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Material2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_sujecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Material1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Material)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(check_plg)
                                    .addComponent(check_mm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
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

    private void cargar_imagen() {
        form = combo_tipo.getSelectedItem().toString();
        ImageIcon imagen1 = new ImageIcon("src/images/porta_broca_" + form + ".png");
        Icon icono1 = new ImageIcon(imagen1.getImage());
        label_dim.setIcon(icono1);
    }

    private void check_mmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_mmItemStateChanged
        // TODO add your handling code here:
        if (check_mm.isSelected() == true) {
            check_plg.setEnabled(false);
            cargar_rango();
        } else {
            check_plg.setEnabled(true);
        }
    }//GEN-LAST:event_check_mmItemStateChanged

    private void check_plgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_plgItemStateChanged
        // TODO add your handling code here:
        if (check_plg.isSelected() == true) {
            check_mm.setEnabled(false);
            cargar_rango();
        } else {
            check_mm.setEnabled(true);
        }
    }//GEN-LAST:event_check_plgItemStateChanged

    private void combo_rangoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_rangoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_sujecion();
        }
    }//GEN-LAST:event_combo_rangoItemStateChanged

    private void combo_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipoItemStateChanged
        cargar_rango();
        cargar_imagen();
    }//GEN-LAST:event_combo_tipoItemStateChanged

    private void combo_sujecionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_sujecionItemStateChanged
        buscar();
    }//GEN-LAST:event_combo_sujecionItemStateChanged

    private void cargar_tipo() {
        combo_tipo.removeAllItems();
        try {
            //Conexión con la base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst = cn.prepareStatement("select distinct tipo from porta_broca where (total > 0) order by tipo asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                combo_tipo.addItem(tipo);
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_tipo");
        }
    }

    private void cargar_rango() {
        combo_rango.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct rangoplg from porta_broca where (total > 0) AND (tipo= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, combo_tipo.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String rangoplg = rs2.getString("rangoplg");
                    combo_rango.addItem(rangoplg);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_rango check_plg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst3 = cn3.prepareStatement("select distinct rangomm from porta_broca where (total > 0) AND (tipo= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                //cod2 = txt_paso.getText();
                pst3.setString(1, combo_tipo.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs3 = pst3.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs3.next()) {
                    String rangomm = rs3.getString("rangomm");
                    combo_rango.addItem(rangomm);
                }
                rs3.close();
                cn3.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_rango check_mm");
            }
        }
    }

    private void cargar_sujecion() {
        combo_sujecion.removeAllItems();
        if (check_plg.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst4 = cn4.prepareStatement("select distinct sujecion from porta_broca where (total > 0) AND (tipo= ?) AND (rangoplg=?) order by sujecion asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                //cod2 = txt_paso.getText();
                pst4.setString(1, combo_tipo.getSelectedItem().toString());
                pst4.setString(2, combo_rango.getSelectedItem().toString());
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs4 = pst4.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs4.next()) {
                    String sujecion = rs4.getString("sujecion");
                    combo_sujecion.addItem(sujecion);
                }
                rs4.close();
                cn4.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_sujecion check_plg");
            }
        }

        if (check_mm.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select distinct sujecion from porta_broca where (total > 0) AND (tipo= ?) AND (rangomm=?) order by sujecion asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst5.setString(1, combo_tipo.getSelectedItem().toString());
                pst5.setString(2, combo_rango.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs5 = pst5.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {
                    String sujecion = rs5.getString("sujecion");
                    combo_sujecion.addItem(sujecion);
                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_sujecion check_mm");
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
                Connection cn6 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst6 = cn6.prepareStatement("select * from porta_broca where (total > 0) AND (tipo= ?) AND (rangoplg=?) AND (sujecion=?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst6.setString(1, combo_tipo.getSelectedItem().toString());
                pst6.setString(2, combo_rango.getSelectedItem().toString());
                pst6.setString(3, combo_sujecion.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs6 = pst6.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs6.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs6.getString("codigo");
                    String estado = rs6.getString("descripcion");
                    String total = rs6.getString("total");
                    String me = rs6.getString("me");
                    String ca = rs6.getString("ca");
                    String bo = rs6.getString("bo");
                    String ma = rs6.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
                }
                rs6.close();
                cn6.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check_plg");
            }
        }

        if (check_mm.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn7 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst7 = cn7.prepareStatement("select * from porta_broca where (total > 0) AND (tipo= ?) AND (rangomm=?) AND (sujecion=?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst7.setString(1, combo_tipo.getSelectedItem().toString());
                pst7.setString(2, combo_rango.getSelectedItem().toString());
                pst7.setString(3, combo_sujecion.getSelectedItem().toString());

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
                rs7.close();
                cn7.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check_mm");
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
                    InformacionPortaBroca informacionportabroca = new InformacionPortaBroca();
                    informacionportabroca.setVisible(true);
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
            java.util.logging.Logger.getLogger(PortaBroca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PortaBroca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PortaBroca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PortaBroca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PortaBroca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material;
    private javax.swing.JLabel Material1;
    private javax.swing.JLabel Material2;
    private javax.swing.JCheckBox check_mm;
    private javax.swing.JCheckBox check_plg;
    private javax.swing.JComboBox<String> combo_rango;
    private javax.swing.JComboBox<String> combo_sujecion;
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_dim;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
