package br.com.barbershop.helper;

import javax.swing.JOptionPane;

import br.com.barbershop.model.Service;
import br.com.barbershop.view.servicos.CadastroServicos;

/**
 *
 * @author jefferson.silva
 */
public class ServicoHelper {
    private final CadastroServicos view;

    public ServicoHelper(CadastroServicos view) {
        this.view = view;
    }
    
    public Service obterServico(){
    	Service service = null;
        String descricao = view.getTextNomeServico().getText();
        Float valor = Float.parseFloat(view.getTextValorServico().getText());
        
        try {
        	 service = new Service(0, descricao, valor);
        	 this.limparTela();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar o serviço, "
					+ "verifique se todas as informações foram preenchidas devidamente!", "Erro", 0);
			System.err.println("Erro no cadastro do serviço: " +  e.getCause());
		}        
		return service;
    }
     
    public void limparTela() { 
    	view.getTextNomeServico().setText("");
    	view.getTextValorServico().setText("");
    }
}
