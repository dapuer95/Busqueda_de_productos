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

public class Copas extends javax.swing.JFrame {

    public static Copas obj = null;
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

    public Copas() {
        initComponents();
        setTitle("Copa / Mandril");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        check_plg.setSelected(true);
    }

    public static Copas getObj() {
        if (obj == null) {
            obj = new Copas();
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
        boton_autoindependiente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combo_diametro = new javax.swing.JComboBox<>();
        Material1 = new javax.swing.JLabel();
        check_plg = new javax.swing.JCheckBox();
        check_mm = new javax.swing.JCheckBox();
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
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        jLabel4.setText("Independiente");

        jLabel5.setText("Autocentrante");

        boton_autoindependiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa_autoindependiente.png"))); // NOI18N
        boton_autoindependiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_autoindependienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Autoindependiente");

        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        Material1.setText("Diámetro");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Material1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(check_plg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(check_mm))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)))
                            .addComponent(boton_independiente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_autoindependiente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(boton_autoindependiente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_plg)
                    .addComponent(check_mm)
                    .addComponent(Material1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void boton_autoindependienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_autoindependienteActionPerformed
        cod = "Autoindependiente";
        cargar_diametro();
    }//GEN-LAST:event_boton_autoindependienteActionPerformed

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
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

    private void cargar_diametro() {
        combo_diametro.removeAllItems();
        if (check_plg.isSelected() == true) {

            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct diametroplg from copas where (total > 0) AND (tipo= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, cod);

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String diametro = rs2.getString("diametroplg");
                    combo_diametro.addItem(diametro);
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
                PreparedStatement pst2 = cn2.prepareStatement("select distinct diametromm from copas where (total > 0) AND (tipo= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst2.setString(1, cod);
                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String diametro = rs2.getString("diametromm");
                    combo_diametro.addItem(diametro);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_diametro");
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
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select * from copas where (total > 0) AND (tipo= ?) AND (diametroplg= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst5.setString(1, cod);
                pst5.setString(2, combo_diametro.getSelectedItem().toString());

                // Declaración de la variable que alberga el resultado de la busqueda
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
                System.out.println("no hay conexion en buscar");
            }
        }

        if (check_mm.isSelected() == true) {
            try {

                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select * from copas where (total > 0) AND (tipo= ?) AND (diametromm= ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst5.setString(1, cod);
                pst5.setString(2, combo_diametro.getSelectedItem().toString());

                // Declaración de la variable que alberga el resultado de la busqueda
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
                    InformacionCopas informacioncopas = new InformacionCopas();
                    informacioncopas.setVisible(true);
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
            java.util.logging.Logger.getLogger(Copas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Copas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Copas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Copas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Copas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material1;
    private javax.swing.JButton boton_autocentrante;
    private javax.swing.JButton boton_autoindependiente;
    private javax.swing.JButton boton_independiente;
    private javax.swing.JCheckBox check_mm;
    private javax.swing.JCheckBox check_plg;
    private javax.swing.JComboBox<String> combo_diametro;
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
