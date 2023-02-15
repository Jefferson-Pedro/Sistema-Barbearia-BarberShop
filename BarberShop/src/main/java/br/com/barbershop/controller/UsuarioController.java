package br.com.barbershop.controller;

import java.sql.SQLException;
import java.text.ParseException;

import br.com.barbershop.controller.Helper.UsuarioHelper;
import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.Usuarios;

public class UsuarioController {
    private final Usuarios view;
    private final UsuarioHelper helper;

    public UsuarioController(Usuarios view) {
        this.view = view;
        this.helper = new UsuarioHelper(view);
    }
    
     public void cadastrarUsuario() throws ParseException, SQLException{
         UsuarioDAO dao = new UsuarioDAO();
         Usuario usuario = helper.obterUsuario();
         
         dao.save(usuario);
     }
}
