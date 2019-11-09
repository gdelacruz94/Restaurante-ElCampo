package restaurantelcampo;

import rojeru_san.RSPanelsSlider;

/**
 *
 * @author GABRIELA
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCocina = new rsmaterialcomponents.RSButtonMaterialIconUno();
        btnMesa = new rsmaterialcomponents.RSButtonMaterialIconUno();
        btnCaja = new rsmaterialcomponents.RSButtonMaterialIconUno();
        btnSalir = new rsmaterialcomponents.RSButtonMaterialIconUno();
        jSeparator1 = new javax.swing.JSeparator();
        btnCarta = new rsmaterialcomponents.RSButtonMaterialIconUno();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        priCocina1 = new restaurantelcampo.priCocina();
        priMesas1 = new restaurantelcampo.priMesas();
        priCaja1 = new restaurantelcampo.priCaja();
        priCarta1 = new restaurantelcampo.priCarta();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(140, 29, 4));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(242, 116, 5));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura.PNG"))); // NOI18N

        btnCocina.setBackground(new java.awt.Color(242, 116, 5));
        btnCocina.setText("COCINA");
        btnCocina.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KITCHEN);
        btnCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocinaActionPerformed(evt);
            }
        });

        btnMesa.setBackground(new java.awt.Color(242, 116, 5));
        btnMesa.setText("Mesas");
        btnMesa.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VIEW_MODULE);
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnCaja.setBackground(new java.awt.Color(242, 116, 5));
        btnCaja.setText("Caja");
        btnCaja.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PAYMENT);
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(242, 116, 5));
        btnSalir.setText("SALIR");
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS_POWER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCarta.setBackground(new java.awt.Color(242, 116, 5));
        btnCarta.setText("Carta");
        btnCarta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIST);
        btnCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
            .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.add(priCocina1, "card2");
        pnlSlider.add(priMesas1, "card3");
        pnlSlider.add(priCaja1, "card4");
        pnlSlider.add(priCarta1, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        if (!btnMesa.isSelected()){
            btnCocina.setSelected(false);
            btnMesa.setSelected(true);
            btnCaja.setSelected(false);
            btnCarta.setSelected(false);
            
            pnlSlider.setPanelSlider(1, priMesas1, RSPanelsSlider.DIRECT.RIGHT);
    }
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        if (!btnCarta.isSelected()){
            btnCocina.setSelected(false);
            btnMesa.setSelected(false);
            btnCaja.setSelected(false);
            btnCarta.setSelected(true);
            
            pnlSlider.setPanelSlider(1, priCarta1, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnCartaActionPerformed
    }
    private void btnCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocinaActionPerformed
        if (!btnCocina.isSelected()){
            btnCocina.setSelected(true);
            btnMesa.setSelected(false);
            btnCaja.setSelected(false);
            btnCarta.setSelected(false);
            
            pnlSlider.setPanelSlider(1, priCocina1, RSPanelsSlider.DIRECT.RIGHT);
    } 
    }//GEN-LAST:event_btnCocinaActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        if (!btnCaja.isSelected()){
            btnCocina.setSelected(false);
            btnMesa.setSelected(false);
            btnCaja.setSelected(true);
            btnCarta.setSelected(false);
            
            pnlSlider.setPanelSlider(1, priCaja1, RSPanelsSlider.DIRECT.RIGHT);
    } 
    }//GEN-LAST:event_btnCajaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsmaterialcomponents.RSButtonMaterialIconUno btnCaja;
    private rsmaterialcomponents.RSButtonMaterialIconUno btnCarta;
    private rsmaterialcomponents.RSButtonMaterialIconUno btnCocina;
    private rsmaterialcomponents.RSButtonMaterialIconUno btnMesa;
    private rsmaterialcomponents.RSButtonMaterialIconUno btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private restaurantelcampo.priCaja priCaja1;
    private restaurantelcampo.priCarta priCarta1;
    private restaurantelcampo.priCocina priCocina1;
    private restaurantelcampo.priMesas priMesas1;
    // End of variables declaration//GEN-END:variables
}
