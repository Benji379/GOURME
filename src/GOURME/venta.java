package GOURME;

import clases.metodos;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class venta extends javax.swing.JFrame {

    int cantidades[] = inicio.cantidades;
    double vuelto = 0;

    public venta() {
        initComponents();
        setLocationRelativeTo(null);
        txtTotal.setText(String.valueOf(inicio.total));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbVenta = new javax.swing.JLabel();
        jlbVuelto = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbEfectivo = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jlbTotal = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        Pagado = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnInicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gourmet Express [Venta]");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbVenta.setFont(new java.awt.Font("Goudy Old Style", 1, 50)); // NOI18N
        jlbVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbVenta.setText("VENTA");
        jPanel1.add(jlbVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 220, 50));

        jlbVuelto.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jlbVuelto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbVuelto.setText("Vuelto: S/.");
        jPanel1.add(jlbVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 130, 40));

        jlbNombre.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jlbNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNombre.setText("Nombre:");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 40));

        jlbEfectivo.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jlbEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbEfectivo.setText("Efectivo: S/.");
        jPanel1.add(jlbEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 40));

        txtEfectivo.setFont(new java.awt.Font("Serif", 0, 17)); // NOI18N
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });
        jPanel1.add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 30));

        txtNombre.setFont(new java.awt.Font("Serif", 0, 17)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 30));

        jlbTotal.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jlbTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTotal.setText("Total: S/.");
        jPanel1.add(jlbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, 40));

        txtVuelto.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        txtVuelto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtVuelto.setText("0.0");
        jPanel1.add(txtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 100, 40));

        txtTotal.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setText("0.0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, 40));

        Pagado.setBackground(new java.awt.Color(230, 57, 70));
        Pagado.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        Pagado.setText("Pagado");
        Pagado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pagado.setFocusPainted(false);
        Pagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagadoActionPerformed(evt);
            }
        });
        jPanel1.add(Pagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 150, 40));

        btnNuevaVenta.setBackground(new java.awt.Color(230, 57, 70));
        btnNuevaVenta.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaVenta.setFocusPainted(false);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        btnInicio.setBackground(new java.awt.Color(230, 57, 70));
        btnInicio.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 40));

        btnInicio1.setBackground(new java.awt.Color(51, 255, 51));
        btnInicio1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 16)); // NOI18N
        btnInicio1.setText("Consultas");
        btnInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio1.setFocusPainted(false);
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setNuevaVenta() {
        for (int i = 0; i < cantidades.length; i++) {
            cantidades[i] = 0;
        }
        inicio.total = 0;
        vuelto = 0;
        txtNombre.setText("");
        txtTotal.setText(String.valueOf(inicio.total));
        txtVuelto.setText(String.valueOf(vuelto));
        txtEfectivo.setText("");
    }

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        setNuevaVenta();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        inicio p = new inicio();
        p.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void PagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagadoActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        try {
            double total = Double.parseDouble(txtTotal.getText());
            double efectivo = Double.parseDouble(txtEfectivo.getText());
            if (txtNombre.getText().equals("") || txtEfectivo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan campos a rellenar");
            } else {
                if (total == 0) {
                    JOptionPane.showMessageDialog(null, "No han seleccionado platos");
                } else {
                    if (efectivo < total) {
                        JOptionPane.showMessageDialog(null, "Efectivo incompleto");
                    } else {
                        int result = JOptionPane.showConfirmDialog(null, "Confirmar el pago?", "Confirmar", dialog);
                        if (result == 0) {
                            Object datos[] = {txtTotal.getText()};
                            metodos.agregarDatos(datos, "pagos.txt");
                            setNuevaVenta();
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos inválidos");
        }
    }//GEN-LAST:event_PagadoActionPerformed

    private void setVuelto() {
        try {
            double total = Double.parseDouble(txtTotal.getText());
            double efectivo = Double.parseDouble(txtEfectivo.getText());
            vuelto = efectivo - total;

            if (vuelto < 0) {
                JOptionPane.showMessageDialog(null, "Efectivo incompleto");
            } else {
                if (total == 0) {
                    JOptionPane.showMessageDialog(null, "No han seleccionado platos");
                } else {
                    txtVuelto.setText(String.valueOf(vuelto));
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Pago Invalido");
        }
    }

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setVuelto();
        }
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        Consultas abrir = new Consultas();
        abrir.setVisible(true);
        hide();
    }//GEN-LAST:event_btnInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new venta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pagado;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbEfectivo;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JLabel jlbVenta;
    private javax.swing.JLabel jlbVuelto;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtVuelto;
    // End of variables declaration//GEN-END:variables
}
