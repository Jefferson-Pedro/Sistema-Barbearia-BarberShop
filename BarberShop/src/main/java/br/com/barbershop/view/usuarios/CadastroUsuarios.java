/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.view.usuarios;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.com.barbershop.service.UsuarioService;

public class CadastroUsuarios extends javax.swing.JFrame {
    
     private final UsuarioService service;
   
    public CadastroUsuarios() {
        initComponents();
        service = new UsuarioService(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonCadastroUsuario = new javax.swing.JToggleButton();
        jComboBoxNvAcesso = new javax.swing.JComboBox<>();
        txtSenhaUsuario = new javax.swing.JTextField();
        txtTelefoneUsuario = new javax.swing.JFormattedTextField();
        txtRgUsuario = new javax.swing.JFormattedTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        txtDataNascUsuario = new javax.swing.JFormattedTextField();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
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
        buttonCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 180, 40));

        jComboBoxNvAcesso.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxNvAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(jComboBoxNvAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, -1));
        getContentPane().add(txtSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 250, 30));

        try {
            txtTelefoneUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 250, 30));

        try {
            txtRgUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRgUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtRgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 250, 30));
        getContentPane().add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 250, 30));

        try {
            txtDataNascUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataNascUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 250, 30));

        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFeminino.setText("Feminino");
        getContentPane().add(jRadioButtonFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMasculino.setText("Masculino");
        getContentPane().add(jRadioButtonMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 250, 30));

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
        getContentPane().add(labelEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 276, -1, 20));

        labelTelefoneUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneUsuario.setText("  Telefone:");
        getContentPane().add(labelTelefoneUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 226, 70, 30));

        labelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNasc.setText("DataNasc:");
        getContentPane().add(labelDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 20));

        labelSexoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelSexoUsuario.setText(" Sexo:");
        getContentPane().add(labelSexoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 40, 40));

        labelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeUsuario.setText("       Nome:");
        getContentPane().add(labelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 96, 60, 30));

        labelCadastroUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroUsuario.setText("Cadastro de Usuário");
        getContentPane().add(labelCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        labelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login.png"))); // NOI18N
        getContentPane().add(labelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 520));

        labelFundoCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/fundo-cadastro-usuario.jpg"))); // NOI18N
        getContentPane().add(labelFundoCadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataNascUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascUsuarioActionPerformed

    private void buttonCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroUsuarioActionPerformed
         try {
             this.service.cadastrarUsuario();
         } catch (ParseException | SQLException ex) {
             Logger.getLogger(CadastroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_buttonCadastroUsuarioActionPerformed

    private void txtTelefoneUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneUsuarioActionPerformed

    private void txtRgUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonCadastroUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxNvAcesso;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
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
    private javax.swing.JFormattedTextField txtRgUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JFormattedTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getjComboBoxNvAcesso() {
        return jComboBoxNvAcesso;
    }

    public void setjComboBoxNvAcesso(JComboBox<String> jComboBoxNvAcesso) {
        this.jComboBoxNvAcesso = jComboBoxNvAcesso;
    }

    public JFormattedTextField getTxtDataNascUsuario() {
        return txtDataNascUsuario;
    }

    public void setTxtDataNascUsuario(JFormattedTextField txtDataNascUsuario) {
        this.txtDataNascUsuario = txtDataNascUsuario;
    }

    public JTextField getTxtEmailUsuario() {
        return txtEmailUsuario;
    }

    public void setTxtEmailUsuario(JTextField txtEmailUsuario) {
        this.txtEmailUsuario = txtEmailUsuario;
    }

    public JTextField getTxtNomeUsuario() {
        return txtNomeUsuario;
    }

    public void setTxtNomeUsuario(JTextField txtNomeUsuario) {
        this.txtNomeUsuario = txtNomeUsuario;
    }

    public JFormattedTextField getTxtRgUsuario() {
        return txtRgUsuario;
    }

    public void setTxtRgUsuario(JFormattedTextField txtRgUsuario) {
        this.txtRgUsuario = txtRgUsuario;
    }

    public JTextField getTxtSenhaUsuario() {
        return txtSenhaUsuario;
    }

    public void setTxtSenhaUsuario(JTextField txtSenhaUsuario) {
        this.txtSenhaUsuario = txtSenhaUsuario;
    }

    public JRadioButton getjRadioButtonFeminino() {
        return jRadioButtonFeminino;
    }

    public void setjRadioButtonFeminino(JRadioButton jRadioButtonFeminino) {
        this.jRadioButtonFeminino = jRadioButtonFeminino;
    }

    public JRadioButton getjRadioButtonMasculino() {
        return jRadioButtonMasculino;
    }

    public void setjRadioButtonMasculino(JRadioButton jRadioButtonMasculino) {
        this.jRadioButtonMasculino = jRadioButtonMasculino;
    }

    public JFormattedTextField getTxtTelefoneUsuario() {
        return txtTelefoneUsuario;
    }

    public void setTxtTelefoneUsuario(JFormattedTextField txtTelefoneUsuario) {
        this.txtTelefoneUsuario = txtTelefoneUsuario;
    }
}