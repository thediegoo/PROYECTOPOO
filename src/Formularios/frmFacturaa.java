
package Formularios;

import clases.Factura.Detalle;
import clases.Factura.Factura;
import dao.ClienteDAO;
import dao.ProductoDAO;
import clases.Persona.Cliente;
import javax.swing.ImageIcon;
import clases.Producto.Producto;
import dao.VentaDAO;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmFacturaa extends javax.swing.JFrame {

     PreparedStatement ps;
     ResultSet rs;
     Producto pro = new Producto();
     Cliente cl = new Cliente();
     ProductoDAO proDao = new ProductoDAO();
     ClienteDAO client=new ClienteDAO();
     Factura fac = new Factura();
     VentaDAO vdao = new VentaDAO();
     Detalle deta = new Detalle();
     int item;
     DefaultTableModel modelo = new DefaultTableModel();
     double totalPagar=0.00;
     double totalDescuento=0.00;
     double totalSubtotal=0.00;
    
    public frmFacturaa() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        this.setLocationRelativeTo(this);
        this.setTitle("Factura");
    }
    
    private void TotalPago(){
        totalPagar=0.00;
        int numFila=tablaVenta.getRowCount();
        for(int i=0; i<numFila; i++){
            double tot=Double.parseDouble(String.valueOf(tablaVenta.getModel().getValueAt(i, 6)));
            totalPagar=totalPagar+tot;
        }
        labelTotal.setText(String.format("%.2f", totalPagar));
    }
    
    private void Subtotal(){
        totalSubtotal=0.00;
        int numFila=tablaVenta.getRowCount();
        for(int i=0; i<numFila; i++){
            double sub=Double.parseDouble(String.valueOf(tablaVenta.getModel().getValueAt(i, 4)));
            totalSubtotal=totalSubtotal+sub;
        }
        labelSubtotal.setText(String.format("%.2f", totalSubtotal));
    }
    
    private void DescuentoTotal(){
        totalDescuento=0.00;
        int numFila=tablaVenta.getRowCount();
        for(int i=0; i<numFila; i++){
            double sub=Double.parseDouble(String.valueOf(tablaVenta.getModel().getValueAt(i, 5)));
            totalDescuento= totalDescuento+sub;
        }
         labelDescuento.setText(String.format("%.2f",  totalDescuento));
    }
    
    private void LimpiarTexto(){
        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        txtCantidad.setText("");
        txPrecioUnitario.setText("");
        txtStock.setText("");
    }
    
    private void LimpiarFactura(){
        limpiarTable();
        txtIdVendedor.setText("");
        txtDNI.setText("");
        txtNombre.setText("");
        labelSubtotal.setText("");
        labelDescuento.setText("");
        labelTotal.setText("");
    }
    
    private void limpiarTable(){
        for(int i=0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    private void ActualizarStock(){
        for(int i=0; i<tablaVenta.getRowCount(); i++){
            String cod = tablaVenta.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(tablaVenta.getValueAt(i, 2).toString());
            pro = proDao.buscarProducto(cod);
            int stockActual = pro.getStock() - cant;
            vdao.ActualizarStock(stockActual, cod);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaFactura = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txPrecioUnitario = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        btnAgregarCompra = new javax.swing.JButton();
        labelDescuento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdVendedor = new javax.swing.JTextField();
        btnRegistrarFactura = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(75, 85, 163));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));

        txtFechaFactura.setBackground(new java.awt.Color(61, 68, 129));
        getContentPane().add(txtFechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 156, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Codigo Producto");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio Unitario");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 100, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        txPrecioUnitario.setEditable(false);
        txPrecioUnitario.setBackground(new java.awt.Color(21, 31, 46));
        txPrecioUnitario.setForeground(new java.awt.Color(172, 241, 225));
        txPrecioUnitario.setBorder(null);
        getContentPane().add(txPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 100, 30));

        txtCantidad.setBackground(new java.awt.Color(43, 58, 81));
        txtCantidad.setForeground(new java.awt.Color(172, 241, 225));
        txtCantidad.setBorder(null);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 70, 30));

        tablaVenta.setBackground(new java.awt.Color(25, 40, 62));
        tablaVenta.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tablaVenta.setForeground(new java.awt.Color(204, 204, 204));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio U", "Subtotal", "Descuento", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 760, 132));

        txtCodigoProducto.setBackground(new java.awt.Color(43, 58, 81));
        txtCodigoProducto.setForeground(new java.awt.Color(172, 241, 225));
        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(25, 40, 62));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_48px.png"))); // NOI18N
        btnBuscarProducto.setBorder(null);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 40, 40));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre Producto");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        txtNombreProducto.setEditable(false);
        txtNombreProducto.setBackground(new java.awt.Color(21, 31, 46));
        txtNombreProducto.setForeground(new java.awt.Color(172, 241, 225));
        txtNombreProducto.setBorder(null);
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, -1, -1));

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(21, 31, 46));
        txtStock.setForeground(new java.awt.Color(172, 241, 225));
        txtStock.setBorder(null);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 60, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI CLIENTE: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        txtDNI.setBackground(new java.awt.Color(43, 58, 81));
        txtDNI.setForeground(new java.awt.Color(172, 241, 225));
        txtDNI.setBorder(null);
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
        });
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(21, 31, 46));
        txtNombre.setForeground(new java.awt.Color(172, 241, 225));
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 180, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        labelTotal.setText("-----------------");
        getContentPane().add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 70, 30));

        btnEliminar.setBackground(new java.awt.Color(25, 40, 62));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapiz.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subtotal :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        labelSubtotal.setText("-----------------");
        getContentPane().add(labelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 70, -1));

        btnAgregarCompra.setBackground(new java.awt.Color(25, 40, 62));
        btnAgregarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NuevoDocumento_48px.png"))); // NOI18N
        btnAgregarCompra.setBorder(null);
        btnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, -1));

        labelDescuento.setText("-----------------");
        getContentPane().add(labelDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 70, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID EMPLEADO : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 20));

        txtIdVendedor.setBackground(new java.awt.Color(43, 58, 81));
        txtIdVendedor.setForeground(new java.awt.Color(172, 241, 225));
        txtIdVendedor.setBorder(null);
        getContentPane().add(txtIdVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 120, 30));

        btnRegistrarFactura.setBackground(new java.awt.Color(100, 255, 218));
        btnRegistrarFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnRegistrarFactura.setText("REGISTRAR COMPROBANTE");
        btnRegistrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 240, 60));

        jPanel3.setBackground(new java.awt.Color(25, 40, 62));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 218)));

        jLabel1.setBackground(new java.awt.Color(39, 71, 117));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CABECERA");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 820, 130));

        jPanel4.setBackground(new java.awt.Color(25, 40, 62));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 218)));

        jLabel13.setBackground(new java.awt.Color(39, 71, 117));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DETALLE COMPROBANTE");
        jPanel4.add(jLabel13);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 820, 380));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COMPROBANTE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 140, 24));

        btnSalir1.setBackground(new java.awt.Color(10, 25, 47));
        btnSalir1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        btnSalir1.setBorder(null);
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(10, 25, 47));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        
        if(!"".equals(txtCodigoProducto.getText())){
                String cod= txtCodigoProducto.getText();
                pro=proDao.buscarProducto(cod);
                if(pro.getNombreP()!=null){
                    txtNombreProducto.setText(""+pro.getNombreP());
                    txPrecioUnitario.setText(""+pro.getPrecio());
                    txtStock.setText(""+pro.getStock());
                    txtCantidad.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "NO EXISTE PRODUCTO");
                    LimpiarTexto();
                     txtCodigoProducto.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE CODIGO DEL PRODUCTO");
                txtCodigoProducto.requestFocus();
            }
        
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtCodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!"".equals(txtCodigoProducto.getText())){
                String cod= txtCodigoProducto.getText();
                pro=proDao.buscarProducto(cod);
                if(pro.getNombreP()!=null){
                    txtNombreProducto.setText(""+pro.getNombreP());
                    txPrecioUnitario.setText(""+pro.getPrecio());
                    txtStock.setText(""+pro.getStock());
                    txtCantidad.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "NO EXISTE PRODUCTO");
                     txtCodigoProducto.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE CODIGO DEL PRODUCTO");
                txtCodigoProducto.requestFocus();
            }
        }
        
    }//GEN-LAST:event_txtCodigoProductoKeyPressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        
        
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtCantidad.getText())){
                String cod = txtCodigoProducto.getText();
                String nombre=txtNombreProducto.getText();
                int cant=Integer.parseInt(txtCantidad.getText());
                double precio=Double.parseDouble(txPrecioUnitario.getText());
                double subtotal=cant*precio;
                
                double descuento=subtotal*0.05;
                double totalFinal=subtotal-descuento;
                
                int stock=Integer.parseInt(txtStock.getText());
                if(stock >= cant){
                    item=item+1;
                    modelo=(DefaultTableModel) tablaVenta.getModel();
                    ArrayList lista=new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(nombre);
                    lista.add(cant);
                    lista.add(precio);
                    
                    lista.add(subtotal);
                    lista.add(descuento);
                    
                    lista.add(totalFinal);
                    Object[] obj= new Object[7];
                    obj[0]=lista.get(1);
                    obj[1]=lista.get(2);
                    obj[2]=lista.get(3);
                    obj[3]=lista.get(4);
                    obj[4]=lista.get(5);
                    obj[5]=lista.get(6);
                    obj[6]=lista.get(7);
                    modelo.addRow(obj);
                    tablaVenta.setModel(modelo);
                    TotalPago();
                    Subtotal();
                    DescuentoTotal();
                    LimpiarTexto();
                    txtCodigoProducto.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "STOCK NO DISPONIBLE");
                }
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE CANTIDAD");
            }
        }
        
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            
        modelo = (DefaultTableModel) tablaVenta.getModel();
        modelo.removeRow(tablaVenta.getSelectedRow());
        TotalPago();
        Subtotal();
        DescuentoTotal();
        txtCodigoProducto.requestFocus();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if( !"".equals(txtDNI.getText())){
                int dni=Integer.parseInt(txtDNI.getText());
                cl = client.BuscarCliente(dni);
                if(cl.getNombre()!=null){
                    txtNombre.setText(""+cl.getNombre());
                }else{
                    txtDNI.setText("");
                    txtNombre.setText("");
                    JOptionPane.showMessageDialog(null,"CLIENTE NO EXISTE");
                    txtDNI.requestFocus();
                }
            }
        }
        
    }//GEN-LAST:event_txtDNIKeyPressed

    private void btnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompraActionPerformed
       
         if(!"".equals(txtCantidad.getText())){
                String cod = txtCodigoProducto.getText();
                String nombre=txtNombreProducto.getText();
                int cant=Integer.parseInt(txtCantidad.getText());
                double precio=Double.parseDouble(txPrecioUnitario.getText());
                double subtotal=cant*precio;
                
                double descuento=subtotal*0.05;
                double totalFinal=subtotal-descuento;
                
                int stock=Integer.parseInt(txtStock.getText());
                if(stock >= cant){
                    item=item+1;
                    modelo=(DefaultTableModel) tablaVenta.getModel();
                    ArrayList lista=new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(nombre);
                    lista.add(cant);
                    lista.add(precio);
                    
                    lista.add(subtotal);
                    lista.add(descuento);
                    
                    lista.add(totalFinal);
                    Object[] obj= new Object[7];
                    obj[0]=lista.get(1);
                    obj[1]=lista.get(2);
                    obj[2]=lista.get(3);
                    obj[3]=lista.get(4);
                    obj[4]=lista.get(5);
                    obj[5]=lista.get(6);
                    obj[6]=lista.get(7);
                    modelo.addRow(obj);
                    tablaVenta.setModel(modelo);
                    TotalPago();
                    Subtotal();
                    DescuentoTotal();
                    LimpiarTexto();
                    txtCodigoProducto.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "STOCK NO DISPONIBLE");
                }
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE CANTIDAD");
            }
        
    }//GEN-LAST:event_btnAgregarCompraActionPerformed

    private void btnRegistrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFacturaActionPerformed
        
        int anio= txtFechaFactura.getCalendar().get(Calendar.YEAR);
        int mes= txtFechaFactura.getCalendar().get(Calendar.MONTH);
        int dia= txtFechaFactura.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fecha= String.valueOf(anio+"-"+mes+"-"+dia);
        
        if(!"".equals(txtIdVendedor.getText())){
            
            fac.setIdCliente(Integer.parseInt(txtDNI.getText()));
            fac.setIdVendedor(Integer.parseInt(txtIdVendedor.getText()));
            fac.setFecha(fecha);
            fac.setDescuento(totalDescuento);
            fac.setSubtotal(totalSubtotal);
            fac.setPrecioTotal(totalPagar);
            vdao.RegistrarVenta(fac);
            
            String id = vdao.IdVenta();
            for(int i=0; i<tablaVenta.getRowCount(); i++){
                    String cod = tablaVenta.getValueAt(i, 0).toString();
                    int cantidad = Integer.parseInt(tablaVenta.getValueAt(i, 2).toString());
                    double precioU = Double.parseDouble(tablaVenta.getValueAt(i, 3).toString());
                    deta.setIdProducto(cod);
                    deta.setIdFactura(id);
                    deta.setSubtotal(precioU);
                    deta.setCantidad(cantidad);
                    vdao.RegistrarDetalle(deta);
            }
            
            ActualizarStock();
            LimpiarFactura();
            
           JOptionPane.showMessageDialog(null,"FACTURA CREADA!");
        }else{
             JOptionPane.showMessageDialog(null,"DEBE REGISTRAR UN VENDEDOR");
        }
    }//GEN-LAST:event_btnRegistrarFacturaActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmFacturaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFacturaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFacturaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFacturaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFacturaa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCompra;
    public javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrarFactura;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tablaVenta;
    public javax.swing.JTextField txPrecioUnitario;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDNI;
    private com.toedter.calendar.JDateChooser txtFechaFactura;
    private javax.swing.JTextField txtIdVendedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
