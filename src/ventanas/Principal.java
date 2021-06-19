package ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Buriles v;

    public Principal() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Menu principal");
        this.getContentPane().setBackground(Color.WHITE);
        jPanel1.setBackground(Color.WHITE);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        boton_insertos = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boton_portatorneado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Sujeción = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton_portafresado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boton_rimas = new javax.swing.JToggleButton();
        boton_abrasivos = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        boton_brocas = new javax.swing.JToggleButton();
        boton_fresas = new javax.swing.JToggleButton();
        boton_medicion = new javax.swing.JToggleButton();
        boton_sujecion = new javax.swing.JButton();
        boton_accesorios_maquina = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        boton_buriles = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        boton_accesorios_moldes = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        boton_sierras = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boton_cotizacion = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        boton_roscar = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        boton_maquinas_pequeñas = new javax.swing.JToggleButton();
        boton_manguera = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        boton_buscador = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();
        boton_buriles1 = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        boton_alesado = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        boton_erosionado = new javax.swing.JToggleButton();
        jLabel22 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setBorder(null);

        boton_insertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insertos_portada.png"))); // NOI18N
        boton_insertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_insertosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel2.setText("Fresas solidas");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel8.setText("Metrólogia");

        boton_portatorneado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_torneado_portada.png"))); // NOI18N
        boton_portatorneado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portatorneadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel11.setText("Rimas");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel10.setText("Accesorios para máquina");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setText("Insertos");

        Sujeción.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        Sujeción.setText("Sujeción");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel9.setText("Abrasivos");

        boton_portafresado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porta_fresado_portada.png"))); // NOI18N
        boton_portafresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_portafresadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel3.setText("Brocas");

        boton_rimas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rima_principal.png"))); // NOI18N
        boton_rimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rimasActionPerformed(evt);
            }
        });

        boton_abrasivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrasivos_portada.png"))); // NOI18N
        boton_abrasivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_abrasivosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel5.setText("Porta fresado");

        boton_brocas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brocas_portada.png"))); // NOI18N
        boton_brocas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_brocasActionPerformed(evt);
            }
        });

        boton_fresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fresas_portada.png"))); // NOI18N
        boton_fresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_fresasActionPerformed(evt);
            }
        });

        boton_medicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medicion_portada.png"))); // NOI18N
        boton_medicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_medicionActionPerformed(evt);
            }
        });

        boton_sujecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sujecion_portada.png"))); // NOI18N
        boton_sujecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sujecionActionPerformed(evt);
            }
        });

        boton_accesorios_maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accesorios_maquina_portada.png"))); // NOI18N
        boton_accesorios_maquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accesorios_maquinaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel4.setText("Porta torneado");

        boton_buriles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buriles_principal.png"))); // NOI18N
        boton_buriles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_burilesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel7.setText("Buriles");

        boton_accesorios_moldes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accesorios_moldes_portada.png"))); // NOI18N
        boton_accesorios_moldes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accesorios_moldesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel12.setText("Accesorios para moldes y troqueles");

        boton_sierras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sierra portada.png"))); // NOI18N
        boton_sierras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sierrasActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel13.setText("Sierras");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        boton_cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cotizacion.png"))); // NOI18N
        boton_cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cotizacionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel15.setText("Formato cotización");

        boton_roscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rosacado_porta.png"))); // NOI18N
        boton_roscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_roscarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel16.setText("Herramientas de roscado");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel17.setText("Máquinas pequeñas");

        boton_maquinas_pequeñas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maquinas_pequeñas_menu.png"))); // NOI18N
        boton_maquinas_pequeñas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_maquinas_pequeñasActionPerformed(evt);
            }
        });

        boton_manguera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manguera_portada.png"))); // NOI18N
        boton_manguera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_mangueraActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel18.setText("Manguera modular");

        boton_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscador_portada.png"))); // NOI18N
        boton_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscadorActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel19.setText("Buscador");

        boton_buriles1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fluidos_portada.png"))); // NOI18N
        boton_buriles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buriles1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel20.setText("Fluidos");

        boton_alesado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alesador_portada.png"))); // NOI18N
        boton_alesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_alesadoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel21.setText("Alesado");

        boton_erosionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erosionado_portada.png"))); // NOI18N
        boton_erosionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_erosionadoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel22.setText("Erosionado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_buriles, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_insertos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel7)))))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel4)
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(boton_portatorneado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(boton_portafresado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton_sierras, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addComponent(jLabel13)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(boton_maquinas_pequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17)
                                                .addGap(36, 36, 36))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_brocas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(boton_roscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel16)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_rimas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(87, 87, 87)))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boton_sujecion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(Sujeción)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton_fresas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel2)))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton_abrasivos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel9)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(boton_medicion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)
                                                .addGap(76, 76, 76))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton_manguera, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(boton_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boton_accesorios_maquina, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel15)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(boton_accesorios_moldes, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boton_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel19)))))
                                .addGap(89, 89, 89))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_buriles1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(boton_alesado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(boton_erosionado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel22))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_fresas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_brocas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_abrasivos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_rimas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_medicion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_roscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Sujeción)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_sujecion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_accesorios_maquina, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boton_insertos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_portatorneado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(boton_portafresado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(boton_accesorios_moldes, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_buriles, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_sierras, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(209, 209, 209))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_maquinas_pequeñas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_manguera, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_alesado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_buriles1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_erosionado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("Opciones");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_insertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_insertosActionPerformed
        insertosprincipal.getObj().setVisible(true);
    }//GEN-LAST:event_boton_insertosActionPerformed

    private void boton_fresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_fresasActionPerformed
        fresasprincipal.getObj().setVisible(true);
    }//GEN-LAST:event_boton_fresasActionPerformed

    private void boton_brocasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_brocasActionPerformed
        Brocas.getObj().setVisible(true);
    }//GEN-LAST:event_boton_brocasActionPerformed

    private void boton_portatorneadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portatorneadoActionPerformed
        PortaTorneadoPrincipal.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portatorneadoActionPerformed

    private void boton_portafresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_portafresadoActionPerformed
        Portafresado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_portafresadoActionPerformed

    private void boton_medicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_medicionActionPerformed
        Menu_metrologia.getObj().setVisible(true);
    }//GEN-LAST:event_boton_medicionActionPerformed

    private void boton_sujecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sujecionActionPerformed
        menu_sujecion.getObj().setVisible(true);
    }//GEN-LAST:event_boton_sujecionActionPerformed

    private void boton_abrasivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_abrasivosActionPerformed
        Menu_Abrasivos.getObj().setVisible(true);
    }//GEN-LAST:event_boton_abrasivosActionPerformed

    private void boton_accesorios_maquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accesorios_maquinaActionPerformed
        Menu_Accesorios_Maquina.getObj().setVisible(true);
    }//GEN-LAST:event_boton_accesorios_maquinaActionPerformed

    private void boton_rimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rimasActionPerformed
        Rimas.getObj().setVisible(true);
    }//GEN-LAST:event_boton_rimasActionPerformed

    private void boton_burilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_burilesActionPerformed
        Buriles.getObj().setVisible(true);
    }//GEN-LAST:event_boton_burilesActionPerformed

    private void boton_accesorios_moldesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accesorios_moldesActionPerformed
        menu_moldes.getObj().setVisible(true);
    }//GEN-LAST:event_boton_accesorios_moldesActionPerformed

    private void boton_sierrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sierrasActionPerformed
        menu_sierras.getObj().setVisible(true);
    }//GEN-LAST:event_boton_sierrasActionPerformed

    private void boton_cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cotizacionActionPerformed
        pdf.getObj().setVisible(true);
    }//GEN-LAST:event_boton_cotizacionActionPerformed

    private void boton_roscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_roscarActionPerformed
        menu_roscado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_roscarActionPerformed

    private void boton_maquinas_pequeñasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_maquinas_pequeñasActionPerformed
        menu_maquinas_pequeñas.getObj().setVisible(true);
    }//GEN-LAST:event_boton_maquinas_pequeñasActionPerformed

    private void boton_mangueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mangueraActionPerformed
        Manguera.getObj().setVisible(true);
    }//GEN-LAST:event_boton_mangueraActionPerformed

    private void boton_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscadorActionPerformed
        Buscador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_buscadorActionPerformed

    private void boton_buriles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buriles1ActionPerformed
        Fluidos.getObj().setVisible(true);
    }//GEN-LAST:event_boton_buriles1ActionPerformed

    private void boton_alesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_alesadoActionPerformed
        menu_alesador.getObj().setVisible(true);
    }//GEN-LAST:event_boton_alesadoActionPerformed

    private void boton_erosionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_erosionadoActionPerformed
        menu_erosionado.getObj().setVisible(true);
    }//GEN-LAST:event_boton_erosionadoActionPerformed

    private void cerrar_comunicacion() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM xampp-control.exe");
        } catch (Exception e) {
            System.out.println("no funciona cerrar");
        }
    }

    private void cerrar() {
        String botones[] = {"Si", "No"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar el asistente de ingeniería?", "Cerrar programa", 0, 0, null, botones, null);
        if (eleccion == JOptionPane.YES_OPTION) {
            cerrar_comunicacion();
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("no se cierra el asistente");
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sujeción;
    private javax.swing.JToggleButton boton_abrasivos;
    private javax.swing.JToggleButton boton_accesorios_maquina;
    private javax.swing.JToggleButton boton_accesorios_moldes;
    private javax.swing.JToggleButton boton_alesado;
    private javax.swing.JToggleButton boton_brocas;
    private javax.swing.JToggleButton boton_buriles;
    private javax.swing.JToggleButton boton_buriles1;
    private javax.swing.JToggleButton boton_buscador;
    private javax.swing.JToggleButton boton_cotizacion;
    private javax.swing.JToggleButton boton_erosionado;
    private javax.swing.JToggleButton boton_fresas;
    private javax.swing.JToggleButton boton_insertos;
    private javax.swing.JToggleButton boton_manguera;
    private javax.swing.JToggleButton boton_maquinas_pequeñas;
    private javax.swing.JToggleButton boton_medicion;
    private javax.swing.JButton boton_portafresado;
    private javax.swing.JButton boton_portatorneado;
    private javax.swing.JToggleButton boton_rimas;
    private javax.swing.JToggleButton boton_roscar;
    private javax.swing.JToggleButton boton_sierras;
    private javax.swing.JButton boton_sujecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
