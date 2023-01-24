
package br.com.barbershop;

import br.com.barbershop.controller.AgendaController;
import br.com.barbershop.dao.AgendamentoDAO;
import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.dao.UsuarioDAO;
import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
import br.com.barbershop.model.Usuario;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ParseException{
    	
    	
    	
    	    	
        /* //Retornar todos os dados
         List<Usuario> usuarios = dao.getAll();
         System.out.println("Total de usuarios = " + usuarios.size());
         System.out.println("Usuario: " + usuarios.toString());*/
         
         //Retornar por ID
         /*Usuario findById = dao.findById(1);
         System.out.println("Usuario: " + findById);*/
    	
    	 //Retorna por nome e senha
    	/*UsuarioDAO dao = new UsuarioDAO();
    	Usuario user = new Usuario(3, "Estagiário", "M", "13/08/2015", "0000", 
                "email@exemple.com","00000", "senha", "admin");
    	 Usuario usuario = dao.findByNameAndPassword(user);
    	  System.out.println(usuario.toString());*/
	     
    	//Salva no BD
		 /*UsuarioDAO dao = new UsuarioDAO();
		 Usuario user = new Usuario(3, "Estagiário", "M", "13/08/2015", "0000", 
             "email@exemple.com","00000", "senha", "admin");
 		 System.out.println(user.toString());
         dao.save(user);*/
    	
    	//Atualiza no BD
    	/* UsuarioDAO dao = new UsuarioDAO();
    	 Usuario user = new Usuario(3,"Barbeiro-3", "F", "25/05/1998", "0000", 
                 "email@exemple.com","00000", "senha", "admin");
    	 dao.update(user);*/
    	 
    	 //Deleta por ID
    	/*UsuarioDAO dao = new UsuarioDAO(); 	
   	 	dao.deleteById(1);*/
    	
    	/*AgendamentoDAO dao = new AgendamentoDAO();
    	ArrayList<AgendamentoDTO> agendamento = dao.selectAll();
    	System.out.println(agendamento.toString());*/
    	
    	/*ClienteDAO dao = new ClienteDAO();
    	ArrayList<Cliente>resposta = dao.selectAll();
    	System.out.println("resposta: " + resposta.toString());*/
    	
    	/*Service s = new Service(1,"Corte Simples", 18);
    	ServiceDAO dao = new ServiceDAO();
    	Service ser = dao.servicePrice(s);
    	
    	System.out.println("Objeto criado: " + s.toString());
    	System.out.println("Objeto dao: " + ser.getValor());*/
    }
}
