package Formularios;

import clases.Persona.Empleado;
import controlador.Arreglo_Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmConsultaEmpleado extends javax.swing.JFrame {
    
    Arreglo_Empleado ar = new Arreglo_Empleado();
    private Empleado EM;
    private DefaultTableModel model;
    int con;
    int indice;

    public frmConsultaEmpleado() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        //listado();
        cargarTabla("");        
        this.setTitle("Consultar empleados");
        this.setLocationRelativeTo(this);
    }
    public void cargarTabla(String valor){
        String[]  titulo={"Id  admi", "Nombres", "Apellidos","Telefono", "Direccion", "Fecha Entrada", "Sueldo"};
        String[]  filas= new String[7];
        
        model= new DefaultTableModel(null, titulo);
        
        try{
            //creando la conección a la BD
            Connection conectar= DriverManager.getConnection("jdbc:mysql://localhost/peritec", "root", "");
            //crear la consulta
            Statement declarar= conectar.createStatement();
            
            String xsql= "SELECT * FROM empleado";
            
            //Crear la tabla
            ResultSet ejecutar= declarar.executeQuery(xsql);
            while(ejecutar.next()){
                filas[0]= ejecutar.getString("id_admi");
                filas[1]= ejecutar.getString("nombre");
                filas[2]= ejecutar.getString("apellido");
                filas[3]= ejecutar.getString("telf");
                filas[4]= ejecutar.getString("direccion");                
                filas[5]= ejecutar.getString("fechaEntrada");                
                filas[6]= ejecutar.getString("sueldo");


                
                model.addRow(filas);
            }
            tablaEmpleado.setModel(model);
        
        }catch(Exception e){
                System.out.println("Error.... No hay conección");
                e.printStackTrace();
        }
        
    }
//    public void listado() {
//        DefaultTableModel dt = (DefaultTableModel) tablaEmpleado.getModel();
//        int filas = dt.getRowCount();
//        for(int i=0;i<filas; i++){
//            dt.removeRow(0);
//        }
//
//        for (int i = 0; i < frmRegistroEmpleado.LISTAE.size(); i++) {
//            EM = frmRegistroEmpleado.LISTAE.get(i);
//            dt.addRow(new Object[]{EM.getNombre(),EM.getApellido(),EM.getDni(),EM.getTelf(),EM.getDireccion(),EM.getSueldo(),
//                EM.getFechaIngreso()});
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTAREA = new javax.swing.JTextArea();
        TXTEM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RegistrarEmpleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jButton5.setText("Guardar");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(176, 173, 198));
        jPanel1.setForeground(new java.awt.Color(181, 222, 179));

        btnSalir.setBackground(new java.awt.Color(240, 129, 129));
        btnSalir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tablaEmpleado.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
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

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CONSULTAR EMPLEADOS");

        btnBuscar.setBackground(new java.awt.Color(185, 231, 231));
        btnBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TXTAREA.setBackground(new java.awt.Color(153, 149, 183));
        TXTAREA.setColumns(20);
        TXTAREA.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        TXTAREA.setRows(5);
        TXTAREA.setBorder(null);
        TXTAREA.setSelectionColor(new java.awt.Color(178, 158, 195));
        jScrollPane1.setViewportView(TXTAREA);

        TXTEM.setBackground(new java.awt.Color(153, 149, 183));
        TXTEM.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        TXTEM.setBorder(null);
        TXTEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEMActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingresar DNI:");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR");

        RegistrarEmpleado.setBackground(new java.awt.Color(240, 129, 129));
        RegistrarEmpleado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        RegistrarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        RegistrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        RegistrarEmpleado.setText("Registrar");
        RegistrarEmpleado.setBorder(null);
        RegistrarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEmpleadoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(TXTEM)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TXTEM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminar)
                            .addGap(29, 29, 29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(RegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        indice = Integer.parseInt(TXTEM.getText());
        if (EM.getDni() == indice){
            EM = ar.buscar(indice);
            TXTAREA.setText("Nombre : " + EM.getNombre());
            TXTAREA.setText("\nApellido : " + EM.getApellido());
            TXTAREA.append("\nTelefono : " + EM.getTelf());
            TXTAREA.append("\nDireccion : " + EM.getDireccion());
            TXTAREA.append("\nSueldo : " + EM.getSueldo());
            TXTAREA.append("\nFecha de Ingreso : " + EM.getFechaIngreso());
            }else{
            JOptionPane.showMessageDialog(null, "NO EXISTE EMPLEADO");
            return;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TXTEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEMActionPerformed

    }//GEN-LAST:event_TXTEMActionPerformed

    private void RegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEmpleadoActionPerformed
        this.setVisible(false);
        frmRegistroEmpleado fre = new frmRegistroEmpleado();
        fre.setVisible(true);
    }//GEN-LAST:event_RegistrarEmpleadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(TXTEM.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"EL CAMPO ESTA VACIO");
            TXTEM.setText("");
            TXTEM.requestFocus();
        }else{
            int dni = Integer.parseInt(TXTEM.getText());
            indice = validacion(dni);

            if(indice == -1){
                JOptionPane.showMessageDialog(null,"NO EXISTE EL EMPLEADO");
                TXTEM.setText("");
            }else{
                ar.LISTAE.remove(indice);
                JOptionPane.showMessageDialog(null,"EMPLEADO ELIMINADO");
                TXTEM.setText("");
                TXTEM.requestFocus();
                listar();
        }
      }
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    public int validacion(int dni){
        for(int i = 0; i < ar.LISTAE.size(); i++){
            EM = ar.LISTAE.get(i);
            if(dni == EM.getDni()){
                return i;
            }
        }
        return -1;
    }
    private void listar(){
        model =(DefaultTableModel)tablaEmpleado.getModel();
           int filas = model.getRowCount();
        for(int i=0;i<filas; i++){
            model.removeRow(0);
        }
        for (int i = 0; i < frmRegistroEmpleado.LISTAE.size(); i++) {
            model.addRow(new Object[]{EM.getNombre(),EM.getApellido(),EM.getDni(),EM.getTelf(),EM.getDireccion(),EM.getSueldo(),
                EM.getFechaIngreso()});
        }
    }
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
    private javax.swing.JButton RegistrarEmpleado;
    private javax.swing.JTextArea TXTAREA;
    private javax.swing.JTextField TXTEM;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleado;
    // End of variables declaration//GEN-END:variables

}
