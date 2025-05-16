/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Sistema.SistemaCajero;
/**
 *
 * @author Genius Lab
 */
public class Cajero extends javax.swing.JFrame {

    // - Variables Locales - 
    boolean opcionDepositar = false;
    boolean opcionRetirar = false;
    
    double nuevaCantidad = 0;
    String nuevoNumero;
    //--------------------------------------------
    SistemaCajero atm = new SistemaCajero();
    
    public Cajero() {
        initComponents();

        txt_nombre.setText("");
        txt_cantidad.setText("");

        panel_opcion.setVisible(false);

        btn_depositar.setEnabled(false);
        btn_retirar.setEnabled(false);
        btn_salir.setEnabled(false);

        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_0.setEnabled(false);

        btn_cancelar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_aceptar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel_opcion = new javax.swing.JPanel();
        txt_opcion = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        btn_depositar = new javax.swing.JButton();
        btn_retirar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BBVA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(102, 255, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_nombre.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Saldo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("$");

        txt_saldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_saldo.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Depositar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Retirar");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Salir");

        panel_opcion.setBackground(new java.awt.Color(153, 255, 153));
        panel_opcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));

        txt_opcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_opcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_opcion.setText("Opcion");

        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_cantidad.setText("Cantidad");
        txt_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        javax.swing.GroupLayout panel_opcionLayout = new javax.swing.GroupLayout(panel_opcion);
        panel_opcion.setLayout(panel_opcionLayout);
        panel_opcionLayout.setHorizontalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_opcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_opcionLayout.setVerticalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_opcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidad)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_saldo))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(panel_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_saldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel9))
                    .addComponent(panel_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_depositar.setText("<");
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });

        btn_retirar.setText("<");
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });

        btn_salir.setText("<");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_depositar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_retirar)
                        .addGap(48, 48, 48)
                        .addComponent(btn_salir)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        btn_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_borrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // - *************** Boton #2 *************** -
    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "2";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

     // - *************** Boton #3 *************** -
    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "3";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    // - *************** Boton #5 *************** -
    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "5";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    // - *************** Boton #7 *************** -
    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "7";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    // - *************** Boton #8 *************** -
    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "8";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    // - *************** Boton #9 *************** -
    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "9";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    // - *************** Boton Cancelar *************** -
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        txt_cantidad.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    // - *************** Boton #0 *************** -
    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "0";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    // - *************** Boton Ingresar *************** - 
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        txt_nombre.setText(JOptionPane.showInputDialog("Ingrese su nombre."));
        btn_ingresar.setEnabled(false);

        btn_depositar.setEnabled(true);
        btn_retirar.setEnabled(true);
        btn_salir.setEnabled(true);
    }//GEN-LAST:event_btn_ingresarActionPerformed

    // - *************** Boton Depositar *************** - 
    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        // TODO add your handling code here:
        opcionDepositar = true;

        btn_retirar.setEnabled(false);
        btn_depositar.setEnabled(false);
        panel_opcion.setVisible(false);

        txt_opcion.setText("[Deposito] - Ingrese una Cantidad");

        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_0.setEnabled(false);

        btn_cancelar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_aceptar.setEnabled(false);

    }//GEN-LAST:event_btn_depositarActionPerformed

    // - *************** Boton Retirar *************** -
    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirarActionPerformed
        // TODO add your handling code here:
        opcionRetirar = true;

        btn_retirar.setEnabled(false);
        btn_depositar.setEnabled(false);
        panel_opcion.setVisible(false);

        txt_opcion.setText("[Retiro] - Ingrese una Cantidad");

        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_0.setEnabled(false);

        btn_cancelar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_aceptar.setEnabled(false);
    }//GEN-LAST:event_btn_retirarActionPerformed

    // - *************** Boton Retirar *************** -
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        if (opcionDepositar == true || opcionRetirar == true) {
            opcionDepositar = false;
            opcionRetirar = false;

            panel_opcion.setVisible(false);
            btn_depositar.setEnabled(true);

            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);

            btn_cancelar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_aceptar.setEnabled(false);

            txt_cantidad.setText("");
        }else{
        
        }
    }//GEN-LAST:event_btn_salirActionPerformed
    
    // - *************** Boton #1 *************** -
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "1";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    // - *************** Boton #4 *************** -
    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "4";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    // - *************** Boton #6 *************** -
    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
            nuevoNumero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(nuevoNumero);
        }else{
            nuevoNumero = txt_cantidad.getText() + "6";
            txt_cantidad.setText(nuevoNumero);
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    // - *************** Boton Borrar *************** -
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        txt_cantidad.setText(txt_cantidad.getText().substring(0, txt_cantidad.getText().length() - 1));
        
        if (txt_cantidad.getText().equals("")) {
            txt_cantidad.setText("");
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    // - *************** Boton Aceptar *************** -
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        if (txt_cantidad.getText().equals("")) {
            opcionDepositar = false;
            opcionRetirar = false;
            
            panel_opcion.setVisible(false);
            btn_depositar.setEnabled(true);
            btn_aceptar.setEnabled(true);
            txt_cantidad.setText("");
            
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);

            btn_cancelar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            
        }else if(opcionDepositar == true){ 
            opcionDepositar = false;
            
            nuevaCantidad = Double.parseDouble(String.valueOf(txt_cantidad.getText() ) );
            atm.depositar(nuevaCantidad);
            
            txt_saldo.setText(String.valueOf(atm.obtenerSaldo() ) );
            panel_opcion.setVisible(false);
            txt_cantidad.setText("");
            btn_depositar.setEnabled(true);
            btn_retirar.setEnabled(true);
            
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);

            btn_cancelar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            
        }else if(opcionRetirar == true){
            opcionRetirar = false;
            
            nuevaCantidad = Double.parseDouble(String.valueOf(txt_cantidad.getText() ) );
            atm.retirar(nuevaCantidad);
            txt_saldo.setText(String.valueOf(atm.obtenerSaldo() ) );
            
            panel_opcion.setVisible(false);
            txt_cantidad.setText("");
            btn_depositar.setEnabled(true);
            btn_retirar.setEnabled(true);
            
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);

            btn_cancelar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_aceptar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel panel_opcion;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_opcion;
    private javax.swing.JLabel txt_saldo;
    // End of variables declaration//GEN-END:variables
}
