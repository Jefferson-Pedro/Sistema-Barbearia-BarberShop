package br.com.barbershop.controller;

import br.com.barbershop.view.Agenda;
import br.com.barbershop.view.CadastroCliente;
import br.com.barbershop.view.MenuPrincipal;

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
}
