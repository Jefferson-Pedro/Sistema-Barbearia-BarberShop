/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller;

import br.com.barbershop.view.EscolhaServico;
import br.com.barbershop.view.ExcluirCliente;

/**
 *
 * @author jefferson.silva
 */
public class ClienteController {
    
    private final EscolhaServico view;

    public ClienteController(EscolhaServico view) {
        this.view = view;
    }
    
    public void navegarParaExcluirCliente(){
        ExcluirCliente excluir = new ExcluirCliente();
        excluir.setVisible(true);
        this.view.dispose();
    }
    
}
