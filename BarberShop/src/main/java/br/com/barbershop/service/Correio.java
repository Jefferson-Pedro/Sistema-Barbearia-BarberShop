package br.com.barbershop.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;

public class Correio {
	
	private String emailFormatado;
	private String destinatario;
	private String remetente = "jeffersonpedro05@gmail.com";
	
	
	public void notificarPorEmail(Agendamento agendamento) {
		
		this.converteObjetos(agendamento);
		
		//uso da classe email
		Email novoEmail = new Email("Agendamento BarberShop", destinatario, destinatario, emailFormatado);
		novoEmail.enviar();
	}
	
	public String criarEmail(String nomeCLiente, String nomeSErvico, Agendamento agendamento) {
		String nomeCliente = nomeCLiente;
		String nomeServico = nomeSErvico;
		Date dataAgendamento = (Date) agendamento.getData();
		float valor = agendamento.getValor();
		
		return "Olá " + nomeCliente + ", na paz? Informamos que seu agendamento "
				+ "para " + nomeServico + "está marcaado para o dia " + dataAgendamento
				+ " no valor de " + valor + " te aguardamos lá, ein! Abraços!";
	}
	
	public String converteObjetos(Agendamento agendamento) {
		
		String nomeCliente = "";
		String nomeServico = "";
		ClienteDAO dao = new ClienteDAO();
		ServiceDAO sDao = new ServiceDAO();
		
		List<Cliente> listaClientes =  dao.selectAll();
		for (Cliente cliente : listaClientes) {
			cliente.getId();
			cliente.getNome();
			cliente.getEmail();
			
			if(agendamento.getIdCliente().equals(cliente.getId())) {
				nomeCliente = cliente.getNome();
				this.destinatario = cliente.getEmail();
			}
		}
		
		List<Service> listaServico = sDao.selectAll();
		for (Service service : listaServico) {
			service.getId();
			service.getDescricao();
			
			if(agendamento.getIdServico().equals(service.getId())){
				nomeServico = service.getDescricao();
			}
		}
		return this.emailFormatado = criarEmail(nomeCliente, nomeServico, agendamento);
	}
	

}
