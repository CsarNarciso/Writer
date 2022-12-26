package Motor;



class VentanaPrincipal implements Uso_VI {


    
    VentanaPrincipal(){
        initVP();

        
        abrir.addActionListener(x.new Accion("Abrir", ""));
        guardar.addActionListener(x.new Accion("Guardar", "g"));
        guardarComo.addActionListener(x.new Accion("Guardar", "gc"));
        
        saltoLineaMenu.addActionListener(x.new AccionScroll());
        copiar.addActionListener(x.new AccionCopPegCor("Cop"));
        pegar.addActionListener(x.new AccionCopPegCor("Peg"));
        cortar.addActionListener(x.new AccionCopPegCor("Cor"));

        btnAbrir.addActionListener(x.new Accion("Abrir", ""));
        btnNueva.addActionListener(x.new Accion("Nueva", ""));
        btnBorrar.addActionListener(x.new Accion("Borrar", ""));
        
        btnSalir.addActionListener(x.new Accion("Salir", ""));
//        
        
        x.getF().setLocationRelativeTo(null);
        
        
        
        
    }

    
//  INSTANCIAS VP ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    
    private javax.swing.JPanel PPrincipal = new javax.swing.JPanel();
    private javax.swing.JPanel barraBotones_Der = new javax.swing.JPanel();
    private javax.swing.JButton btnBorrar = new javax.swing.JButton();
    private javax.swing.JButton btnNueva = new javax.swing.JButton();
    private javax.swing.JButton btnAbrir = new javax.swing.JButton();
    private javax.swing.JButton btnSalir = new javax.swing.JButton();
    private javax.swing.JPanel barraEtiquetas_Ab = new javax.swing.JPanel();
    private javax.swing.JMenuBar barraMenu = new javax.swing.JMenuBar();
    private javax.swing.JMenu archivo = new javax.swing.JMenu();
    private javax.swing.JMenuItem nuevaNota = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem abrir = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem guardar = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem guardarComo = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem borrar = new javax.swing.JMenuItem();
    private javax.swing.JMenu herramientas = new javax.swing.JMenu();
    private javax.swing.JCheckBoxMenuItem saltoLineaMenu = new javax.swing.JCheckBoxMenuItem();
    private javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
    private javax.swing.JMenuItem copiar = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem pegar = new javax.swing.JMenuItem();
    private javax.swing.JMenuItem cortar = new javax.swing.JMenuItem();
   
  
    
    
    
    
    



    
    
