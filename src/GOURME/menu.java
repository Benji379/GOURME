package GOURME;

import clases.descripciones;


public class menu extends javax.swing.JFrame {

    descripciones rellenar = new descripciones();
    double precios[] = {15, 30, 15, 14, 17, 12, 14, 16, 19, 30};
    String nombrePlatos[] = {"CEVICHE", "LOMO SALTADO", "AJÍ DE GALLINA", "CAUSA LIMEÑA", "PACHAMANCA",
        "ARROZ CON POLLO", "TALLARINES A LA HUANCAÍNA", "AGUADITO", "TACU TACU", "POLLO A LA BRASA"};
    String descripciones[] = new String[10];
    public static int cantidades[] = inicio.cantidades;
    int posicionFoto = 1;

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        rellenar.rellenarArray(descripciones);
        txtDescripcion.setText(descripciones[0]);
        txtCantidad.setText(String.valueOf(cantidades[0]));
        txtTotal.setText(String.valueOf(inicio.total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        jlbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jlbMenu = new javax.swing.JLabel();
        imgPlato = new javax.swing.JLabel();
        txtNombrePlato = new javax.swing.JLabel();
        jlbInformacion = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jlbCantidad = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        jlbDescripcion = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gourmet Express [menu]");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 196, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaDerecha.png"))); // NOI18N
        btnDerecha.setBorder(null);
        btnDerecha.setBorderPainted(false);
        btnDerecha.setContentAreaFilled(false);
        btnDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 90, 60));

        btnIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaIzquierda.png"))); // NOI18N
        btnIzquierda.setBorder(null);
        btnIzquierda.setBorderPainted(false);
        btnIzquierda.setContentAreaFilled(false);
        btnIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzquierda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 60));

        jlbTotal.setFont(new java.awt.Font("Perpetua", 0, 40)); // NOI18N
        jlbTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTotal.setText("Total:S/");
        jPanel1.add(jlbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 130, 40));

        txtTotal.setFont(new java.awt.Font("Perpetua", 0, 40)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setText("0.0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 180, 40));

        jlbMenu.setFont(new java.awt.Font("Goudy Old Style", 1, 50)); // NOI18N
        jlbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMenu.setText("MENU");
        jPanel1.add(jlbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 260, 50));

        imgPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        imgPlato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(imgPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 330, 170));

        txtNombrePlato.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        txtNombrePlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombrePlato.setText("Ceviche");
        jPanel1.add(txtNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 430, 50));

        jlbInformacion.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jlbInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInformacion.setText("Informacion");
        jPanel1.add(jlbInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 260, 50));

        jlbPrecio.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jlbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbPrecio.setText("Precio: S/");
        jPanel1.add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 100, 40));

        txtPrecio.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPrecio.setText("15.0");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 50, 40));

        jlbCantidad.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jlbCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCantidad.setText("Cantidad:");
        jPanel1.add(jlbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 90, 40));

        txtDescripcion.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 400, 160));

        jlbDescripcion.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jlbDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDescripcion.setText("Descripción:");
        jPanel1.add(jlbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 130, 40));

        txtCantidad.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 18)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 120, 30));

        btnInicio.setBackground(new java.awt.Color(230, 57, 70));
        btnInicio.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        btnConfirmar.setBackground(new java.awt.Color(255, 51, 51));
        btnConfirmar.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        agregarPedido();
        posicionFoto--;
        if (posicionFoto == 0) {
            this.posicionFoto = 10;
        }
        actualizarInfo(posicionFoto);
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        agregarPedido();
        posicionFoto++;
        if (posicionFoto == 11) {
            this.posicionFoto = 1;
        }
        actualizarInfo(posicionFoto);
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        inicio abrir = new inicio();
        abrir.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        agregarPedido();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void agregarPedido() {
        try {
            if (Integer.parseInt(txtCantidad.getText()) >= 0) {
                cantidades[posicionFoto - 1] = Integer.parseInt(txtCantidad.getText());
            } else {
                txtCantidad.setText("0");
                cantidades[posicionFoto - 1] = 0;
            }
        } catch (NumberFormatException e) {
            cantidades[posicionFoto - 1] = 0;
            txtCantidad.setText("0");
        }
        inicio.total = 0;
        for (int i = 0; i < cantidades.length; i++) {
            inicio.total += cantidades[i] * precios[i];
        }
        txtTotal.setText(String.valueOf(inicio.total));
    }

    private void actualizarInfo(int posicionFoto) {
        txtDescripcion.setText(descripciones[posicionFoto - 1]);
        txtNombrePlato.setText(nombrePlatos[posicionFoto - 1]);
        txtPrecio.setText(String.valueOf(precios[posicionFoto - 1]));
        String foto = "/imagenes/" + posicionFoto + ".png";
        imgPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource(foto)));
        txtCantidad.setText(String.valueOf(cantidades[posicionFoto - 1]));
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JLabel imgPlato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCantidad;
    private javax.swing.JLabel jlbDescripcion;
    private javax.swing.JLabel jlbInformacion;
    private javax.swing.JLabel jlbMenu;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtNombrePlato;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
