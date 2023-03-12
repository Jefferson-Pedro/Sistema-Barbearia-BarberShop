package br.com.barbershop.service;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.helper.LoginHelper;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.Login;
import br.com.barbershop.view.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    //private UsuarioDAO dao;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void LoginNoSistema() throws SQLException{
    	
    	//Pega o que o usuário digitou na view
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario autenticar = new Usuario(nome, senha);
            
        //Pesquisa usuário do banco
        UsuarioDAO dao = new UsuarioDAO();
        System.out.println("Input da tela de Login:" + nome +"Senha: " + senha);
        boolean existe = dao.validateUser(autenticar);
        
        //Autentica o usuario
        if(existe) {
        	MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else {
        	JOptionPane.showMessageDialog(view, "Usuario ou senha invalidos");
        }
    }
    
    public void buscarDoBD(){
        System.out.println("Busquei do banco!");
    }
}
