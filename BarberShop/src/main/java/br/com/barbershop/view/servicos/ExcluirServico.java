package br.com.barbershop.view.servicos;

import br.com.barbershop.service.ServicoService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComboBox;


public class ExcluirServico extends javax.swing.JFrame {

    private final ServicoService service;
    
    public ExcluirServico() {
        initComponents();
        service = new ServicoService(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluir = new javax.swing.JButton();
        jLabelService = new javax.swing.JLabel();
        jComboBoxExcluirServico = new javax.swing.JComboBox<>();
        jLabelExcluirServico = new javax.swing.JLabel();
        jLabelFundoPainel = new javax.swing.JLabel();
        jLabelFundoExclusaoServico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExcluir.setBackground(new java.awt.Color(0, 204, 51));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonExcluirActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 160, 30));

        jLabelService.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelService.setText("Serviço:");
        getContentPane().add(jLabelService, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        jComboBoxExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxExcluirServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxExcluirServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 260, 30));

        jLabelExcluirServico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelExcluirServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExcluirServico.setText("Excluir Serviço");
        getContentPane().add(jLabelExcluirServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabelFundoPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelFundoPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 560, 390));

        jLabelFundoExclusaoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/servicos-fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoExclusaoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonExcluirActionPerformed
       this.service.excluirServico();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxExcluirServicoActionPerformed
        
    }//GEN-LAST:event_jComboBoxExcluirServicoActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxExcluirServico;
    private javax.swing.JLabel jLabelExcluirServico;
    private javax.swing.JLabel jLabelFundoExclusaoServico;
    private javax.swing.JLabel jLabelFundoPainel;
    private javax.swing.JLabel jLabelService;
    // End of variables declaration//GEN-END:variables

    public void iniciar(){
        this.service.preencheServico();
    }

    public JComboBox<String> getjComboBoxExcluirServico() {
        return jComboBoxExcluirServico;
    }

    public void setjComboBoxExcluirServico(JComboBox<String> jComboBoxExcluirServico) {
        this.jComboBoxExcluirServico = jComboBoxExcluirServico;
    }
}