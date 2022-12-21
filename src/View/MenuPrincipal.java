package View;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelBienvenido = new javax.swing.JLabel();
        btnNewTransaccion = new javax.swing.JButton();
        btnCuentas = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnTipoCuenta = new javax.swing.JButton();
        btnSubCategoria = new javax.swing.JButton();
        btnTipoCategoria = new javax.swing.JButton();
        btnEmpresaOrden = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contabilidad.png"))); // NOI18N
        jLabel2.setText("SISTEMA DE INFORMACIÓN - JOSÉ MARIA ROQUÉS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 6, -1, 77));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abstract-modern-futuristic-white-and-gray-gradient-color-geometric-background-with-halftone-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 51));

        labelBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        labelBienvenido.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        labelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/introduccion (1).png"))); // NOI18N
        labelBienvenido.setText("¡ Bienvenido ! Administración de Formularios");

        btnNewTransaccion.setBackground(new java.awt.Color(0, 0, 0));
        btnNewTransaccion.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnNewTransaccion.setForeground(new java.awt.Color(255, 255, 255));
        btnNewTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transaccion.png"))); // NOI18N
        btnNewTransaccion.setText("Formulario Transacciones");
        btnNewTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTransaccionActionPerformed(evt);
            }
        });

        btnCuentas.setBackground(new java.awt.Color(0, 0, 0));
        btnCuentas.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnCuentas.setForeground(new java.awt.Color(255, 255, 255));
        btnCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-contacto.png"))); // NOI18N
        btnCuentas.setText("  Formulario Cuentas");
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });

        btnCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnCategoria.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        btnCategoria.setText("Formulario Categorias");

        btnTipoCuenta.setBackground(new java.awt.Color(0, 0, 0));
        btnTipoCuenta.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnTipoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnTipoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-contacto.png"))); // NOI18N
        btnTipoCuenta.setText("Formulario Tipo De Cuentas");
        btnTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoCuentaActionPerformed(evt);
            }
        });

        btnSubCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnSubCategoria.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnSubCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnSubCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        btnSubCategoria.setText("Formulario SubCategorias");
        btnSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubCategoriaActionPerformed(evt);
            }
        });

        btnTipoCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnTipoCategoria.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnTipoCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnTipoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        btnTipoCategoria.setText("Formulario Tipo De Categorias");
        btnTipoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoCategoriaActionPerformed(evt);
            }
        });

        btnEmpresaOrden.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpresaOrden.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        btnEmpresaOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresaOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compania.png"))); // NOI18N
        btnEmpresaOrden.setText("Formulario EmpresaOrden");
        btnEmpresaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaOrdenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transaccion.png"))); // NOI18N
        jLabel3.setText("Transacciones");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-contacto.png"))); // NOI18N
        jLabel4.setText("Cuentas");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compania.png"))); // NOI18N
        jLabel6.setText("Empresa");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        jLabel7.setText("Categorias");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte-de-negocios.png"))); // NOI18N
        jLabel8.setText(" Informes");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte-de-negocios.png"))); // NOI18N
        jButton8.setText("Informe Transacciones");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel4))
                            .addComponent(btnTipoCuenta)
                            .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel3))
                                    .addComponent(btnNewTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSubCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTipoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addComponent(btnEmpresaOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel7)
                                        .addGap(250, 250, 250)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton8)))
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelBienvenido)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNewTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpresaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTipoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(160, 160, 160)
                        .addComponent(btnSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTransaccionActionPerformed
     
    }//GEN-LAST:event_btnNewTransaccionActionPerformed

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCuentasActionPerformed

    private void btnTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTipoCuentaActionPerformed

    private void btnSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubCategoriaActionPerformed

    private void btnTipoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTipoCategoriaActionPerformed

    private void btnEmpresaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpresaOrdenActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCategoria;
    public javax.swing.JButton btnCuentas;
    public javax.swing.JButton btnEmpresaOrden;
    public javax.swing.JButton btnNewTransaccion;
    public javax.swing.JButton btnSubCategoria;
    public javax.swing.JButton btnTipoCategoria;
    public javax.swing.JButton btnTipoCuenta;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBienvenido;
    // End of variables declaration//GEN-END:variables
}
