package br.com.barbershop.controller.Helper;

import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.Login;

public class LoginHelper implements IHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public void setarModelo(Usuario modelo){
        //Seta na tela as informações do BD
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }

	@Override
	public Object obterModelo() {
		// TODO Auto-generated method stub
		return null;
	}
}
