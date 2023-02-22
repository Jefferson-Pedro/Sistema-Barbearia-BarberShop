package br.com.barbershop.controller;

import javax.swing.JOptionPane;

import br.com.barbershop.view.Agenda;
import br.com.barbershop.view.CadastroCliente;
import br.com.barbershop.view.ExcluirUsuario;
import br.com.barbershop.view.MenuPrincipal;
import br.com.barbershop.view.Servicos;
import br.com.barbershop.view.Usuarios;

public class MenuPrincipalController {
    private final MenuPrincipal view; 

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public void navegarParaCadastroCliente(){
        CadastroCliente cadastro = new CadastroCliente();
        cadastro.setVisible(true);
    }
    public void navegarParaServicos(){
        Servicos servico = new Servicos();
        servico.setVisible(true);
    }
    
    public void navegarParaUsuarios() {
    	Usuarios usuario = new Usuarios();
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
