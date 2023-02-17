package br.com.barbershop.controller;

import java.text.ParseException;

import javax.swing.JOptionPane;

import br.com.barbershop.controller.Helper.ServicoHelper;
import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.model.Service;
import br.com.barbershop.view.Servicos;

public class ServicoController {
	
	  private final Servicos view;
	  private final ServicoHelper helper;
	  
	public ServicoController(Servicos view) {
		this.view = view;
		this.helper = new ServicoHelper(view);
	}
	
	public void cadastrarServico() {
    	ServiceDAO dao = new ServiceDAO();
    	Service service = helper.obterServico();
    	
        dao.save(service);
    }

}
