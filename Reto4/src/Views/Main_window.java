/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


/**
 *
 * @author jjnun
 */
public class Main_window extends javax.swing.JFrame {

    /**
     * Creates new form Main_window
     */
    public Main_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_contratar = new javax.swing.JButton();
        btn_liqNomPara = new javax.swing.JButton();
        btn_liqSegPres = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        tf_horasExtra = new javax.swing.JTextField();
        tf_auxTransporte = new javax.swing.JTextField();
        tf_salario = new javax.swing.JTextField();
        lab_contratarEmpleado = new javax.swing.JLabel();
        lab_nombre = new javax.swing.JLabel();
        lab_horasExtra = new javax.swing.JLabel();
        lab_auxTransporte = new javax.swing.JLabel();
        lab_salario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_contratar.setText("Contratar");
        btn_contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contratarActionPerformed(evt);
            }
        });

        btn_liqNomPara.setText("Liquidación Nómina y Parafiscales");
        btn_liqNomPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_liqNomParaActionPerformed(evt);
            }
        });

        btn_liqSegPres.setText("Liquidación Seguridad y Prestaciones");

        tf_horasExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_horasExtraActionPerformed(evt);
            }
        });

        tf_auxTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_auxTransporteActionPerformed(evt);
            }
        });

        lab_contratarEmpleado.setText("Contratar Empleado");

        lab_nombre.setText("Nombre");

        lab_horasExtra.setText("Horas extra");

        lab_auxTransporte.setText("Auxilio Transporte");

        lab_salario.setText("Salario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_contratar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_nombre)
                            .addComponent(lab_salario)
                            .addComponent(lab_auxTransporte)
                            .addComponent(lab_horasExtra)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_salario)
                                .addComponent(tf_auxTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_horasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lab_contratarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_liqNomPara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_liqSegPres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_liqNomPara)
                        .addGap(18, 18, 18)
                        .addComponent(btn_liqSegPres))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lab_contratarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(lab_nombre)
                        .addGap(3, 3, 3)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lab_horasExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_horasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lab_auxTransporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_auxTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab_salario)
                        .addGap(3, 3, 3)
                        .addComponent(tf_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_contratar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_horasExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_horasExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_horasExtraActionPerformed

    private void tf_auxTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_auxTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_auxTransporteActionPerformed

    private void btn_liqNomParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_liqNomParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_liqNomParaActionPerformed

    private void btn_contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contratarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_contratarActionPerformed

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
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_contratar;
    private javax.swing.JButton btn_liqNomPara;
    private javax.swing.JButton btn_liqSegPres;
    private javax.swing.JLabel lab_auxTransporte;
    private javax.swing.JLabel lab_contratarEmpleado;
    private javax.swing.JLabel lab_horasExtra;
    private javax.swing.JLabel lab_nombre;
    private javax.swing.JLabel lab_salario;
    private javax.swing.JTextField tf_auxTransporte;
    private javax.swing.JTextField tf_horasExtra;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_salario;
    // End of variables declaration//GEN-END:variables
}