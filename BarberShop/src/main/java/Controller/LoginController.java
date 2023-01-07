package Controller;

import java.sql.SQLException;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import Model.DAO.UsuarioDAO;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    private UsuarioDAO dao;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void LoginNoSistema() throws SQLException{
        //Pega um usuário da view
        Usuario usuario = helper.obterModelo();
        
        //Pesquisa usuário do banco
        dao.findById(0); 
    }
    
    public void buscarDoBD(){
        System.out.println("Busquei do banco!");
    }
}
