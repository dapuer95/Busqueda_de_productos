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

public class InformacionInsertosf extends javax.swing.JFrame {

    String cod3 = "";
    String cod2 = "";
    String cod4 = "";
    public String codigo = "";
    public static String descripcion = new String();
    public static String codigo4 = new String();
    public String mar = "";
    public String forma = "";
    public String longi = "";
    public String port = "";

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

    public InformacionInsertosf() {
        initComponents();
        setTitle("Información del producto");
        this.setResizable(false);
        cod3 = InsertosFresado.codigo2;
        cod2 = InsertosFresado.codigo3;
        cod4 = InformacionPortaFresado.codigo3;
        this.getContentPane().setBackground(Color.WHITE);

        //rellana la información del inserto cuando viene desde la forma
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from insertosf where (codigo = ?) ");

            pst.setString(1, cod3.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_filo.setText(rs.getString("longitud"));
                txt_radio.setText(rs.getString("radio"));
                txt_calidad.setText(rs.getString("calidad"));
                txt_material1.setText(rs.getString("material1"));
                txt_material2.setText(rs.getString("material2"));
                txt_material3.setText(rs.getString("material3"));
                txt_angulo.setText(rs.getString("angulo"));
                txt_rompe.setText(rs.getString("rompeviruta"));
                txt_corte.setText(rs.getString("aplicación"));
                codigo = rs.getString("codigo");
                mar = rs.getString("marca");
                forma = rs.getString("forma");

                longi = rs.getString("longitud");
                port = rs.getString("especificacion");

                String calidad = rs.getString("calidad");
                String forma = rs.getString("forma");
                String angulo = rs.getString("ang");

                ImageIcon imagen1 = new ImageIcon("src/images/" + calidad + ".png");
                Icon icono1 = new ImageIcon(imagen1.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_calidad.setIcon(icono1);

                ImageIcon imagen2 = new ImageIcon("src/images/" + forma + "lf" + ".png");
                Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_forma.setIcon(icono2);

                ImageIcon imagen3 = new ImageIcon("src/images/" + angulo + "a" + ".png");
                Icon icono3 = new ImageIcon(imagen3.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_angulo.setIcon(icono3);
            }
        } catch (Exception e) {
        }

        //rellana la información del inserto cuando viene desde la familia
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from insertosf where (codigo = ?) ");

            pst.setString(1, cod2.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_filo.setText(rs.getString("longitud"));
                txt_radio.setText(rs.getString("radio"));
                txt_calidad.setText(rs.getString("calidad"));
                txt_material1.setText(rs.getString("material1"));
                txt_material2.setText(rs.getString("material2"));
                txt_material3.setText(rs.getString("material3"));
                txt_angulo.setText(rs.getString("angulo"));
                txt_rompe.setText(rs.getString("rompeviruta"));
                txt_corte.setText(rs.getString("aplicación"));
                codigo = rs.getString("codigo");
                mar = rs.getString("marca");
                forma = rs.getString("forma");

                longi = rs.getString("longitud");
                port = rs.getString("especificacion");

                String calidad = rs.getString("calidad");
                String forma = rs.getString("forma");
                String angulo = rs.getString("ang");

                ImageIcon imagen1 = new ImageIcon("src/images/" + calidad + ".png");
                Icon icono1 = new ImageIcon(imagen1.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_calidad.setIcon(icono1);

                ImageIcon imagen2 = new ImageIcon("src/images/" + forma + "lf" + ".png");
                Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_forma.setIcon(icono2);
                //}

                ImageIcon imagen3 = new ImageIcon("images/" + angulo + "a" + ".png");
                Icon icono3 = new ImageIcon(imagen3.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_angulo.setIcon(icono3);

                String cod = rs.getString("codigo");
                String estado = rs.getString("descripcion");
            }

        } catch (Exception e) {
        }

        //rellana la información del inserto cuando viene desde la intefaz de porta de fresado
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from insertosf where (codigo = ?) ");

            pst.setString(1, cod4.trim());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                txt_codigo.setText(rs.getString("codigo"));
                txt_descripcion.setText(rs.getString("descripcion"));
                txt_filo.setText(rs.getString("longitud"));
                txt_radio.setText(rs.getString("radio"));
                txt_calidad.setText(rs.getString("calidad"));
                txt_material1.setText(rs.getString("material1"));
                txt_material2.setText(rs.getString("material2"));
                txt_material3.setText(rs.getString("material3"));
                txt_angulo.setText(rs.getString("angulo"));
                txt_rompe.setText(rs.getString("rompeviruta"));
                txt_corte.setText(rs.getString("aplicación"));
                codigo = rs.getString("codigo");
                mar = rs.getString("marca");
                forma = rs.getString("forma");

                longi = rs.getString("longitud");
                port = rs.getString("especificacion");

                String calidad = rs.getString("calidad");
                String forma = rs.getString("forma");
                String angulo = rs.getString("ang");

                ImageIcon imagen1 = new ImageIcon("src/images/" + calidad + ".png");
                Icon icono1 = new ImageIcon(imagen1.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_calidad.setIcon(icono1);

                if (forma == "LBH") {

                    ImageIcon imagen2 = new ImageIcon("images/" + forma + "lf" + ".png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                    label_forma.setIcon(icono2);
                } else if (forma == "LRH") {
                    ImageIcon imagen2 = new ImageIcon("images/" + forma + "lf" + ".png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                    label_forma.setIcon(icono2);

                } else if (forma == "LFH") {
                    ImageIcon imagen2 = new ImageIcon("images/" + forma + "lf" + ".png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                    label_forma.setIcon(icono2);
                } else if (forma == "LCF") {
                    ImageIcon imagen2 = new ImageIcon("images/" + forma + "lf" + ".png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                    label_forma.setIcon(icono2);

                } else {
                    ImageIcon imagen2 = new ImageIcon("images/" + forma + "lf" + ".png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                    label_forma.setIcon(icono2);
                }

                ImageIcon imagen3 = new ImageIcon("images/" + angulo + "a" + ".png");
                Icon icono3 = new ImageIcon(imagen3.getImage());//.getScaledInstance(label_calidad.getWidth(), label_calidad.getHeight(), Image.SCALE_DEFAULT));
                label_angulo.setIcon(icono3);
            }
        } catch (Exception e) {
        }

        if (mar.equals("YG-1")) {
            //Rellena la tabla de portas relacionados con el inserto
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //PreparedStatement pst3 = cn.prepareStatement("select * from portafre where (longitud = ?) AND (especificacion = ?) ");
                PreparedStatement pst3 = cn.prepareStatement("select * from portafre where (longitud = ?) AND (marca2 = ?) AND (forma = ?) ");

                pst3.setString(1, longi);
                pst3.setString(2, mar);
                pst3.setString(3, forma);

                ResultSet rs3 = pst3.executeQuery();

                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);

                PropiedadesTabla();

                while (rs3.next()) {

                    String codi = rs3.getString("codigo");
                    String iso = rs3.getString("porta");

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
                        codigo4 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        InformacionPortaFresado informacionportafresado = new InformacionPortaFresado();
                        informacionportafresado.setVisible(true);
                        codigo4 = "";
                    }

                    if (fila_point > -1 && columna_point == 3) {
                        pdf.contar();
                        if (pdf.limite <= 32) {
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
        } else {

            //Rellena la tabla de portas relacionados con el inserto
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                PreparedStatement pst3 = cn.prepareStatement("select * from portafre where (longitud = ?) AND (especificacion = ?) ");

                pst3.setString(1, longi);
                pst3.setString(2, port);

                ResultSet rs3 = pst3.executeQuery();

                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);

                PropiedadesTabla();

                while (rs3.next()) {

                    String codi = rs3.getString("codigo");
                    String iso = rs3.getString("porta");

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
                        codigo4 = (String) model.getValueAt(fila_point, columna_point = 0);
                        descripcion = (String) model.getValueAt(fila_point, columna_point = 1);
                        InformacionPortaFresado informacionportafresado = new InformacionPortaFresado();
                        informacionportafresado.setVisible(true);
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
        txt_filo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_radio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_calidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_material1 = new javax.swing.JTextField();
        txt_material2 = new javax.swing.JTextField();
        txt_material3 = new javax.swing.JTextField();
        txt_angulo = new javax.swing.JTextField();
        label_angulo = new javax.swing.JLabel();
        label_forma = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_rompe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_corte = new javax.swing.JTextField();
        label_calidad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
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

        txt_filo.setEditable(false);

        jLabel2.setText("Filo");

        jLabel3.setText("Radio");

        txt_radio.setEditable(false);

        jLabel4.setText("Calidad");

        jLabel5.setText("Materiales de trabajo");

        txt_calidad.setEditable(false);

        jLabel6.setText("Excelente");

        jLabel7.setText("Bueno");

        jLabel8.setText("Bueno");

        txt_material1.setEditable(false);

        txt_material2.setEditable(false);

        txt_material3.setEditable(false);

        txt_angulo.setEditable(false);

        jLabel12.setText("Ángulo de incidencia");

        jLabel13.setText("Rompeviruta");

        txt_rompe.setEditable(false);

        jLabel14.setText("Tipo de corte");

        txt_corte.setEditable(false);

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
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_angulo))
                            .addComponent(jLabel12)
                            .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel2)
                                    .addComponent(txt_filo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_forma, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rompe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_corte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_material2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_material1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_material3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel9)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_rompe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel14)
                                        .addGap(5, 5, 5)
                                        .addComponent(txt_corte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_material1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_material2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_material3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txt_filo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(label_forma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_angulo)
                            .addComponent(txt_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(InformacionInsertosf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionInsertosf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionInsertosf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionInsertosf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionInsertosf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ficha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label_angulo;
    private javax.swing.JLabel label_calidad;
    private javax.swing.JLabel label_forma;
    private javax.swing.JTable tabla_resultados;
    private javax.swing.JTextField txt_angulo;
    private javax.swing.JTextField txt_calidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_corte;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_filo;
    private javax.swing.JTextField txt_material1;
    private javax.swing.JTextField txt_material2;
    private javax.swing.JTextField txt_material3;
    private javax.swing.JTextField txt_radio;
    private javax.swing.JTextField txt_rompe;
    // End of variables declaration//GEN-END:variables
}