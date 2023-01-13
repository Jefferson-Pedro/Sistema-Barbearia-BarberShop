package br.com.barbershop.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    private int id;
    private String cliente;
    private String servico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, String cliente, String servico, float valor, String data) {
        this.id = id;
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

	
    public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
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

    public void setServico(String string) {
        this.servico = string;
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
