
package Principal;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ParseException{
    	
    	UsuarioDAO dao = new UsuarioDAO();
    	    	
        /* //Retornar todos os dados
         List<Usuario> usuarios = dao.getAll();
         System.out.println("Total de usuarios = " + usuarios.size());
         System.out.println("Usuario: " + usuarios.toString());*/
         
         //Retornar por ID
         /*Usuario findById = dao.findById(1);
         System.out.println("Usuario: " + findById);*/
    	
    	 //Retorna por nome
    	 /*List<Usuario> usuario = dao.findByName("es");
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
    }
}
