
package Formularios;


public class frmMenu extends javax.swing.JFrame {

    
    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Menu");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuEmpleado = new javax.swing.JMenuItem();
        menuRegistroProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuCEmpleado = new javax.swing.JMenuItem();
        menuCProducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuEditarEmpleado = new javax.swing.JMenuItem();
        menuEditarProducto = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuFactura = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("jMenu8");

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar4.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar4.add(jMenu12);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-menu.png"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        jMenu1.setText("Archivo");

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        menuSalir.setText("Cerrar sesion");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        jMenu2.setText("Registro");

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados.png"))); // NOI18N
        menuEmpleado.setText("Empleado");
        menuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(menuEmpleado);

        menuRegistroProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addproducto.png"))); // NOI18N
        menuRegistroProducto.setText("Producto");
        menuRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroProductoActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegistroProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N
        jMenu3.setText("Informe");

        menuCEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cempleado.png"))); // NOI18N
        menuCEmpleado.setText("Consulta de Empleados");
        menuCEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(menuCEmpleado);

        menuCProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cproducto.png"))); // NOI18N
        menuCProducto.setText("Consulta de Productos");
        menuCProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCProductoActionPerformed(evt);
            }
        });
        jMenu3.add(menuCProducto);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        jMenu4.setText("Mantenimiento");

        menuEditarEmpleado.setText("Editar Empleado");
        menuEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarEmpleadoActionPerformed(evt);
            }
        });
        jMenu4.add(menuEditarEmpleado);

        menuEditarProducto.setText("Editar Producto");
        menuEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarProductoActionPerformed(evt);
            }
        });
        jMenu4.add(menuEditarProducto);

        jMenuBar1.add(jMenu4);

        menuProceso.setText("Procesos");

        menuFactura.setText("Factura");
        menuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFacturaActionPerformed(evt);
            }
        });
        menuProceso.add(menuFactura);

        jMenuBar1.add(menuProceso);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoActionPerformed
        
        frmRegistroEmpleado fre= new frmRegistroEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
        
    }//GEN-LAST:event_menuEmpleadoActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        
        frmLogin log = new frmLogin();
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuRegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroProductoActionPerformed
        
        frmRegistroProducto frp=new frmRegistroProducto();
        this.setVisible(true);
        frp.setVisible(true);
        
    }//GEN-LAST:event_menuRegistroProductoActionPerformed

    private void menuCProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCProductoActionPerformed
        
        frmConsultaProducto fcp = new frmConsultaProducto();
        this.setVisible(true);
        fcp.setVisible(true);
    }//GEN-LAST:event_menuCProductoActionPerformed

    private void menuCEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCEmpleadoActionPerformed
        
        frmConsultaEmpleado fce = new frmConsultaEmpleado();
        this.setVisible(true);
        fce.setVisible(true);
    }//GEN-LAST:event_menuCEmpleadoActionPerformed

    private void menuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFacturaActionPerformed
    frmFactura frm = new frmFactura();
    this.setVisible(true);
    frm.setVisible(true);
    }//GEN-LAST:event_menuFacturaActionPerformed

    private void menuEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarProductoActionPerformed
        frmEditarProducto fep = new frmEditarProducto();
        this.setVisible(true);
        fep.setVisible(true);
    }//GEN-LAST:event_menuEditarProductoActionPerformed

    private void menuEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarEmpleadoActionPerformed
        frmEditarEmpleado fee = new frmEditarEmpleado();
        this.setVisible(true);
        fee.setVisible(true);
    }//GEN-LAST:event_menuEditarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem menuCEmpleado;
    private javax.swing.JMenuItem menuCProducto;
    private javax.swing.JMenuItem menuEditarEmpleado;
    private javax.swing.JMenuItem menuEditarProducto;
    private javax.swing.JMenuItem menuEmpleado;
    private javax.swing.JMenuItem menuFactura;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenuItem menuRegistroProducto;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
