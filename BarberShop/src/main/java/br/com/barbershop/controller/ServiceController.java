package br.com.barbershop.controller;

import br.com.barbershop.view.servicos.CadastroServicos;
import br.com.barbershop.view.servicos.EscolhaService;
import br.com.barbershop.view.servicos.ExcluirServico;

/**
 *
 * @author jefferson.silva
 */
public class ServiceController {
    
    private final EscolhaService view;

    public ServiceController(EscolhaService view) {
        this.view = view;
    }
    
    public void navegarParaExcluirServico(){
        
        ExcluirServico excluir = new ExcluirServico();
        excluir.setVisible(true);
        this.view.dispose();
    }
    
    public void navegarParaAtualizarServico(){
        System.out.println("Clicou!");
        this.view.dispose();
    }
     
    public void navegarParaCadastrarServico(){
        CadastroServicos cadastrar = new CadastroServicos();
        cadastrar.setVisible(true);
        this.view.dispose();
    }
}
