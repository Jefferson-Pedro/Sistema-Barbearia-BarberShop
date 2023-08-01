/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller;

import br.com.barbershop.view.servicos.ExcluirServico;
import br.com.barbershop.view.usuarios.CadastroUsuarios;
import br.com.barbershop.view.usuarios.EscolhaUsuario;
import br.com.barbershop.view.usuarios.ExcluirUsuario;

/**
 *
 * @author jefferson.silva
 */
public class UsuarioController {
    private final EscolhaUsuario view;

    public UsuarioController(EscolhaUsuario view) {
        this.view = view;
    }
    
    public void navegarParaExcluirUsuario(){
        ExcluirUsuario excluir = new ExcluirUsuario();
        excluir.setVisible(true);
        this.view.dispose();
    }
    
    public void navegarParaAtualizarUsuario(){
        System.out.println("Clicou!");
        this.view.dispose();
    }
     
    public void navegarParaCadastrarUsuario(){
        CadastroUsuarios cadastrar = new CadastroUsuarios();
        cadastrar.setVisible(true);
        this.view.dispose();
    }
}
