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

public class InformacionPortaFresado extends javax.swing.JFrame {

    public static String codigo3 = new String();
    public static String codigo7 = new String();
    public static String codigo_infopartes_portafresado = new String();
    public static String descripcion = new String();
    String cod = "";
    String cod2 = "";
    String cod3 = "";
    public String mar = "";
    public String forma = "";
    public String ang = "";
    public String codigo = "";
    public String form = "";
    public String longi = "";
    public String d1 = "";
    public String inci = "";
    public String ima = "";
    public String espe = "";

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

    public InformacionPortaFresado() {
        initComponents();
        setTitle("Información del producto");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        cod = Portafresado.codigo2;
        cod2 = InformacionInsertosf.codigo4;

        this.getContentPane().setBackground(Color.WHITE);

        try {
            //Rellena la información del porta cuando viene del portafresado
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from portafre where (codigo = ?) ");

            pst.setString(1, cod.trim());

            ResultSet rs = pst.executeQuery();

            //Busca y coloca la información e imagenes del porta seleccionado  
            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("porta"));
                txt_inserto.setText(rs.getString("longitud"));
                txt_longitud.setText(rs.getString("longitudporta"));
                txt_dia.setText(rs.getString("diametro"));
                txt_diasuje.setText(rs.getString("diasujecion"));
                txt_familia.setText(rs.getString("familia"));
                txt_tipo.setText(rs.getString("estilo"));

                txt_perno.setText(rs.getString("perno"));
                txt_tornillo.setText(rs.getString("tornillo"));
                txt_brida.setText(rs.getString("brida"));
                txt_tornillobrida.setText(rs.getString("tornillobrida"));
                txt_candado.setText(rs.getString("candado"));
                txt_llave.setText(rs.getString("llave"));
                txt_arbol.setText(rs.getString("arbol"));

                form = rs.getString("especificacion");
                longi = rs.getString("longitud");
                d1 = rs.getString("arbol");
                codigo = rs.getString("codigo");
                mar = rs.getString("marca2");
                forma = rs.getString("forma");
                ang = rs.getString("ang");
                espe = rs.getString("especificacion");

                String ima = rs.getString("imagen");

                ImageIcon imagen12 = new ImageIcon("src/images/" + ima + ".png");
                Icon icono12 = new ImageIcon(imagen12.getImage());
                label_porta.setIcon(icono12);

            }
            rs.close();
            cn.close();
        } catch (Exception e) {
        }

        try {
            //Rellena la información del porta cuando la información viene de la interfaz de insertos de fresado
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst2 = cn2.prepareStatement("select * from portafre where (codigo = ?) ");

            pst2.setString(1, cod2.trim());

            ResultSet rs2 = pst2.executeQuery();

            //Busca y coloca la información e imagenes del porta seleccionado  
            while (rs2.next()) {

                txt_codigo.setText(rs2.getString("codigo"));
                txt_descripcion.setText(rs2.getString("porta"));
                txt_inserto.setText(rs2.getString("longitud"));
                txt_longitud.setText(rs2.getString("longitudporta"));
                txt_dia.setText(rs2.getString("diametro"));
                txt_diasuje.setText(rs2.getString("diasujecion"));
                txt_familia.setText(rs2.getString("familia"));
                txt_tipo.setText(rs2.getString("estilo"));

                txt_perno.setText(rs2.getString("perno"));
                txt_tornillo.setText(rs2.getString("tornillo"));
                txt_brida.setText(rs2.getString("brida"));
                txt_tornillobrida.setText(rs2.getString("tornillobrida"));
                txt_candado.setText(rs2.getString("candado"));
                txt_llave.setText(rs2.getString("llave"));
                txt_arbol.setText(rs2.getString("arbol"));

                form = rs2.getString("especificacion");
                longi = rs2.getString("longitud");
                d1 = rs2.getString("arbol");
                codigo = rs2.getString("codigo");
                mar = rs2.getString("marca2");
                forma = rs2.getString("forma");
                ang = rs2.getString("ang");
                espe = rs2.getString("especificacion");

                String ima = rs2.getString("imagen");

                ImageIcon imagen12 = new ImageIcon("src/images/" + ima + ".png");
                Icon icono12 = new ImageIcon(imagen12.getImage());
                label_porta.setIcon(icono12);
            }
        } catch (Exception e) {
        }

        if (mar.equals("YG-1")) {
            //Rellena la tabla de insertos relacionados con el porta si la marca es yg
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //PreparedStatement pst2 = cn.prepareStatement("select * from insertosf where (longitud = ?) AND (especificacion = ?)");
                PreparedStatement pst2 = cn.prepareStatement("select * from insertosf where (longitud = ?) AND (marca = ?) AND (forma = ?) AND  (ang = ?) ");

                pst2.setString(1, longi);
                pst2.setString(2, mar);
                pst2.setString(3, forma);
                pst2.setString(4, ang);

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
                        InformacionInsertosf informacioninsertosf = new InformacionInsertosf();
                        informacioninsertosf.setVisible(true);
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
        }

        if (mar.equals("KORLOY")) {
            //Rellena la tabla de insertos relacionados con el porta si la marca es korloy
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //PreparedStatement pst2 = cn.prepareStatement("select * from insertosf where (longitud = ?) AND (especificacion = ?)");
                PreparedStatement pst2 = cn.prepareStatement("select * from insertosf where (longitud = ?) AND (marca = ?) AND (forma = ?) AND  (especificacion = ?) ");

                pst2.setString(1, longi);
                pst2.setString(2, mar);
                pst2.setString(3, forma);
                pst2.setString(4, espe);

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
                        InformacionInsertosf informacioninsertosf = new InformacionInsertosf();
                        informacioninsertosf.setVisible(true);
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
        }

        //Rellena la tabla de arboles relacionados con el porta
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("select * from arbol_fresa where (d1 = ?)");

            pst2.setString(1, d1);

            ResultSet rs2 = pst2.executeQuery();

            model2.setRowCount(0);

            //Ajuste de la tabla al JScrollPane 
            tabla_resultados2 = new JTable(model2);
            jScrollPane2.setViewportView(tabla_resultados2);

            PropiedadesTabla2();

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
                    codigo7 = (String) model2.getValueAt(fila_point, columna_point = 0);
                    descripcion = (String) model2.getValueAt(fila_point, columna_point = 1);
                    InformacionArbolFresa informacionarbolfresa = new InformacionArbolFresa();
                    informacionarbolfresa.setVisible(true);
                    codigo7 = "";
                }

                if (fila_point > -1 && columna_point == 3) {
                    pdf.contar();
                    if (pdf.limite <= 49) {
                        codigo7 = (String) model2.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model2.getValueAt(fila_point, columna_point = 1);
                        String canti = JOptionPane.showInputDialog("¿Cuantas unidades del codigo " + codigo7 + " desea agregar a la cotización");
                        if (isNumeric(canti)) {
                            pdf.AddRowToJTable(new Object[]{"", codigo7, "", "", "", "", canti});
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

    private void PropiedadesTabla2() {
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
        txt_diasuje = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        label_cuadrante = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_familia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        label_porta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_resultados2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_perno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_tornillo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_brida = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_tornillobrida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_candado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_llave = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_arbol = new javax.swing.JTextField();
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

        jLabel10.setText("Tamaño del inserto");

        jLabel2.setText("Longitud del porta L (mm)");

        txt_longitud.setEditable(false);

        jLabel5.setText("Insertos disponibles");

        txt_inserto.setEditable(false);

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

        txt_diasuje.setEditable(false);

        jLabel12.setText("Diámetro de sujección Od (mm)");

        txt_dia.setEditable(false);

        label_cuadrante.setText("Diámetro OD (mm)");

        jLabel3.setText("Familia");

        txt_familia.setEditable(false);

        jLabel6.setText("Tipo");

        txt_tipo.setEditable(false);

        jLabel7.setText("Árboles disponibles");

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

        jLabel13.setText("Perno");

        txt_perno.setEditable(false);
        txt_perno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pernoMouseClicked(evt);
            }
        });

        jLabel14.setText("Tornillo");

        txt_tornillo.setEditable(false);
        txt_tornillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tornilloMouseClicked(evt);
            }
        });

        jLabel15.setText("Brida");

        txt_brida.setEditable(false);
        txt_brida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_bridaMouseClicked(evt);
            }
        });

        jLabel16.setText("Tornillo brida");

        txt_tornillobrida.setEditable(false);
        txt_tornillobrida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tornillobridaMouseClicked(evt);
            }
        });

        jLabel17.setText("Candado");

        txt_candado.setEditable(false);
        txt_candado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_candadoMouseClicked(evt);
            }
        });

        jLabel18.setText("Llave");

        txt_llave.setEditable(false);
        txt_llave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_llaveMouseClicked(evt);
            }
        });

        jLabel19.setText("Árbol");

        txt_arbol.setEditable(false);

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
                            .addComponent(jLabel10)
                            .addComponent(txt_inserto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cuadrante)
                            .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txt_diasuje, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_familia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel6))
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txt_perno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel14)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_tornillo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(txt_brida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(txt_tornillobrida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(label_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(txt_candado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(txt_llave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(txt_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(115, 115, 115))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))))
                                        .addGap(26, 26, 26)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_inserto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(label_cuadrante)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_diasuje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_perno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_tornillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_brida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_tornillobrida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_arbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_llave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_candado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(label_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pernoMouseClicked
        codigo_infopartes_portafresado = txt_perno.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_pernoMouseClicked

    private void txt_tornilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tornilloMouseClicked
        codigo_infopartes_portafresado = txt_tornillo.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_tornilloMouseClicked

    private void txt_bridaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_bridaMouseClicked
        codigo_infopartes_portafresado = txt_brida.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_bridaMouseClicked

    private void txt_tornillobridaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tornillobridaMouseClicked
        codigo_infopartes_portafresado = txt_tornillobrida.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_tornillobridaMouseClicked

    private void txt_candadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_candadoMouseClicked
        codigo_infopartes_portafresado = txt_candado.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_candadoMouseClicked

    private void txt_llaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_llaveMouseClicked
        codigo_infopartes_portafresado = txt_llave.getText();
        InformacionParteInserto informacionparteinserto = new InformacionParteInserto();
        informacionparteinserto.setVisible(true);
    }//GEN-LAST:event_txt_llaveMouseClicked

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
            java.util.logging.Logger.getLogger(InformacionPortaFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionPortaFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionPortaFresado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ficha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField txt_arbol;
    private javax.swing.JTextField txt_brida;
    private javax.swing.JTextField txt_candado;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_diasuje;
    private javax.swing.JTextField txt_familia;
    private javax.swing.JTextField txt_inserto;
    private javax.swing.JTextField txt_llave;
    private javax.swing.JTextField txt_longitud;
    private javax.swing.JTextField txt_perno;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_tornillo;
    private javax.swing.JTextField txt_tornillobrida;
    // End of variables declaration//GEN-END:variables
}
