/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.controller;

import java.util.ArrayList;

import br.com.barbershop.controller.Helper.AgendaHelper;
import br.com.barbershop.dao.AgendamentoDAO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.view.Agenda;

/**
 *
 * @author jefferson.silva
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
		this.helper = new AgendaHelper(view);
    }
    public void atualizaTabela(){
        //Busca lista com os agendamentos do BD
        AgendamentoDAO dao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamento = dao.selectAll();
        
        //Exibe a lista na view
        helper.preencherTabela(agendamento);
    }
    
}
