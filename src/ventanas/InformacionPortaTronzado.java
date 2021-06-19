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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;

public class InformacionPortaTronzado extends javax.swing.JFrame {

    public static String codigo3 = new String();
    public static String codigo4 = new String();
    String cod = "";
    String cod2 = "";
    String cod3 = "";
    public String codigo = "";
    public static String descripcion = new String();
    public String form = "";
    public String cuadrante = "";
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

    public InformacionPortaTronzado() {
        initComponents();
        setTitle("Información del producto");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        cod = Portatronzado.codigo2;
        cod2 = InformacionInsertostr.codigo4;
        cod3 = InformacionPortaLama2.codigo4;

        this.getContentPane().setBackground(Color.WHITE);

        try {
            //Rellena la información del porta cuando viene de porta tronzado
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from portatro where (codigo = ?) ");

            pst.setString(1, cod.trim());

            ResultSet rs = pst.executeQuery();

            //Busca y coloca la información e imagenes del porta seleccionado  
            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("porta"));
                txt_inserto.setText(rs.getString("longitud"));
                txt_longitud.setText(rs.getString("longitudporta"));
                txt_cuadrante.setText(rs.getString("cuadrante"));
                txt_tmax.setText(rs.getString("tmax"));
                txt_llave.setText(rs.getString("llave"));
                form = rs.getString("familia");
                longi = rs.getString("longitud");
                codigo = rs.getString("codigo");
                cuadrante = rs.getString("cuadrante");

                String familia = rs.getString("familia");

                if (familia.equals("SP")) {
                    label_cuadrante.setText("Altura");
                }

                ImageIcon imagen12 = new ImageIcon("src/images/" + familia + "porta.png");
                Icon icono12 = new ImageIcon(imagen12.getImage());
                label_porta.setIcon(icono12);
            }
        } catch (Exception e) {
        }

        try {
            //Rellena la información del porta cuando la información viene desde la interfaz de insertos de tronzado
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from portatro where (codigo = ?) ");

            pst.setString(1, cod2.trim());

            ResultSet rs = pst.executeQuery();

            //Busca y coloca la información e imagenes del porta seleccionado  
            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("porta"));
                txt_inserto.setText(rs.getString("longitud"));
                txt_longitud.setText(rs.getString("longitudporta"));
                txt_cuadrante.setText(rs.getString("cuadrante"));
                txt_tmax.setText(rs.getString("tmax"));
                txt_llave.setText(rs.getString("llave"));
                form = rs.getString("familia");
                longi = rs.getString("longitud");
                codigo = rs.getString("codigo");

                String familia = rs.getString("familia");

                if (familia.equals("SP")) {
                    label_cuadrante.setText("Altura");
                }

                ImageIcon imagen12 = new ImageIcon("src/images/" + familia + "porta.png");
                Icon icono12 = new ImageIcon(imagen12.getImage());
                label_porta.setIcon(icono12);
            }
        } catch (Exception e) {
        }

        try {
            //Rellena la información del porta cuando la información viene desde la interfaz de porta lama
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from portatro where (codigo = ?) ");

            pst.setString(1, cod3.trim());

            ResultSet rs = pst.executeQuery();

            //Busca y coloca la información e imagenes del porta seleccionado  
            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("porta"));
                txt_inserto.setText(rs.getString("longitud"));
                txt_longitud.setText(rs.getString("longitudporta"));
                txt_cuadrante.setText(rs.getString("cuadrante"));
                txt_tmax.setText(rs.getString("tmax"));
                txt_llave.setText(rs.getString("llave"));
                form = rs.getString("familia");
                longi = rs.getString("longitud");
                codigo = rs.getString("codigo");
                cuadrante = rs.getString("cuadrante");

                String familia = rs.getString("familia");

                if (familia.equals("SP")) {
                    label_cuadrante.setText("Altura");
                }

                ImageIcon imagen12 = new ImageIcon("src/images/" + familia + "porta.png");
                Icon icono12 = new ImageIcon(imagen12.getImage());
                label_porta.setIcon(icono12);
            }
        } catch (Exception e) {
        }

        //Rellena la tabla de insertos relacionados con el porta
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("select * from insertostr where (familia = ?) AND (longitud = ?)");

            pst2.setString(1, form);
            pst2.setString(2, longi);

            ResultSet rs2 = pst2.executeQuery();

            model.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados = new JTable(model);
            jScrollPane1.setViewportView(tabla_resultados);

            PropiedadesTabla();

            while (rs2.next()) {

                String codi = rs2.getString("codigo");
                String iso = rs2.getString("descripcion");

                String datos[] = {codi, iso};
                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{codi, iso, icono1, icono2});
                //model.addRow(datos);
            }
        } catch (Exception e) {
        }

        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click en la tabla de insertos relacionados con el porta
        tabla_resultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int columna_point = tabla_resultados.columnAtPoint(e.getPoint());

                if (fila_point > -1 && columna_point == 2) {
                    codigo3 = (String) model.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                    InformacionInsertostr informacioninsertostr = new InformacionInsertostr();
                    informacioninsertostr.setVisible(true);
                    codigo3 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 32) {
                        codigo3 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog("¿Cuantas unidades del codigo " + codigo3 + " desea agregar a la cotización");
                        if (isNumeric(canti)) {
                            pdf.AddRowToJTable(new Object[]{"", codigo3, "", "", "", "", canti});
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

        //Rellena la tabla de porta lamas relacionados con la lama
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("select * from porta_lama where (h3 = ?)");

            pst2.setString(1, cuadrante);

            ResultSet rs2 = pst2.executeQuery();

            model2.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados2 = new JTable(model2);
            jScrollPane2.setViewportView(tabla_resultados2);

            PropiedadesTabla();

            while (rs2.next()) {

                String codi = rs2.getString("codigo");
                String iso = rs2.getString("descripcion");

                String datos[] = {codi, iso};
                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model2.addRow(new Object[]{codi, iso, icono1, icono2});
            }
        } catch (Exception e) {
        }

        //Metodo para mostrar la información del elmento que se encuentra en la fila que selecciona y se da click en la tabla de insertos relacionados con el porta
        tabla_resultados2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                int fila_point = tabla_resultados2.rowAtPoint(e.getPoint());
                int columna_point = tabla_resultados2.columnAtPoint(e.getPoint());

                if (fila_point > -1 && columna_point == 2) {
                    codigo4 = (String) model2.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model2.getValueAt(fila_point, columna_point = 1);
                    InformacionPortaLama2 informacionportalama2 = new InformacionPortaLama2();
                    informacionportalama2.setVisible(true);
                    codigo4 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 32) {
                        codigo4 = (String) model2.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model2.getValueAt(fila_point, columna_point = 1);
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

        TableColumn columna2 = tabla_resultados2.getColumn("Codigo");
        TableColumn desc2 = tabla_resultados2.getColumn("Descripción");
        TableColumn info2 = tabla_resultados2.getColumn("Info");
        TableColumn cotizar2 = tabla_resultados2.getColumn("Cotizar");
        columna2.setMaxWidth(55);
        info2.setMaxWidth(40);
        cotizar2.setMaxWidth(60);
        tabla_resultados2.setRowHeight(26);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_longitud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_inserto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        label_porta = new javax.swing.JLabel();
        txt_tmax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cuadrante = new javax.swing.JTextField();
        label_cuadrante = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_llave = new javax.swing.JTextField();
        boton_ficha = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_resultados2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);

        txt_descripcion.setEditable(false);

        label1.setText("Descripción prueba");

        jLabel1.setText("Codigo");

        txt_codigo.setEditable(false);

        jLabel10.setText("Tamaño del inserto");

        jLabel2.setText("Longitud del porta (mm)");

        jLabel5.setText("Insertos disponibles");

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
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel12.setText("Profudidad (Tmax) ");

        label_cuadrante.setText("Cuadrante");

        jLabel13.setText("Llave");

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

        jLabel6.setText("Porta lamas disponibles");

        tabla_resultados2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla_resultados2);
        if (tabla_resultados2.getColumnModel().getColumnCount() > 0) {
            tabla_resultados2.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados2.getColumnModel().getColumn(3).setMaxWidth(60);
        }

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
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_inserto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_tmax, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cuadrante)
                            .addComponent(txt_cuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_llave, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel6)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(txt_inserto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_cuadrante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_llave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
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
            java.util.logging.Logger.getLogger(InformacionPortaTronzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaTronzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaTronzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaTronzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionPortaTronzado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ficha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label_cuadrante;
    private javax.swing.JLabel label_porta;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTable tabla_resultados2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_cuadrante;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_inserto;
    private javax.swing.JTextField txt_llave;
    private javax.swing.JTextField txt_longitud;
    private javax.swing.JTextField txt_tmax;
    // End of variables declaration//GEN-END:variables
}
