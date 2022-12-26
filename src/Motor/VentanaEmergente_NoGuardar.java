package Motor;
import javax.swing.*;



class VentanaEmergente_NoGuardado implements Uso_VI {


    VentanaEmergente_NoGuardado() {
        
        
        btn_g.addActionListener(x.new gg("g"));
        btn_ng.addActionListener(x.new gg("ng"));
        btn_c.addActionListener(x.new gg("c"));
        
        initVE();

 
    }
   
    
    
    
//  INSTANCIAS VE ○•○•○•○•○•○•○•○•○○•○•○•○•○•○•○•○•○•○•

    javax.swing.JLabel texto_uno = new javax.swing.JLabel();
    javax.swing.JLabel texto_dos = new javax.swing.JLabel();
    javax.swing.JLabel fondo_ar_blanco = new javax.swing.JLabel();
    javax.swing.JButton btn_g = new javax.swing.JButton();
    javax.swing.JButton btn_ng = new javax.swing.JButton();
    javax.swing.JButton btn_c = new javax.swing.JButton();
    javax.swing.JLabel fondo_ab_blanco = new javax.swing.JLabel();



    void initVE(){
    	x.getJd().setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    	x.getJd().setResizable(false);
    	x.getJd().setBackground(new java.awt.Color(255, 255, 255));


        texto_uno.setBackground(new java.awt.Color(255, 255, 255));
        texto_uno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        texto_uno.setForeground(new java.awt.Color(0, 0, 204));
        texto_uno.setText("¿Desea guardar?");

        texto_dos.setBackground(new java.awt.Color(255, 255, 255));
        texto_dos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        texto_dos.setText("Los cambios en el documento no han sido guardados. ");

        fondo_ar_blanco.setBackground(new java.awt.Color(255, 255, 255));
        fondo_ar_blanco.setBorder(new javax.swing.border.MatteBorder(null));
        fondo_ar_blanco.setOpaque(true);

        btn_g.setBackground(new java.awt.Color(0, 204, 51));
        btn_g.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_g.setForeground(new java.awt.Color(255, 255, 255));
        btn_g.setText("Guardar");

        btn_ng.setBackground(new java.awt.Color(204, 0, 0));
        btn_ng.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ng.setForeground(new java.awt.Color(255, 255, 255));
        btn_ng.setText("No guardar");

        btn_c.setBackground(new java.awt.Color(51, 51, 255));
        btn_c.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setText("Seguir trabajando");

        fondo_ab_blanco.setBackground(new java.awt.Color(255, 255, 255));
        fondo_ab_blanco.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(x.getJd().getContentPane());
        x.getJd().getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(texto_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(texto_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(fondo_ar_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_g)
                .addGap(55, 55, 55)
                .addComponent(btn_ng)
                .addGap(48, 48, 48)
                .addComponent(btn_c))
            .addComponent(fondo_ab_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(texto_dos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(texto_uno))
                    .addComponent(fondo_ar_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo_ab_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_g)
                            .addComponent(btn_ng)
                            .addComponent(btn_c)))))
        );

        x.getJd().pack();
        x.getJd().setLocationRelativeTo(null);
        x.getJd().setVisible(true);
        
    }

}