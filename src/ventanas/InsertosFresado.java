package ventanas;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;

public class InsertosFresado extends javax.swing.JFrame {

    public static InsertosFresado obj = null;
    public static int k = 0;
    public String cod = new String();
    public String port = new String();
    public static String marca = new String();
    public static String descripcion = new String();
    public static String codigo2 = new String();
    public static String codigo3 = new String();
    public static String mar = new String();

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

    public InsertosFresado() {
        initComponents();
        setTitle("Insertos de fresado");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        botonl.setEnabled(false);
        botonr.setEnabled(false);
        botons.setEnabled(false);
        botont.setEnabled(false);
        botonv.setEnabled(false);
        botonw.setEnabled(false);
        botonx.setEnabled(false);
        botona.setEnabled(false);
        botonz.setEnabled(false);
        botone.setEnabled(false);
        botono.setEnabled(false);
        botontp2p.setEnabled(false);
        botonce.setEnabled(false);
        botonfm.setEnabled(false);
        botongbe.setEnabled(false);
        botonhfm.setEnabled(false);
        botonhrm.setEnabled(false);
        botonlaser.setEnabled(false);
        botonmax.setEnabled(false);
        botonpower.setEnabled(false);
        botonproa.setEnabled(false);
        botonprox.setEnabled(false);
        botonrich.setEnabled(false);
        botonam.setEnabled(false);
        boton_aem.setEnabled(false);
        boton_fmr.setEnabled(false);
        boton_rdkt.setEnabled(false);
        boton_sekt.setEnabled(false);
        boton_zbs.setEnabled(false);
        boton_ahfm.setEnabled(false);
        boton_afm9.setEnabled(false);
        PropiedadesTabla();
    }

