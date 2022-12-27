package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void LoginNoSistema(){
        Usuario usuario = helper.obterModelo();
    }
    
    public void buscarDoBD(){
        System.out.println("Busquei do banco!");
    }
}
