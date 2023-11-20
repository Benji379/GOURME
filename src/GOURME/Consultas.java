package GOURME;

import clases.metodos;

public class Consultas extends javax.swing.JFrame {

    double reservas = 0;
    double menus = 0;

    public Consultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        reservas = metodos.sumarColumna("listaReservas.txt", 8);
        menus = metodos.sumarColumna("pagos.txt", 1);
        txtReservas.setText("Reservas: S/." + reservas);
        txtMenus.setText("Menús: S/." + menus);
        txtTotal.setText(String.valueOf(reservas + menus));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        jlbVenta1 = new javax.swing.JLabel();
        txtReservas = new javax.swing.JLabel();
        txtMenus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("TOTAL: S/. 0.0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 40));

        jlbVenta1.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jlbVenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbVenta1.setText("Recaudado");
        jPanel1.add(jlbVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 50));

        txtReservas.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtReservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtReservas.setText("Reservas: S/.0.0");
        jPanel1.add(txtReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 40));

        txtMenus.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtMenus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMenus.setText("Menús: S/.0.0");
        jPanel1.add(txtMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Consultas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbVenta1;
    private javax.swing.JLabel txtMenus;
    private javax.swing.JLabel txtReservas;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
