package br.com.barbershop.controller;

import br.com.barbershop.view.cliente.EscolhaCliente;

public class ClienteController {
    
    private final EscolhaCliente view;

    public ClienteController(EscolhaCliente view) {
        this.view = view;
    }
       
    public void navegarParaEscolhaCliente(){
        EscolhaCliente cadastrar = new EscolhaCliente();
        cadastrar.setVisible(true);
        this.view.dispose();
    }
    
}
