package br.com.barbershop.service;

import java.text.ParseException;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.helper.ClienteHelper;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.cliente.EscolhaCliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    
    private EscolhaCliente clienteview;
    private ClienteHelper clienteHelper;
    
    public ClienteService(EscolhaCliente clienteview) {
        this.clienteview = clienteview;
        this.clienteHelper = new ClienteHelper(clienteview);
        
    }
    
    //Metodos para lidar com as informações no BD

    public void cadastrarCliente() throws ParseException{
    	ClienteDAO dao = new ClienteDAO();
    	Cliente cliente = clienteHelper.obterClienteDaView();
    	
        dao.save(cliente);
    }
    
    public void atualizarCliente(){
        Cliente cliente = this.obterClientePorId();
        
        
    }    
    
    public void excluirCliente(int cliente){       
        ClienteDAO dao = new ClienteDAO();
        dao.removeClienteById(cliente);
    }
        
    public List<String> listaTodosClientes(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> c = dao.selectAll();
        List<String> nomesClientes = new ArrayList<>();

        for (Cliente cliente : c) {
            nomesClientes.add(cliente.getNome());
        }
        return nomesClientes;
    }
    
    public Cliente obterClientePorId(){
        ClienteDAO dao = new ClienteDAO();
        int idCliente = this.clienteHelper.recuperarIdClienteNaView();
        Cliente cliente = dao.findById(idCliente);
        
        if(cliente != null){
            System.out.println("Cliente service" + cliente.toString());
          return cliente;
          
        }
        System.out.println("O cliente procurado não existe!");
        return null; 
    }
}
