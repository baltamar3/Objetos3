/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Complejo;
import javax.swing.JOptionPane;

/**
 *
 * @author baltamar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReal1 = new javax.swing.JTextField();
        txtImaginario1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtReal2 = new javax.swing.JTextField();
        txtImaginario2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbOperacion = new javax.swing.JComboBox<>();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtImaginario3 = new javax.swing.JTextField();
        txtReal3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNumeradorReal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominadorReal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumeradorImaginario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominadorImaginario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES CON COMPLEJOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("N1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 25));
        jPanel1.add(txtImaginario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("+");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(" N2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));
        jPanel1.add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 60, 25));
        jPanel1.add(txtImaginario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 60, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("+");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("i");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 10, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("i");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 10, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 80, -1));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 90, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resulado:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel13.setText("i");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 10, -1));

        txtImaginario3.setEditable(false);
        jPanel3.add(txtImaginario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, 25));

        txtReal3.setEditable(false);
        jPanel3.add(txtReal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("+");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Division"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeradorReal.setEditable(false);
        jPanel2.add(txtNumeradorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 25));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 10));

        txtDenominadorReal.setEditable(false);
        jPanel2.add(txtDenominadorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("+");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtNumeradorImaginario.setEditable(false);
        jPanel2.add(txtNumeradorImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 10));

        txtDenominadorImaginario.setEditable(false);
        jPanel2.add(txtDenominadorImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel10.setText("i");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 10, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtReal1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte real del primer numero");
            txtReal1.requestFocusInWindow();
        } else if (txtImaginario1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte imaginaria del primer numero");
            txtImaginario1.requestFocusInWindow();
        } else if (txtReal2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte real del segundo numero");
            txtReal2.requestFocusInWindow();
        } else if (txtImaginario2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte imaginaria del segundo numero");
            txtImaginario2.requestFocusInWindow();
        } else {
            int op;
            int r1, i1, r2, i2, aux;
            Complejo n1, n2, n3;
            try {
                op = cmbOperacion.getSelectedIndex();
                r1 = Integer.parseInt(txtReal1.getText());
                i1 = Integer.parseInt(txtImaginario1.getText());
                r2 = Integer.parseInt(txtReal2.getText());
                i2 = Integer.parseInt(txtImaginario2.getText());

                n1 = new Complejo(r1, i1);
                n2 = new Complejo(r2, i2);
                switch (op) {
                    case 0:
                        n3 = n1.sumar(n2);
                        txtReal3.setText("" + n3.getParte_real());
                        txtImaginario3.setText("" + n3.getParte_imaginaria());
                        break;
                    case 1:
                        n3 = n1.restar(n2);
                        txtReal3.setText(String.valueOf(n3.getParte_real()));
                        txtImaginario3.setText("" + n3.getParte_imaginaria());
                        break;
                    case 2:
                        n3 = n1.multiplicar(n2);
                        txtReal3.setText(String.valueOf(n3.getParte_real()));
                        txtImaginario3.setText(String.valueOf(n3.getParte_imaginaria()));
                        break;
                    case 3:
                        n3 = n1.dividir(n2);
                        txtReal3.setText("");
                        txtImaginario3.setText("");
                        aux = (n2.getParte_real() * n2.getParte_real()) + (n2.getParte_imaginaria() * n2.getParte_imaginaria());
                        txtNumeradorReal.setText(String.valueOf(n3.getParte_real()));
                        txtDenominadorReal.setText(String.valueOf(aux));
                        txtNumeradorImaginario.setText(String.valueOf(n3.getParte_imaginaria()));
                        txtDenominadorImaginario.setText(String.valueOf(aux));
                        break;
                }
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "Valor No valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtReal3.setText("");
        txtImaginario3.setText("");
        txtNumeradorReal.setText("");
        txtDenominadorReal.setText("");
        txtNumeradorImaginario.setText("");
        txtReal1.setText("");
        txtImaginario1.setText("");
        txtReal2.setText("");
        txtImaginario2.setText("");
        txtDenominadorImaginario.setText("");
        txtReal1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDenominadorImaginario;
    private javax.swing.JTextField txtDenominadorReal;
    private javax.swing.JTextField txtImaginario1;
    private javax.swing.JTextField txtImaginario2;
    private javax.swing.JTextField txtImaginario3;
    private javax.swing.JTextField txtNumeradorImaginario;
    private javax.swing.JTextField txtNumeradorReal;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    private javax.swing.JTextField txtReal3;
    // End of variables declaration//GEN-END:variables
}
