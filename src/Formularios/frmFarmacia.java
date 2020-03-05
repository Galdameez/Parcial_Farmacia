package Formularios;

import Entidades.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class frmFarmacia extends javax.swing.JFrame {

    //Intancias
    ArrayList<Proveedor> lProveedores;
    Proveedor proveedor;
    Inventario inventario;
    Venta venta;
    DefaultTableModel modelTable;

    public frmFarmacia() {
        initComponents();
        this.iniciarFrame();
        this.inventario = new Inventario();
        this.lProveedores = new ArrayList<>();
        this.venta = new Venta();
        this.bloquearSeccionVenta(false);
        this.bloquearSeccionInventario(false);
    }

    private void iniciarFrame() {
        this.setVisible(true);
        this.setTitle("Farmacia CuidaTM");
    }

    private void bloquearSeccionVenta(boolean cierto) {

        this.jtpFarmacia.setEnabledAt(3, cierto);

    }

    private void bloquearSeccionInventario(boolean cierto) {
        this.spnAddAcetaminofen.setEnabled(cierto);
        this.spnAddAlcohol.setEnabled(cierto);
        this.spnAddAspirina.setEnabled(cierto);
        this.spnAddParacetamol.setEnabled(cierto);
        this.spnAddRoyalin1.setEnabled(cierto);
        this.btnRecargarInventario.setEnabled(cierto);
        this.spnIAddbuprofeno.setEnabled(cierto);
        this.cboProveedorInventario.setEnabled(cierto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpFarmacia = new javax.swing.JTabbedPane();
        jpProveedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ibuprofeno = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnAcetaminofen = new javax.swing.JSpinner();
        spnAspirina = new javax.swing.JSpinner();
        spnAlcohol = new javax.swing.JSpinner();
        spnRoyalin = new javax.swing.JSpinner();
        spnIbuprofeno = new javax.swing.JSpinner();
        spnParacetamol = new javax.swing.JSpinner();
        btnAgregarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProveedores = new javax.swing.JTable();
        jpInventario = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCantAcetaminofen = new javax.swing.JTextField();
        txtCantAspirina = new javax.swing.JTextField();
        txtCantAlcohol = new javax.swing.JTextField();
        txtCantRoyalin = new javax.swing.JTextField();
        txtCantIbuprofeno = new javax.swing.JTextField();
        txtCantParacetamol = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboProveedorInventario = new javax.swing.JComboBox<>();
        spnAddAcetaminofen = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ibuprofeno1 = new javax.swing.JLabel();
        spnAddRoyalin1 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        spnIAddbuprofeno = new javax.swing.JSpinner();
        spnAddParacetamol = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        spnAddAspirina = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        spnAddAlcohol = new javax.swing.JSpinner();
        btnRecargarInventario = new javax.swing.JButton();
        jpRegistros = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtClientesRegistros = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtVentasRealizadas = new javax.swing.JTable();
        jpVenta = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        spnAcetaminofenVenta = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        spnAspirinaVenta = new javax.swing.JSpinner();
        spnAlcoholVenta = new javax.swing.JSpinner();
        spnRoyalinVenta = new javax.swing.JSpinner();
        spnIbuprofenoVenta = new javax.swing.JSpinner();
        spnParacetamolVenta = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        cboEmpleados = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        rbRegistrarCliente = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        ffNumCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jtpFarmacia.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Crear Nuevo Proveedor");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel2.setText("Nombre Proveedor");

        txtNombreProveedor.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel3.setText("Precios");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel4.setText("Acetaminofen $");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel5.setText("Aspirina $");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel6.setText("Alcohol $");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel7.setText("Royalin $");

        ibuprofeno.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        ibuprofeno.setText("Ibuprofeno $");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel9.setText("Paracetamol $");

        spnAcetaminofen.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAcetaminofen.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        spnAspirina.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAspirina.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        spnAlcohol.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAlcohol.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        spnRoyalin.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnRoyalin.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        spnIbuprofeno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnIbuprofeno.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        spnParacetamol.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnParacetamol.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));

        btnAgregarProveedor.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnAgregarProveedor.setText("Agregar");
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });

        jtProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProveedores);
        if (jtProveedores.getColumnModel().getColumnCount() > 0) {
            jtProveedores.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProveedorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProveedorLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(ibuprofeno)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnRoyalin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnIbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregarProveedor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpProveedorLayout.createSequentialGroup()
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jpProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpProveedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spnAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnRoyalin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jpProveedorLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnIbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibuprofeno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProveedor)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jtpFarmacia.addTab("Proveedor", jpProveedor);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Inventario de la Farmacia");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel10.setText("Cantidades Actuales");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel11.setText("Acetaminofen");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel12.setText("Aspirina");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel13.setText("Alcohol");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel14.setText("Royalin");

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel15.setText("Ibuprofeno");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel16.setText("Paracetamol");

        txtCantAcetaminofen.setEditable(false);
        txtCantAcetaminofen.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantAcetaminofen.setText("0");

        txtCantAspirina.setEditable(false);
        txtCantAspirina.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantAspirina.setText("0");

        txtCantAlcohol.setEditable(false);
        txtCantAlcohol.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantAlcohol.setText("0");

        txtCantRoyalin.setEditable(false);
        txtCantRoyalin.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantRoyalin.setText("0");

        txtCantIbuprofeno.setEditable(false);
        txtCantIbuprofeno.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantIbuprofeno.setText("0");

        txtCantParacetamol.setEditable(false);
        txtCantParacetamol.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtCantParacetamol.setText("0");

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setText("Recargar Inventario");

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel18.setText("Seleccionar Proveedor");

        cboProveedorInventario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cboProveedorInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboProveedorInventarioMouseClicked(evt);
            }
        });
        cboProveedorInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedorInventarioActionPerformed(evt);
            }
        });

        spnAddAcetaminofen.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAddAcetaminofen.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel19.setText("Acetaminofen");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel20.setText("Cantidad a pedir");

        ibuprofeno1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        ibuprofeno1.setText("Ibuprofeno");

        spnAddRoyalin1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAddRoyalin1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel21.setText("Paracetamol");

        spnIAddbuprofeno.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnIAddbuprofeno.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        spnAddParacetamol.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAddParacetamol.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel22.setText("Aspirina");

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel23.setText("Alcohol");

        spnAddAspirina.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAddAspirina.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel24.setText("Royalin");

        spnAddAlcohol.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAddAlcohol.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        btnRecargarInventario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRecargarInventario.setText("Realizar Pedido");
        btnRecargarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInventarioLayout = new javax.swing.GroupLayout(jpInventario);
        jpInventario.setLayout(jpInventarioLayout);
        jpInventarioLayout.setHorizontalGroup(
            jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInventarioLayout.createSequentialGroup()
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel10))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel15)
                        .addGap(9, 9, 9)
                        .addComponent(txtCantIbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8)
                        .addComponent(txtCantParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantRoyalin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboProveedorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpInventarioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(ibuprofeno1)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnAddAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAddAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAddRoyalin1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnIAddbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnAddParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpInventarioLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAddAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(btnRecargarInventario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpInventarioLayout.setVerticalGroup(
            jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(24, 24, 24)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCantAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtCantAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtCantRoyalin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCantIbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtCantParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cboProveedorInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(spnAddAcetaminofen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAddAspirina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAddAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAddRoyalin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnIAddbuprofeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibuprofeno1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnAddParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(btnRecargarInventario))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jtpFarmacia.addTab("Inventario", jpInventario);

        jLabel27.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel27.setText("Clientes Registrados en el Sistema");

        jtClientesRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Núm. Celular", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtClientesRegistros);
        if (jtClientesRegistros.getColumnModel().getColumnCount() > 0) {
            jtClientesRegistros.getColumnModel().getColumn(0).setResizable(false);
            jtClientesRegistros.getColumnModel().getColumn(1).setResizable(false);
            jtClientesRegistros.getColumnModel().getColumn(2).setResizable(false);
            jtClientesRegistros.getColumnModel().getColumn(2).setHeaderValue("Correo");
        }

        jLabel40.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel40.setText("Ventas Registradas");

        jtVentasRealizadas.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jtVentasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Empleado", "Productos", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtVentasRealizadas);
        if (jtVentasRealizadas.getColumnModel().getColumnCount() > 0) {
            jtVentasRealizadas.getColumnModel().getColumn(0).setResizable(false);
            jtVentasRealizadas.getColumnModel().getColumn(1).setResizable(false);
            jtVentasRealizadas.getColumnModel().getColumn(2).setResizable(false);
            jtVentasRealizadas.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jpRegistrosLayout = new javax.swing.GroupLayout(jpRegistros);
        jpRegistros.setLayout(jpRegistrosLayout);
        jpRegistrosLayout.setHorizontalGroup(
            jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(jpRegistrosLayout.createSequentialGroup()
                        .addGroup(jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel40))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRegistrosLayout.setVerticalGroup(
            jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jtpFarmacia.addTab("Registros", jpRegistros);

        jLabel28.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel28.setText("Crear Nueva Venta");

        jLabel29.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel29.setText("Nombre Cliente");

        txtNombreCliente.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel31.setText("Cantidad a pedir");

        jLabel32.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel32.setText("Acetaminofen");

        spnAcetaminofenVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAcetaminofenVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnAcetaminofenVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAcetaminofenVentaStateChanged(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel33.setText("Aspirina");

        jLabel34.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel34.setText("Alcohol");

        jLabel35.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel35.setText("Royalin");

        jLabel36.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel36.setText("Ibuprofeno");

        jLabel37.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel37.setText("Paracetamol");

        spnAspirinaVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAspirinaVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnAspirinaVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAspirinaVentaStateChanged(evt);
            }
        });

        spnAlcoholVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnAlcoholVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnAlcoholVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAlcoholVentaStateChanged(evt);
            }
        });

        spnRoyalinVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnRoyalinVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnRoyalinVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnRoyalinVentaStateChanged(evt);
            }
        });

        spnIbuprofenoVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnIbuprofenoVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnIbuprofenoVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnIbuprofenoVentaStateChanged(evt);
            }
        });

        spnParacetamolVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnParacetamolVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spnParacetamolVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnParacetamolVentaStateChanged(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel30.setText("Subtotal ");

        cboEmpleados.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cboEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan Lopez", "Adonay Martinez", "Alejandro Fernandez" }));

        jLabel38.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel38.setText("Núm Celular");

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtSubTotal.setText("$");

        jLabel39.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel39.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtTotal.setText("$");

        btnTotal.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        rbRegistrarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        rbRegistrarCliente.setText("Registrar Cliente");
        rbRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegistrarClienteActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel41.setText("Empleado");

        jLabel42.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel42.setText("Correo");

        txtCorreoCliente.setEditable(false);

        ffNumCelular.setEditable(false);
        try {
            ffNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffNumCelular.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpVentaLayout = new javax.swing.GroupLayout(jpVenta);
        jpVenta.setLayout(jpVentaLayout);
        jpVentaLayout.setHorizontalGroup(
            jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentaLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAcetaminofenVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpVentaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpVentaLayout.createSequentialGroup()
                                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTotal)
                                            .addComponent(btnRegistrarVenta)))
                                    .addGroup(jpVentaLayout.createSequentialGroup()
                                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpVentaLayout.createSequentialGroup()
                                                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel34)
                                                        .addComponent(jLabel36)
                                                        .addComponent(jLabel33))
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVentaLayout.createSequentialGroup()
                                                .addComponent(jLabel37)
                                                .addGap(7, 7, 7)))
                                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnParacetamolVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnAspirinaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnAlcoholVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnIbuprofenoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnRoyalinVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel28))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addGap(25, 25, 25)
                                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel31))
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentaLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ffNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVentaLayout.createSequentialGroup()
                                .addComponent(rbRegistrarCliente)
                                .addGap(84, 84, 84))))))
            .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpVentaLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel41)
                    .addContainerGap(556, Short.MAX_VALUE)))
        );
        jpVentaLayout.setVerticalGroup(
            jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentaLayout.createSequentialGroup()
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(spnAcetaminofenVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnAspirinaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(19, 19, 19)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(spnAlcoholVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(rbRegistrarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(ffNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnRoyalinVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(spnIbuprofenoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(spnParacetamolVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)))
                    .addGroup(jpVentaLayout.createSequentialGroup()
                        .addComponent(btnTotal)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarVenta)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpVentaLayout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jLabel41)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        jtpFarmacia.addTab("Venta", jpVenta);

        getContentPane().add(jtpFarmacia, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(663, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        if (this.txtNombreProveedor.getText().equals("")) {
        } else {
            this.agregarProveedorLista();
            this.actualizarCboProveedores();
            this.agregarArrowProveedor();
            this.bloquearSeccionInventario(true);
        }

    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void cboProveedorInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboProveedorInventarioMouseClicked

    }//GEN-LAST:event_cboProveedorInventarioMouseClicked

    private void registrarVentaTabla() {
        this.modelTable = (DefaultTableModel) this.jtVentasRealizadas.getModel();
        String arrowVenta[] = {this.txtNombreCliente.getText(),
            this.cboEmpleados.getSelectedItem().toString(), "Producto", this.txtTotal.getText()};
        this.modelTable.addRow(arrowVenta);
    }
    private void btnRecargarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarInventarioActionPerformed
        this.recargarInventario();
        this.actualizarCantInventario();
        this.bloquearSeccionVenta(true);
    }//GEN-LAST:event_btnRecargarInventarioActionPerformed


    private void spnAcetaminofenVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAcetaminofenVentaStateChanged
        if (this.inventario.getCantAcetaminofe() - (int) this.spnAcetaminofenVenta.getValue() < 0) {
            System.out.println("n0 se puede");

        } else {
            this.venta.setVentaAcetaminofen((int) this.spnAcetaminofenVenta.getValue() * this.inventario.getPrcAcetaminofen());
            this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
            this.inventario.restartAcetaminofen((int) this.spnAcetaminofenVenta.getValue());
        }
    }//GEN-LAST:event_spnAcetaminofenVentaStateChanged

    private void spnAspirinaVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAspirinaVentaStateChanged
        this.venta.setVentaAspirina((int) this.spnAspirinaVenta.getValue() * this.inventario.getPrcAspirina());
        this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
        this.inventario.restartAspirina((int) this.spnAspirinaVenta.getValue());

    }//GEN-LAST:event_spnAspirinaVentaStateChanged

    private void spnAlcoholVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAlcoholVentaStateChanged
        this.venta.setVentaAlcohol((int) this.spnAlcoholVenta.getValue() * this.inventario.getPrcAlcohol());
        this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
        this.inventario.restartAlcohol((int) this.spnAlcoholVenta.getValue());


    }//GEN-LAST:event_spnAlcoholVentaStateChanged

    private void spnRoyalinVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnRoyalinVentaStateChanged
        this.venta.setVentaRoyalin((int) this.spnRoyalinVenta.getValue() * this.inventario.getPrcRoyalin());
        this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
        this.inventario.restartRoyalin((int) this.spnRoyalinVenta.getValue());
    }//GEN-LAST:event_spnRoyalinVentaStateChanged

    private void spnIbuprofenoVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnIbuprofenoVentaStateChanged
        this.venta.setVentaIbuprofeno((int) this.spnIbuprofenoVenta.getValue() * this.inventario.getPrcIbuprofeno());
        this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
        this.inventario.restartIbuprofeno((int) this.spnIbuprofenoVenta.getValue());
    }//GEN-LAST:event_spnIbuprofenoVentaStateChanged

    private void spnParacetamolVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnParacetamolVentaStateChanged
        this.venta.setVentaParacetamol((int) this.spnParacetamolVenta.getValue() * this.inventario.getPrcParacetamol());
        this.txtSubTotal.setText("$ " + String.valueOf(this.venta.sumarTodo()));
        this.inventario.restartParacetamol((int) this.spnParacetamolVenta.getValue());
    }//GEN-LAST:event_spnParacetamolVentaStateChanged

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        this.txtTotal.setText("$" + String.valueOf(this.venta.sumarTodo() + (this.venta.sumarTodo() * 0.13)));
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if (this.rbRegistrarCliente.isSelected()) {
            this.agregarClienteSpam();
        } else {

        }
        this.registrarVentaTabla();
        this.limpiarVenta();
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void limpiarVenta() {
        this.txtNombreCliente.setText(null);
        this.ffNumCelular.setText(null);
        this.txtCorreoCliente.setEditable(false);
        this.ffNumCelular.setEditable(false);
        this.txtCorreoCliente.setText(null);
        this.txtSubTotal.setText(null);
        this.txtTotal.setText(null);
        this.rbRegistrarCliente.setSelected(false);
    }
    private void rbRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegistrarClienteActionPerformed
        this.txtCorreoCliente.setEditable(true);
        this.ffNumCelular.setEditable(true);
    }//GEN-LAST:event_rbRegistrarClienteActionPerformed

    private void cboProveedorInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedorInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProveedorInventarioActionPerformed

    private void agregarClienteSpam() {
        this.modelTable = (DefaultTableModel) this.jtClientesRegistros.getModel();
        String arrowClienteSpam[] = {this.txtNombreCliente.getText(), this.ffNumCelular.getText(), this.txtCorreoCliente.getText()};
        this.modelTable.addRow(arrowClienteSpam);
    }

    private void recargarInventario() {
        this.inventario.addMedicamentos((int) this.spnAddAcetaminofen.getValue(), (int) this.spnAddAspirina.getValue(),
                (int) this.spnAddAlcohol.getValue(), (int) this.spnAddRoyalin1.getValue(), (int) this.spnIAddbuprofeno.getValue(),
                (int) this.spnAddParacetamol.getValue());
        this.actulizarPrecios();
    }

    private void actulizarPrecios() {
        this.inventario.setPrcAcetaminofen(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcAcetaminofen());
        this.inventario.setPrcAlcohol(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcAlcohol());
        this.inventario.setPrcIbuprofeno(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcIbuprofeno());
        this.inventario.setPrcRoyalin(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcRoyalin());
        this.inventario.setPrcAspirina(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcAspirina());
        this.inventario.setPrcParacetamol(this.lProveedores.get(this.cboProveedorInventario.getSelectedIndex()).getPrcParacetamol());
    }

    private void actualizarCantInventario() {
        this.txtCantAcetaminofen.setText(String.valueOf(this.inventario.getCantAcetaminofe()));
        this.txtCantAlcohol.setText(String.valueOf(this.inventario.getCantAlcohol()));
        this.txtCantAspirina.setText(String.valueOf(this.inventario.getCantAspirina()));
        this.txtCantIbuprofeno.setText(String.valueOf(this.inventario.getCantIbuprofeno()));
        this.txtCantParacetamol.setText(String.valueOf(this.inventario.getCantParacetamol()));
        this.txtCantRoyalin.setText(String.valueOf(this.inventario.getCantRoyalin()));
    }

    private void agregarProveedorLista() {
        this.proveedor = new Proveedor(this.txtNombreProveedor.getText(), (double) this.spnAcetaminofen.getValue(), (double) this.spnAspirina.getValue(),
                (double) this.spnAlcohol.getValue(), (double) this.spnRoyalin.getValue(), (double) this.spnIbuprofeno.getValue(), (double) this.spnParacetamol.getValue());
        this.lProveedores.add(proveedor);
    }

    private void agregarArrowProveedor() {
        this.modelTable = (DefaultTableModel) this.jtProveedores.getModel();
        String[] arrowProveedor = {this.txtNombreProveedor.getText().trim().toUpperCase()};
        this.modelTable.addRow(arrowProveedor);
    }

    private void actualizarCboProveedores() {
        this.cboProveedorInventario.addItem(this.txtNombreProveedor.getText().trim().toUpperCase());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnRecargarInventario;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnTotal;
    private javax.swing.JComboBox<String> cboEmpleados;
    private javax.swing.JComboBox<String> cboProveedorInventario;
    private javax.swing.JFormattedTextField ffNumCelular;
    private javax.swing.JLabel ibuprofeno;
    private javax.swing.JLabel ibuprofeno1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpInventario;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpRegistros;
    private javax.swing.JPanel jpVenta;
    private javax.swing.JTable jtClientesRegistros;
    private javax.swing.JTable jtProveedores;
    private javax.swing.JTable jtVentasRealizadas;
    private javax.swing.JTabbedPane jtpFarmacia;
    private javax.swing.JRadioButton rbRegistrarCliente;
    private javax.swing.JSpinner spnAcetaminofen;
    private javax.swing.JSpinner spnAcetaminofenVenta;
    private javax.swing.JSpinner spnAddAcetaminofen;
    private javax.swing.JSpinner spnAddAlcohol;
    private javax.swing.JSpinner spnAddAspirina;
    private javax.swing.JSpinner spnAddParacetamol;
    private javax.swing.JSpinner spnAddRoyalin1;
    private javax.swing.JSpinner spnAlcohol;
    private javax.swing.JSpinner spnAlcoholVenta;
    private javax.swing.JSpinner spnAspirina;
    private javax.swing.JSpinner spnAspirinaVenta;
    private javax.swing.JSpinner spnIAddbuprofeno;
    private javax.swing.JSpinner spnIbuprofeno;
    private javax.swing.JSpinner spnIbuprofenoVenta;
    private javax.swing.JSpinner spnParacetamol;
    private javax.swing.JSpinner spnParacetamolVenta;
    private javax.swing.JSpinner spnRoyalin;
    private javax.swing.JSpinner spnRoyalinVenta;
    private javax.swing.JTextField txtCantAcetaminofen;
    private javax.swing.JTextField txtCantAlcohol;
    private javax.swing.JTextField txtCantAspirina;
    private javax.swing.JTextField txtCantIbuprofeno;
    private javax.swing.JTextField txtCantParacetamol;
    private javax.swing.JTextField txtCantRoyalin;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
