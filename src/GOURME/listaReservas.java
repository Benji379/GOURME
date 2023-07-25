package GOURME;

import clases.metodos;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listaReservas extends javax.swing.JPanel {

    public listaReservas() {
        initComponents();
        metodos.mostrarDatosEnTabla(JTListaReservas, "listaReservas.txt");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTListaReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMontoCancelado = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(188, 57, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTListaReservas.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        JTListaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Dni", "Nombre", "Apellido", "Tipo", "Precio", "Cancelado", "MontoCancelado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTListaReservas.setGridColor(new java.awt.Color(0, 0, 0));
        JTListaReservas.setSelectionBackground(new java.awt.Color(255, 255, 102));
        JTListaReservas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        JTListaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTListaReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTListaReservas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 97, 920, 410));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Monto Cancelado: S/.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtMontoCancelado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtMontoCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 160, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 110, 40));

        btnGuardar.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 110, 40));
    }// </editor-fold>//GEN-END:initComponents
    int fila = -1;
    String precio;
    String pagado;
    private void JTListaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTListaReservasMouseClicked
        fila = JTListaReservas.getSelectedRow();
        pagado = (String) JTListaReservas.getValueAt(fila, 7);
        precio = (String) JTListaReservas.getValueAt(fila, 5);
        txtMontoCancelado.setText(pagado);
//        System.out.println("Fila: " + fila);
    }//GEN-LAST:event_JTListaReservasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (fila >= 0) {
            try {
                try {
//            System.out.println("Fila: " + fila);
                    if (!txtMontoCancelado.getText().equalsIgnoreCase("")) {
                        int dialog = JOptionPane.YES_NO_OPTION;
                        int result = JOptionPane.showConfirmDialog(null, "Guardar?", "Confirmar", dialog);
                        if (result == 0) {
                            JTListaReservas.setValueAt(txtMontoCancelado.getText(), fila, 7);
                            pagado = (String) JTListaReservas.getValueAt(fila, 7);
                            double PAGADO = Double.parseDouble(pagado);
                            double PRECIO = Double.parseDouble(precio);
                            if (PAGADO == PRECIO) {
                                JTListaReservas.setValueAt("si", fila, 6);
                            } else {
                                JTListaReservas.setValueAt("no", fila, 6);
                            }
                            metodos.guardarDatosTabla(JTListaReservas, "listaReservas.txt");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JTListaReservas.setValueAt("0.0", fila, 7);
                    JOptionPane.showMessageDialog(null, "Dato inválidos");
                }
            } catch (HeadlessException e) {
                System.out.println("ERRRO: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "No hay fila seleccionada");
            } else {
                DefaultTableModel model = (DefaultTableModel) JTListaReservas.getModel();
                model.removeRow(fila);
                fila = 0;
            }
        } catch (HeadlessException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTListaReservas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMontoCancelado;
    // End of variables declaration//GEN-END:variables
}
