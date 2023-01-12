package br.com.barbershop.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    private Usuario idUsuario;
    private Cliente cliente;
    private Service servico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(Usuario idUsuario, Cliente cliente, Service servico, float valor, String data) {
        this.idUsuario = idUsuario;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Agendamento() {}

	
    public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario i) {
		this.idUsuario = i;
	}

	public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Service getServico() {
        return servico;
    }

    public void setServico(Service servico) {
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
