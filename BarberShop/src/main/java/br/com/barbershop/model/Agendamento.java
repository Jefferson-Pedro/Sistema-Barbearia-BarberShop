package br.com.barbershop.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    private int id;
    private Integer idCliente;
    private Integer idServico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, int idCliente, int idServico, float valor, String data, String obs) {
        this.id = id;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.observacao = obs;
    }

    public Agendamento() {}
      
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdServico() {
        return idServico;
    }

    public void setServico(Integer idServico) {
        this.idServico = idServico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}