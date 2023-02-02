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

import br.com.barbershop.model.Cliente;
import br.com.barbershop.util.ConexaoBD;

/**
 *
 * @author jefferson.silva
 */

public class ClienteDAO {
	
	private Connection conexao = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
	 public ArrayList<Cliente> selectAll() {
	    	
    	 String sql = "SELECT * FROM cliente"; 
    	
    	 
         ArrayList<Cliente> lista = new ArrayList<Cliente>();
            
         try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
                      
             rs = ps.executeQuery();
                         
             while(rs.next()){
                Cliente c = new Cliente(); 
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                               
                lista.add(c);
             }

         } catch (SQLException ex) {
             System.err.println("Erro ao recuperar os dados: "+ ex.getMessage());
         }finally {
      	   ConexaoBD.fechaConexao(conexao, ps, rs);
         }
         return lista;
      }
}
