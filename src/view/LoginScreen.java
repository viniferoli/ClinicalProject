/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
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

        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonUser = new javax.swing.JButton();
        jButtonPassword = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelBackgroundScreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(190, 140, 140, 30);

        jButtonUser.setText("User");
        jButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUser);
        jButtonUser.setBounds(70, 100, 100, 30);

        jButtonPassword.setText("Password");
        getContentPane().add(jButtonPassword);
        jButtonPassword.setBounds(70, 140, 100, 30);

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(230, 220, 51, 23);

        jButtonEnter.setText("Enter");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnter);
        jButtonEnter.setBounds(100, 220, 59, 23);
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(190, 100, 140, 30);

        jLabelBackgroundScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundotelaLogin.png"))); // NOI18N
        jLabelBackgroundScreen.setText("Exit");
        getContentPane().add(jLabelBackgroundScreen);
        jLabelBackgroundScreen.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUserActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        if(jTextFieldUser.getText().equals("admin")&&jPasswordFieldPassword.getText().equals("1234")){
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
        dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário Inválido!");
        }
        
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonPassword;
    private javax.swing.JButton jButtonUser;
    private javax.swing.JLabel jLabelBackgroundScreen;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
