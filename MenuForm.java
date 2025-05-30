/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanApp;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MenuForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuForm
     */
    public MenuForm() {
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

        dekstopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        judul = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuRegister = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dekstopPane.setBackground(new java.awt.Color(0, 255, 204));
        dekstopPane.setAutoscrolls(true);

        javax.swing.GroupLayout dekstopPaneLayout = new javax.swing.GroupLayout(dekstopPane);
        dekstopPane.setLayout(dekstopPaneLayout);
        dekstopPaneLayout.setHorizontalGroup(
            dekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        dekstopPaneLayout.setVerticalGroup(
            dekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        judul.setText("LOGIN");
        judul.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                judulComponentShown(evt);
            }
        });

        menuLogin.setText("LOGIN");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        judul.add(menuLogin);

        menuLogout.setText("LOGOUT");
        menuLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        menuLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuLogoutKeyPressed(evt);
            }
        });
        judul.add(menuLogout);

        menuRegister.setText("REGISTER");
        menuRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterActionPerformed(evt);
            }
        });
        judul.add(menuRegister);

        jMenuBar1.add(judul);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterActionPerformed
    FormRegistrasi register = new FormRegistrasi();
    register.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_menuRegisterActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        dekstopPane.removeAll();
        LoginForm loginForm = new LoginForm ();
        loginForm.setVisible (true);
        dekstopPane.add(loginForm);
        menuLogin.setEnabled(false);
        menuLogout.setEnabled(true);
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        dekstopPane.removeAll();
        LoginForm loginForm = new LoginForm ();
        loginForm.setVisible (true);
        dekstopPane.add(loginForm);
        menuLogout.setEnabled(false);
        menuLogin.setEnabled(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuLogoutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLogoutKeyPressed

    private void judulComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_judulComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_judulComponentShown

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dekstopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu judul;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuRegister;
    // End of variables declaration//GEN-END:variables
}