    public static InsertosFresado getObj() {
        if (obj == null) {
            obj = new InsertosFresado();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botona = new javax.swing.JButton();
        botonl = new javax.swing.JButton();
        botonr = new javax.swing.JButton();
        botons = new javax.swing.JButton();
        botonv = new javax.swing.JButton();
        botont = new javax.swing.JButton();
        botonw = new javax.swing.JButton();
        botonx = new javax.swing.JButton();
        botonz = new javax.swing.JButton();
        check_forma_korloy = new javax.swing.JCheckBox();
        check_familia = new javax.swing.JCheckBox();
        combo_longitud = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        combo_radio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combo_material = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        botonfm = new javax.swing.JButton();
        botonmax = new javax.swing.JButton();
        botonrich = new javax.swing.JButton();
        botonhrm = new javax.swing.JButton();
        botonam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        botonce = new javax.swing.JButton();
        botongbe = new javax.swing.JButton();
        botonhfm = new javax.swing.JButton();
        botonlaser = new javax.swing.JButton();
        botonpower = new javax.swing.JButton();
        botonprox = new javax.swing.JButton();
        botonproa = new javax.swing.JButton();
        botontp2p = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo_espe = new javax.swing.JComboBox<>();
        check_forma_yg = new javax.swing.JCheckBox();
        botone = new javax.swing.JButton();
        botono = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton_aem = new javax.swing.JButton();
        boton_fmr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        boton_rdkt = new javax.swing.JButton();
        boton_sekt = new javax.swing.JButton();
        boton_zbs = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        boton_afm9 = new javax.swing.JButton();
        boton_ahfm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A2.PNG"))); // NOI18N
        botona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaActionPerformed(evt);
            }
        });

        botonl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/L2.png"))); // NOI18N
        botonl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlActionPerformed(evt);
            }
        });

        botonr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/R2.PNG"))); // NOI18N
        botonr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrActionPerformed(evt);
            }
        });

        botons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/S2.PNG"))); // NOI18N
        botons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsActionPerformed(evt);
            }
        });

        botonv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/V2.PNG"))); // NOI18N
        botonv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvActionPerformed(evt);
            }
        });

        botont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T2.PNG"))); // NOI18N
        botont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontActionPerformed(evt);
            }
        });

        botonw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/W2.PNG"))); // NOI18N
        botonw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonwActionPerformed(evt);
            }
        });

        botonx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/X2.png"))); // NOI18N
        botonx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonxActionPerformed(evt);
            }
        });

        botonz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Z2.png"))); // NOI18N
        botonz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonzActionPerformed(evt);
            }
        });

        check_forma_korloy.setText("Selección geometria KORLOY");
        check_forma_korloy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_forma_korloyItemStateChanged(evt);
            }
        });

        check_familia.setText("Selección familia");
        check_familia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_familiaItemStateChanged(evt);
            }
        });

        combo_longitud.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_longitudItemStateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        jLabel1.setText("Longitud del filo");

        combo_radio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_radioItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/radio_icono.png"))); // NOI18N
        jLabel2.setText("Radio");

        combo_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_materialItemStateChanged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material2_icono.png"))); // NOI18N
        jLabel3.setText("Material de trabajo");

        botonfm.setText("FUTURE MILL");
        botonfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonfmActionPerformed(evt);
            }
        });

        botonmax.setText("MAX");
        botonmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmaxActionPerformed(evt);
            }
        });

        botonrich.setText("RICH");
        botonrich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrichActionPerformed(evt);
            }
        });

        botonhrm.setText("HIGH REMOVAL");
        botonhrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhrmActionPerformed(evt);
            }
        });

        botonam.setText("ALPHA MILL");
        botonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonamActionPerformed(evt);
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
            tabla_resultados.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(1).setMaxWidth(310);
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        botonce.setText("CE");
        botonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonceActionPerformed(evt);
            }
        });

        botongbe.setText("GBE");
        botongbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botongbeActionPerformed(evt);
            }
        });

        botonhfm.setText("HIGH FEED");
        botonhfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhfmActionPerformed(evt);
            }
        });

        botonlaser.setText("LASER");
        botonlaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlaserActionPerformed(evt);
            }
        });

        botonpower.setText("POWER");
        botonpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpowerActionPerformed(evt);
            }
        });

        botonprox.setText("PRO X");
        botonprox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonproxActionPerformed(evt);
            }
        });

        botonproa.setText("PRO A");
        botonproa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonproaActionPerformed(evt);
            }
        });

        botontp2p.setText("TP2P");
        botontp2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontp2pActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        jLabel4.setText("Especificación");

        combo_espe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espeItemStateChanged(evt);
            }
        });

        check_forma_yg.setText("Selección geometria YG-1");
        check_forma_yg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_forma_ygItemStateChanged(evt);
            }
        });

        botone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INFE.png"))); // NOI18N
        botone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneActionPerformed(evt);
            }
        });

        botono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INFO.png"))); // NOI18N
        botono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/korloyicono.png"))); // NOI18N
        jLabel6.setToolTipText("KORLOY");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ygicono.png"))); // NOI18N
        jLabel8.setToolTipText("YG-1");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ygicono.png"))); // NOI18N
        jLabel9.setToolTipText("YG-1");

        boton_aem.setText("AEM90");
        boton_aem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aemActionPerformed(evt);
            }
        });

        boton_fmr.setText("AFMRC");
        boton_fmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fmrActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/akkoicono.png"))); // NOI18N
        jLabel7.setToolTipText("AKKO");

        boton_rdkt.setText("RDKT");
        boton_rdkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rdktActionPerformed(evt);
            }
        });

        boton_sekt.setText("SEKT");
        boton_sekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sektActionPerformed(evt);
            }
        });

        boton_zbs.setText("ZBS");
        boton_zbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_zbsActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/korloyicono.png"))); // NOI18N
        jLabel10.setToolTipText("KORLOY");

        boton_afm9.setText("AFM90");
        boton_afm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_afm9ActionPerformed(evt);
            }
        });

        boton_ahfm.setText("AHFM");
        boton_ahfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ahfmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_familia)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonce, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botontp2p, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonprox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonproa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonpower, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(botonhfm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonfm)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonhrm)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonrich, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonmax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonlaser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botongbe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton_fmr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_afm9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton_aem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_ahfm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_sekt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_zbs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_rdkt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonv, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonw, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botona, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonz, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonr, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botons, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botont, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonx, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(check_forma_korloy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(42, 42, 42)
                                .addComponent(check_forma_yg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(combo_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_forma_korloy, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_forma_yg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botons, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonx, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botont, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botona, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(31, 31, 31)
                .addComponent(check_familia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boton_aem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_ahfm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_fmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_afm9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(botonam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonfm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonhrm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonhfm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonrich, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonmax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonlaser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botongbe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonce, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botontp2p, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonprox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonproa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonpower, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton_rdkt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addComponent(boton_sekt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_zbs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        botona.getAccessibleContext().setAccessibleDescription("");
        botonv.getAccessibleContext().setAccessibleDescription("");
        botonw.getAccessibleContext().setAccessibleDescription("");
        botonz.getAccessibleContext().setAccessibleDescription("");
        botonfm.getAccessibleContext().setAccessibleDescription("");
        botonmax.getAccessibleContext().setAccessibleDescription("");
        botonrich.getAccessibleContext().setAccessibleDescription("");
        botonhrm.getAccessibleContext().setAccessibleDescription("");
        botonam.getAccessibleContext().setAccessibleDescription("");
        botonce.getAccessibleContext().setAccessibleDescription("");
        botongbe.getAccessibleContext().setAccessibleDescription("");
        botonhfm.getAccessibleContext().setAccessibleDescription("");
        botonlaser.getAccessibleContext().setAccessibleDescription("");
        botonpower.getAccessibleContext().setAccessibleDescription("");
        botonprox.getAccessibleContext().setAccessibleDescription("");
        botonproa.getAccessibleContext().setAccessibleDescription("");
        botontp2p.getAccessibleContext().setAccessibleDescription("");

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

    private void check_familiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_familiaItemStateChanged
        if (check_familia.isSelected() == true) {
            check_forma_korloy.setEnabled(false);
            check_forma_yg.setEnabled(false);
            botontp2p.setEnabled(true);
            botonce.setEnabled(true);
            botonfm.setEnabled(true);
            botongbe.setEnabled(true);
            botonhfm.setEnabled(true);
            botonhrm.setEnabled(true);
            botonlaser.setEnabled(true);
            botonmax.setEnabled(true);
            botonpower.setEnabled(true);
            botonproa.setEnabled(true);
            botonprox.setEnabled(true);
            botonrich.setEnabled(true);
            botonam.setEnabled(true);
            boton_aem.setEnabled(true);
            boton_fmr.setEnabled(true);
            boton_rdkt.setEnabled(true);
            boton_sekt.setEnabled(true);
            boton_zbs.setEnabled(true);
            boton_ahfm.setEnabled(true);
            boton_afm9.setEnabled(true);

        } else {
            check_forma_korloy.setEnabled(true);
            check_forma_yg.setEnabled(true);
            botontp2p.setEnabled(false);
            botonce.setEnabled(false);
            botonfm.setEnabled(false);
            botongbe.setEnabled(false);
            botonhfm.setEnabled(false);
            botonhrm.setEnabled(false);
            botonlaser.setEnabled(false);
            botonmax.setEnabled(false);
            botonpower.setEnabled(false);
            botonproa.setEnabled(false);
            botonprox.setEnabled(false);
            botonrich.setEnabled(false);
            botonam.setEnabled(false);
            botonam.setEnabled(false);
            boton_aem.setEnabled(false);
            boton_fmr.setEnabled(false);
            boton_rdkt.setEnabled(false);
            boton_sekt.setEnabled(false);
            boton_zbs.setEnabled(false);
            boton_ahfm.setEnabled(false);
            boton_afm9.setEnabled(false);
        }
    }//GEN-LAST:event_check_familiaItemStateChanged

    private void check_forma_korloyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_forma_korloyItemStateChanged
        if (check_forma_korloy.isSelected() == true) {
            check_familia.setEnabled(false);
            check_forma_yg.setEnabled(false);
            combo_espe.removeAllItems();
            combo_espe.setEnabled(false);
            botona.setEnabled(true);
            botonl.setEnabled(true);
            botonr.setEnabled(true);
            botons.setEnabled(true);
            botont.setEnabled(true);
            botonv.setEnabled(true);
            botonw.setEnabled(true);
            botonx.setEnabled(true);
            botonz.setEnabled(true);
            botono.setEnabled(true);
            botone.setEnabled(false);
            marca = "Korloy";

        } else {
            check_familia.setEnabled(true);
            check_forma_yg.setEnabled(true);
            combo_espe.setEnabled(true);
            botona.setEnabled(false);
            botonl.setEnabled(false);
            botonr.setEnabled(false);
            botons.setEnabled(false);
            botont.setEnabled(false);
            botonv.setEnabled(false);
            botonw.setEnabled(false);
            botonx.setEnabled(false);
            botonz.setEnabled(false);
            botono.setEnabled(false);
        }
    }//GEN-LAST:event_check_forma_korloyItemStateChanged

    private void botonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaActionPerformed
        cod = "A";
        cargar_longitud();
    }//GEN-LAST:event_botonaActionPerformed

    private void botonlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlActionPerformed
        cod = "L";
        cargar_longitud();
    }//GEN-LAST:event_botonlActionPerformed

    private void botonrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrActionPerformed
        cod = "R";
        cargar_longitud();
    }//GEN-LAST:event_botonrActionPerformed

    private void botonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsActionPerformed
        cod = "S";
        cargar_longitud();
    }//GEN-LAST:event_botonsActionPerformed

    private void botontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontActionPerformed
        cod = "T";
        cargar_longitud();
    }//GEN-LAST:event_botontActionPerformed

    private void botonvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvActionPerformed
        cod = "V";
        cargar_longitud();
    }//GEN-LAST:event_botonvActionPerformed

    private void botonwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonwActionPerformed
        cod = "W";
        cargar_longitud();
    }//GEN-LAST:event_botonwActionPerformed

    private void botonxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonxActionPerformed
        cod = "X";
        cargar_longitud();
    }//GEN-LAST:event_botonxActionPerformed

    private void botonzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonzActionPerformed
        cod = "Z";
        cargar_longitud();
    }//GEN-LAST:event_botonzActionPerformed

    private void botonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonamActionPerformed
        port = "ALPHA MILL";
        cargar_espe();
    }//GEN-LAST:event_botonamActionPerformed

    private void botonfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonfmActionPerformed
        port = "FUTURE MILL";
        cargar_espe();
    }//GEN-LAST:event_botonfmActionPerformed

    private void botonmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmaxActionPerformed
        port = "MILL MAX";
        cargar_espe();
    }//GEN-LAST:event_botonmaxActionPerformed

    private void botonrichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrichActionPerformed
        port = "RICH MILL";
        cargar_espe();
    }//GEN-LAST:event_botonrichActionPerformed

    private void botonhrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhrmActionPerformed
        port = "HIGH REMOVAL";
        cargar_espe();
    }//GEN-LAST:event_botonhrmActionPerformed

    private void botonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonceActionPerformed
        port = "CE";
        cargar_espe();
    }//GEN-LAST:event_botonceActionPerformed

    private void botongbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botongbeActionPerformed
        // TODO add your handling code here:
        port = "GBE";
        cargar_espe();
    }//GEN-LAST:event_botongbeActionPerformed

    private void botonhfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhfmActionPerformed
        port = "HIGH FEED";
        cargar_espe();
    }//GEN-LAST:event_botonhfmActionPerformed

    private void botonlaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlaserActionPerformed
        port = "LASER MILL";
        cargar_espe();
    }//GEN-LAST:event_botonlaserActionPerformed

    private void botonpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpowerActionPerformed
        port = "POWER BUSTER";
        cargar_espe();
    }//GEN-LAST:event_botonpowerActionPerformed

    private void botonproxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonproxActionPerformed
        port = "PRO X MILL";
        cargar_espe();
    }//GEN-LAST:event_botonproxActionPerformed

    private void botonproaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonproaActionPerformed
        port = "PRO A MILL";
        cargar_espe();
    }//GEN-LAST:event_botonproaActionPerformed

    private void botontp2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontp2pActionPerformed
        port = "TP2P";
        cargar_espe();
    }//GEN-LAST:event_botontp2pActionPerformed

    private void combo_longitudItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_longitudItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_radio();
        }
    }//GEN-LAST:event_combo_longitudItemStateChanged

    private void combo_radioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_radioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_material();
        }
    }//GEN-LAST:event_combo_radioItemStateChanged

    private void combo_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_materialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_materialItemStateChanged

    private void combo_espeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_longitud();
        }
    }//GEN-LAST:event_combo_espeItemStateChanged

    private void check_forma_ygItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_forma_ygItemStateChanged
        if (check_forma_yg.isSelected() == true) {
            check_familia.setEnabled(false);
            check_forma_korloy.setEnabled(false);
            combo_espe.removeAllItems();
            combo_espe.setEnabled(false);
            botona.setEnabled(true);
            botonl.setEnabled(false);
            botonr.setEnabled(true);
            botons.setEnabled(true);
            botont.setEnabled(true);
            botonv.setEnabled(false);
            botonw.setEnabled(false);
            botonx.setEnabled(true);
            botonz.setEnabled(false);
            botone.setEnabled(true);
            botono.setEnabled(false);
            marca = "YG-1";

        } else {
            check_familia.setEnabled(true);
            check_forma_korloy.setEnabled(true);
            combo_espe.setEnabled(true);
            botona.setEnabled(false);
            botonl.setEnabled(false);
            botonr.setEnabled(false);
            botons.setEnabled(false);
            botont.setEnabled(false);
            botonv.setEnabled(false);
            botonw.setEnabled(false);
            botonx.setEnabled(false);
            botonz.setEnabled(false);
            botone.setEnabled(false);
        }
    }//GEN-LAST:event_check_forma_ygItemStateChanged

    private void botoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneActionPerformed
        cod = "E";
        cargar_longitud();
    }//GEN-LAST:event_botoneActionPerformed

    private void botonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonoActionPerformed
        cod = "O";
        cargar_longitud();
    }//GEN-LAST:event_botonoActionPerformed

    private void boton_aemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aemActionPerformed
        port = "AEM90";
        cargar_espe();
    }//GEN-LAST:event_boton_aemActionPerformed

    private void boton_afm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_afm9ActionPerformed
        port = "AFM90";
        cargar_espe();
    }//GEN-LAST:event_boton_afm9ActionPerformed

    private void boton_fmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fmrActionPerformed
        port = "AFMRC";
        cargar_espe();
    }//GEN-LAST:event_boton_fmrActionPerformed

    private void boton_ahfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ahfmActionPerformed
        port = "AHFM";
        cargar_espe();
    }//GEN-LAST:event_boton_ahfmActionPerformed

    private void boton_rdktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rdktActionPerformed
        port = "RDKT";
        cargar_espe();
    }//GEN-LAST:event_boton_rdktActionPerformed

    private void boton_sektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sektActionPerformed
        port = "SEKT";
        cargar_espe();
    }//GEN-LAST:event_boton_sektActionPerformed

    private void boton_zbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_zbsActionPerformed
        port = "ZBS";
        cargar_espe();
    }//GEN-LAST:event_boton_zbsActionPerformed

    private void cargar_espe() {
        combo_espe.removeAllItems();
        if (check_familia.isEnabled()) {

            try {
                //Conexión con la base de datos 
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst2 = cn2.prepareStatement("select distinct especificacion from insertosf where (total > 0) AND (porta = ?) order by longitud asc ");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst2.setString(1, port);

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {

                    String espe = rs2.getString("especificacion");
                    combo_espe.addItem(espe);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_longitud check especificacion");
            }
        }
    }

    private void cargar_longitud() {
        combo_longitud.removeAllItems();
        if (check_forma_korloy.isEnabled() || check_forma_yg.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst = cn.prepareStatement("select distinct longitud from insertosf where (total > 0) AND (forma = ?) AND (marca = ?) order by longitud asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst.setString(1, cod);
                pst.setString(2, marca);

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs = pst.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs.next()) {
                    String lon = rs.getString("longitud");
                    combo_longitud.addItem(lon);
                }
                rs.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_longitud check forma");
            }
        }
        if (check_familia.isEnabled()) {

            try {
                //Conexión con la base de datos 
                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst2 = cn2.prepareStatement("select distinct longitud from insertosf where (total > 0) AND (porta = ?) AND (especificacion= ?) order by longitud asc ");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst2.setString(1, port);
                pst2.setString(2, combo_espe.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs2 = pst2.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs2.next()) {

                    String lon = rs2.getString("longitud");
                    combo_longitud.addItem(lon);
                }
                rs2.close();
                cn2.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_longitud check familia");
            }
        }
    }

    private void cargar_radio() {
        combo_radio.removeAllItems();
        if (check_forma_korloy.isEnabled() || check_forma_yg.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst3 = cn3.prepareStatement("select distinct radio from insertosf where (total > 0) AND (forma = ?) AND (longitud=?) AND (marca = ?) order by radio asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst3.setString(1, cod);
                pst3.setString(2, combo_longitud.getSelectedItem().toString());
                pst3.setString(3, marca);

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs3 = pst3.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs3.next()) {
                    String rad = rs3.getString("radio");
                    combo_radio.addItem(rad);
                }
                rs3.close();
                cn3.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_radio check forma");
            }
        }
        if (check_familia.isEnabled()) {
            try {

                //Conexión con la base de datos 
                Connection cn4 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst4 = cn4.prepareStatement("select distinct radio from insertosf where (total > 0) AND (porta = ?) AND (especificacion = ?) AND (longitud=?) order by radio asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst4.setString(1, port);
                pst4.setString(2, combo_espe.getSelectedItem().toString());
                pst4.setString(3, combo_longitud.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs4 = pst4.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs4.next()) {
                    String rad = rs4.getString("radio");
                    combo_radio.addItem(rad);
                }
                rs4.close();
                cn4.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_radio check familia");
            }
        }
    }

    private void cargar_material() {
        combo_material.removeAllItems();
        if (check_forma_korloy.isEnabled() || check_forma_yg.isEnabled()) {
            try {
                //Conexión con la base de datos
                Connection cn5 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst5 = cn5.prepareStatement("select distinct material1 from insertosf where (total > 0) AND (forma = ?) AND (longitud=?) AND (radio=?) AND (marca = ?) order by material1 asc");
                //PreparedStatement pst5 = cn5.prepareStatement("select distinct material1 from insertosf where (total > 0) AND (forma = ?) AND (longitud=?) AND (radio=?) AND (marca = ?) union select distinct material2 from insertosf where (total > 0) AND (forma = ?) AND (longitud=?) AND (radio=?) AND (marca = ?) order by material1 asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst5.setString(1, cod);
                pst5.setString(2, combo_longitud.getSelectedItem().toString());
                pst5.setString(3, combo_radio.getSelectedItem().toString());
                pst5.setString(4, marca);

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs5 = pst5.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs5.next()) {
                    String mat = rs5.getString("material1");
                    combo_material.addItem(mat);
                }
                rs5.close();
                cn5.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_material check forma");
            }
        }
        if (check_familia.isEnabled()) {
            try {
                //Conexión con la base de datos
                Connection cn6 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos
                PreparedStatement pst6 = cn6.prepareStatement("select distinct material1 from insertosf where (total > 0) AND (porta=?) AND (especificacion=?) AND (longitud=?) AND (radio=?) order by material1 asc");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos
                pst6.setString(1, port);
                pst6.setString(2, combo_espe.getSelectedItem().toString());
                pst6.setString(3, combo_longitud.getSelectedItem().toString());
                pst6.setString(4, combo_radio.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda
                ResultSet rs6 = pst6.executeQuery();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs6.next()) {
                    String mat = rs6.getString("material1");
                    combo_material.addItem(mat);
                }
                rs6.close();
                cn6.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en cargar_material check familia");
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

        if (check_forma_korloy.isEnabled() || check_forma_yg.isEnabled()) {
            try {
                //Conexión con la base de datos 
                Connection cn7 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst7 = cn7.prepareStatement("select * from insertosf where (total > 0) AND (forma = ?) AND (longitud = ?) AND (radio = ?) AND (material1 = ?) AND (marca = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst7.setString(1, cod);
                pst7.setString(2, combo_longitud.getSelectedItem().toString());
                pst7.setString(3, combo_radio.getSelectedItem().toString());
                pst7.setString(4, combo_material.getSelectedItem().toString());
                pst7.setString(5, marca);

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs7 = pst7.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                model.setRowCount(0);

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();
                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs7.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs7.getString("codigo");
                    String estado = rs7.getString("descripcion");
                    String total = rs7.getString("total");
                    String me = rs7.getString("me");
                    String ca = rs7.getString("ca");
                    String bo = rs7.getString("bo");
                    String ma = rs7.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
                }
                PreparedStatement pst8 = cn7.prepareStatement("select * from insertosf where (total > 0) AND (forma = ?) AND (longitud = ?) AND (radio = ?) AND (material2 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                // pst.setString(1, txt_nombre.getText().trim());
                pst8.setString(1, cod);
                pst8.setString(2, combo_longitud.getSelectedItem().toString());
                pst8.setString(3, combo_radio.getSelectedItem().toString());
                pst8.setString(4, combo_material.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs8 = pst8.executeQuery();

                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs8.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod1 = rs8.getString("codigo");
                    String estado1 = rs8.getString("descripcion");
                    String total = rs8.getString("total");
                    String me = rs8.getString("me");
                    String ca = rs8.getString("ca");
                    String bo = rs8.getString("bo");
                    String ma = rs8.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod1, estado1, icono1, icono2, total, me, ca, bo, ma});
                }
                rs7.close();
                rs8.close();
                cn7.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check forma");
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
                        InformacionInsertosf informacioninsertosf = new InformacionInsertosf();
                        informacioninsertosf.setVisible(true);
                        codigo2 = "";
                    }

                    if (fila_point > -1 && columna_point == 3) {
                        pdf.contar();
                        if (pdf.limite <= 32) {
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
        if (check_familia.isEnabled()) {
            try {

                //Conexión con la base de datos 
                Connection cn9 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
                //Instrucciones para la busqueda en la base de datos  
                PreparedStatement pst9 = cn9.prepareStatement("select * from insertosf where (total > 0) AND (porta = ?) AND (especificacion=?) AND (longitud = ?) AND (radio = ?) AND (material1 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                // pst.setString(1, txt_nombre.getText().trim());
                pst9.setString(1, port);
                pst9.setString(2, combo_espe.getSelectedItem().toString());
                pst9.setString(3, combo_longitud.getSelectedItem().toString());
                pst9.setString(4, combo_radio.getSelectedItem().toString());
                pst9.setString(5, combo_material.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs9 = pst9.executeQuery();

                //Se limpian los componentes de la tabla luego de cada busqueda 
                //combobox2.removeAllItems();
                model.setRowCount(0);
                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs9.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod = rs9.getString("codigo");
                    String estado = rs9.getString("descripcion");
                    String total = rs9.getString("total");
                    String me = rs9.getString("me");
                    String ca = rs9.getString("ca");
                    String bo = rs9.getString("bo");
                    String ma = rs9.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
                }

                PreparedStatement pst10 = cn9.prepareStatement("select * from insertosf where (total > 0) AND (porta = ?) AND (especificacion=?) AND (longitud = ?) AND (radio = ?) AND (material2 = ?)");

                //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
                pst10.setString(1, port);
                pst10.setString(2, combo_espe.getSelectedItem().toString());
                pst10.setString(3, combo_longitud.getSelectedItem().toString());
                pst10.setString(4, combo_radio.getSelectedItem().toString());
                pst10.setString(5, combo_material.getSelectedItem().toString());

                //Declaración de la variable que alberga el resultado de la busqueda  
                ResultSet rs10 = pst10.executeQuery();
                //Ajuste de la tabla al JScrollPane 
                tabla_resultados = new JTable(model);
                jScrollPane1.setViewportView(tabla_resultados);
                PropiedadesTabla();

                //Metodo para que busque todos los resultados posible con las condiciones dadas
                while (rs10.next()) {

                    //txt_codigo.setText(rs.getString("codigo"));
                    String cod1 = rs10.getString("codigo");
                    String estado1 = rs10.getString("descripcion");
                    String total = rs10.getString("total");
                    String me = rs10.getString("me");
                    String ca = rs10.getString("ca");
                    String bo = rs10.getString("bo");
                    String ma = rs10.getString("ma");

                    ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                    Icon icono1 = new ImageIcon(imagen1.getImage());
                    ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                    Icon icono2 = new ImageIcon(imagen2.getImage());
                    model.addRow(new Object[]{cod1, estado1, icono1, icono2, total, me, ca, bo, ma});
                }
                rs9.close();
                rs10.close();
                cn9.close();
            } catch (Exception e) {
                System.out.println("Se perdio la conexión en buscar check familia");
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
                        InformacionInsertosf informacioninsertosf = new InformacionInsertosf();
                        informacioninsertosf.setVisible(true);
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
            java.util.logging.Logger.getLogger(InsertosFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertosFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertosFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertosFresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertosFresado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aem;
    private javax.swing.JButton boton_afm9;
    private javax.swing.JButton boton_ahfm;
    private javax.swing.JButton boton_fmr;
    private javax.swing.JButton boton_rdkt;
    private javax.swing.JButton boton_sekt;
    private javax.swing.JButton boton_zbs;
    private javax.swing.JButton botona;
    private javax.swing.JButton botonam;
    private javax.swing.JButton botonce;
    private javax.swing.JButton botone;
    private javax.swing.JButton botonfm;
    private javax.swing.JButton botongbe;
    private javax.swing.JButton botonhfm;
    private javax.swing.JButton botonhrm;
    private javax.swing.JButton botonl;
    private javax.swing.JButton botonlaser;
    private javax.swing.JButton botonmax;
    private javax.swing.JButton botono;
    private javax.swing.JButton botonpower;
    private javax.swing.JButton botonproa;
    private javax.swing.JButton botonprox;
    private javax.swing.JButton botonr;
    private javax.swing.JButton botonrich;
    private javax.swing.JButton botons;
    private javax.swing.JButton botont;
    private javax.swing.JButton botontp2p;
    private javax.swing.JButton botonv;
    private javax.swing.JButton botonw;
    private javax.swing.JButton botonx;
    private javax.swing.JButton botonz;
    private javax.swing.JCheckBox check_familia;
    private javax.swing.JCheckBox check_forma_korloy;
    private javax.swing.JCheckBox check_forma_yg;
    private javax.swing.JComboBox<String> combo_espe;
    private javax.swing.JComboBox<String> combo_longitud;
    private javax.swing.JComboBox<String> combo_material;
    private javax.swing.JComboBox<String> combo_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
