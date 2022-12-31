
package Principal;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import java.sql.SQLException;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws SQLException, ParseException{

        /* //Retornar todos os dados
         List<Usuario> usuarios = dao.getAll();
         System.out.println("Total de usuarios = " + usuarios.size());
         System.out.println("Usuario: " + usuarios.toString());
         
         //Retornar por ID
         Usuario findById = dao.findById(1);
         System.out.println("Usuario: " + findById);
	     
    	//Salva no BD
		 UsuarioDAO dao = new UsuarioDAO();
		 Usuario user = new Usuario(3, "Barbeiro-2", "M", "25/05/1993", "0000", 
             "email@exemple.com","00000", "senha", "admin");
 		 System.out.println(user.toString());
         dao.save(user);*/
    	
    	//Atualiza no BD
    	/* UsuarioDAO dao = new UsuarioDAO();
    	 Usuario user = new Usuario(3,"Barbeiro-3", "F", "25/05/1998", "0000", 
                 "email@exemple.com","00000", "senha", "admin");
    	 dao.update(user);*/
    	 
    	 //Deleta por ID
    	UsuarioDAO dao = new UsuarioDAO();
   	 	   	 	
   	 	dao.deleteById(3);
    }
}
