package br.com.barbershop.controller;

import javax.swing.JOptionPane;

import br.com.barbershop.view.Agenda;
import br.com.barbershop.view.usuarios.ExcluirUsuario;
import br.com.barbershop.view.MenuPrincipal;
import br.com.barbershop.view.usuarios.CadastroUsuarios;
import br.com.barbershop.view.servicos.EscolhaService;


public class MenuPrincipalController {
    private final MenuPrincipal view; 

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public void navegarEscolhaCliente(){
        EscolhaCliente escolhaCliente = new EscolhaCliente();
        escolhaCliente.setVisible(true);
    }
    public void navegarParaServicos(){
        EscolhaService servico = new EscolhaService();
        servico.setVisible(true);
    }
    
    public void navegarParaUsuarios() {
    	CadastroUsuarios usuario = new CadastroUsuarios();
    	usuario.setVisible(true);
    }
    
    public void navegarParaExcluirClientes() {
    	ExcluirUsuario eCliente = new ExcluirUsuario();
    	eCliente.setVisible(true);
    }

    public void navegarParaAtualizar() {
	JOptionPane.showMessageDialog(null, "Clicou!");	
    }
    
    public void navegarParaRelatorio() {
	JOptionPane.showMessageDialog(null, "Clicou!");	
    }
    
}
