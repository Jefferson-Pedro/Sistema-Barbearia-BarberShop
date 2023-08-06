/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.barbershop.view.usuarios;

import br.com.barbershop.controller.UsuarioController;

/**
 *
 * @author jefferson.silva
 */
public class EscolhaUsuario extends javax.swing.JFrame {
    
    private final UsuarioController controller;
   
    public EscolhaUsuario() {
        initComponents();
         this.controller =  new UsuarioController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluirServico = new javax.swing.JButton();
        jButtonAtualizarServico = new javax.swing.JButton();
        jButtonCadastroServico = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelPlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExcluirServico.setText("Excluir Serviço");
        jButtonExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluirServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, -1));

        jButtonAtualizarServico.setText("Atualizar Serviço Existente");
        jButtonAtualizarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jButtonCadastroServico.setText("Cadastrar Novo Serviço");
        jButtonCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastroServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, -1));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Escolha o que você deseja fazer");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabelPlanoDeFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefferson.silva\\Documents\\GitHub\\Sistema-Barbearia-BarberShop\\BarberShop\\src\\main\\java\\resources\\Telas\\duvida.png")); // NOI18N
        jLabelPlanoDeFundo.setText("jLabel1");
        getContentPane().add(jLabelPlanoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroServicoActionPerformed
        this.controller.navegarParaCadastrarUsuario();
    }//GEN-LAST:event_jButtonCadastroServicoActionPerformed

    private void jButtonAtualizarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarServicoActionPerformed
        this.controller.navegarParaAtualizarUsuario();
    }//GEN-LAST:event_jButtonAtualizarServicoActionPerformed

    private void jButtonExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirServicoActionPerformed
        this.controller.navegarParaExcluirUsuario();
    }//GEN-LAST:event_jButtonExcluirServicoActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarServico;
    private javax.swing.JButton jButtonCadastroServico;
    private javax.swing.JButton jButtonExcluirServico;
    private javax.swing.JLabel jLabelPlanoDeFundo;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}