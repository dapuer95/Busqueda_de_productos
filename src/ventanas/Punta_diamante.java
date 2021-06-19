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

public class Punta_diamante extends javax.swing.JFrame {
    
    public static Punta_diamante obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String cod_bus = "";
    public static String descripcion = new String();
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción","Info", "Cotizar", "Total", "Me", "Ca", "Bo", "Ma"};
    DefaultTableModel model = new DefaultTableModel(data, cabeza) {

        //Metodo que permite que no se púeda editar los valores de la tabla
        @Override
        public Class getColumnClass(int indiceColumna){
            Object k = getValueAt(0, indiceColumna);
            if(k == null){
                return Object.class;
            }else{
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

    public Punta_diamante() {
        initComponents();
        setTitle("Punta de diamante");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    public static Punta_diamante getObj(){
        if(obj == null){
            obj = new Punta_diamante();
        }return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        combo_diametro = new javax.swing.JComboBox<>();
        Material1 = new javax.swing.JLabel();
        check_kilates = new javax.swing.JCheckBox();
        check_diametro = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        Material2 = new javax.swing.JLabel();
        combo_kilates = new javax.swing.JComboBox<>();
        Material3 = new javax.swing.JLabel();
        combo_espesor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione las caracteristicas de la punta");

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

        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N

        check_kilates.setText("Buscar por Kilates");
        check_kilates.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_kilatesItemStateChanged(evt);
            }
        });

        check_diametro.setText("Buscar por dimensiones de la rueda");
        check_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_diametroItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punta_diamante.png"))); // NOI18N

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N

        combo_kilates.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_kilatesItemStateChanged(evt);
            }
        });

        Material3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N

        combo_espesor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espesorItemStateChanged(evt);
            }
        });

        jLabel3.setText("Espesor (mm)");

        jLabel4.setText("Kilates");

        jLabel5.setText("Diámetro (mm)");

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
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check_kilates)
                        .addGap(44, 44, 44)
                        .addComponent(check_diametro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_kilates, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Material1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Material2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Material3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(combo_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check_diametro)
                    .addComponent(check_kilates))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Material1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_kilates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Material2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Material3)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_espesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
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
    
    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_espesor();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

    private void check_kilatesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_kilatesItemStateChanged
        // TODO add your handling code here:
        if (check_kilates.isSelected() == true) {
            check_diametro.setEnabled(false);
            combo_diametro.setEnabled(false);
            cargar_kilates();
        } else {
            check_diametro.setEnabled(true);
            combo_diametro.setEnabled(true);
        }
    }//GEN-LAST:event_check_kilatesItemStateChanged

    private void check_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_diametroItemStateChanged
        // TODO add your handling code here:
        if (check_diametro.isSelected() == true) {
            check_kilates.setEnabled(false);
            combo_kilates.setEnabled(false);
            cargar_diametro();
        } else {
            check_kilates.setEnabled(true);
            combo_kilates.setEnabled(true);
        }
    }//GEN-LAST:event_check_diametroItemStateChanged

    private void combo_kilatesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_kilatesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_kilatesItemStateChanged

    private void combo_espesorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espesorItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_espesorItemStateChanged

    private void cargar_kilates() {
        combo_kilates.removeAllItems();
        if (check_kilates.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct kilates from punta_diamante where (total > 0) order by kilates asc");

                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String kilates = rs2.getString("kilates");
                    combo_kilates.addItem(kilates);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_kilates");
            }
        }
    }
    
    private void cargar_diametro() {
        combo_diametro.removeAllItems();
        if (check_diametro.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct drueda from punta_diamante where (total > 0) order by drueda asc");
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String diametro = rs2.getString("drueda");
                    combo_diametro.addItem(diametro);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_diametro");
            }
        }
    }

    private void cargar_espesor() {
        combo_espesor.removeAllItems();
        if (check_diametro.isSelected() == true) {
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("select distinct esperueda from punta_diamante where (total > 0) AND (drueda=?) order by esperueda asc");
                pst2.setString(1, combo_diametro.getSelectedItem().toString());
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String espe = rs2.getString("esperueda");
                    combo_espesor.addItem(espe);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_espesor");
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
        if (check_kilates.isSelected() == true) {
            try {

                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst6 = cn5.prepareStatement("select distinct codigo from punta_diamante where (total > 0) AND (kilates= ?) order by descripcion asc");
                pst6.setString(1, combo_kilates.getSelectedItem().toString());
                ResultSet rs6 = pst6.executeQuery();

                while (rs6.next()) {
                    model.setRowCount(0);
                    cod_bus = rs6.getString("codigo");
                }

                //PreparedStatement pst5 = cn5.prepareStatement("select * from punta_diamante where (total > 0) AND (kilates= ?) AND (codigo= ?) order by descripcion asc");
                PreparedStatement pst5 = cn5.prepareStatement("select * from punta_diamante where (total > 0) AND (kilates= ?) order by descripcion asc");
                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                //pst5.setString(1, cod);
                pst5.setString(1, combo_kilates.getSelectedItem().toString());
                //pst5.setString(2, cod_bus);
                //System.out.println("rs 5 " + cod_bus);

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

        if (check_diametro.isSelected() == true) {
            try {
                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select * from punta_diamante where (total > 0) AND (drueda= ?) AND (esperueda= ?) order by descripcion asc");

                pst5.setString(1, combo_diametro.getSelectedItem().toString());
                pst5.setString(2, combo_espesor.getSelectedItem().toString());

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
                    InformacionPuntaDiamante informacionpuntadiamante = new InformacionPuntaDiamante();
                    informacionpuntadiamante.setVisible(true);
                    codigo2 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 49) {
                        codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog(null, "¿Cuantas unidades del codigo " + codigo2 + "\n     desea agregar a la cotización?", "Cantidad",  JOptionPane.QUESTION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Punta_diamante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Punta_diamante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Punta_diamante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Punta_diamante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Punta_diamante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material1;
    private javax.swing.JLabel Material2;
    private javax.swing.JLabel Material3;
    private javax.swing.JCheckBox check_diametro;
    private javax.swing.JCheckBox check_kilates;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JComboBox<String> combo_espesor;
    private javax.swing.JComboBox<String> combo_kilates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
