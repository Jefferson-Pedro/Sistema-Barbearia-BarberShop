package br.com.barbershop.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.mail.EmailException;

import br.com.barbershop.controller.Helper.AgendaHelper;
import br.com.barbershop.dao.AgendamentoDAO;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
import br.com.barbershop.service.Correio;
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
	
	public void atualizaIdCliente() {
		ClienteDAO dao = new ClienteDAO();
		
		//Retorna o que está na View (Nome e ID)
		Cliente cliente = helper.obterCliente();
				
		helper.setarIdCliente(cliente.getId());

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
		Service TipoServico = helper.obterServico(); 
		
		//Retorna o que vem do banco
		Service ValorServico = dao.servicePrice(TipoServico);
				
		helper.setarValor(ValorServico);
	}
	
	public void agendarCliente() throws SQLException, EmailException {
		
		AgendamentoDAO dao = new AgendamentoDAO();
		
		//Buscar Objeto Agendamento da Tela
		Agendamento agendamento = (Agendamento) helper.obterAgendamento();
		
		//Salvar Objeto no BD
		dao.save(agendamento);
		
		//Inserir elemento na tabela
		this.atualizaTabela();
		helper.limparTela();
		
		//Enviar email
		Correio correio = new Correio();
		correio.notificarPorEmail(agendamento);
	}
}
