
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
        labelNumT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        cbbEmpresa = new javax.swing.JComboBox<>();
        cbbCuenta = new javax.swing.JComboBox<>();
        cbbCategoria = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        labelTipoCuenta = new javax.swing.JLabel();
        labelTipoCategoria = new javax.swing.JLabel();
        txtNumCheque = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cbbSubCategoria = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
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
        txtIvaFac27 = new javax.swing.JTextField();
        checkBoxIVA10 = new javax.swing.JCheckBox();
        checkBoxIVA21 = new javax.swing.JCheckBox();
        checkBoxIVA27 = new javax.swing.JCheckBox();
        txtPercIIBB_bsas = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtAfipRG485 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtImpPaisArg = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtImpPais = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        labelVerificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Transacciones y CompraVenta IVA");
        setIconImage(getIconImage());
        setResizable(false);

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

        txtSalidas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtSalidas.setPreferredSize(new java.awt.Dimension(14, 28));
        txtSalidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalidasKeyTyped(evt);
            }
        });

        txtEntradas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
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

        labelNumT.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        labelNumT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transaccion N° : ");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario-de-llenado.png"))); // NOI18N
        jLabel1.setText("EDITAR TRANSACCIÓN");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel38.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Descripción");

        cbbEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cbbEmpresa.setForeground(new java.awt.Color(0, 0, 0));

        cbbCuenta.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cbbCuenta.setForeground(new java.awt.Color(0, 0, 0));

        cbbCategoria.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cbbCategoria.setForeground(new java.awt.Color(0, 0, 0));

        jLabel39.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Tipo Cuenta:");

        jLabel40.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Tipo Categoria:");

        labelTipoCuenta.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        labelTipoCuenta.setForeground(new java.awt.Color(255, 255, 255));

        labelTipoCategoria.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        labelTipoCategoria.setForeground(new java.awt.Color(255, 255, 255));

        txtNumCheque.setEditable(false);
        txtNumCheque.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCheque.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtNumCheque.setForeground(new java.awt.Color(0, 0, 0));

        jLabel41.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Tipo - N° Factura");

        txtNumeroFactura.setEditable(false);
        txtNumeroFactura.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtNumeroFactura.setForeground(new java.awt.Color(0, 0, 0));

        jLabel37.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        cbbSubCategoria.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cbbSubCategoria.setForeground(new java.awt.Color(0, 0, 0));

        jLabel43.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("SubCategoria:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumT, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNumCheque)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33)
                                    .addComponent(cbbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel43)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel37)
                                .addGap(417, 417, 417)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbbSubCategoria, 0, 227, Short.MAX_VALUE)
                                    .addComponent(labelTipoCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbCuenta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTipoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelNumT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(btnModificarT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel35)
                                            .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelTipoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)
                                    .addComponent(cbbSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(4, 4, 4))
        );

        jPanel2.setBackground(new java.awt.Color(14, 18, 66));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Operación");

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

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("N° Comprobante");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Imp. Neto Grav.");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("C.U.I.T");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Imp. Interno");

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Concepto No Grav.");

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Percepción IVA");

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ret. Ganancias");

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Perc.IIBB Compra");

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sigma.png"))); // NOI18N
        jLabel19.setText("Imp. Total Fact :");

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ite. IVA Dere. Reg.");

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("C. no Grav. Sellos");

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ret.II BB Venta");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("IVA RG 212");

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Grav. Ley 25413");

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Otros");

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Int. Numerales");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Operaciones Exentas");

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Ing. Brutos");

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Retencion IVA");

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
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

        txtImpNetoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpNetoGrav.setForeground(new java.awt.Color(0, 0, 0));
        txtImpNetoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpNetoGravKeyTyped(evt);
            }
        });

        txtIvaFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact.setForeground(new java.awt.Color(0, 0, 0));
        txtIvaFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFactKeyTyped(evt);
            }
        });

        txtImpInterno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpInterno.setForeground(new java.awt.Color(0, 0, 0));
        txtImpInterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpInternoKeyTyped(evt);
            }
        });

        txtIvaFact21.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFact21.setForeground(new java.awt.Color(0, 0, 0));
        txtIvaFact21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFact21KeyTyped(evt);
            }
        });

        txtPercepcionIVA.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercepcionIVA.setForeground(new java.awt.Color(0, 0, 0));
        txtPercepcionIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercepcionIVAKeyTyped(evt);
            }
        });

        txtRetGanan.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetGanan.setForeground(new java.awt.Color(0, 0, 0));
        txtRetGanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetGananKeyTyped(evt);
            }
        });

        txtPercIvaC.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIvaC.setForeground(new java.awt.Color(0, 0, 0));
        txtPercIvaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIvaCKeyTyped(evt);
            }
        });

        txtImpTotalFact.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpTotalFact.setForeground(new java.awt.Color(0, 0, 0));
        txtImpTotalFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpTotalFactActionPerformed(evt);
            }
        });
        txtImpTotalFact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpTotalFactKeyTyped(evt);
            }
        });

        txtIvaDereReg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaDereReg.setForeground(new java.awt.Color(0, 0, 0));
        txtIvaDereReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaDereRegKeyTyped(evt);
            }
        });

        txtCNoGravSellos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtCNoGravSellos.setForeground(new java.awt.Color(0, 0, 0));
        txtCNoGravSellos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCNoGravSellosKeyTyped(evt);
            }
        });

        txtRetIiBbV.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIiBbV.setForeground(new java.awt.Color(0, 0, 0));
        txtRetIiBbV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIiBbVKeyTyped(evt);
            }
        });

        txtIvaRg212.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaRg212.setForeground(new java.awt.Color(0, 0, 0));
        txtIvaRg212.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaRg212KeyTyped(evt);
            }
        });

        txtGravLey25413.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtGravLey25413.setForeground(new java.awt.Color(0, 0, 0));
        txtGravLey25413.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGravLey25413KeyTyped(evt);
            }
        });

        txtIntNumerales.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIntNumerales.setForeground(new java.awt.Color(0, 0, 0));
        txtIntNumerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntNumeralesKeyTyped(evt);
            }
        });

        txtOpExentas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOpExentas.setForeground(new java.awt.Color(0, 0, 0));
        txtOpExentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpExentasKeyTyped(evt);
            }
        });

        txtIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIngBrutos.setForeground(new java.awt.Color(0, 0, 0));
        txtIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngBrutosKeyTyped(evt);
            }
        });

        txtRetIva.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRetIva.setForeground(new java.awt.Color(0, 0, 0));
        txtRetIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRetIvaKeyTyped(evt);
            }
        });

        txtImpRIngBrutos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpRIngBrutos.setForeground(new java.awt.Color(0, 0, 0));
        txtImpRIngBrutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpRIngBrutosKeyTyped(evt);
            }
        });

        txtOtros.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtOtros.setForeground(new java.awt.Color(0, 0, 0));
        txtOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtrosKeyTyped(evt);
            }
        });

        txtConceptoNoGrav.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtConceptoNoGrav.setForeground(new java.awt.Color(0, 0, 0));
        txtConceptoNoGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConceptoNoGravKeyTyped(evt);
            }
        });

        txtIvaFac27.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIvaFac27.setForeground(new java.awt.Color(0, 0, 0));
        txtIvaFac27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaFac27KeyTyped(evt);
            }
        });

        checkBoxIVA10.setText("IVA Facturado 10.5%");

        checkBoxIVA21.setText("IVA Facturado 21%");

        checkBoxIVA27.setText("IVA Facturado 27%");

        txtPercIIBB_bsas.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtPercIIBB_bsas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPercIIBB_bsasKeyTyped(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Perc. IIBB Bs As");

        txtAfipRG485.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtAfipRG485.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAfipRG485KeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Perc. AFIP RG 4815");

        txtImpPaisArg.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPaisArg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisArgKeyTyped(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Imp. País Arg");

        txtImpPais.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtImpPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpPaisKeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial Narrow", 3, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Imp. País");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(checkBoxIVA27, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxIVA21, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxIVA10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIvaFac27, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(14, 14, 14)
                        .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOtros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGravLey25413, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntNumerales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpExentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel32)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImpPais, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpPaisArg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAfipRG485, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPercIIBB_bsas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImpTotalFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnModificarCVI, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImpNetoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxIVA10))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIvaFact21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxIVA21))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxIVA27)
                            .addComponent(txtIvaFac27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtImpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtConceptoNoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtPercepcionIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtRetGanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPercIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIvaRg212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtIvaDereReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtGravLey25413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addComponent(txtIntNumerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOpExentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))
                                    .addComponent(txtIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRetIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29))
                                        .addGap(11, 11, 11)
                                        .addComponent(txtImpRIngBrutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRetIiBbV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCNoGravSellos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImpPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpPaisArg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAfipRG485, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPercIIBB_bsas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImpTotalFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCVI, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(34, 34, 34)
                .addComponent(labelVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVerificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros= key >=48 && key<=57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtIvaFac27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaFac27KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaFac27KeyTyped

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtImpTotalFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpTotalFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpTotalFactActionPerformed

    private void txtPercIIBB_bsasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercIIBB_bsasKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtPercIIBB_bsas.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtPercIIBB_bsasKeyTyped

    private void txtAfipRG485KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfipRG485KeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtAfipRG485.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtAfipRG485KeyTyped

    private void txtImpPaisArgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisArgKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpPaisArg.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpPaisArgKeyTyped

    private void txtImpPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpPaisKeyTyped
        char caracter = evt.getKeyChar();
        
        if (((caracter < '0' || caracter > '9')) 
                && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.' || txtImpPais.getText().contains("."))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_txtImpPaisKeyTyped

    
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
    public javax.swing.JComboBox<String> cbbCategoria;
    public javax.swing.JComboBox<String> cbbCuenta;
    public javax.swing.JComboBox<String> cbbEmpresa;
    public javax.swing.JComboBox<String> cbbSubCategoria;
    public javax.swing.JCheckBox checkBoxIVA10;
    public javax.swing.JCheckBox checkBoxIVA21;
    public javax.swing.JCheckBox checkBoxIVA27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelNumT;
    public javax.swing.JLabel labelTipoCategoria;
    public javax.swing.JLabel labelTipoCuenta;
    public javax.swing.JLabel labelVerificacion;
    public javax.swing.JTextField txtAfipRG485;
    public javax.swing.JTextField txtCNoGravSellos;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtConceptoNoGrav;
    public javax.swing.JTextField txtCuit;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtEntradas;
    public com.toedter.calendar.JDateChooser txtFecha;
    public com.toedter.calendar.JDateChooser txtFechaT;
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
    public javax.swing.JTextField txtIvaFac27;
    public javax.swing.JTextField txtIvaFact;
    public javax.swing.JTextField txtIvaFact21;
    public javax.swing.JTextField txtIvaRg212;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumCheque;
    public javax.swing.JTextField txtNumComprobante;
    public javax.swing.JTextField txtNumeroFactura;
    public javax.swing.JTextField txtOpExentas;
    public javax.swing.JTextField txtOperacion;
    public javax.swing.JTextField txtOtros;
    public javax.swing.JTextField txtPercIIBB_bsas;
    public javax.swing.JTextField txtPercIvaC;
    public javax.swing.JTextField txtPercepcionIVA;
    public javax.swing.JTextField txtRetGanan;
    public javax.swing.JTextField txtRetIiBbV;
    public javax.swing.JTextField txtRetIva;
    public javax.swing.JTextField txtSalidas;
    public javax.swing.JTextField txtTipoComprobante;
    // End of variables declaration//GEN-END:variables
}
