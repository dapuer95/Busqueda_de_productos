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

public class Arbol_mandril extends javax.swing.JFrame {

    public static Arbol_mandril obj = null;
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

    public Arbol_mandril() {
        initComponents();
        setTitle("Arbol para mandril");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Arbol_mandril getObj() {
        if (obj == null) {
            obj = new Arbol_mandril();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_recto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Material1 = new javax.swing.JLabel();
        combo_acople = new javax.swing.JComboBox<>();
        boton_mt = new javax.swing.JButton();
        boton_nt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Material2 = new javax.swing.JLabel();
        combo_jacobs = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_recto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arbol_mandril_Recto.png"))); // NOI18N
        boton_recto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rectoActionPerformed(evt);
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
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        jLabel5.setText("Recto");

        Material1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material1.setText("Tamaño acople");

        combo_acople.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_acopleItemStateChanged(evt);
            }
        });

        boton_mt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arbol_mandril_MT.png"))); // NOI18N
        boton_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mtActionPerformed(evt);
            }
        });

        boton_nt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arbol_mandril_NT.png"))); // NOI18N
        boton_nt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ntActionPerformed(evt);
            }
        });

        jLabel9.setText("MT");

        jLabel10.setText("NT");

        jLabel2.setText("Seleccione el tipo de acople del árbol");

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidad_icono.png"))); // NOI18N
        Material2.setText("Tamaño Jabobs");

        combo_jacobs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_jacobsItemStateChanged(evt);
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
                .addGap(180, 180, 180)
                .addComponent(jLabel9)
                .addGap(195, 195, 195)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_nt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_recto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Material2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_jacobs, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Material1)
                                    .addComponent(combo_acople, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(230, 230, 230))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_nt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_recto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Material1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_acople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Material2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_jacobs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PropiedadesTabla() {
        tabla_resultados.setRowHeight(26);
        TableColumn columna = tabla_resultados.getColumn("Codigo");
        TableColumn desc = tabla_resultados.getColumn("Descripción");
        TableColumn info = tabla_resultados.getColumn("Info");
        TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
        TableColumn total = tabla_resultados.getColumn("Total");
        TableColumn me = tabla_resultados.getColumn("Me");
        TableColumn ca = tabla_resultados.getColumn("Ca");
        TableColumn bo = tabla_resultados.getColumn("Bo");
        TableColumn ma = tabla_resultados.getColumn("Ma");
        columna.setMaxWidth(55);
        info.setMaxWidth(40);
        cotizar.setMaxWidth(60);
        total.setMaxWidth(38);
        me.setMaxWidth(27);
        bo.setMaxWidth(27);
        ca.setMaxWidth(27);
        ma.setMaxWidth(27);

    }

    private void boton_rectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rectoActionPerformed
        cod = "Recto";
        cargar_acople();
    }//GEN-LAST:event_boton_rectoActionPerformed

    private void boton_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mtActionPerformed
        cod = "MT";
        cargar_acople();
    }//GEN-LAST:event_boton_mtActionPerformed

    private void boton_ntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ntActionPerformed
        cod = "NT";
        cargar_acople();
    }//GEN-LAST:event_boton_ntActionPerformed

    private void combo_acopleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_acopleItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_jacobs();
        }
    }//GEN-LAST:event_combo_acopleItemStateChanged

    private void combo_jacobsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_jacobsItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_jacobsItemStateChanged

    private void cargar_acople() {
        combo_acople.removeAllItems();
        try {

            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct medida from arbol_mandril where (total > 0) AND (tipo = ?) order by medida asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst.setString(1, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {

                String medida = rs.getString("medida");
                combo_acople.addItem(medida);
            }
            rs.close();
            cn.close();

        } catch (Exception e) {
            System.out.println("no hay conexion en llenar_acople");
        }
    }

    private void cargar_jacobs() {
        combo_jacobs.removeAllItems();
        try {

            //Conexión con la base de datos 
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst3 = cn3.prepareStatement("select distinct jacobs from arbol_mandril where (total > 0) AND (tipo = ?) AND (medida = ?) order by jacobs asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst3.setString(1, cod);
            pst3.setString(2, combo_acople.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs3 = pst3.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs3.next()) {

                String jacobs = rs3.getString("jacobs");
                combo_jacobs.addItem(jacobs);
            }
            rs3.close();
            cn3.close();

        } catch (Exception e) {
            System.out.println("no hay conexion en llenar_diametro");
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
            PreparedStatement pst4 = cn4.prepareStatement("select * from arbol_mandril where (total > 0) AND (tipo = ?) AND (medida = ?) AND (jacobs = ?)");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, combo_acople.getSelectedItem().toString());
            pst4.setString(3, combo_jacobs.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs4 = pst4.executeQuery();

            //Se limpian los componentes de la tabla luego de cada busqueda 
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

                //Coloca los resultados encontrado en la tabla creada previamente
                String datos[] = {cod, estado};

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});

                System.out.println();
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
                    InformacionArbolMandril informacionarbolmandril = new InformacionArbolMandril();
                    informacionarbolmandril.setVisible(true);
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
            java.util.logging.Logger.getLogger(Arbol_mandril.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbol_mandril.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbol_mandril.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbol_mandril.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbol_mandril().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Material1;
    private javax.swing.JLabel Material2;
    private javax.swing.JButton boton_mt;
    private javax.swing.JButton boton_nt;
    private javax.swing.JButton boton_recto;
    private javax.swing.JComboBox<String> combo_acople;
    private javax.swing.JComboBox<String> combo_jacobs;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
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
