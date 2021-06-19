package ventanas;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ParteErosionadora extends javax.swing.JFrame {

    public static ParteErosionadora obj = null;
    public static int k = 0;
    public static String cod = "";
    public static String cod1 = "j";
    public static int valor_nom = 0;
    public static String descripcion = new String();
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Ref", "Total", "Me", "Ca", "Bo", "Ma", "Info", "Cotizar"};
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
            if (columnas == 10) {
                return true;
            } else {
                return false;
            }
        }
    };

    public ParteErosionadora() {
        initComponents();
        setTitle("Partes para electoro erosionadora");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        AutoCompleteDecorator.decorate(combo_des);
        AutoCompleteDecorator.decorate(combo_ref);
    }

    public static ParteErosionadora getObj() {
        if (obj == null) {
            obj = new ParteErosionadora();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados_2 = new javax.swing.JTable();
        check_des = new javax.swing.JCheckBox();
        combo_des = new javax.swing.JComboBox<>();
        check_ref = new javax.swing.JCheckBox();
        combo_ref = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_resultados_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Ref", "Total", "Me", "Ca", "Bo", "Ma", "Info", "Cotizar"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados_2);
        if (tabla_resultados_2.getColumnModel().getColumnCount() > 0) {
            tabla_resultados_2.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_resultados_2.getColumnModel().getColumn(2).setMaxWidth(70);
            tabla_resultados_2.getColumnModel().getColumn(3).setMaxWidth(38);
            tabla_resultados_2.getColumnModel().getColumn(4).setMaxWidth(27);
            tabla_resultados_2.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados_2.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados_2.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados_2.getColumnModel().getColumn(8).setMaxWidth(40);
            tabla_resultados_2.getColumnModel().getColumn(9).setMaxWidth(50);
        }

        check_des.setText("Buscar por descripción");
        check_des.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_desItemStateChanged(evt);
            }
        });

        combo_des.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_desItemStateChanged(evt);
            }
        });

        check_ref.setText("Buscar por referencia");
        check_ref.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_refItemStateChanged(evt);
            }
        });

        combo_ref.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_refItemStateChanged(evt);
            }
        });

        jLabel2.setText("Seleccione el nombre o la referencia del accesorio");

        jMenu1.setText("Opciones");

        menu_recargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.ALT_DOWN_MASK));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_des, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_des))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check_ref)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(check_des)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void check_desItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_desItemStateChanged
        // TODO add your handling code here:
        if (check_des.isSelected() == true) {
            check_ref.setEnabled(false);
            combo_ref.setEnabled(false);
            cargar_des();
        } else {
            check_ref.setEnabled(true);
            combo_ref.setEnabled(true);
            combo_des.removeAllItems();
        }
    }//GEN-LAST:event_check_desItemStateChanged

    private void combo_desItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_desItemStateChanged
        cargar_ref();
        buscar();
    }//GEN-LAST:event_combo_desItemStateChanged

    private void check_refItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_refItemStateChanged
        if (check_ref.isSelected() == true) {
            check_des.setEnabled(false);
            combo_des.setEnabled(false);
            cargar_ref();
        } else {
            check_des.setEnabled(true);
            combo_des.setEnabled(true);
            combo_ref.removeAllItems();
        }
    }//GEN-LAST:event_check_refItemStateChanged

    private void combo_refItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_refItemStateChanged
        buscar();
    }//GEN-LAST:event_combo_refItemStateChanged

    private void PropiedadesTabla() {
        tabla_resultados_2.setRowHeight(26);
        TableColumn codigo = tabla_resultados_2.getColumn("Codigo");
        TableColumn desc = tabla_resultados_2.getColumn("Descripción");
        TableColumn info = tabla_resultados_2.getColumn("Info");
        TableColumn cotizar = tabla_resultados_2.getColumn("Cotizar");
        TableColumn total = tabla_resultados_2.getColumn("Total");
        TableColumn me = tabla_resultados_2.getColumn("Me");
        TableColumn ca = tabla_resultados_2.getColumn("Ca");
        TableColumn bo = tabla_resultados_2.getColumn("Bo");
        TableColumn ma = tabla_resultados_2.getColumn("Ma");
        TableColumn ref = tabla_resultados_2.getColumn("Ref");
        codigo.setMaxWidth(50);
        info.setMaxWidth(40);
        cotizar.setMaxWidth(50);
        total.setMaxWidth(38);
        total.setMinWidth(38);
        me.setMaxWidth(31);
        me.setMinWidth(31);
        bo.setMaxWidth(31);
        bo.setMinWidth(31);
        ca.setMaxWidth(31);
        ca.setMinWidth(31);
        ma.setMaxWidth(31);
        ma.setMinWidth(31);
        info.setMaxWidth(40);
        info.setMinWidth(40);
        cotizar.setMaxWidth(50);
        cotizar.setMinWidth(50);
        ref.setMaxWidth(200);
        ref.setMinWidth(70);
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void cargar_des() {
        if (check_des.isSelected() == true) {
            combo_des.removeAllItems();
            try {
                //Conexión con la base de datos
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2 = cn2.prepareStatement("Select distinct descripcion from parte_erosionadora where (total > 0) order by descripcion asc");

                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {
                    String des = rs2.getString("descripcion");
                    combo_des.addItem(des);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_descripcion");
            }
        }
    }

    public void cargar_ref() {
        if (check_ref.isSelected() == true) {
            combo_ref.removeAllItems();
            try {
                //Conexión con la base de datos
                Connection cn2t = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst2t = cn2t.prepareStatement("Select distinct especificacion from parte_erosionadora where (total > 0) order by especificacion asc");

                ResultSet rs2t = pst2t.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2t.next()) {
                    String refe = rs2t.getString("especificacion");
                    combo_ref.addItem(refe);
                }
                rs2t.close();
                cn2t.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_referencia");
            }
        }
    }

    private void buscar() {
        //Busca solo por la descripcion
        if (check_des.isSelected() == true) {
            try {
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                PreparedStatement pst5 = cn5.prepareStatement("select * from parte_erosionadora where (total > 0) AND (descripcion = ?) order by descripcion asc");
                pst5.setString(1, combo_des.getSelectedItem().toString());
                ResultSet rs5 = pst5.executeQuery();

                model.setRowCount(0);
                tabla_resultados_2 = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados_2);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {

                    String cod = rs5.getString("codigo");
                    //String nom = rs5.getString("nombre");
                    String des = rs5.getString("descripcion");
                    String ref = rs5.getString("referencia");
                    //String precio = rs5.getString("precio");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/ficha_icono_tabla.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, des, ref, total, me, ca, bo, ma, icono1, icono2});
                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("no hay conexion en buscar_des");
            }
        }

        //Busca solo por la referencia
        if (check_ref.isSelected() == true && check_des.isSelected() == false) {
            try {
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                PreparedStatement pst5 = cn5.prepareStatement("select * from parte_erosionadora where (total > 0) AND (especificacion = ?) order by especificacion asc");
                pst5.setString(1, combo_ref.getSelectedItem().toString());
                ResultSet rs5 = pst5.executeQuery();

                model.setRowCount(0);
                tabla_resultados_2 = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados_2);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {

                    String cod = rs5.getString("codigo");
                    String des = rs5.getString("descripcion");
                    String ref = rs5.getString("referencia");
                    String total = rs5.getString("total");
                    String me = rs5.getString("me");
                    String ca = rs5.getString("ca");
                    String bo = rs5.getString("bo");
                    String ma = rs5.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/ficha_icono_tabla.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, des, ref, total, me, ca, bo, ma, icono1, icono2});
                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("no hay conexion en buscar_ref");
            }
        }

        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click
        tabla_resultados_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tabla_resultados_2.rowAtPoint(e.getPoint());
                int columna_point = tabla_resultados_2.columnAtPoint(e.getPoint());

                if (fila_point > -1 && columna_point == 8) {
                    codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                    abrirarchivo("src/fichas/" + codigo2 + ".pdf");
                    codigo2 = "";
                }

                if (fila_point > -1 && columna_point == 9) {
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

    public void abrirarchivo(String archivo) {
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentra la ficha de ese producto" + "\nPor favor comunicarse con el área de investigación y desarrollo", "Advertencia", HEIGHT);
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
            java.util.logging.Logger.getLogger(ParteErosionadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParteErosionadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParteErosionadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParteErosionadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParteErosionadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_des;
    private javax.swing.JCheckBox check_ref;
    private javax.swing.JComboBox<String> combo_des;
    private javax.swing.JComboBox<String> combo_ref;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_recargar;
    private javax.swing.JTable tabla_resultados_2;
    // End of variables declaration//GEN-END:variables
}
