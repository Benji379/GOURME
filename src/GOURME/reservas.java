package GOURME;

import java.awt.BorderLayout;

public class reservas extends javax.swing.JFrame {

    public reservas() {
        initComponents();
        setLocationRelativeTo(null);
        btnHacerReserva.setVisible(false);
        hacerReserva mostrar = new hacerReserva();
        mostrar.setSize(1000, 520);
        mostrar.setLocation(0, 0);
        mostrador.removeAll();
        mostrador.add(mostrar, BorderLayout.CENTER);
        mostrador.revalidate();
        mostrador.repaint();
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbRESERVAS = new javax.swing.JLabel();
        btnListaReservas = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        mostrador = new javax.swing.JPanel();
        btnHacerReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gourmet Express [reservas]");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(188, 57, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbRESERVAS.setFont(new java.awt.Font("Goudy Old Style", 1, 50)); // NOI18N
        jlbRESERVAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbRESERVAS.setText("RESERVAS");
        jPanel1.add(jlbRESERVAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 410, 50));

        btnListaReservas.setBackground(new java.awt.Color(230, 57, 70));
        btnListaReservas.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnListaReservas.setText("Lista de reservas");
        btnListaReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaReservas.setFocusPainted(false);
        btnListaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaReservasActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 210, 40));

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

        mostrador.setBackground(new java.awt.Color(188, 57, 66));
        mostrador.setLayout(new java.awt.CardLayout());
        jPanel1.add(mostrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 520));

        btnHacerReserva.setBackground(new java.awt.Color(230, 57, 70));
        btnHacerReserva.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnHacerReserva.setText("Hacer Reserva");
        btnHacerReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHacerReserva.setFocusPainted(false);
        btnHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnHacerReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        inicio abrir = new inicio();
        abrir.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnListaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaReservasActionPerformed
        btnHacerReserva.setVisible(true);
        btnListaReservas.setVisible(false);
        listaReservas mostrar = new listaReservas();
        mostrar.setSize(1000, 520);
        mostrar.setLocation(0, 0);
        mostrador.removeAll();
        mostrador.add(mostrar, BorderLayout.CENTER);
        mostrador.revalidate();
        mostrador.repaint();
    }//GEN-LAST:event_btnListaReservasActionPerformed

    private void btnHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerReservaActionPerformed
        btnHacerReserva.setVisible(false);
        btnListaReservas.setVisible(true);
        hacerReserva mostrar = new hacerReserva();
        mostrar.setSize(1000, 520);
        mostrar.setLocation(0, 0);
        mostrador.removeAll();
        mostrador.add(mostrar, BorderLayout.CENTER);
        mostrador.revalidate();
        mostrador.repaint();
    }//GEN-LAST:event_btnHacerReservaActionPerformed

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
            java.util.logging.Logger.getLogger(reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new reservas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerReserva;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListaReservas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbRESERVAS;
    private javax.swing.JPanel mostrador;
    // End of variables declaration//GEN-END:variables
}
