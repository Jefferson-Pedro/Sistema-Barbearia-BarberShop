/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.view;

/**
 *
 * @author jefferson.silva
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
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

        buttonCadastroUsuario = new javax.swing.JToggleButton();
        jComboBoxNvAcesso = new javax.swing.JComboBox<>();
        txtSenhaUsuario = new javax.swing.JTextField();
        txtRgUsuario = new javax.swing.JTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        txtTelefoneUsuario = new javax.swing.JTextField();
        txtDataNascUsuario = new javax.swing.JFormattedTextField();
        txtSexousuario = new javax.swing.JTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        labelNivelAcessoUsuario = new javax.swing.JLabel();
        labelSenhaUsuario = new javax.swing.JLabel();
        labelRgUsuario = new javax.swing.JLabel();
        labelEmailUsuario = new javax.swing.JLabel();
        labelTelefoneUsuario = new javax.swing.JLabel();
        labelDataNasc = new javax.swing.JLabel();
        labelSexoUsuario = new javax.swing.JLabel();
        labelNomeUsuario = new javax.swing.JLabel();
        labelCadastroUsuario = new javax.swing.JLabel();
        labelPainelFundo = new javax.swing.JLabel();
        labelFundoCadastroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCadastroUsuario.setBackground(new java.awt.Color(0, 204, 51));
        buttonCadastroUsuario.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastroUsuario.setText("Cadastrar");
        getContentPane().add(buttonCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 180, 40));

        jComboBoxNvAcesso.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxNvAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(jComboBoxNvAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, -1));
        getContentPane().add(txtSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 250, 30));
        getContentPane().add(txtRgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 250, 30));
        getContentPane().add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 250, 30));
        getContentPane().add(txtTelefoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 250, 30));

        try {
            txtDataNascUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataNascUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 250, 30));
        getContentPane().add(txtSexousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 30));
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 250, 30));

        labelNivelAcessoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelNivelAcessoUsuario.setText("Nv. de Acesso:");
        getContentPane().add(labelNivelAcessoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 90, -1));

        labelSenhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaUsuario.setText(" Senha:");
        getContentPane().add(labelSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 50, 30));

        labelRgUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelRgUsuario.setText(" RG:");
        getContentPane().add(labelRgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 316, 30, 20));

        labelEmailUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelEmailUsuario.setText("Email:");
        getContentPane().add(labelEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        labelTelefoneUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneUsuario.setText("  Telefone:");
        getContentPane().add(labelTelefoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, -1));

        labelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNasc.setText("DataNasc:");
        getContentPane().add(labelDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        labelSexoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelSexoUsuario.setText(" Sexo:");
        getContentPane().add(labelSexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 156, 40, 20));

        labelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeUsuario.setText("       Nome:");
        getContentPane().add(labelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 60, -1));

        labelCadastroUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroUsuario.setText("Cadastro de Usuário");
        getContentPane().add(labelCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        labelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login.png"))); // NOI18N
        getContentPane().add(labelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        labelFundoCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/fundo-cadastro-usuario.jpg"))); // NOI18N
        getContentPane().add(labelFundoCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCadastroUsuario;
    private javax.swing.JComboBox<String> jComboBoxNvAcesso;
    private javax.swing.JLabel labelCadastroUsuario;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmailUsuario;
    private javax.swing.JLabel labelFundoCadastroUsuario;
    private javax.swing.JLabel labelNivelAcessoUsuario;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelPainelFundo;
    private javax.swing.JLabel labelRgUsuario;
    private javax.swing.JLabel labelSenhaUsuario;
    private javax.swing.JLabel labelSexoUsuario;
    private javax.swing.JLabel labelTelefoneUsuario;
    private javax.swing.JFormattedTextField txtDataNascUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtRgUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JTextField txtSexousuario;
    private javax.swing.JTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables
}
