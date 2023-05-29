
package View;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;


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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Operación");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
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

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Comprobante");

        txtNumComprobante.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        txtNumComprobante.setForeground(new java.awt.Color(0, 0, 0));
        txtNumComprobante.setPreferredSize(new java.awt.Dimension(14, 28));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° Comprobante");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Imp. Neto Grav.");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C.U.I.T");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");

        cbbEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        cbbEmpresa.setForeground(new java.awt.Color(0, 0, 0));

        cbbCuitEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        cbbCuitEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        cbbCuitEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Imp. Interno");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Concepto No Grav.");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Percepción IVA");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ret. Ganancias");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Perc.IIBB Compra");

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sigma.png"))); // NOI18N
        jLabel18.setText("Imp. Total Fact.");

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ite. IVA Dere. Reg.");

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("C. no Grav. Sellos");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Ret.II BB Venta");

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("IVA RG 212");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Grav. Ley 25413");

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Otros");

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Int. Numerales");

        btnFinalizar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hecho.png"))); // NOI18N
        btnFinalizar.setText("Finalizar Operación");

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Operaciones Exentas");

        cbbOperacion.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        cbbOperacion.setForeground(new java.awt.Color(0, 0, 0));

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ing. Brutos");

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Retencion IVA");

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Imp. R. Ing. Brutos");

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

        txtConceptoNoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtConceptoNoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConceptoNoGravKeyTyped(evt);
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

        txtIvaFact27.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFact27KeyTyped(evt);
            }
        });

        checkIVA10.setText("IVA Facturado 10.5%");

        checkIVA21.setText("IVA Facturado 21%");

        checkIVA27.setText("IVA Facturado 27%");

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Imp. País");

        txtImpPais.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Imp. País Arg");

        txtImpPaisArg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPaisArg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisArgKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Perc. AFIP RG 4815");

        txtAfipRG485.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtAfipRG485.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAfipRG485KeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Perc. IIBB Bs As");

        txtPercIIBB_bsas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIIBB_bsas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIIBB_bsasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(checkIVA10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkIVA21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkIVA27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIvaFact27, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbOperacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(cbbCuitEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIntNumerales, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGravLey25413, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOpExentas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtImpPais, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImpPaisArg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAfipRG485, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPercIIBB_bsas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImpTotalFact, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbCuitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkIVA10))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkIVA21))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaFact27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkIVA27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtImpPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImpPaisArg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAfipRG485, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPercIIBB_bsas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtImpTotalFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGravLey25413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIntNumerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpExentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

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

    private void txtImpInternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpInternoKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpInterno.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpInternoKeyTyped

    private void txtIvaFact21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFact21KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtIvaFact21.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIvaFact21KeyTyped

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

    private void txtIvaFact27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFact27KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaFact27KeyTyped

    private void txtCNoGravSellosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNoGravSellosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNoGravSellosActionPerformed

    private void txtImpPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpPaisKeyTyped

    private void txtImpPaisArgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisArgKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpPaisArgKeyTyped

    private void txtAfipRG485KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfipRG485KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfipRG485KeyTyped

    private void txtPercIIBB_bsasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercIIBB_bsasKeyTyped
        // TODO add your handling code here:
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
