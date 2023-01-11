package br.com.barbershop.controller;

import java.sql.SQLException;

import br.com.barbershop.controller.Helper.LoginHelper;
import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    //private UsuarioDAO dao;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void LoginNoSistema() throws SQLException{
        //Pega um usuário da view
        Usuario usuario = helper.obterModelo();
            
        //Pesquisa usuário do banco
        UsuarioDAO dao = new UsuarioDAO();
        System.out.println("Input da tela de Login:" + usuario);
        Usuario autenticacao = dao.findByNameAndPassword(usuario);
        System.out.println("Login Controller: " + autenticacao);
       
        /*if(autenticacao != null) {
        	MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        }else {
            view.exibeMensagem("Erro! Usuario ou Senha invalidos.");
        }*/
    }
    
    public void buscarDoBD(){
        System.out.println("Busquei do banco!");
    }
}
