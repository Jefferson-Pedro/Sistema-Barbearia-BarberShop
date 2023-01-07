package Model.DAO;

import Model.Usuario;
import Util.ConexaoBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    private Connection conexao = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    //private Usuario usuario;
    
    
    //Carrega todos os usuarios do banco de dados
    public List<Usuario> getAll() throws ClassNotFoundException{
        
       String sql = "SELECT * FROM usuario";
       ArrayList<Usuario> lista = null;
          
       try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
                    
           rs = ps.executeQuery();
           
           lista = new ArrayList<Usuario>();
           
           while(rs.next()){
              Usuario u = new Usuario(); 
              u.setId(rs.getInt("id"));
              u.setNome(rs.getString("nome"));
              u.setSexo(rs.getString("sexo"));
              u.setDataNasc(rs.getDate("dataNasc"));
              u.setTel(rs.getString("tel"));
              u.setEmail(rs.getString("email"));
              u.setRg(rs.getString("rg"));
              u.setSenha(rs.getString("senha"));
              u.setNivelAcesso(rs.getString("nivelAcesso"));
              lista.add(u);
           }
           
           ps.close();
           return lista;
       } catch (SQLException ex) {
           System.err.println("Erro ao recuperar os dados: "+ ex.getMessage());
       }
       return null;
    }
    
    //Busca usuario por ID
    public Usuario findById(int idUsuario) throws SQLException{
        
        String sql = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuario = new Usuario();
        
        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);

           ps.setInt(1, idUsuario); //muda a 1a interrogacao pelo numero escolhido
           rs = ps.executeQuery(); //Executa o comando sql
         
           rs.next();//Posiciona o ResultSet na primeira posicao
           usuario.setId(idUsuario);
           usuario.setNome(rs.getString("nome"));
           usuario.setNivelAcesso(rs.getString("nivelAcesso"));
           
           return usuario;
  
        } catch (SQLException ex) {
            ps.close();
            System.err.println("Usuário não encontrado: "+ ex.getMessage());
        } finally{
             ps.close();
        }
       return null;
     }
    
    //Busca usuario por ID
    public ArrayList<Usuario> findByName(String nome) throws SQLException{
        
        String sql = "SELECT * FROM usuario WHERE nome like ?";
        ArrayList<Usuario> usuario = null;
        
        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);

           ps.setString(1,"%"+ nome + "%"); //muda a 1a interrogacao pelo numero escolhido
           rs = ps.executeQuery(); //Executa o comando sql
           
           usuario = new ArrayList<Usuario>();
           
           while(rs.next()) {
        	   Usuario u = new Usuario(); 
	           u.setNome(rs.getString("nome"));
	           u.setNivelAcesso(rs.getString("nivelAcesso"));
	           usuario.add(u);
           }
           return usuario;
  
        } catch (SQLException ex) {
            ps.close();
            System.err.println("Usuário não encontrado: "+ ex.getMessage());
        } finally{
             ps.close();
        }
       return null;
     }
    
    
     //Salva a tarefa
     public Usuario save(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO usuario ("
                + "id," 
                + "nome,"
                + "sexo,"
                + "dataNasc,"
                + "tel,"
                + "email,"
                + "rg,"
                + "senha,"
                + "nivelAcesso) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);
            
            ps.setInt(1,usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getSexo());
            ps.setDate(4, new Date(usuario.getDataNasc().getTime()));
            ps.setString(5, usuario.getTel());
            ps.setString(6, usuario.getEmail());
            ps.setString(7, usuario.getRg());
            ps.setString(8, usuario.getSenha());
            ps.setString(9, usuario.getNivelAcesso());
            
            ps.execute();
            System.out.println("Usuario salvo com sucesso!");
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o usuário; " + e.getMessage(), e);
        } finally {
            ps.close();
        }
        return usuario;
    }
    
    public void update(Usuario usuario) throws SQLException {
    	
    	 String sql = "UPDATE usuario SET "
    			  + "nome = ?,"
                  + "sexo = ?,"
                  + "dataNasc = ?,"
                  + "tel = ?,"
                  + "email = ?,"
                  + "rg = ?,"
                  + "senha = ?,"
                  + "nivelAcesso = ?"
                  + "WHERE usuario.id = ?"; 
    	 
    	 try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
             
             ps.setString(1, usuario.getNome());
             ps.setString(2, usuario.getSexo());
             ps.setDate(3, new Date(usuario.getDataNasc().getTime()));
             ps.setString(4, usuario.getTel());
             ps.setString(5, usuario.getEmail());
             ps.setString(6, usuario.getRg());
             ps.setString(7, usuario.getSenha());
             ps.setString(8, usuario.getNivelAcesso());
             ps.setInt(9, usuario.getId());
             
             ps.execute();
             System.out.println("Usuario atualizado com sucesso!");
             
         } catch (Exception e) {
             throw new RuntimeException("Erro ao atualizar os dados do usuário; " + e.getMessage(), e);
         } finally {
             ps.close();
         }
    }
    
    public void deleteById(int idUsuario) throws SQLException {
    		
    	 String sql = "DELETE FROM usuario WHERE id = ?";
    	 
    	 try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
             
             ps.setInt(1, idUsuario);
             
             ps.execute();
             System.out.println("Usuario deletado com sucesso!");
             
         } catch (Exception e) {
             throw new RuntimeException("Erro ao deletar o usuário; " + e.getMessage(), e);
         } finally {
             ps.close();
         }
    }
     
}
