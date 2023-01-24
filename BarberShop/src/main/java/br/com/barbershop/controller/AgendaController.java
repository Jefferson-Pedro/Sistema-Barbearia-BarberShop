/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.barbershop.controller.Helper.AgendaHelper;
import br.com.barbershop.dao.AgendamentoDAO;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
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

	public void atualizaTabela() {
		// Busca lista com os agendamentos do BD
		AgendamentoDAO dao = new AgendamentoDAO();
		ArrayList<AgendamentoDTO> agendamento = dao.selectAll();

		// Exibe a lista na view
		helper.preencherTabela(agendamento);
	}

	public void atualizaCliente() {

		// Buscar cliente do BD
		ClienteDAO dao = new ClienteDAO();
		ArrayList<Cliente> clientes = dao.selectAll();

		// Exibir Clientes no ComboBox Cliente
		helper.preencherClientes(clientes);
	}

	public void atualizaServico() {

		// Buscar servico do BD
		ServiceDAO dao = new ServiceDAO();
		ArrayList<Service> servicos = dao.selectAll();

		// Exibir Clientes no ComboBox Cliente
		helper.preencherServicos(servicos);
	}

	public void atualizaValor() throws SQLException {
		
		ServiceDAO dao = new ServiceDAO();
		
		//Retorna o que está na View
		Service TipoServico = helper.obterServico(); //Corte Simples
		
		//Retorna o que vem do banco
		Service ValorServico = dao.servicePrice(TipoServico);
				
		helper.setarValor(ValorServico);
	}
}
