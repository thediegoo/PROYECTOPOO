package Formularios;

import static Formularios.frmRegistroProducto.prod;
import ModelFactura.EmpleadoDAO;
import clases.Persona.Empleado;
import clases.Producto.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class frmConsultaProductos extends javax.swing.JFrame {

    Empleado emp = new Empleado();    
    EmpleadoDAO empleado=new EmpleadoDAO();

    private Producto PR;
    private DefaultTableModel model;
    int con;
    String indice;

    public frmConsultaProductos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        cargarTabla("");
        
        this.setTitle("Consultar Productos");
        this.setLocationRelativeTo(this);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        BUTCOD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        RegistrarProd = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jButton5.setText("Guardar");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(75, 85, 163));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CONSULTAR PRODUCTOS");

        tablaProductos.setAutoCreateRowSorter(true);
        tablaProductos.setBackground(new java.awt.Color(75, 85, 163));
        tablaProductos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(0, 0, 0));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Categoria", "Nombre", "Marca", "Estado", "Stock", "Cantidad Inicial", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        BUTCOD.setBackground(new java.awt.Color(75, 85, 163));
        BUTCOD.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        BUTCOD.setForeground(new java.awt.Color(0, 0, 0));
        BUTCOD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        BUTCOD.setText("BUSCAR");
        BUTCOD.setBorder(null);
        BUTCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTCODActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUSCAR");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese Codigo:");

        txtCodProd.setBackground(new java.awt.Color(60, 66, 119));
        txtCodProd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 15)); // NOI18N
        txtCodProd.setBorder(null);
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });

        RegistrarProd.setBackground(new java.awt.Color(75, 85, 163));
        RegistrarProd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        RegistrarProd.setForeground(new java.awt.Color(0, 0, 0));
        RegistrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        RegistrarProd.setText("Registrar");
        RegistrarProd.setBorder(null);
        RegistrarProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RegistrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProdActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fd.png"))); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(240, 129, 129));
        btnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(75, 85, 163));
        btnSalir1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.setBorder(null);
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(75, 85, 163));
        btnMostrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        btnMostrar.setText("MOSTRAR TODOS");
        btnMostrar.setBorder(null);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(309, 309, 309))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(RegistrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalir1)
                                    .addComponent(RegistrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BUTCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarTabla(String valor){
            String[]  titulo={"codProducto", "Categoria", "Nombre","Marca", "Estado", "RUT Proveedor", "Stock","Cantidad Inicial", "Precio Unitario"};
            String[]  filas= new String[9];

            model= new DefaultTableModel(null, titulo);

            try{
                //creando la conección a la BD
                Connection conectar= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
                //crear la consulta
                Statement declarar= conectar.createStatement();

                String xsql= "SELECT codProducto , c.nombreCat , p.nombre , m.nombreMar , p.estado , p.rut_proveedor , p.stock , p.cantInicial , p.precioUnit FROM producto p INNER JOIN categoria c on p.codCategoria = c.codCategoria INNER JOIN marca m on p.codMarca = m.codMarca";
                //Crear la tabla
                ResultSet ejecutar= declarar.executeQuery(xsql);
                while(ejecutar.next()){
                    filas[0]= ejecutar.getString("codProducto");
                    filas[1]= ejecutar.getString("c.nombreCat");
                    filas[2]= ejecutar.getString("p.nombre");
                    filas[3]= ejecutar.getString("m.nombreMar");
                    filas[4]= ejecutar.getString("p.estado");                
                    filas[5]= ejecutar.getString("p.rut_proveedor");                
                    filas[6]= ejecutar.getString("p.stock");
                    filas[7]= ejecutar.getString("p.cantInicial");          
                    filas[8]= ejecutar.getString("p.precioUnit");          
     
                    model.addRow(filas);
                }
                tablaProductos.setModel(model);

            }catch(Exception e){
                    System.out.println("Error.... No hay conección");
                    e.printStackTrace();
            }

        }
    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodProdActionPerformed

    private void BUTCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTCODActionPerformed
        String[]  titulo={"codProducto", "Categoria", "Nombre","Marca", "Estado", "RUT Proveedor", "Stock","Cantidad Inicial", "Precio Unitario"};
            String[]  filas= new String[9];

            model= new DefaultTableModel(null, titulo);
        
        try{
            indice = txtCodProd.getText();
            Connection conectar= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            //crear la consulta
            String xsql=  "SELECT codProducto , c.nombreCat , p.nombre , m.nombreMar , p.estado , p.rut_proveedor , p.stock , p.cantInicial , p.precioUnit FROM producto p INNER JOIN categoria c on p.codCategoria = c.codCategoria INNER JOIN marca m on p.codMarca = m.codMarca WHERE p.codProducto=? ";
            PreparedStatement declarar= conectar.prepareStatement(xsql);
            declarar.setString(1,  indice);
            //Crear la tabla
            ResultSet ejecutar= declarar.executeQuery();
            while(ejecutar.next()){
                filas[0]= ejecutar.getString("codProducto");
                filas[1]= ejecutar.getString("c.nombreCat");
                filas[2]= ejecutar.getString("p.nombre");
                filas[3]= ejecutar.getString("m.nombreMar");
                filas[4]= ejecutar.getString("p.estado");                
                filas[5]= ejecutar.getString("p.rut_proveedor");                
                filas[6]= ejecutar.getString("p.stock");
                filas[7]= ejecutar.getString("p.cantInicial");          
                filas[8]= ejecutar.getString("p.precioUnit");            
                model.addRow(filas);
            }
            tablaProductos.setModel(model);
        
        }catch(Exception e){
                System.out.println("Error.... No hay conección");
                e.printStackTrace();
        }
    }//GEN-LAST:event_BUTCODActionPerformed

    private void RegistrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProdActionPerformed
        this.setVisible(false);
        frmRegistroProducto fre = new frmRegistroProducto();
        fre.setVisible(true);
    }//GEN-LAST:event_RegistrarProdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//      if(TEXTCOD.getText().trim().isEmpty()){
//          JOptionPane.showMessageDialog(null,"EL CAMPO ESTA VACIO");
//          TEXTCOD.setText("");
//          TEXTCOD.requestFocus();
//        }else{
//            String codP = TEXTCOD.getText();
//           existe = comprobarCod(codP);
//
//          if(existe== -1){
//              JOptionPane.showMessageDialog(null,"no existe el codigo");
//              TEXTCOD.setText("");
//              TEXTCOD.setText("");
//          }else{
//              frmRegistroProducto.LISTA.remove(existe);
//              JOptionPane.showMessageDialog(null,"REGISTRO ELIMINADO");
//               TEXTCOD.setText("");
//               TEXTCOD.requestFocus();
//               listardatos();
//        }
//      }
          
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cargarTabla("");
    }//GEN-LAST:event_btnMostrarActionPerformed
   
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
            java.util.logging.Logger.getLogger(frmConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTCOD;
    private javax.swing.JButton RegistrarProd;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodProd;
    // End of variables declaration//GEN-END:variables

    private int comprobarCodigo(String codP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
