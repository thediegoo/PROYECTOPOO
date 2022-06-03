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
        panelRegistro = new javax.swing.JPanel();
        BtnRegistrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnEmpleado = new javax.swing.JButton();
        BtnProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelConsultas = new javax.swing.JPanel();
        BtnConsultas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnEmC = new javax.swing.JButton();
        BtnProC = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();
        panelMante = new javax.swing.JPanel();
        btnMantenimiento = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnEmMan = new javax.swing.JButton();
        BtnProdMan = new javax.swing.JButton();
        panelProcesos = new javax.swing.JPanel();
        btnProcesos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BtnFac = new javax.swing.JButton();
        close = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelRegistro.setBackground(new java.awt.Color(172, 219, 222));

        BtnRegistrar.setBackground(new java.awt.Color(172, 219, 222));
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRAR");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<");

        javax.swing.GroupLayout BtnRegistrarLayout = new javax.swing.GroupLayout(BtnRegistrar);
        BtnRegistrar.setLayout(BtnRegistrarLayout);
        BtnRegistrarLayout.setHorizontalGroup(
            BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnRegistrarLayout.createSequentialGroup()
                .addGroup(BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnRegistrarLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(BtnRegistrarLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        BtnRegistrarLayout.setVerticalGroup(
            BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnRegistrarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(57, 57, 57))
        );

        BtnEmpleado.setBackground(new java.awt.Color(240, 129, 129));
        BtnEmpleado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        BtnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados.png"))); // NOI18N
        BtnEmpleado.setText("Empleado");
        BtnEmpleado.setBorder(null);
        BtnEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmpleadoActionPerformed(evt);
            }
        });

        BtnProducto.setBackground(new java.awt.Color(240, 129, 129));
        BtnProducto.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnProducto.setForeground(new java.awt.Color(0, 0, 0));
        BtnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addproducto.png"))); // NOI18N
        BtnProducto.setText("Producto");
        BtnProducto.setBorder(null);
        BtnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(BtnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(BtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BtnEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIENVENIDO/A");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelConsultas.setBackground(new java.awt.Color(171, 167, 218));

        BtnConsultas.setBackground(new java.awt.Color(171, 167, 218));
        BtnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConsultasMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONSULTAS");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<");

        javax.swing.GroupLayout BtnConsultasLayout = new javax.swing.GroupLayout(BtnConsultas);
        BtnConsultas.setLayout(BtnConsultasLayout);
        BtnConsultasLayout.setHorizontalGroup(
            BtnConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnConsultasLayout.createSequentialGroup()
                .addGroup(BtnConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnConsultasLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel6))
                    .addGroup(BtnConsultasLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        BtnConsultasLayout.setVerticalGroup(
            BtnConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnConsultasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(57, 57, 57))
        );

        BtnEmC.setBackground(new java.awt.Color(240, 129, 129));
        BtnEmC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnEmC.setForeground(new java.awt.Color(0, 0, 0));
        BtnEmC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N
        BtnEmC.setText("Empleado");
        BtnEmC.setBorder(null);
        BtnEmC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEmC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmCActionPerformed(evt);
            }
        });

        BtnProC.setBackground(new java.awt.Color(240, 129, 129));
        BtnProC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnProC.setForeground(new java.awt.Color(0, 0, 0));
        BtnProC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inform.png"))); // NOI18N
        BtnProC.setText("Producto");
        BtnProC.setBorder(null);
        BtnProC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnProC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnProC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultasLayout = new javax.swing.GroupLayout(panelConsultas);
        panelConsultas.setLayout(panelConsultasLayout);
        panelConsultasLayout.setHorizontalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(BtnEmC, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(BtnProC, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConsultasLayout.setVerticalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnProC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BtnEmC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        panelMante.setBackground(new java.awt.Color(248, 192, 197));

        btnMantenimiento.setBackground(new java.awt.Color(248, 192, 197));
        btnMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientoMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MANTENIMIENTO");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("<");

        javax.swing.GroupLayout btnMantenimientoLayout = new javax.swing.GroupLayout(btnMantenimiento);
        btnMantenimiento.setLayout(btnMantenimientoLayout);
        btnMantenimientoLayout.setHorizontalGroup(
            btnMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMantenimientoLayout.createSequentialGroup()
                .addGroup(btnMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMantenimientoLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel9))
                    .addGroup(btnMantenimientoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        btnMantenimientoLayout.setVerticalGroup(
            btnMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMantenimientoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMantenimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(57, 57, 57))
        );

        BtnEmMan.setBackground(new java.awt.Color(240, 129, 129));
        BtnEmMan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnEmMan.setForeground(new java.awt.Color(0, 0, 0));
        BtnEmMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        BtnEmMan.setText("Empleado");
        BtnEmMan.setBorder(null);
        BtnEmMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEmMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEmMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmManActionPerformed(evt);
            }
        });

        BtnProdMan.setBackground(new java.awt.Color(240, 129, 129));
        BtnProdMan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnProdMan.setForeground(new java.awt.Color(0, 0, 0));
        BtnProdMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        BtnProdMan.setText("Producto");
        BtnProdMan.setBorder(null);
        BtnProdMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnProdMan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnProdMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManteLayout = new javax.swing.GroupLayout(panelMante);
        panelMante.setLayout(panelManteLayout);
        panelManteLayout.setHorizontalGroup(
            panelManteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(BtnEmMan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(BtnProdMan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panelManteLayout.setVerticalGroup(
            panelManteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelManteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelManteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnProdMan, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BtnEmMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelProcesos.setBackground(new java.awt.Color(224, 161, 139));

        btnProcesos.setBackground(new java.awt.Color(224, 161, 139));
        btnProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcesosMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MostrarE.png"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PROCESOS");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<");

        javax.swing.GroupLayout btnProcesosLayout = new javax.swing.GroupLayout(btnProcesos);
        btnProcesos.setLayout(btnProcesosLayout);
        btnProcesosLayout.setHorizontalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addGroup(btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnProcesosLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(btnProcesosLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnProcesosLayout.setVerticalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(12, 12, 12))
        );

        BtnFac.setBackground(new java.awt.Color(240, 129, 129));
        BtnFac.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnFac.setForeground(new java.awt.Color(0, 0, 0));
        BtnFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        BtnFac.setText("Factura");
        BtnFac.setBorder(null);
        BtnFac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnFac.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProcesosLayout = new javax.swing.GroupLayout(panelProcesos);
        panelProcesos.setLayout(panelProcesosLayout);
        panelProcesosLayout.setHorizontalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(BtnFac, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProcesosLayout.setVerticalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProcesosLayout.createSequentialGroup()
                        .addComponent(btnProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesosLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(BtnFac, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        close.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(57, 57, 57));
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnSalir)
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addGap(154, 154, 154)
                .addComponent(close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelMante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelConsultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelProcesos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1656, 1656, 1656))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(btnSalir))
                        .addGap(19, 19, 19)
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelMante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked

        if (panelRegistro.getX() == 0) {
            desplace.desplazarIzquierda(panelRegistro, panelRegistro.getX(), -600, 10, 10);
        } else if (panelRegistro.getX() == -600) {
            desplace.desplazarDerecha(panelRegistro, panelRegistro.getX(), 0, 10, 10);
        }

    }//GEN-LAST:event_BtnRegistrarMouseClicked

    private void BtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductoActionPerformed
        frmRegistroProducto fre = new frmRegistroProducto();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnProductoActionPerformed

    private void BtnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmpleadoActionPerformed
        frmRegistroEmpleado fre = new frmRegistroEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnEmpleadoActionPerformed

    private void BtnConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConsultasMouseClicked
        if (panelConsultas.getX() == 0) {
            desplace.desplazarIzquierda(panelConsultas, panelConsultas.getX(), -600, 10, 10);
        } else if (panelConsultas.getX() == -600) {
            desplace.desplazarDerecha(panelConsultas, panelConsultas.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_BtnConsultasMouseClicked

    private void BtnEmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmCActionPerformed
        frmConsultaEmpleado fre = new frmConsultaEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnEmCActionPerformed

    private void BtnProCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProCActionPerformed
        frmConsultaProductos fre = new frmConsultaProductos();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnProCActionPerformed

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

    private void btnMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoMouseClicked
        if (panelMante.getX() == 0) {
            desplace.desplazarIzquierda(panelMante, panelMante.getX(), -600, 10, 10);
        } else if (panelMante.getX() == -600) {
            desplace.desplazarDerecha(panelMante, panelMante.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_btnMantenimientoMouseClicked

    private void BtnEmManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmManActionPerformed
        frmEditarEmpleado re = new frmEditarEmpleado();
        this.setVisible(true);
        re.setVisible(true);
    }//GEN-LAST:event_BtnEmManActionPerformed

    private void BtnProdManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdManActionPerformed
        frmEditarProducto fre = new frmEditarProducto();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnProdManActionPerformed

    private void btnProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesosMouseClicked
        if (panelProcesos.getX() == 0) {
            desplace.desplazarIzquierda(panelProcesos, panelProcesos.getX(), -600, 10, 10);
        } else if (panelProcesos.getX() == -600) {
            desplace.desplazarDerecha(panelProcesos, panelProcesos.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_btnProcesosMouseClicked

    private void BtnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacActionPerformed
        frmFactura fre = new frmFactura();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnFacActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea cerrar el sistema?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

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
    private javax.swing.JPanel BtnConsultas;
    private javax.swing.JButton BtnEmC;
    private javax.swing.JButton BtnEmMan;
    private javax.swing.JButton BtnEmpleado;
    private javax.swing.JButton BtnFac;
    private javax.swing.JButton BtnProC;
    private javax.swing.JButton BtnProdMan;
    private javax.swing.JButton BtnProducto;
    private javax.swing.JPanel BtnRegistrar;
    private javax.swing.JPanel btnMantenimiento;
    private javax.swing.JPanel btnProcesos;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel panelConsultas;
    private javax.swing.JPanel panelMante;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProcesos;
    private javax.swing.JPanel panelRegistro;
    // End of variables declaration//GEN-END:variables
}
