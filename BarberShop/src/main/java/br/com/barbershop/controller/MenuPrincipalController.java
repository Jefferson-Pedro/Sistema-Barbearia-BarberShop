package br.com.barbershop.controller;

import javax.swing.JOptionPane;

import br.com.barbershop.view.Agenda;
import br.com.barbershop.view.usuarios.ExcluirUsuario;
import br.com.barbershop.view.MenuPrincipal;
import br.com.barbershop.view.cliente.EscolhaCliente;
import br.com.barbershop.view.usuarios.CadastroUsuarios;
import br.com.barbershop.view.servicos.EscolhaService;
import br.com.barbershop.view.usuarios.EscolhaUsuario;


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
        EscolhaCliente cliente = new EscolhaCliente();
        cliente.setVisible(true);
    }
    public void navegarParaServicos(){
        EscolhaService servico = new EscolhaService();
        servico.setVisible(true);
    }
    
    public void navegarParaUsuarios() {
    	EscolhaUsuario usuario = new EscolhaUsuario();
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
