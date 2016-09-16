/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 *
 * @author coste
 */
import clases.*;
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Password p;
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cmdCContraseña = new javax.swing.JButton();
        cmdFuerte = new javax.swing.JButton();
        txtCambiar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        cmdCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        cmdMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password");
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Contraeña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        cmdCContraseña.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCContraseña.setText("Cambiar contraseña");
        cmdCContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, -1));

        cmdFuerte.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdFuerte.setText("Fuerte");
        cmdFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFuerteActionPerformed(evt);
            }
        });
        jPanel1.add(cmdFuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, -1));

        txtCambiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, -1));

        txtMostrar.setEditable(false);
        txtMostrar.setColumns(20);
        txtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, -1));

        cmdCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Longitud");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel1.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 80, -1));

        cmdMostrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 346, 380));

        setSize(new java.awt.Dimension(362, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFuerteActionPerformed

       p.EsFuerte();
       Helper.mensaje(null, "La contraseña es: " + p.EsFuerte(), "Mensaje", 1);
        
    }//GEN-LAST:event_cmdFuerteActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
       
        int L = 0;
        String C = null;
        try{
        C = txtPassword.getText();
        L = Integer.parseInt(txtLongitud.getText());
        } catch (NumberFormatException | NullPointerException e){
        }
        p = new Password(C, L);
        Helper.mensaje(null, "Contraseña creada satisfactoriamente", "Mensaje", 1);
        
        
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdCContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCContraseñaActionPerformed

        String Cn;
        try{
            Cn = txtCambiar.getText();
            p.Cambiar(Cn);
        } catch (NumberFormatException | NullPointerException e){
            Helper.mensaje(null, "Contraseña cambiada exitosamente", "Mensaje", 1);
        }
        
    }//GEN-LAST:event_cmdCContraseñaActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        txtMostrar.append("");
        String aux = null;
        try{
            aux = p.Mostrar();
        } catch (NumberFormatException | NullPointerException e){
        }
        txtMostrar.append(aux);
    }//GEN-LAST:event_cmdMostrarActionPerformed

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
    private javax.swing.JButton cmdCContraseña;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdFuerte;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCambiar;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
