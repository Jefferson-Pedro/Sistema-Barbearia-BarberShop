package View;

import Controller.LoginController;
import Util.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jefferson.silva
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
        ConexaoBD.conectaBD();
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
        jLabelRecuperacaoSenha = new javax.swing.JLabel();
        ButtonEntrar = new javax.swing.JButton();
        TextSenha = new javax.swing.JPasswordField();
        TextUsuario = new javax.swing.JTextField();
        LabelTituloLogin = new javax.swing.JLabel();
        LabelPainelFundo = new javax.swing.JLabel();
        LabelLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRecuperacaoSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRecuperacaoSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecuperacaoSenha.setText("Esqueceu sua senha?");
        jPanel1.add(jLabelRecuperacaoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 120, 20));

        ButtonEntrar.setBackground(new java.awt.Color(255, 51, 0));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 220, 30));

        TextSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 280, 50));

        TextUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 280, 50));

        LabelTituloLogin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 34)); // NOI18N
        LabelTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloLogin.setText("Login");
        jPanel1.add(LabelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 100, 60));

        LabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login 350x200.png"))); // NOI18N
        jPanel1.add(LabelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        LabelLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/Logo 500x700.jpg"))); // NOI18N
        jPanel1.add(LabelLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        try {
            //Salva o que o usuario digitou no input
            this.controller.LoginNoSistema();       
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelLoginFundo;
    private javax.swing.JLabel LabelPainelFundo;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabelRecuperacaoSenha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    
    public void exibeMensagem(String mensagem) {
    	JOptionPane.showMessageDialog(null, mensagem);
        System.out.println("Usuário não existe!");
    }
    
    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }

    
}