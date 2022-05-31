
package Formularios;
import clases.Persona.Empleado;
import controlador.Arreglo_Empleado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmConsultaEmpleado extends javax.swing.JFrame {
    
    Arreglo_Empleado emp = new Arreglo_Empleado();
    int con;
    int indice;
    public frmConsultaEmpleado() {
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        listado();
        this.setTitle("Consultar empleados");
        this.setLocationRelativeTo(this);
    }
    
    
    public void listado(){
        DefaultTableModel dt=(DefaultTableModel)tablaEmpleado.getModel();
        dt.setRowCount(0);
        
        for(int i=0; i<frmRegistroEmpleado.emp.tamaño(); i++){
            Empleado x=frmRegistroEmpleado.emp.obtener(i);
            Object v[] = {x.getNombre(), x.getApellido(), x.getDni(), x.getTelf(), x.getDireccion(), x.getSueldo(), x.getFechaIngreso()};
            dt.addRow(v);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSalir1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTAREA = new javax.swing.JTextArea();
        textFI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jButton5.setText("Guardar");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(181, 222, 179));
        jPanel1.setForeground(new java.awt.Color(181, 222, 179));

        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "DNI", "Telefono", "Direccion", "Sueldo", "Fecha Ingreso"
            }
        ));
        jScrollPane2.setViewportView(tablaEmpleado);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setText("CONSULTAR EMPLEADOS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TXTAREA.setColumns(20);
        TXTAREA.setRows(5);
        jScrollPane1.setViewportView(TXTAREA);

        textFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFIActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingresa Dni:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir1)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textFI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        indice = emp.busca(Integer.parseInt(textFI.getText()));
        Empleado e = emp.obtener(indice);
        TXTAREA.setText("Nombre : "+e.getNombre());
        TXTAREA.append( " \n Apellido : "+e.getApellido());
        TXTAREA.append("\n DNI : "+e.getDni());
        TXTAREA.append("\n TELEFONO : "+e.getTelf());
        TXTAREA.append("\n DIRECC : "+e.getDireccion());
        TXTAREA.append("\n DIRECC : "+e.getDireccion());
        TXTAREA.append("\n SUELDO : "+e.getSueldo());
        TXTAREA.append("\n FECHA DE INGRESO : "+e.getFechaIngreso());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFIActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFIActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TXTAREA;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField textFI;
    // End of variables declaration//GEN-END:variables

   
}
