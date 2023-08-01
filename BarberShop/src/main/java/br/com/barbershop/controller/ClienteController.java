package br.com.barbershop.controller;

import br.com.barbershop.view.cliente.CadastroCliente;
import br.com.barbershop.view.cliente.ExcluirCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author jefferson.silva
 */
public class ClienteController {
    
    private final EscolhaCliente view;

    public ClienteController(EscolhaCliente view) {
        this.view = view;
    }
    
    public void navegarParaExcluirCliente(){
        ExcluirCliente excluir = new ExcluirCliente();
        excluir.setVisible(true);
        this.view.dispose();
    }
    
    public void navegarParaAtualizarCliente(){
        System.out.println("Clicou!");
        this.view.dispose();
    }
     
    public void navegarParaCadastrarCliente(){
        CadastroCliente cadastrar = new CadastroCliente();
        cadastrar.setVisible(true);
        this.view.dispose();
    }
    
}
