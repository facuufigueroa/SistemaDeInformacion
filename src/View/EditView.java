
package View;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;


public class EditView extends javax.swing.JFrame {

    
    public EditView() {
        initComponents();
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/contabilidad32.png"));
  
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFechaT = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnModificarT = new javax.swing.JButton();
        txtSalidas = new javax.swing.JTextField();
        txtEntradas = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        labelCheque = new javax.swing.JLabel();
        labelFactura = new javax.swing.JLabel();
        labelEmpresa = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNumT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtTipoComprobante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnModificarCVI = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCuit = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtImpNetoGrav = new javax.swing.JTextField();
        txtIvaFact = new javax.swing.JTextField();
        txtImpInterno = new javax.swing.JTextField();
        txtIvaFact21 = new javax.swing.JTextField();
        txtPercepcionIVA = new javax.swing.JTextField();
        txtRetGanan = new javax.swing.JTextField();
        txtPercIvaC = new javax.swing.JTextField();
        txtImpTotalFact = new javax.swing.JTextField();
        txtIvaDereReg = new javax.swing.JTextField();
        txtCNoGravSellos = new javax.swing.JTextField();
        txtRetIiBbV = new javax.swing.JTextField();
        txtIvaRg212 = new javax.swing.JTextField();
        txtGravLey25413 = new javax.swing.JTextField();
        txtIntNumerales = new javax.swing.JTextField();
        txtOpExentas = new javax.swing.JTextField();
        txtIngBrutos = new javax.swing.JTextField();
        txtRetIva = new javax.swing.JTextField();
        txtImpRIngBrutos = new javax.swing.JTextField();
        txtOtros = new javax.swing.JTextField();
        txtConceptoNoGrav = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        labelVerificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Transacciones y CompraVenta IVA");
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        jLabel1.setText("EDITAR TRANSACCIÓN");

        jPanel1.setBackground(new java.awt.Color(14, 18, 66));

        txtFechaT.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Transacción");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entradas");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salidas");

        btnModificarT.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnModificarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        btnModificarT.setText("Modificar");

