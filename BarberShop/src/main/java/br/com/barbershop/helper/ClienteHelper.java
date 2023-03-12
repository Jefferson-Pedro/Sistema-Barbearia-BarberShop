package br.com.barbershop.helper;

import java.text.ParseException;

import javax.swing.JOptionPane;

import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.CadastroCliente;

public class ClienteHelper {
	
	private final CadastroCliente view;

    public ClienteHelper(CadastroCliente view) {
    	this.view = view;
    }
    
    public Cliente obterCliente() throws ParseException {
    	    	
    	String nome = view.getTextNomeCliente().getText();
    	String sexo = "";
    	String dataNasc = view.getjFormattedTextDataNasc().getText();
    	String telefone = view.getTextTelefoneCliente().getText();
    	String email = view.getTextEmailCliente().getText();
    	String rg = view.getTextRGCliente().getText();
    	String endereco = view.getTextEnderecoCliente().getText();
    	String cep = view.getTextCepCliente().getText();
        
        if(view.getjRadioButtonMasculino().isSelected()){
            sexo = "M";
        }else if(view.getjRadioButtonFeminino().isSelected()){
            sexo = "F";
        }
    	
    	Cliente cliente = null;
    	
		try {
			cliente = new Cliente(0, nome, sexo, dataNasc, telefone, email, rg,
					endereco, cep);
			this.limparTela();
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente, "
					+ "verifique se todas as informações foram preenchidas devidamente!", "Erro", 0);
			System.err.println("Data não prenchida" + e);
		}
		return cliente;
    }
    
    public void limparTela() {
		view.getTextNomeCliente().setText("");
		//view.getTextSexoCliente().setText("");
		view.getjFormattedTextDataNasc().setText("");
		view.getTextTelefoneCliente().setText("");
		view.getTextEmailCliente().setText("");
		view.getTextRGCliente().setText("");
		view.getTextEnderecoCliente().setText("");
		view.getTextCepCliente().setText("");		
	}	
}
