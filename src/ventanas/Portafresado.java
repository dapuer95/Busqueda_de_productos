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
import static ventanas.Portafresado.cod;
import javax.swing.JOptionPane;

public class Portafresado extends javax.swing.JFrame {

    public static int k = 0;
    public static Portafresado obj = null;
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

    public Portafresado() {
        initComponents();
        setTitle("Porta insertos de torneado ");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public static Portafresado getObj() {
        if (obj == null) {
            obj = new Portafresado();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_diametro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boton_hrm = new javax.swing.JButton();
        boton_futurer = new javax.swing.JButton();
        combo_longitud = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        boton_alpha = new javax.swing.JButton();
        boton_mill = new javax.swing.JButton();
        boton_laser = new javax.swing.JButton();
        boton_hfm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultados = new javax.swing.JTable();
        boton_ce = new javax.swing.JButton();
        boton_rich = new javax.swing.JButton();
        combo_tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_espe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        boton_aem = new javax.swing.JButton();
        boton_fmr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        boton_rdkt = new javax.swing.JButton();
        boton_sekt = new javax.swing.JButton();
        boton_zbs = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        boton_afm = new javax.swing.JButton();
        boton_ahfm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Seleccione la familia de fresado según la marca");

        combo_diametro.setToolTipText("");
        combo_diametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_diametroItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diametro_icono.png"))); // NOI18N
        jLabel2.setText("Diametro");

        boton_hrm.setText("HIGH REMOVAL");
        boton_hrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_hrmActionPerformed(evt);
            }
        });

