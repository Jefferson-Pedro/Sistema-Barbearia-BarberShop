/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.barbershop.model.Service;
import br.com.barbershop.util.ConexaoBD;

/**
 *
 * @author jefferson.silva
 */
public class ServiceDAO {
	
	private Connection conexao = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	//Retorna todos os serviços
	public ArrayList<Service> selectAll() {
		
		String sql = "SELECT * FROM service"; 
    	
    	 
         ArrayList<Service> lista = new ArrayList<Service>();
            
         try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
                      
             rs = ps.executeQuery();
                         
             while(rs.next()){
            	 
                Service s = new Service(); 
                
                s.setId(rs.getInt("id"));
                s.setDescricao(rs.getString("descricao"));
               
                lista.add(s);
             }

         } catch (SQLException ex) {
             System.err.println("Erro ao recuperar os dados: "+ ex.getMessage());
         }finally {
      	   ConexaoBD.fechaConexao(conexao, ps, rs);
         }
         return lista;
      }
	
    //Busca valor do serviço pelo nome
    public Service servicePrice(Service service) throws SQLException{
        
        String sql = "SELECT valor FROM service WHERE descricao = ?";
        Service s = new Service();
        
        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
           
           ps.setString(1, service.getDescricao());
           rs = ps.executeQuery();
           
           rs.next();
           s.setValor(rs.getFloat("valor"));
           
           
         } catch (SQLException ex) {
            
            System.err.println("Servico nao encontrado: "+ ex.getMessage());
        } finally{
        	ConexaoBD.fechaConexao(conexao, ps, rs);
        }
		return s;
     }
    
    public void save(Service service) {
		
		 String sql = "INSERT INTO service ("
	                + "descricao,"
	                + "valor) VALUES (?,?)";

	        try {
	        	 conexao = ConexaoBD.conectaBD();
	             ps = conexao.prepareStatement(sql);
		           
		         ps.setString(1, service.getDescricao());
		         ps.setFloat(2, service.getValor());
		                 
		     
		         ps.execute();
		         JOptionPane.showMessageDialog(null, "Serviço salvo com sucesso!");
		         System.out.println("Serviço salvo com sucesso!");

	        } catch (Exception e) {
	     	   JOptionPane.showMessageDialog(null, "Erro ao cadastrar o serviço no BD. Verifique"
	     	   		+ " as informações prenchidas e tente novamente!", "Erro", 0);
	            throw new RuntimeException("Erro ao cadastrar o serviço; " + e.getMessage(), e);
	        } finally {
	            ConexaoBD.fechaConexao(conexao, ps);
	        }
	    }
        
}
