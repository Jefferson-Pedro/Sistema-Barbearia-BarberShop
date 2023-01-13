package br.com.barbershop.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.barbershop.model.Agendamento;

public class AgendamentoDTO {

	private int id;
	private String cliente;
	private String servico;
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
