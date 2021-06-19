package ventanas;

import java.awt.Color;
import static java.awt.Color.RED;
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
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;

public class Accesorio_boquilla extends javax.swing.JFrame {
    public static int k = 0;
    public static Accesorio_boquilla obj = null;
    public String form = "";
    public String form2 = "";
    public static String cod = "";
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

    public Accesorio_boquilla() {
        initComponents();
        setTitle("Accesorio porta boquilla");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        cargar_tipo();
        cargar_imagen();
    }

    public static Accesorio_boquilla getObj() {
        if (obj == null) {
            obj = new Accesorio_boquilla();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        Espesor = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        Material2 = new javax.swing.JLabel();
        combo_tamaño = new javax.swing.JComboBox<>();
        label_dim = new javax.swing.JLabel();
        Material3 = new javax.swing.JLabel();
        combo_tuerca = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione las caracteristicas del dado");

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

        Espesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forma_icono.png"))); // NOI18N
        Espesor.setText("Tipo");

        combo_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipoItemStateChanged(evt);
            }
        });

        Material2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        Material2.setText("Longitud");

        combo_tamaño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tamañoItemStateChanged(evt);
            }
        });

        Material3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        Material3.setText("Tipo de tuerca");

        combo_tuerca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tuercaItemStateChanged(evt);
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
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(140, 140, 140))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Espesor)
                            .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Material2))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_tuerca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Material3)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Espesor)
                                    .addComponent(Material2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Material3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_tuerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_dim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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


    private void combo_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
           cargar_tamaño();
           cargar_imagen();
        }
    }//GEN-LAST:event_combo_tipoItemStateChanged

    private void combo_tamañoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tamañoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_tuerca();
        }
    }//GEN-LAST:event_combo_tamañoItemStateChanged

    private void combo_tuercaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tuercaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_imagen();
            buscar();
        }
    }//GEN-LAST:event_combo_tuercaItemStateChanged

    private void cargar_imagen(){
        form = combo_tipo.getSelectedItem().toString();
        form2 = combo_tuerca.getSelectedItem().toString();
       
        ImageIcon imagen1 = new ImageIcon("src/images/"+ form + form2 +".png");
        Icon icono1 = new ImageIcon(imagen1.getImage());
        label_dim.setIcon(icono1);
    }
    
    private void cargar_tipo() {
        combo_tipo.removeAllItems();
        try {
            //Conexión con la base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst = cn.prepareStatement("select distinct tipo from accesorio_boquilla where (total > 0) order by tipo asc");

            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                combo_tipo.addItem(tipo);
 
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_unidad");
        }

    }

    private void cargar_tamaño() {
        combo_tamaño.removeAllItems();
        try {
            //Conexión con la base de datos
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst2 = cn2.prepareStatement("select distinct tamaño from accesorio_boquilla where (total > 0) AND (tipo=?) order by tamaño asc");

            pst2.setString(1, combo_tipo.getSelectedItem().toString());
            //Declaración de la variable que alberga el resultado de la busqueda
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String tamaño = rs2.getString("tamaño");
                combo_tamaño.addItem(tamaño);
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_tamaño");
        }

    }

    private void cargar_tuerca() {
        combo_tuerca.removeAllItems();
        try {
            //Conexión con la base de datos
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst2 = cn2.prepareStatement("select distinct tuerca from accesorio_boquilla where (total > 0) AND (tipo=?) AND (tamaño=?) order by tuerca asc");

            
            pst2.setString(1, combo_tipo.getSelectedItem().toString());
            pst2.setString(2, combo_tamaño.getSelectedItem().toString());
            //Declaración de la variable que alberga el resultado de la busqueda
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String tuerca = rs2.getString("tuerca");
                combo_tuerca.addItem(tuerca);
                
                
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_tuerca");
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
            Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos
            PreparedStatement pst5 = cn5.prepareStatement("select * from accesorio_boquilla where (total > 0) AND (tipo= ?) AND (tamaño= ?) AND (tuerca= ?)");

            pst5.setString(1, combo_tipo.getSelectedItem().toString());
            pst5.setString(2, combo_tamaño.getSelectedItem().toString());
            pst5.setString(3, combo_tuerca.getSelectedItem().toString());
            

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
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma });

            }
            rs5.close();
            cn5.close();
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
                    InformacionAccesorioBoquilla informacionaccesorioboquilla = new InformacionAccesorioBoquilla();
                    informacionaccesorioboquilla.setVisible(true);
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
            java.util.logging.Logger.getLogger(Accesorio_boquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accesorio_boquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accesorio_boquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accesorio_boquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accesorio_boquilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espesor;
    private javax.swing.JLabel Material2;
    private javax.swing.JLabel Material3;
    private javax.swing.JComboBox<String> combo_tamaño;
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JComboBox<String> combo_tuerca;
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
