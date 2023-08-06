package br.com.barbershop.service;

import java.text.ParseException;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.helper.ClienteHelper;
import br.com.barbershop.helper.ExcluirClienteHelper;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.cliente.CadastroCliente;
import br.com.barbershop.view.cliente.ExcluirCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class ClienteService {
    
    private CadastroCliente cadastrarClienteview;
    private ExcluirCliente excluirClienteView;
    
    private ClienteHelper cadastroHelper;
    private ExcluirClienteHelper excluirHelper;

    public ClienteService(CadastroCliente cadastrarClienteview) {
        this.cadastrarClienteview = cadastrarClienteview;
        this.cadastroHelper = new ClienteHelper(cadastrarClienteview);
    }

    public ClienteService(ExcluirCliente excluirClienteView) {
        this.excluirClienteView = excluirClienteView;
        this.excluirHelper = new ExcluirClienteHelper(excluirClienteView);
    }

    public void cadastrarCliente() throws ParseException{
    	ClienteDAO dao = new ClienteDAO();
    	Cliente cliente = cadastroHelper.obterCliente();
    	
        dao.save(cliente);
    }
    
    public void excluirCliente(String cliente){
        ClienteDAO dao = new ClienteDAO();
        dao.removeClienteByName(cliente);
    }
    
    
    public List<String> listaClientes(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> c = dao.selectAll();
        List<String> nomesClientes = new ArrayList<>();

        for (Cliente cliente : c) {
            nomesClientes.add(cliente.getNome());
        }

        return nomesClientes;
    }
    
    public void atualizarCliente(){}
    
    
}
