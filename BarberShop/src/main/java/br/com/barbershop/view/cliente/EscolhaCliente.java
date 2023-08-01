
package br.com.barbershop.view.cliente;

import br.com.barbershop.controller.ClienteController;

/**
 *
 * @author jefferson.silva
 */
public class EscolhaCliente extends javax.swing.JFrame {

private final ClienteController controller;

    public EscolhaCliente() {
        initComponents();
        this.controller = new ClienteController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExcluirCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        jLabelTituloPrincipal = new javax.swing.JLabel();
        labelFundoEscolhaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExcluirCliente.setText("Excluir um Cliente");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, -1));

        btnAtualizarCliente.setText("Atualizar um Cliente");
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        btnCadastrarCliente.setText("Cadastrar um Cliente");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabelTituloPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloPrincipal.setText("Escolha o que você deseja fazer?");
        getContentPane().add(jLabelTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 25));

        labelFundoEscolhaCliente.setBackground(new java.awt.Color(0, 0, 0));
        labelFundoEscolhaCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\Sistema-Barbearia-BarberShop\\BarberShop\\src\\main\\java\\resources\\Telas\\duvida.png")); // NOI18N
        getContentPane().add(labelFundoEscolhaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 390, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        this.controller.navegarParaCadastrarCliente();
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
        this.controller.navegarParaAtualizarCliente();
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        this.controller.navegarParaExcluirCliente();
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JLabel jLabelTituloPrincipal;
    private javax.swing.JLabel labelFundoEscolhaCliente;
    // End of variables declaration//GEN-END:variables
}
