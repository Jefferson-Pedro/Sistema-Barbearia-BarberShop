
package Principal;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
     
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario();
        
        List<Usuario> usuarios = dao.getAll();
        System.out.println("Total de usuarios = " + usuarios.size());
        
    }
}
