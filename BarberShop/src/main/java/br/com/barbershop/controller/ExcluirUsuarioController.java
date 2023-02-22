package br.com.barbershop.controller;

import br.com.barbershop.controller.Helper.ExcluirUsuarioHelper;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.ExcluirUsuario;

import java.sql.SQLException;
import java.util.ArrayList;

public class ExcluirUsuarioController {
    private final ExcluirUsuario view;
    private final ExcluirUsuarioHelper helper;

    public ExcluirUsuarioController(ExcluirUsuario view) {
        this.view = view;
        this.helper = new ExcluirUsuarioHelper(view);
    }
    
    public void atualizaUsuario() throws ClassNotFoundException {
	// Buscar usuario do BD
	UsuarioDAO dao = new UsuarioDAO();
	ArrayList<Usuario> usuarios = dao.getAll();
	
	// Exibir Usuarios no ComboBox Cliente
	helper.preencherUsuarios(usuarios);
    }

    public void excluirUsuario() throws SQLException {
    	UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = helper.obterUsuario();
       
        dao.deleteById(usuario);
        
        //Remove o Item do ComboBox da visão do usuário;
        view.getjComboBoxExcluirUsuario().removeItem(usuario);
    }
}
