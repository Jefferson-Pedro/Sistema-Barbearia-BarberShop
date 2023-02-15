/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.controller;

import java.text.ParseException;
import br.com.barbershop.controller.Helper.ClienteHelper;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.CadastroCliente;

public class ClienteController {
    
    private final CadastroCliente view;
    private final ClienteHelper helper;

    public ClienteController(CadastroCliente view) {
        this.view = view;
        this.helper = new ClienteHelper(view);
    }
    
    public void cadastrarCliente() throws ParseException{
    	ClienteDAO dao = new ClienteDAO();
    	Cliente cliente = helper.obterCliente();
    	
        dao.save(cliente);
    }
}
