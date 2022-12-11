
package Formularios.Clientes;

import Formularios.frmMenu;
import dao.ClienteDAO;
import clases.Persona.Cliente;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class frmClientes extends javax.swing.JFrame {

    Cliente cl = new Cliente();
    ClienteDAO client=new ClienteDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public frmClientes() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        this.setLocationRelativeTo(this);
        limpiarTable();
        listarCliente();
        customizeTable();
    }
//    public static javax.swing.JTable tablaCliente;
    public void customizeTable(){
        tablaCliente.setRowHeight(25);
        JTableHeader tableHeader = tablaCliente.getTableHeader();
        Font headerFont = new Font("Poppins", Font.PLAIN, 16);
        tableHeader.setFont(headerFont);
        tableHeader.setForeground(Color.black);
        tableHeader.setBackground(Color.white);
    }
    public void listarCliente(){
        List<Cliente> lista=client.ListarCliente();
        modelo=(DefaultTableModel) tablaCliente.getModel();
        Object[] obj=new Object[6];
        for(int i=0;  i<lista.size(); i++){
            obj[0] = lista.get(i).getDni();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getApellido();
            obj[3] = lista.get(i).getTelf();
            obj[4] = lista.get(i).getTipoCliente();
            obj[5] = lista.get(i).getDireccion();
            modelo.addRow(obj);
        }
        tablaCliente.setModel(modelo);
    }
    
    public void limpiarTable(){
        for(int i=0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    public void listarCategoriaCliente(JComboBox cb){
        try {
            Connection conectar= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            Statement declarar= conectar.createStatement();
            String sql= "SELECT tipoCliente, nombre from tipocliente";
            ResultSet ejecutar= declarar.executeQuery(sql);
            while(ejecutar.next()){
                cb.addItem(ejecutar.getString("tipoCliente"));
            }
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1313, 642));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setEnabled(false);

        tablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tablaCliente.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        tablaCliente.setForeground(new java.awt.Color(0, 0, 0));
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Telefono", "Tipo Cliente", "Direccion"
            }
        ));
        tablaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        jLabel35.setBackground(java.awt.Color.black);
        jLabel35.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(30, 30, 30));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(136, 146, 176));
        jLabel34.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(30, 30, 30));
        jLabel34.setText("PeriTec | Clientes");

        btnClientes.setBackground(new java.awt.Color(31, 31, 31));
        btnClientes.setForeground(new java.awt.Color(30, 30, 30));
        btnClientes.setToolTipText("");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        jLabel38.setBackground(java.awt.Color.black);
        jLabel38.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel38.setForeground(java.awt.Color.white);
        jLabel38.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel38)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRegistrar.setBackground(new java.awt.Color(31, 31, 31));
        btnRegistrar.setForeground(new java.awt.Color(30, 30, 30));
        btnRegistrar.setToolTipText("");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        lbl.setBackground(java.awt.Color.black);
        lbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lbl.setForeground(java.awt.Color.white);
        lbl.setText("REGISTRAR");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setBackground(new java.awt.Color(31, 31, 31));
        btnEditar.setForeground(new java.awt.Color(30, 30, 30));
        btnEditar.setToolTipText("");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        jLabel40.setBackground(java.awt.Color.black);
        jLabel40.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel40.setForeground(java.awt.Color.white);
        jLabel40.setText("EDITAR");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditarLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked

    }//GEN-LAST:event_tablaClienteMouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        frmMenu formMenu = new frmMenu();
        this.setVisible(false);
        formMenu.setVisible(true);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        frmMenu formMenu = new frmMenu();
        this.setVisible(false);
        formMenu.setVisible(true);
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        frmRegistrarCliente formRegistrar = new frmRegistrarCliente();
        this.setVisible(false);
        formRegistrar.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(tablaCliente.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Selecciona un cliente para poder modificarlo.");
        }else{
             frmEditarCliente editarCliente = new frmEditarCliente();
            editarCliente.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    public static javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
