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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class InformacionPortaBoquilla extends javax.swing.JFrame {

    String cod = "";
    String cod2 = "";
    String boq = "";
    public String codigo = "";
    public static String descripcion = new String();
    public static String codigo3 = new String();
    public static String codigo4 = new String();
    public static String codigo5 = new String();
    public String dimension = "";
    public String longi = "";
    public String inci = "";

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

    DefaultTableModel model2 = new DefaultTableModel(data, cabeza) {

        //Metodo que permite que no se púeda editar los valores de la tabla
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 2) {
                return true;
            } else {
                return false;
            }
        }
    };

    public InformacionPortaBoquilla() {
        initComponents();
        setTitle("Información del árbol portaboquilla");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        cod = Arbol_portaboquilla.codigo2;
        cod2 = InformacionBoquillaFresadora.codigo4;
        this.getContentPane().setBackground(Color.WHITE);

        try {
            //Rellena la información del arbol cuando viene desde la interfaz de porta boquilla
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from porta_boquilla where (codigo = ?) ");

            pst.setString(1, cod.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_acople.setText(rs.getString("sujecion"));
                txt_boquilla.setText(rs.getString("boquilla"));
                txt_l1.setText(rs.getString("l1"));
                txt_l2.setText(rs.getString("l2"));
                txt_L.setText(rs.getString("ltotal"));
                txt_T.setText(rs.getString("T"));

                String tipo = rs.getString("tipo");
                boq = rs.getString("boquilla");
                codigo = rs.getString("codigo");

                ImageIcon imagen1 = new ImageIcon("src/images/portaboquilla" + tipo + ".png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                label_dim.setIcon(icono1);
            }
        } catch (Exception e) {
        }

        try {
            //Rellena la información del arbol cuando viene desde informacion boquilla

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from porta_boquilla where (codigo = ?) ");

            pst.setString(1, cod2.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_acople.setText(rs.getString("sujecion"));
                txt_boquilla.setText(rs.getString("boquilla"));
                txt_l1.setText(rs.getString("l1"));
                txt_l2.setText(rs.getString("l2"));
                txt_L.setText(rs.getString("ltotal"));
                txt_T.setText(rs.getString("T"));

                String tipo = rs.getString("tipo");
                boq = rs.getString("boquilla");
                codigo = rs.getString("codigo");

                ImageIcon imagen1 = new ImageIcon("src/images/portaboquilla" + tipo + ".png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                label_dim.setIcon(icono1);
            }
        } catch (Exception e) {
        }

        //Rellena la tabla de boquillas relacionadas con el porta_boquilla
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst3 = cn.prepareStatement("select * from boquilla_fresadora where (boquilla= ?)");

            pst3.setString(1, boq);

            ResultSet rs3 = pst3.executeQuery();

            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);

            TableColumn columna = tabla_resultados.getColumn("Codigo");
            columna.setMaxWidth(60);
            PropiedadesTabla();
            while (rs3.next()) {

                String codi = rs3.getString("codigo");
                String iso = rs3.getString("descripcion");

                String datos[] = {codi, iso};
                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{codi, iso, icono1, icono2});
            }
        } catch (Exception e) {
            System.out.println("no hay conexion en llenar tabla");
        }

        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click en la tabla de insertos relacionados con el porta
        tabla_resultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int columna_point = tabla_resultados.columnAtPoint(e.getPoint());

                if (fila_point > -1 && columna_point == 2) {
                    codigo4 = (String) model.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                    InformacionBoquillaFresadora informacionboquillafresadora = new InformacionBoquillaFresadora();
                    informacionboquillafresadora.setVisible(true);
                    codigo4 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 49) {
                        codigo4 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog("¿Cuantas unidades del codigo " + codigo4 + " desea agregar a la cotización");
                        if (isNumeric(canti)) {
                            pdf.AddRowToJTable(new Object[]{"", codigo4, "", "", "", "", canti});
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

    private void PropiedadesTabla() {
        TableColumn columna = tabla_resultados.getColumn("Codigo");
        TableColumn desc = tabla_resultados.getColumn("Descripción");
        TableColumn info = tabla_resultados.getColumn("Info");
        TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
        columna.setMaxWidth(55);
        info.setMaxWidth(40);
        cotizar.setMaxWidth(60);
        tabla_resultados.setRowHeight(26);
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_descripcion = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_l1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_L = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_T = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_acople = new javax.swing.JTextField();
        txt_l2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        label_dim = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_boquilla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        boton_ficha = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);

        txt_descripcion.setEditable(false);

        label1.setText("Descripción");

        jLabel1.setText("Codigo");

        txt_codigo.setEditable(false);

        txt_l1.setEditable(false);

        jLabel16.setText("l1");

        jLabel18.setText("L");

        txt_L.setEditable(false);

        jLabel19.setText("T");

        txt_T.setEditable(false);

        jLabel2.setText("Acople a la máquina");

        txt_acople.setEditable(false);

        txt_l2.setEditable(false);

        jLabel20.setText("l2");

        jLabel3.setText("Tipo de boquilla");

        txt_boquilla.setEditable(false);

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
            tabla_resultados.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel4.setText("Boquillas relacionadas con el árbol");

        boton_ficha.setBackground(new java.awt.Color(255, 255, 255));
        boton_ficha.setForeground(new java.awt.Color(0, 0, 0));
        boton_ficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ficha_tecnica_icono.png"))); // NOI18N
        boton_ficha.setText("Ficha técnica");
        boton_ficha.setToolTipText("");
        boton_ficha.setBorder(null);
        boton_ficha.setBorderPainted(false);
        boton_ficha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_ficha.setVerifyInputWhenFocusTarget(false);
        boton_ficha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fichaActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");
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
                        .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(63, 63, 63))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_boquilla, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txt_T, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_acople, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(label1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_acople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_boquilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirarchivo(String archivo) {
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentra la ficha de ese producto" + "\nPor favor comunicarse con el área de investigación y desarrollo", "Advertencia", HEIGHT);
        }
    }

    private void boton_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fichaActionPerformed
        abrirarchivo("src/fichas/" + codigo + ".pdf");
    }//GEN-LAST:event_boton_fichaActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionPortaBoquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaBoquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaBoquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaBoquilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionPortaBoquilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ficha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label_dim;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_L;
    private javax.swing.JTextField txt_T;
    private javax.swing.JTextField txt_acople;
    private javax.swing.JTextField txt_boquilla;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_l1;
    private javax.swing.JTextField txt_l2;
    // End of variables declaration//GEN-END:variables
}
