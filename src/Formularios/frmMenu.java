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
        panelMantenimiento = new javax.swing.JPanel();
        BtnMantenimiento1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnRegistroEmpleado = new javax.swing.JButton();
        BtnCliente = new javax.swing.JButton();
        BtnEmpleado1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        panelMantenimiento1 = new javax.swing.JPanel();
        btnMantenimiento2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BtnProducto = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        panelProcesos = new javax.swing.JPanel();
        btnProcesos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BtnFac1 = new javax.swing.JButton();

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

        panelMantenimiento.setBackground(new java.awt.Color(75, 85, 163));

        BtnMantenimiento1.setBackground(new java.awt.Color(75, 85, 163));
        BtnMantenimiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMantenimiento1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANTENIMIENTO PERSONAS");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<");

        javax.swing.GroupLayout BtnMantenimiento1Layout = new javax.swing.GroupLayout(BtnMantenimiento1);
        BtnMantenimiento1.setLayout(BtnMantenimiento1Layout);
        BtnMantenimiento1Layout.setHorizontalGroup(
            BtnMantenimiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMantenimiento1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30))
            .addGroup(BtnMantenimiento1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel4)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        BtnMantenimiento1Layout.setVerticalGroup(
            BtnMantenimiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnMantenimiento1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(BtnMantenimiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(57, 57, 57))
        );

        BtnRegistroEmpleado.setBackground(new java.awt.Color(75, 85, 163));
        BtnRegistroEmpleado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnRegistroEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegistroEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados.png"))); // NOI18N
        BtnRegistroEmpleado.setText("Empleado");
        BtnRegistroEmpleado.setBorder(null);
        BtnRegistroEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegistroEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroEmpleadoActionPerformed(evt);
            }
        });

        BtnCliente.setBackground(new java.awt.Color(75, 85, 163));
        BtnCliente.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnCliente.setForeground(new java.awt.Color(0, 0, 0));
        BtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cempleado.png"))); // NOI18N
        BtnCliente.setText("Cliente");
        BtnCliente.setBorder(null);
        BtnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClienteActionPerformed(evt);
            }
        });

        BtnEmpleado1.setBackground(new java.awt.Color(75, 85, 163));
        BtnEmpleado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnEmpleado1.setForeground(new java.awt.Color(0, 0, 0));
        BtnEmpleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleados.png"))); // NOI18N
        BtnEmpleado1.setText("Mantenimiento empleado");
        BtnEmpleado1.setBorder(null);
        BtnEmpleado1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEmpleado1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEmpleado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnMantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BtnRegistroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEmpleado1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(BtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnMantenimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnRegistroEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BtnEmpleado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(BtnCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 24, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        panelMantenimiento1.setBackground(new java.awt.Color(75, 85, 163));

        btnMantenimiento2.setBackground(new java.awt.Color(75, 85, 163));
        btnMantenimiento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimiento2MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cproducto.png"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MANTENIMIENTO PRODUCTOS");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<");

        javax.swing.GroupLayout btnMantenimiento2Layout = new javax.swing.GroupLayout(btnMantenimiento2);
        btnMantenimiento2.setLayout(btnMantenimiento2Layout);
        btnMantenimiento2Layout.setHorizontalGroup(
            btnMantenimiento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMantenimiento2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(34, 34, 34))
            .addGroup(btnMantenimiento2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel13)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        btnMantenimiento2Layout.setVerticalGroup(
            btnMantenimiento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMantenimiento2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(btnMantenimiento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(57, 57, 57))
        );

        BtnProducto.setBackground(new java.awt.Color(75, 85, 163));
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

        javax.swing.GroupLayout panelMantenimiento1Layout = new javax.swing.GroupLayout(panelMantenimiento1);
        panelMantenimiento1.setLayout(panelMantenimiento1Layout);
        panelMantenimiento1Layout.setHorizontalGroup(
            panelMantenimiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimiento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMantenimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(BtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMantenimiento1Layout.setVerticalGroup(
            panelMantenimiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimiento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMantenimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelMantenimiento1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(BtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        close.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        close.setForeground(new java.awt.Color(57, 57, 57));
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        panelProcesos.setBackground(new java.awt.Color(75, 85, 163));

        btnProcesos.setBackground(new java.awt.Color(75, 85, 163));
        btnProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcesosMouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MostrarE.png"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PROCESOS");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("<");

        javax.swing.GroupLayout btnProcesosLayout = new javax.swing.GroupLayout(btnProcesos);
        btnProcesos.setLayout(btnProcesosLayout);
        btnProcesosLayout.setHorizontalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(34, 34, 34))
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProcesosLayout.setVerticalGroup(
            btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProcesosLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(btnProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(63, 63, 63))
        );

        BtnFac1.setBackground(new java.awt.Color(75, 85, 163));
        BtnFac1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        BtnFac1.setForeground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap()
                .addComponent(btnProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(BtnFac1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProcesosLayout.setVerticalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnFac1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelMantenimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnSalir)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel2)
                                .addGap(138, 138, 138)
                                .addComponent(close))
                            .addComponent(panelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(panelProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelMantenimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMantenimiento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMantenimiento1MouseClicked

        if (panelMantenimiento.getX() == 0) {
            desplace.desplazarIzquierda(panelMantenimiento, panelMantenimiento.getX(), -600, 10, 10);
        } else if (panelMantenimiento.getX() == -600) {
            desplace.desplazarDerecha(panelMantenimiento, panelMantenimiento.getX(), 0, 10, 10);
        }

    }//GEN-LAST:event_BtnMantenimiento1MouseClicked

    private void BtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductoActionPerformed
        frmRegistroProducto fre = new frmRegistroProducto();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnProductoActionPerformed

    private void BtnRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroEmpleadoActionPerformed
        frmRegistroEmpleado fre = new frmRegistroEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnRegistroEmpleadoActionPerformed

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

    private void btnMantenimiento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimiento2MouseClicked
        if (panelMantenimiento1.getX() == 0) {
            desplace.desplazarIzquierda(panelMantenimiento1, panelMantenimiento1.getX(), -600, 10, 10);
        } else if (panelMantenimiento1.getX() == -600) {
            desplace.desplazarDerecha(panelMantenimiento1, panelMantenimiento1.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_btnMantenimiento2MouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea cerrar el sistema?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void BtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClienteActionPerformed
        frmRegistroCliente fre = new frmRegistroCliente();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnClienteActionPerformed

    private void btnProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesosMouseClicked
       
        if (panelProcesos.getX() == 0) {
            desplace.desplazarIzquierda(panelProcesos, panelProcesos.getX(), -600, 10, 10);
        } else if (panelProcesos.getX() == -600) {
            desplace.desplazarDerecha(panelProcesos, panelProcesos.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_btnProcesosMouseClicked

    private void BtnFac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFac1ActionPerformed
        frmFacturaa fre = new frmFacturaa();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnFac1ActionPerformed

    private void BtnEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmpleado1ActionPerformed
        frmMantenimientoEmpleado fre = new frmMantenimientoEmpleado();
        this.setVisible(true);
        fre.setVisible(true);
    }//GEN-LAST:event_BtnEmpleado1ActionPerformed

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
    private javax.swing.JButton BtnCliente;
    private javax.swing.JButton BtnEmpleado1;
    private javax.swing.JButton BtnFac1;
    private javax.swing.JPanel BtnMantenimiento1;
    private javax.swing.JButton BtnProducto;
    private javax.swing.JButton BtnRegistroEmpleado;
    private javax.swing.JPanel btnMantenimiento2;
    private javax.swing.JPanel btnProcesos;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel panelMantenimiento;
    private javax.swing.JPanel panelMantenimiento1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProcesos;
    // End of variables declaration//GEN-END:variables
}
