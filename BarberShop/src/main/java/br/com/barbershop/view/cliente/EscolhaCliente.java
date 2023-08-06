package br.com.barbershop.view.cliente;

import br.com.barbershop.helper.ClienteHelper;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

import br.com.barbershop.service.ClienteService;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author jefferson.silva
 */
public class EscolhaCliente extends javax.swing.JFrame {

    private final ClienteService service;
    private ClienteHelper clienteHelper;

       public EscolhaCliente() {
        initComponents();
        service = new ClienteService(this);
        clienteHelper = new ClienteHelper(this);
        clienteHelper.listaClienteNaView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabelaCliente = new javax.swing.JScrollPane();
        jListaCliente = new javax.swing.JTable();
        btnExcluirCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JToggleButton();
        textCepCliente = new javax.swing.JFormattedTextField();
        textRGCliente = new javax.swing.JFormattedTextField();
        jFormattedTextDataNasc = new javax.swing.JFormattedTextField();
        textEnderecoCliente = new javax.swing.JTextField();
        textTelefoneCliente1 = new javax.swing.JFormattedTextField();
        textEmailCliente = new javax.swing.JTextField();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        textNomeCliente = new javax.swing.JTextField();
        labelCepCliente = new javax.swing.JLabel();
        labelEnderecoCliente = new javax.swing.JLabel();
        labelRGCliente = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefoneCliente = new javax.swing.JLabel();
        labelDataNascCliente = new javax.swing.JLabel();
        labelSexoCliente = new javax.swing.JLabel();
        labelNomeCliente = new javax.swing.JLabel();
        labelTitleClientes = new javax.swing.JLabel();
        labelPainelFundoCliente = new javax.swing.JLabel();
        labelFundoCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jListaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaClienteMouseClicked(evt);
            }
        });
        jListaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jListaClienteKeyReleased(evt);
            }
        });
        jTabelaCliente.setViewportView(jListaCliente);

        getContentPane().add(jTabelaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 580, 150));

        btnExcluirCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluirCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 100, -1));

        btnAtualizarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnAtualizarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtualizarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizarCliente.setText("Atualizar");
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 90, -1));

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 204, 51));
        btnCadastrarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnCadastrarClienteActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        getContentPane().add(btnCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 140, 30));

        try {
            textCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textCepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 230, 30));

        try {
            textRGCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textRGCliente.setText("                                .   .   - ");
        textRGCliente.setToolTipText("");
        getContentPane().add(textRGCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 230, 30));

        try {
            jFormattedTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 90, 30));
        getContentPane().add(textEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 300, 30));

        try {
            textTelefoneCliente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textTelefoneCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 30));
        getContentPane().add(textEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 310, 30));

        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFeminino.setText("Feminino");
        getContentPane().add(jRadioButtonFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMasculino.setText("Masculino");
        getContentPane().add(jRadioButtonMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(textNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 300, 30));

        labelCepCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCepCliente.setText("CEP:");
        getContentPane().add(labelCepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        labelEnderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoCliente.setText("Endereço:");
        getContentPane().add(labelEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        labelRGCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelRGCliente.setText("Rg:");
        getContentPane().add(labelRGCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText(" Email:");
        getContentPane().add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 40, -1));

        labelTelefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneCliente.setText("Telefone:");
        getContentPane().add(labelTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        labelDataNascCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascCliente.setText("Data Nasc:");
        getContentPane().add(labelDataNascCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        labelSexoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelSexoCliente.setText("Sexo:");
        getContentPane().add(labelSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 40));

        labelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeCliente.setText("  Nome:");
        getContentPane().add(labelNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, 20));

        labelTitleClientes.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        labelTitleClientes.setForeground(new java.awt.Color(255, 255, 255));
        labelTitleClientes.setText("Cliente");
        getContentPane().add(labelTitleClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));
        getContentPane().add(labelPainelFundoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 560, 500));
        getContentPane().add(labelFundoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
      System.out.println("linha selecionada: " + jListaCliente.getSelectedRow());
       if(jListaCliente.getSelectedRow() != -1){
          this.clienteHelper.excluirClienteDaView(); //Excluir dados da view;
          //Falta colocar o excluir do banco de dados;
       }else{
          JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!");
      }
     
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
       if(jListaCliente.getSelectedRow() != -1){
           System.out.println(this.clienteHelper.recuperarIdClienteNaView());
           System.out.println(" cliente Class Main" + this.service.obterClientePorId().toString());
       }
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void jListaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListaClienteKeyReleased
       // System.out.println("linha selecionada: " + jListaCliente.getSelectedRow());
    }//GEN-LAST:event_jListaClienteKeyReleased

    private void jListaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaClienteMouseClicked
       if(jListaCliente.getSelectedRow() != -1){
           //this.clienteHelper.setarClienteNaView();
       }
    }//GEN-LAST:event_jListaClienteMouseClicked

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
       this.service.cadastrarCliente();
       this.clienteHelper.limparDadosDaView();
       this.clienteHelper.listaClienteNaView();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JToggleButton btnCadastrarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextDataNasc;
    private javax.swing.JTable jListaCliente;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jTabelaCliente;
    private javax.swing.JLabel labelCepCliente;
    private javax.swing.JLabel labelDataNascCliente;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEnderecoCliente;
    private javax.swing.JLabel labelFundoCliente;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelPainelFundoCliente;
    private javax.swing.JLabel labelRGCliente;
    private javax.swing.JLabel labelSexoCliente;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JLabel labelTitleClientes;
    private javax.swing.JFormattedTextField textCepCliente;
    private javax.swing.JTextField textEmailCliente;
    private javax.swing.JTextField textEnderecoCliente;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JFormattedTextField textRGCliente;
    private javax.swing.JFormattedTextField textTelefoneCliente1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JFormattedTextField getjFormattedTextDataNasc() {
        return jFormattedTextDataNasc;
    }

    public void setjFormattedTextDataNasc(javax.swing.JFormattedTextField jFormattedTextDataNasc) {
        this.jFormattedTextDataNasc = jFormattedTextDataNasc;
    }

    public JFormattedTextField getTextCepCliente() {
        return textCepCliente;
    }

    public void setTextCepCliente(JFormattedTextField textCepCliente) {
        this.textCepCliente = textCepCliente;
    }

    public javax.swing.JTextField getTextEmailCliente() {
        return textEmailCliente;
    }

    public void setTextEmailCliente(javax.swing.JTextField textEmailCliente) {
        this.textEmailCliente = textEmailCliente;
    }

    public javax.swing.JTextField getTextEnderecoCliente() {
        return textEnderecoCliente;
    }

    public void setTextEnderecoCliente(javax.swing.JTextField textEnderecoCliente) {
        this.textEnderecoCliente = textEnderecoCliente;
    }

    public javax.swing.JTextField getTextNomeCliente() {
        return textNomeCliente;
    }

    public void setTextNomeCliente(javax.swing.JTextField textNomeCliente) {
        this.textNomeCliente = textNomeCliente;
    }

    public JFormattedTextField getTextRGCliente() {
        return textRGCliente;
    }

    public void setTextRGCliente(JFormattedTextField textRGCliente) {
        this.textRGCliente = textRGCliente;
    }

    public JFormattedTextField getTextTelefoneCliente() {
        return textRGCliente;
    }

    public void setTextTelefoneCliente(JFormattedTextField textTelefoneCliente) {
        this.textRGCliente = textTelefoneCliente;
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

    public JTable getjListaCliente() {
        return jListaCliente;
    }

    public void setjListaCliente(JTable jListaCliente) {
        this.jListaCliente = jListaCliente;
    }

    public JScrollPane getjTabelaCliente() {
        return jTabelaCliente;
    }

    public void setjTabelaCliente(JScrollPane jTabelaCliente) {
        this.jTabelaCliente = jTabelaCliente;
    }
}
