package GOURME;

import clases.metodos;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class hacerReserva extends javax.swing.JPanel {

    public hacerReserva() {
        initComponents();
        getPrecioReservacion(jcbTipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCliente = new javax.swing.JPanel();
        jlbMesa = new javax.swing.JLabel();
        txtMesa = new javax.swing.JTextField();
        jlbDatosCliente = new javax.swing.JLabel();
        jlbDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jlbApellido = new javax.swing.JLabel();
        jlbTipoReservacion = new javax.swing.JLabel();
        txtPagado = new javax.swing.JTextField();
        jlbPagado = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        jlbCancelado = new javax.swing.JLabel();
        jlbFacturacion = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        CheckBoxCancelado = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(188, 57, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCliente.setBackground(new java.awt.Color(230, 57, 70));
        jpCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMesa.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbMesa.setText("N° de mesa");
        jpCliente.add(jlbMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpCliente.add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 30));

        jlbDatosCliente.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbDatosCliente.setText("Datos cliente");
        jpCliente.add(jlbDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jlbDni.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbDni.setText("DNI:");
        jpCliente.add(jlbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpCliente.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));

        jlbNombre.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbNombre.setText("Nombre:");
        jpCliente.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpCliente.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 160, 30));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpCliente.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, 30));

        jlbApellido.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbApellido.setText("Apellido:");
        jpCliente.add(jlbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        add(jpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 440));

        jlbTipoReservacion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbTipoReservacion.setText("Tipo de reservación");
        add(jlbTipoReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, 50));

        txtPagado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 160, 30));

        jlbPagado.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbPagado.setText("Cancelado: S/.");
        add(jlbPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 170, 50));

        txtPrecio.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 160, 50));

        jlbPrecio.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbPrecio.setText("Precio: S/.");
        add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 120, 50));

        jlbCancelado.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbCancelado.setText("Cancelado");
        add(jlbCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, 50));

        jlbFacturacion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jlbFacturacion.setText("Facturacion");
        add(jlbFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, 50));

        jcbTipo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Pareja", "Familiar" }));
        jcbTipo.setToolTipText("");
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });
        add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 140, 40));

        CheckBoxCancelado.setBackground(new java.awt.Color(255, 0, 0));
        CheckBoxCancelado.setEnabled(false);
        add(CheckBoxCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(241, 196, 15));
        btnIngresar.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 200, 50));
    }// </editor-fold>//GEN-END:initComponents

    private double getPrecioReservacion(JComboBox combo) {
        String tipoReservacion = (String) jcbTipo.getSelectedItem();
        double precio = 0;
        switch (tipoReservacion) {
            case "Individual":
                precio = 30;
                break;
            case "Pareja":
                precio = 50;
                break;
            case "Familiar":
                precio = 60;
                break;
        }
        txtPrecio.setText(String.valueOf(precio));
        return precio;
    }

    private String getCancelado(JCheckBox check) {
        String cancelado;
        double pagado = Double.parseDouble(txtPagado.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        if (pagado == precio) {
            check.setSelected(true);
        } else {
            if (pagado > precio) {
                txtPagado.setText("0");
            } else {
                check.setSelected(false);
            }
        }
        if (check.isSelected()) {
            cancelado = "si";
        } else {
            cancelado = "no";
        }
        return cancelado;
    }

    private void guardarDatos() {
        try {
            int mesa = Integer.parseInt(txtMesa.getText());
            int dni = Integer.parseInt(txtDni.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String tipoReservacion = (String) jcbTipo.getSelectedItem();
            double precioReservacion = getPrecioReservacion(jcbTipo);
            String cancelado = getCancelado(CheckBoxCancelado);
            double montoCancelado = Double.parseDouble(txtPagado.getText());
            Object datos[] = {mesa, dni, nombre, apellido, tipoReservacion, precioReservacion, cancelado, montoCancelado};
            metodos.agregarDatos(datos, "listaReservas.txt");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos invalidos");
        }
    }

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        boolean mesaOcupada = metodos.buscarDatoEnArchivo("listaReservas.txt", 1, txtMesa.getText());
        if (mesaOcupada) {
            JOptionPane.showMessageDialog(null, "Mesa Ocupada", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            guardarDatos();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        getPrecioReservacion(jcbTipo);
    }//GEN-LAST:event_jcbTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxCancelado;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbCancelado;
    private javax.swing.JLabel jlbDatosCliente;
    private javax.swing.JLabel jlbDni;
    private javax.swing.JLabel jlbFacturacion;
    private javax.swing.JLabel jlbMesa;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbPagado;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbTipoReservacion;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMesa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPagado;
    private javax.swing.JLabel txtPrecio;
    // End of variables declaration//GEN-END:variables
}