    void initVP(){
    	x.getF().setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    	x.getF().setBackground(new java.awt.Color(204, 0, 51));
    	x.getF().setUndecorated(true);

        PPrincipal.setBackground(new java.awt.Color(216, 216, 216));

        barraBotones_Der.setBackground(new java.awt.Color(216, 216, 216));
        barraBotones_Der.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnBorrar.setBackground(new java.awt.Color(0, 102, 204));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("Eliminar el documento del dispositivo");

        btnNueva.setBackground(new java.awt.Color(0, 102, 204));
        btnNueva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnNueva.setText("Nueva nota");
        btnNueva.setToolTipText("Nueva hoja de trabajo");
        btnNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAbrir.setBackground(new java.awt.Color(0, 102, 204));
        btnAbrir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setToolTipText("Cargar un documento del dispositivo");

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\Programacion\\JAVA\\Proyectos\\BlocDeNotas\\src\\Graficos\\IconoSalir.jpg"));
        btnSalir.setToolTipText("Salir de I am a writer.");
        btnSalir.setBorder(null);

        javax.swing.GroupLayout barraBotones_DerLayout = new javax.swing.GroupLayout(barraBotones_Der);
        barraBotones_Der.setLayout(barraBotones_DerLayout);
        barraBotones_DerLayout.setHorizontalGroup(
            barraBotones_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraBotones_DerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(barraBotones_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueva)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        barraBotones_DerLayout.setVerticalGroup(
            barraBotones_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraBotones_DerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnSalir)
                .addGap(115, 115, 115)
                .addComponent(btnNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        x.getScroll().setViewportView(x.getTexto());

        x.getTexto().setColumns(20);
        x.getTexto().setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        x.getTexto().setLineWrap(true);
        x.getTexto().setRows(5);
        x.getScroll().setViewportView(x.getTexto());

        barraEtiquetas_Ab.setBackground(new java.awt.Color(0, 102, 204));

        x.getEtiPalabras().setForeground(new java.awt.Color(255, 255, 255));
        x.getEtiPalabras().setText("Palabras: ");

        x.getEtiSalto().setForeground(new java.awt.Color(255, 255, 255));
        x.getEtiSalto().setText("Salto de linea: activado");

        javax.swing.GroupLayout barraEtiquetas_AbLayout = new javax.swing.GroupLayout(barraEtiquetas_Ab);
        barraEtiquetas_Ab.setLayout(barraEtiquetas_AbLayout);
        barraEtiquetas_AbLayout.setHorizontalGroup(
            barraEtiquetas_AbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEtiquetas_AbLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(x.getEtiSalto())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(x.getEtiPalabras())
                .addGap(112, 112, 112))
        );
        barraEtiquetas_AbLayout.setVerticalGroup(
            barraEtiquetas_AbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEtiquetas_AbLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(barraEtiquetas_AbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x.getEtiPalabras())
                    .addComponent(x.getEtiSalto()))
                .addContainerGap())
        );

        javax.swing.GroupLayout PPrincipalLayout = new javax.swing.GroupLayout(PPrincipal);
        PPrincipal.setLayout(PPrincipalLayout);
        PPrincipalLayout.setHorizontalGroup(
            PPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPrincipalLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(x.getScroll(), javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(barraBotones_Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(barraEtiquetas_Ab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PPrincipalLayout.setVerticalGroup(
            PPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPrincipalLayout.createSequentialGroup()
                .addGroup(PPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(x.getScroll(), javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barraBotones_Der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(barraEtiquetas_Ab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraMenu.setBackground(new java.awt.Color(0, 102, 204));
        barraMenu.setBorder(null);
        barraMenu.setOpaque(true);

        archivo.setBackground(new java.awt.Color(0, 102, 204));
        archivo.setForeground(new java.awt.Color(255, 255, 255));
        archivo.setText("Archivo");

        nuevaNota.setText("Nueva nota");
        nuevaNota.setToolTipText("Nueva hoja de trabajo");
        archivo.add(nuevaNota);

        abrir.setText("Abrir");
        abrir.setToolTipText("Cargar un documento del dispositivo");
        archivo.add(abrir);

        guardar.setText("Guardar");
        guardar.setToolTipText("");
        archivo.add(guardar);

        guardarComo.setText("Guardar como");
        archivo.add(guardarComo);

        borrar.setText("Borrar ");
        borrar.setToolTipText("Eliminar el documento del dispositivo");
        archivo.add(borrar);

        barraMenu.add(archivo);

        herramientas.setBackground(new java.awt.Color(0, 102, 204));
        herramientas.setForeground(new java.awt.Color(255, 255, 255));
        herramientas.setText("Herramientas");

        saltoLineaMenu.setSelected(true);
        saltoLineaMenu.setText("Salto de linea");
        saltoLineaMenu.setToolTipText("Activado, tendra un salto de renglon automatico cuando se llegué al limite de la hoja");
        herramientas.add(saltoLineaMenu);
        herramientas.add(jSeparator1);

        copiar.setText("Copiar");
        herramientas.add(copiar);

        pegar.setText("Pegar");
        herramientas.add(pegar);

        cortar.setText("Cortar");
        herramientas.add(cortar);

        barraMenu.add(herramientas);

        x.getF().setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(x.getF().getContentPane());
        x.getF().getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        x.getF().pack();
    }
    
}