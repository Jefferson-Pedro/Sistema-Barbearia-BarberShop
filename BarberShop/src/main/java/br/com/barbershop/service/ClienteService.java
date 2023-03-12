package br.com.barbershop.service;

import java.text.ParseException;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.helper.ClienteHelper;
import br.com.barbershop.helper.ExcluirClienteHelper;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.CadastroCliente;
import br.com.barbershop.view.ExcluirCliente;

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
    
    public void excluirCliente(){}
    
    /*public void mostrarPesquisa() throws SQLException{
        ClienteDAO dao = new ClienteDAO();
        ArrayList<Cliente> c = new ArrayList<Cliente>();
        c = dao.findByName();
    }*/
    
    public void atualizarCliente(){}
    
    
}
