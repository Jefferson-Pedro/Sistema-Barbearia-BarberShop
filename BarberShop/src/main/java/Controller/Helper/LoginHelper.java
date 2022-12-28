package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        //Pega o que o usuário digitou na view
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario usuario = new Usuario(0, nome, senha);
         
        return usuario;
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
}