        txtSalidas.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        txtSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtSalidas.setPreferredSize(new java.awt.Dimension(14, 28));
        txtSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalidasKeyTyped(evt);
            }
        });

        txtEntradas.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        txtEntradas.setForeground(new java.awt.Color(0, 0, 0));
        txtEntradas.setPreferredSize(new java.awt.Dimension(14, 28));
        txtEntradas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradasKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Empresa/Orden:");

        jLabel34.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cuenta:");

        jLabel35.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Categoria:");

        jLabel36.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("N° Cheque:");

        jLabel37.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Tipo y N° Factura:");

        labelCheque.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        labelCheque.setForeground(new java.awt.Color(255, 255, 255));

        labelFactura.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        labelFactura.setForeground(new java.awt.Color(255, 255, 255));

        labelEmpresa.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        labelEmpresa.setForeground(new java.awt.Color(255, 255, 255));

        labelCategoria.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(255, 255, 255));

        labelCuenta.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        labelCuenta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarT)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36))
                        .addGap(584, 584, 584))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel35)
                                    .addComponent(labelEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFechaT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(labelCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Transaccion N° : ");

        labelNumT.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        labelNumT.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(14, 18, 66));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Operación");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        txtTipoComprobante.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtTipoComprobante.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoComprobante.setPreferredSize(new java.awt.Dimension(14, 28));
        txtTipoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoComprobanteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Comprobante");

        txtNumComprobante.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtNumComprobante.setForeground(new java.awt.Color(0, 0, 0));
        txtNumComprobante.setPreferredSize(new java.awt.Dimension(14, 28));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N° Comprobante");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Imp. Neto Grav.");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("C-U-I-T");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IVA Facturado 10.5%");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Imp. Interno");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Concepto No Grav.");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Percepción IVA");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ret. Ganancias");

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Perc.IIBB Compra");

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Imp. Total Fact.");

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ite. IVA Dere. Reg.");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("C. no Grav. Sellos");

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ret.II BB Venta");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("IVA RG 212");

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Grav. Ley 25413");

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Otros");

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Int. Numerales");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Operaciones Exentas");

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ing. Brutos");

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Retencion IVA");

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Imp. R. Ing. Brutos");

        btnModificarCVI.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnModificarCVI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        btnModificarCVI.setText("Modificar");

        txtOperacion.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(0, 0, 0));
        txtOperacion.setPreferredSize(new java.awt.Dimension(14, 28));

        txtNombre.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setPreferredSize(new java.awt.Dimension(14, 28));

        txtCuit.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtCuit.setForeground(new java.awt.Color(0, 0, 0));
        txtCuit.setPreferredSize(new java.awt.Dimension(14, 28));

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("IVA Facturado 21%");

        txtImpNetoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpNetoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpNetoGravKeyTyped(evt);
            }
        });

        txtIvaFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFactKeyTyped(evt);
            }
        });

        txtImpInterno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpInterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpInternoKeyTyped(evt);
            }
        });

        txtIvaFact21.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFact21KeyTyped(evt);
            }
        });

        txtPercepcionIVA.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercepcionIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercepcionIVAKeyTyped(evt);
            }
        });

        txtRetGanan.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetGanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetGananKeyTyped(evt);
            }
        });

        txtPercIvaC.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIvaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIvaCKeyTyped(evt);
            }
        });

        txtImpTotalFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpTotalFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpTotalFactKeyTyped(evt);
            }
        });

        txtIvaDereReg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaDereReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaDereRegKeyTyped(evt);
            }
        });

        txtCNoGravSellos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtCNoGravSellos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCNoGravSellosKeyTyped(evt);
            }
        });

        txtRetIiBbV.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIiBbV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIiBbVKeyTyped(evt);
            }
        });

        txtIvaRg212.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaRg212.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaRg212KeyTyped(evt);
            }
        });

        txtGravLey25413.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtGravLey25413.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGravLey25413KeyTyped(evt);
            }
        });

        txtIntNumerales.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIntNumerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntNumeralesKeyTyped(evt);
            }
        });

        txtOpExentas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOpExentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpExentasKeyTyped(evt);
            }
        });

        txtIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngBrutosKeyTyped(evt);
            }
        });

        txtRetIva.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIvaKeyTyped(evt);
            }
        });

        txtImpRIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpRIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpRIngBrutosKeyTyped(evt);
            }
        });

        txtOtros.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtrosKeyTyped(evt);
            }
        });

        txtConceptoNoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtConceptoNoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConceptoNoGravKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addComponent(jLabel7)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpTotalFact, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGravLey25413, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntNumerales, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addGap(117, 117, 117))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addComponent(btnModificarCVI)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOpExentas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(8, 8, 8)))
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel32)
                    .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtImpTotalFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGravLey25413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntNumerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpExentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCVI)
                        .addGap(16, 16, 16))))
        );

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        jLabel31.setText("Edicion - Compra_Venta_IVA");

        labelVerificacion.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        labelVerificacion.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(32, 32, 32)
                                .addComponent(labelVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoComprobanteActionPerformed

    private void txtSalidasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalidasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtSalidas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtSalidasKeyTyped

    private void txtEntradasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtEntradas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtEntradasKeyTyped

    private void txtImpNetoGravKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpNetoGravKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpNetoGrav.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpNetoGravKeyTyped

    private void txtIvaFactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFactKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIvaFact.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaFactKeyTyped

    private void txtIvaFact21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFact21KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIvaFact21.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaFact21KeyTyped

    private void txtImpInternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpInternoKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpInterno.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpInternoKeyTyped

    private void txtConceptoNoGravKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConceptoNoGravKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtConceptoNoGrav.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtConceptoNoGravKeyTyped

    private void txtPercepcionIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercepcionIVAKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtPercepcionIVA.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercepcionIVAKeyTyped

    private void txtRetGananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetGananKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtRetGanan.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetGananKeyTyped

    private void txtPercIvaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercIvaCKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtPercIvaC.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercIvaCKeyTyped

    private void txtImpTotalFactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpTotalFactKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpTotalFact.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpTotalFactKeyTyped

    private void txtIvaDereRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaDereRegKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIvaDereReg.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaDereRegKeyTyped

    private void txtCNoGravSellosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNoGravSellosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtCNoGravSellos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtCNoGravSellosKeyTyped

    private void txtRetIiBbVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetIiBbVKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtRetIiBbV.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetIiBbVKeyTyped

    private void txtIvaRg212KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaRg212KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIvaRg212.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaRg212KeyTyped

    private void txtGravLey25413KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGravLey25413KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtGravLey25413.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtGravLey25413KeyTyped

    private void txtIntNumeralesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNumeralesKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIntNumerales.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIntNumeralesKeyTyped

    private void txtOpExentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpExentasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtOpExentas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtOpExentasKeyTyped

    private void txtIngBrutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngBrutosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIngBrutos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIngBrutosKeyTyped

    private void txtRetIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetIvaKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtRetIva.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetIvaKeyTyped

    private void txtImpRIngBrutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpRIngBrutosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpRIngBrutos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpRIngBrutosKeyTyped

    private void txtOtrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtrosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtOtros.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtOtrosKeyTyped

    
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
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificarCVI;
    public javax.swing.JButton btnModificarT;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel labelCategoria;
    public javax.swing.JLabel labelCheque;
    public javax.swing.JLabel labelCuenta;
    public javax.swing.JLabel labelEmpresa;
    public javax.swing.JLabel labelFactura;
    public javax.swing.JLabel labelNumT;
    public javax.swing.JLabel labelVerificacion;
    public javax.swing.JTextField txtCNoGravSellos;
    public javax.swing.JTextField txtConceptoNoGrav;
    public javax.swing.JTextField txtCuit;
    public javax.swing.JTextField txtEntradas;
    public com.toedter.calendar.JDateChooser txtFecha;
    public com.toedter.calendar.JDateChooser txtFechaT;
    public javax.swing.JTextField txtGravLey25413;
    public javax.swing.JTextField txtImpInterno;
    public javax.swing.JTextField txtImpNetoGrav;
    public javax.swing.JTextField txtImpRIngBrutos;
    public javax.swing.JTextField txtImpTotalFact;
    public javax.swing.JTextField txtIngBrutos;
    public javax.swing.JTextField txtIntNumerales;
    public javax.swing.JTextField txtIvaDereReg;
    public javax.swing.JTextField txtIvaFact;
    public javax.swing.JTextField txtIvaFact21;
    public javax.swing.JTextField txtIvaRg212;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumComprobante;
    public javax.swing.JTextField txtOpExentas;
    public javax.swing.JTextField txtOperacion;
    public javax.swing.JTextField txtOtros;
    public javax.swing.JTextField txtPercIvaC;
    public javax.swing.JTextField txtPercepcionIVA;
    public javax.swing.JTextField txtRetGanan;
    public javax.swing.JTextField txtRetIiBbV;
    public javax.swing.JTextField txtRetIva;
    public javax.swing.JTextField txtSalidas;
    public javax.swing.JTextField txtTipoComprobante;
    // End of variables declaration//GEN-END:variables
}
