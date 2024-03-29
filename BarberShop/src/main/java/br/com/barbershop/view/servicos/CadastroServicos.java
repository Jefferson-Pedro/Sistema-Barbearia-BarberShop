package br.com.barbershop.view.servicos;

import javax.swing.JTextField;

import br.com.barbershop.service.ServicoService;

public class CadastroServicos extends javax.swing.JFrame {
    
      private final ServicoService controller;
   
    public CadastroServicos() {
		initComponents();
		controller = new ServicoService(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextValorServico = new javax.swing.JTextField();
        TextNomeServico = new javax.swing.JTextField();
        ButtonCadastrar = new javax.swing.JToggleButton();
        jLabelValorServico = new javax.swing.JLabel();
        jLabelNomeServico = new javax.swing.JLabel();
        jLabelCadastroDeServicos = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelFundoServico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextValorServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorServicoActionPerformed(evt);
            }
        });
        getContentPane().add(TextValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 150, 30));

        TextNomeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeServicoActionPerformed(evt);
            }
        });
        getContentPane().add(TextNomeServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 230, 30));

        ButtonCadastrar.setBackground(new java.awt.Color(0, 204, 51));
        ButtonCadastrar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        ButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 260, 40));

        jLabelValorServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorServico.setText("Valor:");
        getContentPane().add(jLabelValorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabelNomeServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeServico.setText("Nome do Serviço:");
        getContentPane().add(jLabelNomeServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabelCadastroDeServicos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCadastroDeServicos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroDeServicos.setText("Cadastro de Serviços");
        getContentPane().add(jLabelCadastroDeServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 560, 480));

        jLabelFundoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/servicos-fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        this.controller.cadastrarServico();
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void TextNomeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeServicoActionPerformed

    private void TextValorServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorServicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonCadastrar;
    private javax.swing.JTextField TextNomeServico;
    private javax.swing.JTextField TextValorServico;
    private javax.swing.JLabel jLabelCadastroDeServicos;
    private javax.swing.JLabel jLabelFundoServico;
    private javax.swing.JLabel jLabelNomeServico;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelValorServico;
    // End of variables declaration//GEN-END:variables

    public JTextField getTextNomeServico() {
        return TextNomeServico;
    }

    public void setTextNomeServico(JTextField TextNomeServico) {
        this.TextNomeServico = TextNomeServico;
    }

    public JTextField getTextValorServico() {
        return TextValorServico;
    }

    public void setTextValorServico(JTextField TextValorServico) {
        this.TextValorServico = TextValorServico;
    }

    
    
    
}
