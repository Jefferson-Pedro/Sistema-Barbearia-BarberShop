
package br.com.barbershop;


import java.sql.SQLException;
import java.text.ParseException;


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
    	
    	/*Service s = new Service();
    	ServiceDAO dao = new ServiceDAO();
    	//dao.save(s);
    	//Service ser = dao.selectAll();
    	ArrayList<Service>resposta = dao.selectAll();
    	
    	//System.out.println("Objeto criado: " + s.toString());
    	//System.out.println("Objeto dao: " + ser.getValor());
    	System.out.println(resposta);*/
    }
}
