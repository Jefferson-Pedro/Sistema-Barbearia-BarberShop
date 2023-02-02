package br.com.barbershop.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;

public class AgendamentoDTO {

	private int id;
	private String cliente;
	private String servico;
	private int idCliente;
	private int idServico;
	private float valor;
	private Date data;
	private String observacao;

	public AgendamentoDTO() {

	}

	public void converteDTO(Agendamento agendamento) {
		this.id = agendamento.getId();
		this.cliente = agendamento.getCliente();
		this.servico = agendamento.getServico();
		this.valor = agendamento.getValor();
		this.data = agendamento.getData();
		this.observacao = agendamento.getObservacao();
	}
	
	/*public Object agendamento (int id, Cliente cliente, Service servico, float valor, String data, String observacao) {
		
		this.id = id;
		this.idCliente = cliente.getId();
		this.idServico = servico.getId();
		this.valor = valor;
		this.data = getData();
		this.observacao = observacao;
		return null;
	}*/

	public String getDataFormatada() {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);

	}

	public String getHoraFormatada() {
		return new SimpleDateFormat("HH:mm").format(data);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}