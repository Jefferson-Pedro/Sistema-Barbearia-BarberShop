package br.com.barbershop.view;

import java.text.ParseException;

import br.com.barbershop.controller.ClienteController;

/**
 *
 * @author jefferson.silva
 */
public class CadastroCliente extends javax.swing.JFrame {
    
    private final ClienteController controller;
  
    public CadastroCliente() {
        initComponents();
        controller = new ClienteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarCliente = new javax.swing.JToggleButton();
        jFormattedTextDataNasc = new javax.swing.JFormattedTextField();
        textCepCliente = new javax.swing.JTextField();
        textEnderecoCliente = new javax.swing.JTextField();
        textRGCliente = new javax.swing.JTextField();
        textEmailCliente = new javax.swing.JTextField();
        textTelefoneCliente = new javax.swing.JTextField();
        textSexoCliente = new javax.swing.JTextField();
        textNomeCliente = new javax.swing.JTextField();
        labelCepCliente = new javax.swing.JLabel();
        labelEnderecoCliente = new javax.swing.JLabel();
        labelRGCliente = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefoneCliente = new javax.swing.JLabel();
        labelDataNascCliente = new javax.swing.JLabel();
        labelSexoCliente = new javax.swing.JLabel();
        labelNomeCliente = new javax.swing.JLabel();
        labelCadastroClientes = new javax.swing.JLabel();
        labelPainelFundoCliente = new javax.swing.JLabel();
        labelFundoCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 170, -1));

        try {
            jFormattedTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, 30));
        getContentPane().add(textCepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 230, 30));
        getContentPane().add(textEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 230, 30));

        textRGCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRGClienteActionPerformed(evt);
            }
        });
        getContentPane().add(textRGCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 230, 30));
        getContentPane().add(textEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 230, 30));

        textTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneClienteActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, 30));
        getContentPane().add(textSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 230, 30));
        getContentPane().add(textNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, 30));

        labelCepCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCepCliente.setText("CEP:");
        getContentPane().add(labelCepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        labelEnderecoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelEnderecoCliente.setText("Endereço:");
        getContentPane().add(labelEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        labelRGCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelRGCliente.setText("Rg:");
        getContentPane().add(labelRGCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText(" Email:");
        getContentPane().add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, -1));

        labelTelefoneCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefoneCliente.setText("Telefone:");
        getContentPane().add(labelTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        labelDataNascCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNascCliente.setText("Data Nasc:");
        getContentPane().add(labelDataNascCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        labelSexoCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelSexoCliente.setText("Sexo:");
        getContentPane().add(labelSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        labelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeCliente.setText("  Nome:");
        getContentPane().add(labelNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, -1));

        labelCadastroClientes.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        labelCadastroClientes.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroClientes.setText("Cadastro de Clientes");
        getContentPane().add(labelCadastroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        labelPainelFundoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/painel-login.png"))); // NOI18N
        labelPainelFundoCliente.setText("jLabel1");
        getContentPane().add(labelPainelFundoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 550, -1));

        labelFundoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Telas/fundo-cadastro-cliente.jpg"))); // NOI18N
        getContentPane().add(labelFundoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneClienteActionPerformed

    private void textRGClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRGClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRGClienteActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {                                                    
        this.controller.cadastrarCliente();
        
    }

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrarCliente;
    private javax.swing.JFormattedTextField jFormattedTextDataNasc;
    private javax.swing.JLabel labelCadastroClientes;
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
    private javax.swing.JTextField textCepCliente;
    private javax.swing.JTextField textEmailCliente;
    private javax.swing.JTextField textEnderecoCliente;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JTextField textRGCliente;
    private javax.swing.JTextField textSexoCliente;
    private javax.swing.JTextField textTelefoneCliente;
    // End of variables declaration//GEN-END:variables

	public javax.swing.JFormattedTextField getjFormattedTextDataNasc() {
		return jFormattedTextDataNasc;
	}

	public void setjFormattedTextDataNasc(javax.swing.JFormattedTextField jFormattedTextDataNasc) {
		this.jFormattedTextDataNasc = jFormattedTextDataNasc;
	}

	public javax.swing.JTextField getTextCepCliente() {
		return textCepCliente;
	}

	public void setTextCepCliente(javax.swing.JTextField textCepCliente) {
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

	public javax.swing.JTextField getTextRGCliente() {
		return textRGCliente;
	}

	public void setTextRGCliente(javax.swing.JTextField textRGCliente) {
		this.textRGCliente = textRGCliente;
	}

	public javax.swing.JTextField getTextSexoCliente() {
		return textSexoCliente;
	}

	public void setTextSexoCliente(javax.swing.JTextField textSexoCliente) {
		this.textSexoCliente = textSexoCliente;
	}

	public javax.swing.JTextField getTextTelefoneCliente() {
		return textTelefoneCliente;
	}

	public void setTextTelefoneCliente(javax.swing.JTextField textTelefoneCliente) {
		this.textTelefoneCliente = textTelefoneCliente;
	}

}