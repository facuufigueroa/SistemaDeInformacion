
package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;


public class FormComprasVentasIVA extends javax.swing.JFrame {

   
    public FormComprasVentasIVA() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelIdTransaccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtTipoComprobante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbbEmpresa = new javax.swing.JComboBox<>();
        cbbCuitEmpresa = new javax.swing.JComboBox<>();
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
        btnFinalizar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cbbOperacion = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtImpNetoGrav = new javax.swing.JTextField();
        txtIvaFact = new javax.swing.JTextField();
        txtImpInterno = new javax.swing.JTextField();
        txtIvaFact21 = new javax.swing.JTextField();
        txtConceptoNoGrav = new javax.swing.JTextField();
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
        txtIvaFact27 = new javax.swing.JTextField();
        checkIVA10 = new javax.swing.JCheckBox();
        checkIVA21 = new javax.swing.JCheckBox();
        checkIVA27 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        txtImpPais = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtImpPaisArg = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtAfipRG485 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtPercIIBB_bsas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CompraVentasIVA");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CompraVentasIVA");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transacción N°: ");

        labelIdTransaccion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelIdTransaccion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIdTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelIdTransaccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(14, 18, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Operación");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 47, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 29));

        txtFecha.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 6, 200, -1));

        txtTipoComprobante.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtTipoComprobante.setPreferredSize(new java.awt.Dimension(14, 28));
        txtTipoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoComprobanteActionPerformed(evt);
            }
        });
        jPanel2.add(txtTipoComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 78, 200, -1));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Comprobante");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 87, -1, -1));

        txtNumComprobante.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtNumComprobante.setPreferredSize(new java.awt.Dimension(14, 28));
        jPanel2.add(txtNumComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 116, 200, 24));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° Comprobante");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Imp. Neto Grav.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 231, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C.U.I.T");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 191, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 157, -1, -1));

        cbbEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jPanel2.add(cbbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 150, 290, 30));

        cbbCuitEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        cbbCuitEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel2.add(cbbCuitEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 186, 290, -1));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Imp. Interno");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 375, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Concepto No Grav.");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 412, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Percepción IVA");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ret. Ganancias");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, 20));

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Perc.IIBB Compra");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 20));

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sigma.png"))); // NOI18N
        jLabel18.setText("Imp. Total Fact.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 134, 136, -1));

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ite. IVA Dere. Reg.");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, 20));

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("C. no Grav. Sellos");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 29));

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Ret.II BB Venta");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 29));

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("IVA RG 212");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, 29));

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Grav. Ley 25413");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 20));

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Otros");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, 29));

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Int. Numerales");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, 29));

        btnFinalizar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hecho.png"))); // NOI18N
        btnFinalizar.setText("Finalizar Operación");
        jPanel2.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, 49));

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Operaciones Exentas");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 130, 29));

        cbbOperacion.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jPanel2.add(cbbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 42, 200, -1));

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ing. Brutos");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, 29));

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Retencion IVA");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 29));

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Imp. R. Ing. Brutos");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 29));

        txtImpNetoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpNetoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpNetoGravKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpNetoGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 226, 103, 25));

        txtIvaFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFactKeyTyped(evt);
            }
        });
        jPanel2.add(txtIvaFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 263, 103, 25));

        txtImpInterno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpInterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpInternoKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 370, 103, 25));

        txtIvaFact21.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFact21KeyTyped(evt);
            }
        });
        jPanel2.add(txtIvaFact21, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 300, 103, 25));

        txtConceptoNoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtConceptoNoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConceptoNoGravKeyTyped(evt);
            }
        });
        jPanel2.add(txtConceptoNoGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 407, 103, 25));

        txtPercepcionIVA.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercepcionIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercepcionIVAKeyTyped(evt);
            }
        });
        jPanel2.add(txtPercepcionIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 7, 103, 25));

        txtRetGanan.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetGanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetGananKeyTyped(evt);
            }
        });
        jPanel2.add(txtRetGanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 103, 25));

        txtPercIvaC.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIvaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIvaCKeyTyped(evt);
            }
        });
        jPanel2.add(txtPercIvaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 103, 25));

        txtImpTotalFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpTotalFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpTotalFactKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpTotalFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 103, 25));

        txtIvaDereReg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaDereReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaDereRegKeyTyped(evt);
            }
        });
        jPanel2.add(txtIvaDereReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 103, 25));

        txtCNoGravSellos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtCNoGravSellos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNoGravSellosActionPerformed(evt);
            }
        });
        txtCNoGravSellos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCNoGravSellosKeyTyped(evt);
            }
        });
        jPanel2.add(txtCNoGravSellos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 103, 25));

        txtRetIiBbV.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIiBbV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIiBbVKeyTyped(evt);
            }
        });
        jPanel2.add(txtRetIiBbV, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 103, 25));

        txtIvaRg212.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaRg212.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaRg212KeyTyped(evt);
            }
        });
        jPanel2.add(txtIvaRg212, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 103, 25));

        txtGravLey25413.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtGravLey25413.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGravLey25413KeyTyped(evt);
            }
        });
        jPanel2.add(txtGravLey25413, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 103, 25));

        txtIntNumerales.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIntNumerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntNumeralesKeyTyped(evt);
            }
        });
        jPanel2.add(txtIntNumerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 103, 25));

        txtOpExentas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOpExentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpExentasKeyTyped(evt);
            }
        });
        jPanel2.add(txtOpExentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 103, 25));

        txtIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngBrutosKeyTyped(evt);
            }
        });
        jPanel2.add(txtIngBrutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 103, 25));

        txtRetIva.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIvaKeyTyped(evt);
            }
        });
        jPanel2.add(txtRetIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 103, 25));

        txtImpRIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpRIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpRIngBrutosKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpRIngBrutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 103, 25));

        txtOtros.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtrosKeyTyped(evt);
            }
        });
        jPanel2.add(txtOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 103, 25));

        txtIvaFact27.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFact27KeyTyped(evt);
            }
        });
        jPanel2.add(txtIvaFact27, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 337, 103, 25));

        checkIVA10.setText("IVA Facturado 10.5%");
        jPanel2.add(checkIVA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, -1, -1));

        checkIVA21.setText("IVA Facturado 21%");
        jPanel2.add(checkIVA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 305, 131, -1));

        checkIVA27.setText("IVA Facturado 27%");
        jPanel2.add(checkIVA27, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 342, 131, -1));

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Imp. País");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 29));

        txtImpPais.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 103, 25));

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Imp. País Arg");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, 29));

        txtImpPaisArg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPaisArg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisArgKeyTyped(evt);
            }
        });
        jPanel2.add(txtImpPaisArg, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 103, 25));

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Perc. AFIP RG 4815");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, 29));

        txtAfipRG485.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtAfipRG485.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAfipRG485KeyTyped(evt);
            }
        });
        jPanel2.add(txtAfipRG485, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 103, 25));

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Perc. IIBB Bs As");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, 29));

        txtPercIIBB_bsas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIIBB_bsas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIIBB_bsasKeyTyped(evt);
            }
        });
        jPanel2.add(txtPercIIBB_bsas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 103, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoComprobanteActionPerformed
    }//GEN-LAST:event_txtTipoComprobanteActionPerformed

    private void txtImpNetoGravKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpNetoGravKeyTyped
       char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpNetoGrav.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpNetoGravKeyTyped

    private void txtIvaFactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFactKeyTyped
       char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIvaFact.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaFactKeyTyped

    private void txtImpInternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpInternoKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpInterno.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpInternoKeyTyped

    private void txtIvaFact21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFact21KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIvaFact21.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaFact21KeyTyped

    private void txtConceptoNoGravKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConceptoNoGravKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtConceptoNoGrav.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtConceptoNoGravKeyTyped

    private void txtPercepcionIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercepcionIVAKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPercepcionIVA.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercepcionIVAKeyTyped

    private void txtRetGananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetGananKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtRetGanan.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetGananKeyTyped

    private void txtPercIvaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercIvaCKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPercIvaC.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercIvaCKeyTyped

    private void txtImpTotalFactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpTotalFactKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpTotalFact.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpTotalFactKeyTyped

    private void txtIvaDereRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaDereRegKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIvaDereReg.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaDereRegKeyTyped

    private void txtCNoGravSellosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNoGravSellosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtCNoGravSellos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtCNoGravSellosKeyTyped

    private void txtRetIiBbVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetIiBbVKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtRetIiBbV.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetIiBbVKeyTyped

    private void txtIvaRg212KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaRg212KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIvaRg212.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaRg212KeyTyped

    private void txtGravLey25413KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGravLey25413KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtGravLey25413.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtGravLey25413KeyTyped

    private void txtIntNumeralesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNumeralesKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIntNumerales.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIntNumeralesKeyTyped

    private void txtOpExentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpExentasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtOpExentas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtOpExentasKeyTyped

    private void txtIngBrutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngBrutosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtIngBrutos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIngBrutosKeyTyped

    private void txtRetIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetIvaKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtRetIva.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtRetIvaKeyTyped

    private void txtImpRIngBrutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpRIngBrutosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpRIngBrutos.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpRIngBrutosKeyTyped

    private void txtOtrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtrosKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtOtros.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtOtrosKeyTyped

    private void txtIvaFact27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFact27KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaFact27KeyTyped

    private void txtCNoGravSellosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNoGravSellosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNoGravSellosActionPerformed

    private void txtImpPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisKeyTyped
       char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpPais.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpPaisKeyTyped

    private void txtImpPaisArgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisArgKeyTyped
       char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtImpPaisArg.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpPaisArgKeyTyped

    private void txtAfipRG485KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfipRG485KeyTyped
       char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtAfipRG485.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtAfipRG485KeyTyped

    private void txtPercIIBB_bsasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercIIBB_bsasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPercIIBB_bsas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercIIBB_bsasKeyTyped

    
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
            java.util.logging.Logger.getLogger(FormComprasVentasIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormComprasVentasIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormComprasVentasIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormComprasVentasIVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormComprasVentasIVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFinalizar;
    public javax.swing.JComboBox<String> cbbCuitEmpresa;
    public javax.swing.JComboBox<String> cbbEmpresa;
    public javax.swing.JComboBox<String> cbbOperacion;
    public javax.swing.JCheckBox checkIVA10;
    public javax.swing.JCheckBox checkIVA21;
    public javax.swing.JCheckBox checkIVA27;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel labelIdTransaccion;
    public javax.swing.JTextField txtAfipRG485;
    public javax.swing.JTextField txtCNoGravSellos;
    public javax.swing.JTextField txtConceptoNoGrav;
    public com.toedter.calendar.JDateChooser txtFecha;
    public javax.swing.JTextField txtGravLey25413;
    public javax.swing.JTextField txtImpInterno;
    public javax.swing.JTextField txtImpNetoGrav;
    public javax.swing.JTextField txtImpPais;
    public javax.swing.JTextField txtImpPaisArg;
    public javax.swing.JTextField txtImpRIngBrutos;
    public javax.swing.JTextField txtImpTotalFact;
    public javax.swing.JTextField txtIngBrutos;
    public javax.swing.JTextField txtIntNumerales;
    public javax.swing.JTextField txtIvaDereReg;
    public javax.swing.JTextField txtIvaFact;
    public javax.swing.JTextField txtIvaFact21;
    public javax.swing.JTextField txtIvaFact27;
    public javax.swing.JTextField txtIvaRg212;
    public javax.swing.JTextField txtNumComprobante;
    public javax.swing.JTextField txtOpExentas;
    public javax.swing.JTextField txtOtros;
    public javax.swing.JTextField txtPercIIBB_bsas;
    public javax.swing.JTextField txtPercIvaC;
    public javax.swing.JTextField txtPercepcionIVA;
    public javax.swing.JTextField txtRetGanan;
    public javax.swing.JTextField txtRetIiBbV;
    public javax.swing.JTextField txtRetIva;
    public javax.swing.JTextField txtTipoComprobante;
    // End of variables declaration//GEN-END:variables
}
