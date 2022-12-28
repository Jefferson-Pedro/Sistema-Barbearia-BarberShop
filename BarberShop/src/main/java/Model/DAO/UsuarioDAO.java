package Model.DAO;

import Model.Usuario;
import Util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
    
    private Connection conexao = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
  
     //Carrega todos os usuarios do banco de dados
     public List<Usuario> getAll() throws ClassNotFoundException{
         
        String sql = "SELECT * FROM usuario";
           
        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);
                     
            rs = ps.executeQuery();
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while(rs.next()){
               Usuario u = new Usuario(); 
               u.setId(rs.getInt("id"));
               u.setNome(rs.getString("nome"));
               u.setSenha(rs.getString("senha"));
               lista.add(u);
            }
            ps.close();
            return lista;
            
        } catch (SQLException ex) {
            System.err.println("Erro ao recuperar os dados "+ ex.getMessage());
        }
         return null;
     }
}