        boton_futurer.setText("FUTURE MILL");
        boton_futurer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_futurerActionPerformed(evt);
            }
        });

        combo_longitud.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_longitudItemStateChanged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/longitud_icono.png"))); // NOI18N
        jLabel3.setText("Longitud inserto");

        boton_alpha.setText("ALPHA MILL");
        boton_alpha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_alphaActionPerformed(evt);
            }
        });

        boton_mill.setText("MILL MAX");
        boton_mill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_millActionPerformed(evt);
            }
        });

        boton_laser.setText("LASER MILL");
        boton_laser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_laserActionPerformed(evt);
            }
        });

        boton_hfm.setText("HIGH FEED");
        boton_hfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_hfmActionPerformed(evt);
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
            tabla_resultados.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla_resultados.getColumnModel().getColumn(3).setMaxWidth(50);
            tabla_resultados.getColumnModel().getColumn(4).setMaxWidth(38);
            tabla_resultados.getColumnModel().getColumn(5).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(6).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(7).setMaxWidth(27);
            tabla_resultados.getColumnModel().getColumn(8).setMaxWidth(27);
        }

        boton_ce.setText("CE");
        boton_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ceActionPerformed(evt);
            }
        });

        boton_rich.setText("RICH MILL");
        boton_rich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_richActionPerformed(evt);
            }
        });

        combo_tipo.setToolTipText("");
        combo_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipoItemStateChanged(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresa_icono.png"))); // NOI18N
        jLabel5.setText("Especificacion");

        combo_espe.setToolTipText("");
        combo_espe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_espeItemStateChanged(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/korloyicono.png"))); // NOI18N
        jLabel6.setToolTipText("KORLOY");

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ygicono.png"))); // NOI18N
        jLabel8.setToolTipText("YG-1");

        boton_afm.setText("AFM90");
        boton_afm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_afmActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_rich, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_hfm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_hrm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_mill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_ce, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_futurer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_laser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_fmr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_afm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_aem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_ahfm, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_sekt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_zbs, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_rdkt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_rdkt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_sekt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_zbs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton_rich, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_futurer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton_aem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_ahfm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_fmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton_hfm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_hrm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_laser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton_mill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton_ce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_afm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(combo_diametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(combo_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(combo_espe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        boton_hrm.getAccessibleContext().setAccessibleDescription("");
        boton_futurer.getAccessibleContext().setAccessibleDescription("");
        boton_alpha.getAccessibleContext().setAccessibleDescription("");
        boton_mill.getAccessibleContext().setAccessibleDescription("");
        boton_laser.getAccessibleContext().setAccessibleDescription("");
        boton_hfm.getAccessibleContext().setAccessibleDescription("");
        boton_ce.getAccessibleContext().setAccessibleDescription("");
        boton_rich.getAccessibleContext().setAccessibleDescription("");

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

    private void boton_hrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_hrmActionPerformed
        cod = "HIGH REMOVAL";
        cargar_especificacion();
    }//GEN-LAST:event_boton_hrmActionPerformed

    private void boton_futurerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_futurerActionPerformed
        cod = "FUTURE MILL";
        cargar_especificacion();
    }//GEN-LAST:event_boton_futurerActionPerformed

    private void boton_alphaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_alphaActionPerformed
        cod = "ALPHA MILL";
        cargar_especificacion();
    }//GEN-LAST:event_boton_alphaActionPerformed

    private void boton_laserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_laserActionPerformed
        cod = "LASER MILL";
        cargar_especificacion();
    }//GEN-LAST:event_boton_laserActionPerformed

    private void boton_millActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_millActionPerformed
        cod = "MILL MAX";
        cargar_especificacion();
    }//GEN-LAST:event_boton_millActionPerformed

    private void boton_hfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_hfmActionPerformed
        cod = "HIGH FEED";
        cargar_especificacion();
    }//GEN-LAST:event_boton_hfmActionPerformed

    private void boton_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ceActionPerformed
        cod = "CE";
        cargar_especificacion();
    }//GEN-LAST:event_boton_ceActionPerformed

    private void boton_richActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_richActionPerformed
        cod = "RICH MILL";
        cargar_especificacion();
    }//GEN-LAST:event_boton_richActionPerformed

    private void combo_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_diametro();
        }
    }//GEN-LAST:event_combo_tipoItemStateChanged

    private void combo_diametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_diametroItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_longitud();
        }
    }//GEN-LAST:event_combo_diametroItemStateChanged

    private void combo_longitudItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_longitudItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            buscar();
        }
    }//GEN-LAST:event_combo_longitudItemStateChanged

    private void combo_espeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_espeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cargar_tipo();
        }
    }//GEN-LAST:event_combo_espeItemStateChanged

    private void boton_aemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aemActionPerformed
        cod = "AEM90";
        cargar_especificacion();
    }//GEN-LAST:event_boton_aemActionPerformed

    private void boton_fmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fmrActionPerformed
        cod = "AFMRC";
        cargar_especificacion();
    }//GEN-LAST:event_boton_fmrActionPerformed

    private void boton_rdktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rdktActionPerformed
        cod = "RDKT";
        cargar_especificacion();
    }//GEN-LAST:event_boton_rdktActionPerformed

    private void boton_sektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sektActionPerformed
        cod = "SEKT";
        cargar_especificacion();
    }//GEN-LAST:event_boton_sektActionPerformed

    private void boton_zbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_zbsActionPerformed
        cod = "ZBS";
        cargar_especificacion();
    }//GEN-LAST:event_boton_zbsActionPerformed

    private void boton_afmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_afmActionPerformed
        cod = "AFM90";
        cargar_especificacion();
    }//GEN-LAST:event_boton_afmActionPerformed

    private void boton_ahfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ahfmActionPerformed
        cod = "AHFM";
        cargar_especificacion();
    }//GEN-LAST:event_boton_ahfmActionPerformed

    private void cargar_especificacion() {
        combo_espe.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct especificacion from portafre where (total > 0) AND (familia = ?) order by especificacion asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst.setString(1, cod);

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String esp = rs.getString("especificacion");
                combo_espe.addItem(esp);
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_especificacion");
        }
    }

    private void cargar_tipo() {
        combo_tipo.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst = cn.prepareStatement("select distinct estilo from portafre where (total > 0) AND (familia = ?) AND (especificacion= ?) order by estilo asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst.setString(1, cod);
            pst.setString(2, combo_espe.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs = pst.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs.next()) {
                String est = rs.getString("estilo");
                combo_tipo.addItem(est);
            }
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_tipo");
        }
    }

    private void cargar_diametro() {
        combo_diametro.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst2 = cn2.prepareStatement("select distinct diametro from portafre where (total > 0) AND (familia = ?) AND (especificacion= ?) AND (estilo=?) order by diametro asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst2.setString(1, cod);
            pst2.setString(2, combo_espe.getSelectedItem().toString());
            pst2.setString(3, combo_tipo.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs2 = pst2.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs2.next()) {
                String dia = rs2.getString("diametro");
                combo_diametro.addItem(dia);
            }
            rs2.close();
            cn2.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_diametro");
        }
    }

    private void cargar_longitud() {
        combo_longitud.removeAllItems();
        try {
            //Conexión con la base de datos 
            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/catalogo", "root", "");
            //Instrucciones para la busqueda en la base de datos  
            PreparedStatement pst3 = cn3.prepareStatement("select distinct longitud from portafre where (total > 0) AND (familia = ?) AND (especificacion= ?) AND (estilo=?) AND (diametro=?) order by longitud asc");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst3.setString(1, cod);
            pst3.setString(2, combo_espe.getSelectedItem().toString());
            pst3.setString(3, combo_tipo.getSelectedItem().toString());
            pst3.setString(4, combo_diametro.getSelectedItem().toString());

            //Declaración de la variable que alberga el resultado de la busqueda  
            ResultSet rs3 = pst3.executeQuery();

            //Metodo para que busque todos los resultados posible con las condiciones dadas
            while (rs3.next()) {
                String lo = rs3.getString("longitud");
                combo_longitud.addItem(lo);
            }
            rs3.close();
            cn3.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en cargar_longitud");
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
            PreparedStatement pst4 = cn4.prepareStatement("select * from portafre where (total > 0) AND (familia = ?) AND (especificacion= ?) AND (estilo=?) AND (diametro = ?) AND (longitud = ?) ");

            //Recuperación del texto de los botones y listas que sirven de filtros para la busqueda en la base de datos 
            pst4.setString(1, cod);
            pst4.setString(2, combo_espe.getSelectedItem().toString());
            pst4.setString(3, combo_tipo.getSelectedItem().toString());
            pst4.setString(4, combo_diametro.getSelectedItem().toString());
            pst4.setString(5, combo_longitud.getSelectedItem().toString());

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

                String cod = rs4.getString("codigo");
                String estado = rs4.getString("porta");
                String total = rs4.getString("total");
                String me = rs4.getString("me");
                String ca = rs4.getString("ca");
                String bo = rs4.getString("bo");
                String ma = rs4.getString("ma");

                ImageIcon imagen1 = new ImageIcon("src/images/informacion.png");
                Icon icono1 = new ImageIcon(imagen1.getImage());
                ImageIcon imagen2 = new ImageIcon("src/images/carrito.png");
                Icon icono2 = new ImageIcon(imagen2.getImage());
                model.addRow(new Object[]{cod, estado, icono1, icono2, total, me, ca, bo, ma});
            }
            rs4.close();
            cn4.close();
        } catch (Exception e) {
            System.out.println("Se perdio la conexión en buscar");
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
                    InformacionPortaFresado informacionportafresado = new InformacionPortaFresado();
                    informacionportafresado.setVisible(true);
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
            java.util.logging.Logger.getLogger(Portafresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portafresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portafresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portafresado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portafresado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aem;
    private javax.swing.JButton boton_afm;
    private javax.swing.JButton boton_ahfm;
    private javax.swing.JButton boton_alpha;
    private javax.swing.JButton boton_ce;
    private javax.swing.JButton boton_fmr;
    private javax.swing.JButton boton_futurer;
    private javax.swing.JButton boton_hfm;
    private javax.swing.JButton boton_hrm;
    private javax.swing.JButton boton_laser;
    private javax.swing.JButton boton_mill;
    private javax.swing.JButton boton_rdkt;
    private javax.swing.JButton boton_rich;
    private javax.swing.JButton boton_sekt;
    private javax.swing.JButton boton_zbs;
    private javax.swing.JComboBox<String> combo_diametro;
    private javax.swing.JComboBox<String> combo_espe;
    private javax.swing.JComboBox<String> combo_longitud;
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_resultados;
    // End of variables declaration//GEN-END:variables
}
