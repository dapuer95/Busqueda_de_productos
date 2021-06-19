package ventanas;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;

public class pdf extends javax.swing.JFrame {

    public static pdf obj = null;

    public static String cod = "";
    public static String f1 = "";
    public static String cod_buscar = "";
    public static String cantidad = "";
    public static double total_2;
    public static int fila_point;
    public static int fila_pointo;
    public static int x1;
    public static int limite;
    public static int total_total;
    public static int total_nuevo;
    public static int item;
    public static String total_uni = "";
    public static String codigo2 = new String();
    ArrayList<String> listalon = new ArrayList();
    public HashSet hs = new HashSet();

    String data[][] = {};
    //String cabeza[] = {"Codigo", "Descripción"};
    String cabeza[] = {"Item", "Codigo", "Descripción", "Caracteristicas", "Ref", "Marca", "Cantidad", "Precio uni", "Precio total"};
    public DefaultTableModel model = new DefaultTableModel(data, cabeza) {

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

    public pdf() {
        initComponents();
        items();
        setTitle("Formato de cotización");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        cod = prueba.codigo2;
        PropiedadesTabla();
    }

    public static pdf getObj() {
        if (obj == null) {
            obj = new pdf();
        }
        return obj;
    }

    public static void AddRowToJTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) tabla_resultados.getModel();
        model.addRow(dataRow);
    }

    public static void calcular_total() {
        int contar = tabla_resultados.getRowCount();
        double suma = 0;
        double iva = 0;
        double total = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Double.parseDouble(tabla_resultados.getValueAt(i, 8).toString());
            iva = suma * 0.19;
            total = suma * 1.19;
        }
        tabla_total.setValueAt(suma, 0, 1);
        tabla_total.setValueAt(iva, 1, 1);
        tabla_total.setValueAt(total, 2, 1);
    }

    public static void contar() {
        limite = tabla_resultados.getRowCount();
    }

    public void contar_items() {
        item = tabla_resultados.getRowCount() + 1;
    }

    /// Llena la tabla de la cotización
    public static void cargar_nombre() {
        int x1 = tabla_resultados.getRowCount();
        int x = tabla_resultados.getRowCount() - 1;
        if (x1 > 0) {
            try {

                cod_buscar = tabla_resultados.getValueAt(x, 1).toString();
                cantidad = tabla_resultados.getValueAt(x, 6).toString();
                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select * from productos where (codigo= ?)");
                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos

                pst5.setString(1, cod_buscar);

                // Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs5 = pst5.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {

                    String nombre = rs5.getString("nombre");
                    String descripcion = rs5.getString("descripcion");
                    String referencia = rs5.getString("referencia");
                    String marca = rs5.getString("marca");
                    String precio = rs5.getString("precio");
                    int item = tabla_resultados.getRowCount();

                    double canti = Double.parseDouble(cantidad);
                    double precio_uni = Double.parseDouble(precio);
                    double precio_total = precio_uni * canti;

                    tabla_resultados.setValueAt(item, x, 0);
                    tabla_resultados.setValueAt(nombre, x, 2);
                    tabla_resultados.setValueAt(descripcion, x, 3);
                    tabla_resultados.setValueAt(referencia, x, 4);
                    tabla_resultados.setValueAt(marca, x, 5);
                    tabla_resultados.setValueAt(precio_uni, x, 7);
                    tabla_resultados.setValueAt(precio_total, x, 8);
                }
                rs5.close();
                cn5.close();
            } catch (NumberFormatException | SQLException e) {
                System.out.println("no hay conexion en buscar_nombre");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_total = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        label_ciudad = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_correo = new javax.swing.JLabel();
        label_pbx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_pago = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JLabel();
        txt_email = new javax.swing.JLabel();
        txt_zona = new javax.swing.JLabel();
        txt_asesor = new javax.swing.JLabel();
        txt_mail_ase = new javax.swing.JLabel();
        txt_celular = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_consecutivo = new javax.swing.JTextField();
        txt_nit = new javax.swing.JTextField();
        txt_nombre_consultar = new javax.swing.JTextField();
        boton_generar = new javax.swing.JButton();
        combo_ciudad = new javax.swing.JComboBox<>();
        combo_zona = new javax.swing.JComboBox<>();
        combo_pago = new javax.swing.JComboBox<>();
        boton_limpiar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_recargar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(895, 730));

        jScrollPane3.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(560, 650));

        panel.setForeground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tabla_resultados.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Codigo", "Descripción", "Caracteristicas", "Ref", "Marca", "Cantidad", "Precio uni", "Precio total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_resultados.setRowHeight(12);
        tabla_resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_resultadosMouseClicked(evt);
            }
        });
        tabla_resultados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_resultadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_resultados);
        if (tabla_resultados.getColumnModel().getColumnCount() > 0) {
            tabla_resultados.getColumnModel().getColumn(0).setMaxWidth(30);
            tabla_resultados.getColumnModel().getColumn(1).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(45);
            tabla_resultados.getColumnModel().getColumn(7).setMinWidth(51);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(51);
            tabla_resultados.getColumnModel().getColumn(8).setMinWidth(57);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(57);
        }

        jScrollPane2.setBorder(null);

        tabla_total.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla_total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SUBTOTAL", null},
                {"IVA 19%", null},
                {"TOTAL", null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_total.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(tabla_total);
        if (tabla_total.getColumnModel().getColumnCount() > 0) {
            tabla_total.getColumnModel().getColumn(0).setMinWidth(85);
            tabla_total.getColumnModel().getColumn(0).setMaxWidth(85);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nit cliente");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Razón social");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cuidad");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Zona");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Asesor");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("E - Mail");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Celular");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Forma de pago");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COTIZACION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Vigencia de la oferta");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("Tiempo de entrega");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("BANCO DE BOGOTA cuenta corriente No 054069521");

        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(0, 0, 0));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("7 días");
        jTextField15.setAlignmentX(0.0F);
        jTextField15.setAlignmentY(0.0F);
        jTextField15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(0, 0, 0));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("1 día hábil");
        jTextField16.setAlignmentX(0.0F);
        jTextField16.setAlignmentY(0.0F);
        jTextField16.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));

        label_ciudad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_ciudad.setText("BOGOTÁ");

        label_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_direccion.setText("Calle 18 No  22 - 16 Paloquemao");

        label_correo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_correo.setText("bogota@herratec.com.co");

        label_pbx.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_pbx.setText("PBX 7568080");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Identificación empresa");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 54, 115));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Consecutivo No.");

        txt_pago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_pago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pago.setToolTipText("");
        txt_pago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_ciudad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_ciudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_zona.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_zona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_asesor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_asesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_mail_ase.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_mail_ase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_celular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_celular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel19.setBackground(new java.awt.Color(51, 51, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("NOTA");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Precios sujetos a cambios sin aviso previo");

        txt_consecutivo.setBackground(new java.awt.Color(255, 255, 255));
        txt_consecutivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_consecutivo.setForeground(new java.awt.Color(0, 0, 0));
        txt_consecutivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_consecutivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txt_nit.setBackground(new java.awt.Color(255, 255, 255));
        txt_nit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nit.setForeground(new java.awt.Color(0, 0, 0));
        txt_nit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txt_nit.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_nit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nitKeyReleased(evt);
            }
        });

        txt_nombre_consultar.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_consultar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre_consultar.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre_consultar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre_consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txt_nombre_consultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombre_consultarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nombre_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_pago, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_zona, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_asesor, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_mail_ase, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txt_consecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(15, 15, 15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20))
                                .addComponent(jLabel18))
                            .addGap(66, 66, 66)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_pbx)
                                .addComponent(label_correo)
                                .addComponent(label_direccion)
                                .addComponent(label_ciudad))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_nombre_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txt_consecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_mail_ase, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(label_ciudad)
                        .addGap(1, 1, 1)
                        .addComponent(label_direccion)
                        .addGap(3, 3, 3)
                        .addComponent(label_correo)
                        .addGap(1, 1, 1)
                        .addComponent(label_pbx)))
                .addGap(15, 15, 15))
        );

        jScrollPane3.setViewportView(panel);

        boton_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf_3.png"))); // NOI18N
        boton_generar.setToolTipText("Exporta la cotización a formato PDF");
        boton_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_generarActionPerformed(evt);
            }
        });

        combo_ciudad.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        combo_ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad", "Medellín", "Bogotá", "Cali", "Manizales" }));
        combo_ciudad.setPreferredSize(new java.awt.Dimension(87, 32));
        combo_ciudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_ciudadItemStateChanged(evt);
            }
        });

        combo_zona.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        combo_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona", "12", "14", "18", "25", "29", "30", "36", "37", "38", "39", "40", "44", "45" }));
        combo_zona.setToolTipText("Codigo asesor");
        combo_zona.setPreferredSize(new java.awt.Dimension(58, 32));
        combo_zona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_zonaItemStateChanged(evt);
            }
        });

        combo_pago.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        combo_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forma de pago", "Cotización", "Credito Medellín", "Contado Medellín", "Credito Bogotá", "Contado Bogotá", "Credito Cali", "Contado Cali", "Credito Manizales", "Contado Manizales" }));
        combo_pago.setPreferredSize(new java.awt.Dimension(137, 32));
        combo_pago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_pagoItemStateChanged(evt);
            }
        });

        boton_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar_tabla.png"))); // NOI18N
        boton_limpiar.setToolTipText("Limpia todos los campos de la tabla");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar_fila_6.png"))); // NOI18N
        boton_eliminar.setToolTipText("Elimina la fila que se encuentre seleccionada");
        boton_eliminar.setBorder(null);
        boton_eliminar.setBorderPainted(false);
        boton_eliminar.setOpaque(false);
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asesor.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colombia.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pago.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(combo_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(combo_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301)
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void items() {

        TextAutoCompleter textautocompleter = new TextAutoCompleter(txt_nombre_consultar);
        try {
            Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pstt = cnt.prepareStatement("Select distinct nombre from clientes");

            ResultSet rst = pstt.executeQuery();

            while (rst.next()) {
                textautocompleter.addItem(rst.getString("nombre"));
            }
            rst.close();
            cnt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no hay conexion en el textautocompleter");
        }
        llenar_datos();
    }

    public void llenar_datos() {
        cod = txt_nombre_consultar.getText().toString();
        try {
            Connection cnt2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pstt2 = cnt2.prepareStatement("Select * from clientes where (nombre=?)");
            pstt2.setString(1, cod);
            ResultSet rst2 = pstt2.executeQuery();

            while (rst2.next()) {
                String nit = rst2.getString("nit");
                txt_nit.setText(nit);
            }
            rst2.close();
            cnt2.close();
        } catch (Exception e) {
        }
    }

    private void boton_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_generarActionPerformed

        JFileChooser dlg = new JFileChooser();
        dlg.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.PDF", ".pdf", "PDF"));
        int Option = dlg.showSaveDialog(this);
        if (Option == JFileChooser.APPROVE_OPTION) {

            File f = dlg.getSelectedFile();
            f1 = f.toString();
        }

        Document document = new Document();
        try {

            FileOutputStream archivo = new FileOutputStream(f1 + ".pdf");
            PdfWriter writer = PdfWriter.getInstance(document, archivo);
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            PdfTemplate template = contentByte.createTemplate(555, 800);
            Graphics2D g2 = template.createGraphics(555, 800);
            g2.scale(0.65, 0.65);
            panel.print(g2);
            g2.dispose();
            contentByte.addTemplate(template, 20, 5);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El documento no se ha podido guardar. Por favor revise que no se encuentre abierto", "Alerta", JOptionPane.WARNING_MESSAGE);
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    }//GEN-LAST:event_boton_generarActionPerformed

    private void combo_zonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_zonaItemStateChanged
        String zona = combo_zona.getSelectedItem().toString();
        txt_zona.setText(zona);
        if (zona.equals("12")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("14")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("18")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("25")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("29")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("30")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("36")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("37")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("38")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("39")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("40")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("44")) {
            txt_asesor.setText("Camila Gomez");
            txt_mail_ase.setText("c.gomez@gmail.com.co");
            txt_celular.setText("350-6778856");
        } else if (zona.equals("45")) {
            txt_asesor.setText("Juan Perez");
            txt_mail_ase.setText("j.perez@gmail.com.co");
            txt_celular.setText("350-6778856");
        }

    }//GEN-LAST:event_combo_zonaItemStateChanged

    private void combo_ciudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_ciudadItemStateChanged
        // TODO add your handling code here:
        String ciudad = combo_ciudad.getSelectedItem().toString();

        if (ciudad.equals("Medellín")) {
            label_ciudad.setText(ciudad);
            label_direccion.setText("CARRERA 789");
            label_correo.setText("medellin@gmail.com.co");
            label_pbx.setText("565665");
        } else if (ciudad.equals("Bogotá")) {
            label_ciudad.setText(ciudad);
            label_direccion.setText("CALLE 754");
            label_correo.setText("bogota@gmail.com.co");
            label_pbx.setText("4466");
        } else if (ciudad.equals("Envigado")) {
            label_ciudad.setText(ciudad);
            label_direccion.setText("CALLE 789");
            label_correo.setText("envigado@gmail.com.co");
            label_pbx.setText("565666");
        } else if (ciudad.equals("Pereira")) {
            label_ciudad.setText(ciudad);
            label_direccion.setText("CALLE 754");
            label_correo.setText("Pereira@gmail.com.co");
            label_pbx.setText("1111111");
        }
    }//GEN-LAST:event_combo_ciudadItemStateChanged

    private void combo_pagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_pagoItemStateChanged
        // TODO add your handling code here:
        String pago = combo_pago.getSelectedItem().toString();
        txt_pago.setText(pago);
    }//GEN-LAST:event_combo_pagoItemStateChanged

    private void fila() {
        tabla_resultados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("entro al mouse");
                int fila_point = tabla_resultados.rowAtPoint(e.getPoint());
                System.out.println("la fila es " + fila_point);
            }
        });
    }
    private void tabla_resultadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_resultadosKeyReleased
    }//GEN-LAST:event_tabla_resultadosKeyReleased

    private void tabla_resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadosMouseClicked
        int fila_pointo = tabla_resultados.rowAtPoint(evt.getPoint());
        System.out.println("la fila es " + fila_pointo);
        double cati = Double.parseDouble(tabla_resultados.getValueAt(fila_pointo, 6).toString());
        double unidad = Double.parseDouble(tabla_resultados.getValueAt(fila_pointo, 7).toString());
        double total_2 = cati * unidad;
        tabla_resultados.setValueAt(total_2, fila_pointo, 8);
        calcular_total();

    }//GEN-LAST:event_tabla_resultadosMouseClicked

    private void txt_nitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nitKeyReleased
        cod = txt_nit.getText().toString();
        try {
            Connection cnt2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pstt2 = cnt2.prepareStatement("Select * from clientes where (nit=?)");

            pstt2.setString(1, cod);
            ResultSet rst2 = pstt2.executeQuery();

            while (rst2.next()) {
                String nombre = rst2.getString("nombre");
                String telefono = rst2.getString("telefono");
                String direccion = rst2.getString("direccion");
                String ciudad = rst2.getString("ciudad");
                String email = rst2.getString("email");
                txt_nombre_consultar.setText(nombre);
                txt_telefono.setText(telefono);
                txt_direccion.setText(direccion);
                txt_ciudad.setText(ciudad);
                txt_email.setText(email);
            }
            rst2.close();
            cnt2.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_nitKeyReleased

    private void txt_nombre_consultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_consultarKeyReleased
        cod = txt_nombre_consultar.getText().toString();
        try {
            Connection cnt2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            PreparedStatement pstt2 = cnt2.prepareStatement("Select * from clientes where (nombre=?)");

            pstt2.setString(1, cod);
            ResultSet rst2 = pstt2.executeQuery();

            while (rst2.next()) {
                String nit = rst2.getString("nit");
                String telefono = rst2.getString("telefono");
                String direccion = rst2.getString("direccion");
                String ciudad = rst2.getString("ciudad");
                String email = rst2.getString("email");
                txt_nit.setText(nit);
                txt_telefono.setText(telefono);
                txt_direccion.setText(direccion);
                txt_ciudad.setText(ciudad);
                txt_email.setText(email);
            }
            rst2.close();
            cnt2.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_nombre_consultarKeyReleased

    private void PropiedadesTabla() {
        tabla_resultados.getTableHeader().setPreferredSize(new java.awt.Dimension(20, 20));
        tabla_total.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 0));
        tabla_resultados.getTableHeader().setFont(new Font("Cooper Black", 1, 11));
        ((DefaultTableCellRenderer) tabla_resultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabla_resultados.setFont(new Font("Dialog", Font.PLAIN, 12));
        tabla_resultados.setRowHeight(14);

        TableColumn item = tabla_resultados.getColumn("Item");
        TableColumn codigo = tabla_resultados.getColumn("Codigo");
        TableColumn descripcion = tabla_resultados.getColumn("Descripción");
        TableColumn caracteristicas = tabla_resultados.getColumn("Caracteristicas");
        TableColumn ref = tabla_resultados.getColumn("Ref");
        TableColumn marca = tabla_resultados.getColumn("Marca");
        TableColumn cantidad = tabla_resultados.getColumn("Cantidad");
        TableColumn preciouni = tabla_resultados.getColumn("Precio uni");
        TableColumn preciototal = tabla_resultados.getColumn("Precio total");
        item.setMaxWidth(35);
        item.setMinWidth(35);
        codigo.setMaxWidth(55);
        codigo.setMinWidth(55);
        ref.setMaxWidth(68);
        ref.setMinWidth(68);
        marca.setMaxWidth(60);
        marca.setMinWidth(60);
        cantidad.setMaxWidth(60);
        cantidad.setMinWidth(60);
        preciouni.setMaxWidth(78);
        preciouni.setMinWidth(78);
        preciototal.setMaxWidth(80);
        preciototal.setMinWidth(80);
        descripcion.setMaxWidth(200);
        descripcion.setMinWidth(200);
        caracteristicas.setMaxWidth(210);
        caracteristicas.setMinWidth(210);
    }


    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed

        int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro de limpiar toda la tabla?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            try {

                //Conexión con la base de datos 
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select * from productos");

                ResultSet rs5 = pst5.executeQuery();

                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);

                PropiedadesTabla();

                while (rs5.next()) {

                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("no hay conexion en buscar");
            }
        }
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        // TODO add your handling code here:
        int item = tabla_resultados.getRowCount();
        int x = tabla_resultados.getRowCount() - 1;
        if (item > 0) {
            int p = tabla_resultados.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tabla_resultados.getModel();
            model.removeRow(p);
            calcular_total();

            for (int i = 0; i < x; i++) {
                System.out.println(i);
                tabla_resultados.setValueAt(i + 1, i, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay filas seleccionadas para eliminar");
        }

    }//GEN-LAST:event_boton_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdf().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton boton_eliminar;
    public javax.swing.JButton boton_generar;
    public javax.swing.JButton boton_limpiar;
    public javax.swing.JComboBox<String> combo_ciudad;
    public javax.swing.JComboBox<String> combo_pago;
    public javax.swing.JComboBox<String> combo_zona;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextField15;
    public javax.swing.JTextField jTextField16;
    public javax.swing.JLabel label_ciudad;
    public javax.swing.JLabel label_correo;
    public javax.swing.JLabel label_direccion;
    public javax.swing.JLabel label_pbx;
    public javax.swing.JMenuItem menu_recargar;
    public javax.swing.JPanel panel;
    public static javax.swing.JTable tabla_resultados;
    public static javax.swing.JTable tabla_total;
    public javax.swing.JLabel txt_asesor;
    public javax.swing.JLabel txt_celular;
    public javax.swing.JLabel txt_ciudad;
    public javax.swing.JTextField txt_consecutivo;
    public javax.swing.JLabel txt_direccion;
    public javax.swing.JLabel txt_email;
    public javax.swing.JLabel txt_mail_ase;
    public javax.swing.JTextField txt_nit;
    public javax.swing.JTextField txt_nombre_consultar;
    public javax.swing.JLabel txt_pago;
    public javax.swing.JLabel txt_telefono;
    public javax.swing.JLabel txt_zona;
    // End of variables declaration//GEN-END:variables
}
