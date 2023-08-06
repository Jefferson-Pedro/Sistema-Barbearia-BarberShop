package br.com.barbershop.service;

import java.sql.SQLException;
import java.text.ParseException;

import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.helper.UsuarioHelper;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.usuarios.ExcluirUsuario;
import br.com.barbershop.view.usuarios.CadastroUsuarios;
import java.util.ArrayList;

public class UsuarioService {

    private CadastroUsuarios cadastroUsuarioView;
    private ExcluirUsuario excluirUsuarioView;

    private UsuarioHelper cadastroUsuarioHelper;
    //private ExcluirUsuarioHelper excluirUsuarioHelper;

    //Construtores
    public UsuarioService(CadastroUsuarios cadastroUsuarioView) {
        this.cadastroUsuarioView = cadastroUsuarioView;
        this.cadastroUsuarioHelper = new UsuarioHelper(cadastroUsuarioView);
    }

    public UsuarioService(ExcluirUsuario excluirUsuarioView) {
        this.excluirUsuarioView = excluirUsuarioView;
      //  this.excluirUsuarioHelper = new ExcluirUsuarioHelper(excluirUsuarioView);
    }

    //Metodos
    public void cadastrarUsuario() throws ParseException, SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = cadastroUsuarioHelper.obterUsuario();

        dao.save(usuario);
    }

    public void preencheUsuario() throws ClassNotFoundException {
        // Buscar usuario do BD
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> usuarios = dao.getAll();

        // Exibir Usuarios no ComboBox Cliente
       // excluirUsuarioHelper.preencherUsuarios(usuarios);
    }

    public void excluirUsuario() throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
       // Usuario usuario = excluirUsuarioHelper.obterUsuario();

      //  dao.deleteById(usuario);

        // Remove o Item do ComboBox da visão do usuário;
       // excluirUsuarioView.getjComboBoxExcluirUsuario().removeItem(usuario);
    }

}
