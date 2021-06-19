package ventanas;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;

public class InformacionColumnas extends javax.swing.JFrame {

    String cod = "";
    String cod2 = "";
    String cod3 = "";
    public String codigo = "";
    public static String descripcion = new String();
    public static String codigo2 = new String();
    public static String codigo3 = new String();
    public static String codigo4 = new String();
    public static String codigo5 = new String();
    public String form = "";
    public String dia = "";

    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    String cabeza[] = {"Codigo", "Descripción", "Info", "Cotizar"};
    DefaultTableModel model = new DefaultTableModel(data, cabeza) {

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

    public InformacionColumnas() {
        initComponents();
        setTitle("Información de la columna");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        cod = Columnas.codigo2;
        cod2 = InformacionBujes.codigo4;
        PropiedadesTabla();
        this.getContentPane().setBackground(Color.WHITE);

        // Rellena la información de la columna cuando viene desde la interfaz de columnas
        try {
            //Rellena la información del inserto
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from columnas where (codigo = ?) ");

            pst.setString(1, cod.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_longitud.setText(rs.getString("longitud"));
                txt_diametro.setText(rs.getString("diametro"));
                txt_diacabeza.setText(rs.getString("diacabeza"));
                txt_longcabeza.setText(rs.getString("longcabeza"));
                txt_ajustesup.setText(rs.getString("ajustedsup"));
                txt_ajusteinf.setText(rs.getString("ajustedinf"));
                txt_ajustesupdm5.setText(rs.getString("ajustedm5sup"));
                txt_ajusteinfdm5.setText(rs.getString("ajustedm5inf"));
                txt_material.setText(rs.getString("material"));
                txt_dureza.setText(rs.getString("dureza"));
                txt_longajuste.setText(rs.getString("longajuste"));

                dia = rs.getString("diametro");
                codigo = rs.getString("codigo");

                ImageIcon imagen1 = new ImageIcon("src/images/columnadim.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                label_dim.setIcon(icono1);

            }
            rs.close();
            cn.close();
        } catch (Exception e) {

        }
        // Rellena la información de la columna cuando viene desde la interfaz de información bujes
        try {
            //Rellena la información del inserto

            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst2 = cn2.prepareStatement("select * from columnas where (codigo = ?) ");

            pst2.setString(1, cod2.trim());

            ResultSet rs2 = pst2.executeQuery();

            while (rs2.next()) {

                txt_codigo.setText(rs2.getString("codigo"));
                txt_descripcion.setText(rs2.getString("descripcion"));
                txt_longitud.setText(rs2.getString("longitud"));
                txt_diametro.setText(rs2.getString("diametro"));
                txt_diacabeza.setText(rs2.getString("diacabeza"));
                txt_longcabeza.setText(rs2.getString("longcabeza"));
                txt_ajustesup.setText(rs2.getString("ajustedsup"));
                txt_ajusteinf.setText(rs2.getString("ajustedinf"));
                txt_ajustesupdm5.setText(rs2.getString("ajustedm5sup"));
                txt_ajusteinfdm5.setText(rs2.getString("ajustedm5inf"));
                txt_material.setText(rs2.getString("material"));
                txt_dureza.setText(rs2.getString("dureza"));
                txt_longajuste.setText(rs2.getString("longajuste"));

                dia = rs2.getString("diametro");
                codigo = rs2.getString("codigo");
                ImageIcon imagen1 = new ImageIcon("src/images/columnadim.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                label_dim.setIcon(icono1);

            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {

        }

        //Rellena la tabla de bujes relacionadas con las columnas
        try {
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst3 = cn3.prepareStatement("select * from bujes where (diametroint = ?)");

            pst3.setString(1, dia);

            ResultSet rs3 = pst3.executeQuery();

            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);

            TableColumn columna = tabla_resultados.getColumn("Codigo");
            TableColumn desc = tabla_resultados.getColumn("Descripción");
            TableColumn info = tabla_resultados.getColumn("Info");
            TableColumn cotizar = tabla_resultados.getColumn("Cotizar");
            columna.setMaxWidth(55);
            info.setMaxWidth(40);
            cotizar.setMaxWidth(60);
            tabla_resultados.setRowHeight(26);

            while (rs3.next()) {

                String codi = rs3.getString("codigo");
                String iso = rs3.getString("descripcion");

                String datos[] = {codi, iso};
                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());

                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());

                model.addRow(new Object[]{codi, iso, icono1, icono2});
                //model.addRow(datos);
            }
            rs3.close();
            cn3.close();

        } catch (Exception e) {
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
                    InformacionBujes informacionbujes = new InformacionBujes();
                    informacionbujes.setVisible(true);
                    codigo2 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 49) {
                        codigo2 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog("¿Cuantas unidades del codigo " + codigo2 + " desea agregar a la cotización");
                        if (isNumeric(canti)) {
                            pdf.AddRowToJTable(new Object[]{"", codigo2, "", "", "", "", canti});
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

    String[] botones = {"Ver información", "Agregar a cotización"};

    private void PropiedadesTabla() {
        tabla_resultados.setDefaultRenderer(Object.class, new ImgTabla());
        tabla_resultados.getTableHeader().setPreferredSize(new java.awt.Dimension(20, 20));
        tabla_resultados.getTableHeader().setFont(new Font("Cooper Black", 1, 10));
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
        jLabel3 = new javax.swing.JLabel();
        txt_diacabeza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_longitud = new javax.swing.JTextField();
        label_forma = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_diametro = new javax.swing.JTextField();
        label_dim = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_longcabeza = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_ajusteinf = new javax.swing.JTextField();
        txt_ajustesup = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_ajustesupdm5 = new javax.swing.JTextField();
        txt_ajusteinfdm5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_material = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_dureza = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_longajuste = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
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

        jLabel3.setText("Diámetro cabeza (H)");

        txt_diacabeza.setEditable(false);

        jLabel4.setText("Longitud (L)");

        txt_longitud.setEditable(false);

        jLabel13.setText("Diámetro (D)");

        txt_diametro.setEditable(false);

        jLabel17.setText("Longitud cabeza (T)");

        txt_longcabeza.setEditable(false);

        jLabel18.setText("Ajuste D");

        txt_ajusteinf.setEditable(false);

        txt_ajustesup.setEditable(false);

        jLabel19.setText("Ajuste Dm5");

        txt_ajustesupdm5.setEditable(false);

        txt_ajusteinfdm5.setEditable(false);

        jLabel20.setText("Material");

        txt_material.setEditable(false);

        jLabel22.setText("Dureza HRc");

        txt_dureza.setEditable(false);

        jLabel21.setText("Longitud ajuste(N)");

        txt_longajuste.setEditable(false);

        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codigo", "descripción", "Info", "Cotizar"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultados);
        if (tabla_resultados.getColumnModel().getColumnCount() > 0) {
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel2.setText("Bujes relacionados con la columna");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txt_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_diacabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_longcabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_forma))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_longajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_dureza, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_ajustesup, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_ajusteinf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_ajustesupdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_ajusteinfdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel19))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(label_forma)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_material, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dureza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_diacabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_longcabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ajusteinf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ajustesup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ajusteinfdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ajustesupdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_longajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(label_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_ficha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(InformacionColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionColumnas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ficha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label_dim;
    private javax.swing.JLabel label_forma;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_ajusteinf;
    private javax.swing.JTextField txt_ajusteinfdm5;
    private javax.swing.JTextField txt_ajustesup;
    private javax.swing.JTextField txt_ajustesupdm5;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_diacabeza;
    private javax.swing.JTextField txt_diametro;
    private javax.swing.JTextField txt_dureza;
    private javax.swing.JTextField txt_longajuste;
    private javax.swing.JTextField txt_longcabeza;
    private javax.swing.JTextField txt_longitud;
    private javax.swing.JTextField txt_material;
    // End of variables declaration//GEN-END:variables
}
