package br.com.barbershop.controller;

import br.com.barbershop.controller.Helper.ExcluirClienteHelper;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.ExcluirCliente;
import java.util.ArrayList;

public class ExcluirClienteController {
    private final ExcluirCliente view;
    private final ExcluirClienteHelper helper;

    public ExcluirClienteController(ExcluirCliente view) {
        this.view = view;
        this.helper = new ExcluirClienteHelper(view);
    }
    
    public void atualizaCliente() {

		// Buscar cliente do BD
		ClienteDAO dao = new ClienteDAO();
		ArrayList<Cliente> clientes = dao.selectAll();
	
		// Exibir Clientes no ComboBox Cliente
		helper.preencherClientes(clientes);
    }

    public void excluirCliente() {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = helper.obterCliente();
       
        dao.removeClienteById(cliente);
        this.atualizaCliente();
    }

}
