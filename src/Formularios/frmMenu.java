package Formularios;

import desplazable.Desface;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JFrame {

    Desface desplace;

    public frmMenu() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/fd.png")).getImage());
        this.setLocationRelativeTo(this);
        this.setTitle("Menu");
        desplace = new Desface();
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
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        panelProcesos = new javax.swing.JPanel();
        BtnFac1 = new javax.swing.JButton();
        btnClientes = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        btnProcesos = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        panelDempleado = new javax.swing.JPanel();
        panelEmpleado = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnRegistrarEMP = new javax.swing.JLabel();
        panelEmpleadoM = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnManteEMP = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnDEmpleado2 = new javax.swing.JLabel();
        panelProcesosPro = new javax.swing.JPanel();
        panelEmpleado4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnMantePRO = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        panelEmpleadoM1 = new javax.swing.JPanel();
        btnComprobante = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnDProcesos2 = new javax.swing.JLabel();
        btnDClientes = new javax.swing.JLabel();
        btnDEmpleado = new javax.swing.JLabel();
        btnDProcesos = new javax.swing.JLabel();
        panelContCli = new javax.swing.JPanel();
        btnDClientes2 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JLabel();

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
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 25, 47));
        jPanel1.setPreferredSize(new java.awt.Dimension(1313, 642));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        close.setBackground(new java.awt.Color(100, 255, 218));
        close.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(100, 255, 218));
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        panelProcesos.setBackground(new java.awt.Color(10, 25, 47));

        BtnFac1.setBackground(new java.awt.Color(25, 40, 62));
        BtnFac1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnFac1.setForeground(new java.awt.Color(255, 255, 255));
        BtnFac1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        BtnFac1.setText("Factura");
        BtnFac1.setBorder(null);
        BtnFac1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnFac1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnFac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFac1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProcesosLayout = new javax.swing.GroupLayout(panelProcesos);
        panelProcesos.setLayout(panelProcesosLayout);
        panelProcesosLayout.setHorizontalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addContainerGap(1312, Short.MAX_VALUE)
                .addComponent(BtnFac1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        panelProcesosLayout.setVerticalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(BtnFac1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClientes.setBackground(new java.awt.Color(25, 40, 62));
        btnClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 218)));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(136, 146, 176));
        jLabel31.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("CLIENTES");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel31)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel31)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnEmpleados.setBackground(new java.awt.Color(25, 40, 62));
        btnEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 218)));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(136, 146, 176));
        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("EMPLEADOS");

        javax.swing.GroupLayout btnEmpleadosLayout = new javax.swing.GroupLayout(btnEmpleados);
        btnEmpleados.setLayout(btnEmpleadosLayout);
        btnEmpleadosLayout.setHorizontalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEmpleadosLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(95, 95, 95))
        );
        btnEmpleadosLayout.setVerticalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpleadosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProcesos.setBackground(new java.awt.Color(25, 40, 62));
        btnProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 218)));

        jLabel32.setBackground(new java.awt.Color(136, 146, 176));
        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("PROCESOS");

        javax.swing.GroupLayout btnProcesosLayout = new javax.swing.GroupLayout(btnProcesos);
        btnProcesos.setLayout(btnProcesosLayout);
        btnProcesosLayout.setHorizontalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel32)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        btnProcesosLayout.setVerticalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDempleado.setBackground(new java.awt.Color(10, 25, 47));

        panelEmpleado.setBackground(new java.awt.Color(25, 40, 62));
        panelEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("REGISTRO ");

        btnRegistrarEMP.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEMP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        btnRegistrarEMP.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cempleado.png"))); // NOI18N
        btnRegistrarEMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEMPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarEMP)
                .addGap(12, 12, 12))
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(btnRegistrarEMP)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(47, 47, 47))))
        );

        panelEmpleadoM.setBackground(new java.awt.Color(25, 40, 62));
        panelEmpleadoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("EDITAR     ");

        btnManteEMP.setBackground(new java.awt.Color(255, 255, 255));
        btnManteEMP.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        btnManteEMP.setForeground(new java.awt.Color(255, 255, 255));
        btnManteEMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N
        btnManteEMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManteEMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManteEMPMouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ELIMINAR");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ACTUALIZAR");

        javax.swing.GroupLayout panelEmpleadoMLayout = new javax.swing.GroupLayout(panelEmpleadoM);
        panelEmpleadoM.setLayout(panelEmpleadoMLayout);
        panelEmpleadoMLayout.setHorizontalGroup(
            panelEmpleadoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoMLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelEmpleadoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManteEMP)
                .addGap(12, 12, 12))
        );
        panelEmpleadoMLayout.setVerticalGroup(
            panelEmpleadoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoMLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelEmpleadoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManteEMP)
                    .addGroup(panelEmpleadoMLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel28)))
                .addGap(15, 15, 15))
        );

        btnDEmpleado2.setBackground(new java.awt.Color(136, 146, 176));
        btnDEmpleado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDEmpleado2.setForeground(new java.awt.Color(204, 204, 204));
        btnDEmpleado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        btnDEmpleado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDEmpleado2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDempleadoLayout = new javax.swing.GroupLayout(panelDempleado);
        panelDempleado.setLayout(panelDempleadoLayout);
        panelDempleadoLayout.setHorizontalGroup(
            panelDempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDempleadoLayout.createSequentialGroup()
                .addComponent(panelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(panelEmpleadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnDEmpleado2)
                .addContainerGap())
        );
        panelDempleadoLayout.setVerticalGroup(
            panelDempleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEmpleadoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDempleadoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnDEmpleado2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProcesosPro.setBackground(new java.awt.Color(10, 25, 47));

        panelEmpleado4.setBackground(new java.awt.Color(25, 40, 62));
        panelEmpleado4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("REGISTRAR");

        btnMantePRO.setBackground(new java.awt.Color(255, 255, 255));
        btnMantePRO.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        btnMantePRO.setForeground(new java.awt.Color(255, 255, 255));
        btnMantePRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cproducto.png"))); // NOI18N
        btnMantePRO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMantePRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantePROMouseClicked(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("PRODUCTO");

        javax.swing.GroupLayout panelEmpleado4Layout = new javax.swing.GroupLayout(panelEmpleado4);
        panelEmpleado4.setLayout(panelEmpleado4Layout);
        panelEmpleado4Layout.setHorizontalGroup(
            panelEmpleado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleado4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panelEmpleado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMantePRO)
                .addGap(12, 12, 12))
        );
        panelEmpleado4Layout.setVerticalGroup(
            panelEmpleado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleado4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnMantePRO)
                .addGap(23, 23, 23))
            .addGroup(panelEmpleado4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEmpleadoM1.setBackground(new java.awt.Color(25, 40, 62));
        panelEmpleadoM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnComprobante.setBackground(new java.awt.Color(255, 255, 255));
        btnComprobante.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        btnComprobante.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        btnComprobante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprobante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprobanteMouseClicked(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("GENERAR");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("COMPROBANTE");

        javax.swing.GroupLayout panelEmpleadoM1Layout = new javax.swing.GroupLayout(panelEmpleadoM1);
        panelEmpleadoM1.setLayout(panelEmpleadoM1Layout);
        panelEmpleadoM1Layout.setHorizontalGroup(
            panelEmpleadoM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoM1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmpleadoM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprobante)
                .addGap(12, 12, 12))
        );
        panelEmpleadoM1Layout.setVerticalGroup(
            panelEmpleadoM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoM1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmpleadoM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoM1Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addGap(35, 35, 35))
                    .addGroup(panelEmpleadoM1Layout.createSequentialGroup()
                        .addComponent(btnComprobante)
                        .addGap(23, 23, 23))))
        );

        btnDProcesos2.setBackground(new java.awt.Color(136, 146, 176));
        btnDProcesos2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDProcesos2.setForeground(new java.awt.Color(204, 204, 204));
        btnDProcesos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        btnDProcesos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDProcesos2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProcesosProLayout = new javax.swing.GroupLayout(panelProcesosPro);
        panelProcesosPro.setLayout(panelProcesosProLayout);
        panelProcesosProLayout.setHorizontalGroup(
            panelProcesosProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosProLayout.createSequentialGroup()
                .addComponent(panelEmpleado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panelEmpleadoM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnDProcesos2)
                .addGap(14, 14, 14))
        );
        panelProcesosProLayout.setVerticalGroup(
            panelProcesosProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEmpleadoM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesosProLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDProcesos2)
                .addGap(39, 39, 39))
        );

        btnDClientes.setBackground(new java.awt.Color(136, 146, 176));
        btnDClientes.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDClientes.setForeground(new java.awt.Color(204, 204, 204));
        btnDClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-x.png"))); // NOI18N
        btnDClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDClientesMouseClicked(evt);
            }
        });

        btnDEmpleado.setBackground(new java.awt.Color(136, 146, 176));
        btnDEmpleado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDEmpleado.setForeground(new java.awt.Color(204, 204, 204));
        btnDEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-x.png"))); // NOI18N
        btnDEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDEmpleadoMouseEntered(evt);
            }
        });

        btnDProcesos.setBackground(new java.awt.Color(136, 146, 176));
        btnDProcesos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDProcesos.setForeground(new java.awt.Color(204, 204, 204));
        btnDProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-x.png"))); // NOI18N
        btnDProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDProcesosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDProcesosMouseEntered(evt);
            }
        });

        panelContCli.setBackground(new java.awt.Color(10, 25, 47));

        btnDClientes2.setBackground(new java.awt.Color(136, 146, 176));
        btnDClientes2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        btnDClientes2.setForeground(new java.awt.Color(204, 204, 204));
        btnDClientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar_15px.png"))); // NOI18N
        btnDClientes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDClientes2MouseClicked(evt);
            }
        });

        panelClientes.setBackground(new java.awt.Color(25, 40, 62));
        panelClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MANTENIMIENTO");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("REGISTRO Y ");

        btnCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnCliente.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnCliente)
                .addGap(30, 30, 30))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnCliente)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout panelContCliLayout = new javax.swing.GroupLayout(panelContCli);
        panelContCli.setLayout(panelContCliLayout);
        panelContCliLayout.setHorizontalGroup(
            panelContCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContCliLayout.createSequentialGroup()
                .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btnDClientes2)
                .addContainerGap())
        );
        panelContCliLayout.setVerticalGroup(
            panelContCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContCliLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnDClientes2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1215, 1215, 1215)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDProcesos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDClientes))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDEmpleado)))
                        .addGap(730, 730, 730)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelContCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(panelProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelProcesosPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnDClientes))
                    .addComponent(panelContCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDempleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnDEmpleado)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelProcesosPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnDProcesos)))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(panelProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int rpta = JOptionPane.showConfirmDialog(this, "Estas seguro/a de cerrar sesion?", "Cerrar sesion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (rpta == JOptionPane.YES_OPTION) {
            frmLogin log = new frmLogin();
            this.setVisible(false);
            log.setVisible(true);
        } else {
            frmMenu m = new frmMenu();
            this.setVisible(false);
            m.setVisible((true));
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea cerrar el sistema?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void BtnFac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFac1ActionPerformed
        frmFacturaa fre = new frmFacturaa();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnFac1ActionPerformed

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
       

    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked

    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnDClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDClientesMouseClicked
        desplace.desplazarIzquierda(panelContCli, panelContCli.getX(), panelContCli.getX()-600, 10, 10);
    }//GEN-LAST:event_btnDClientesMouseClicked

    private void btnDClientes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDClientes2MouseClicked
          desplace.desplazarDerecha(panelContCli, panelContCli.getX(), panelContCli.getX()+600, 10, 10);
    }//GEN-LAST:event_btnDClientes2MouseClicked

    private void btnDEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDEmpleadoMouseClicked
        desplace.desplazarIzquierda(panelDempleado, panelDempleado.getX(), panelDempleado.getX()-600, 10, 10);
    }//GEN-LAST:event_btnDEmpleadoMouseClicked

    private void btnDEmpleado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDEmpleado2MouseClicked
         desplace.desplazarDerecha(panelDempleado, panelDempleado.getX(), panelDempleado.getX()+600, 10, 10);
    }//GEN-LAST:event_btnDEmpleado2MouseClicked

    private void btnDEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDEmpleadoMouseEntered
        
    }//GEN-LAST:event_btnDEmpleadoMouseEntered

    private void btnDProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDProcesosMouseClicked
        desplace.desplazarIzquierda(panelProcesosPro, panelProcesosPro.getX(), panelProcesosPro.getX()-600, 10, 10);
    }//GEN-LAST:event_btnDProcesosMouseClicked

    private void btnDProcesosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDProcesosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDProcesosMouseEntered

    private void btnDProcesos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDProcesos2MouseClicked
        desplace.desplazarDerecha(panelProcesosPro, panelProcesosPro.getX(), panelProcesosPro.getX()+600, 10, 10);
    }//GEN-LAST:event_btnDProcesos2MouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        frmRegistroCliente fre = new frmRegistroCliente();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnRegistrarEMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEMPMouseClicked
        frmRegistroEmpleado fre = new frmRegistroEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEMPMouseClicked

    private void btnManteEMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManteEMPMouseClicked
        frmMantenimientoEmpleado fre = new frmMantenimientoEmpleado();
        this.setVisible(true);
        fre.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_btnManteEMPMouseClicked

    private void btnMantePROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantePROMouseClicked
       frmRegistroProducto fre = new frmRegistroProducto();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_btnMantePROMouseClicked

    private void btnComprobanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprobanteMouseClicked
        frmFacturaa fre = new frmFacturaa();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_btnComprobanteMouseClicked

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
    private javax.swing.JButton BtnFac1;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JLabel btnComprobante;
    private javax.swing.JLabel btnDClientes;
    private javax.swing.JLabel btnDClientes2;
    private javax.swing.JLabel btnDEmpleado;
    private javax.swing.JLabel btnDEmpleado2;
    private javax.swing.JLabel btnDProcesos;
    private javax.swing.JLabel btnDProcesos2;
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JLabel btnManteEMP;
    private javax.swing.JLabel btnMantePRO;
    private javax.swing.JPanel btnProcesos;
    private javax.swing.JLabel btnRegistrarEMP;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelContCli;
    private javax.swing.JPanel panelDempleado;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelEmpleado4;
    private javax.swing.JPanel panelEmpleadoM;
    private javax.swing.JPanel panelEmpleadoM1;
    private javax.swing.JPanel panelProcesos;
    private javax.swing.JPanel panelProcesosPro;
    // End of variables declaration//GEN-END:variables
}
