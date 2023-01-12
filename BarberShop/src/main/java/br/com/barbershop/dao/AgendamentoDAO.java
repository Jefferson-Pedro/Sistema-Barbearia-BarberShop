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
import java.util.List;
import java.sql.Date;

import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Usuario;
import br.com.barbershop.util.ConexaoBD;
import br.com.barbershop.view.Agenda;

/**
 *
 * @author jefferson.silva
 */
public class AgendamentoDAO {
	
	 private Connection conexao = null;
	 private PreparedStatement ps = null;
	 private ResultSet rs = null;

    public List<Agenda> selectAll() {
    	
    	 String sql = "SELECT * FROM agendamento";
    	 
         ArrayList<Agendamento> lista = new ArrayList<Agendamento>();
            
         try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
                      
             rs = ps.executeQuery();
                         
             while(rs.next()){
                Agendamento a = new Agendamento(); 
                a.setId(rs.getInt("id"));
                a.setCliente(rs.getInt("cliente"));
                a.setServico(rs.getInt("servico"));
                a.setValor(rs.getFloat("valor"));
                a.setData(rs.getDate("data"));
                a.setObservacao(rs.getString("observacao"));
               
                lista.add(a);
             }
             
             return lista;
             
         } catch (SQLException ex) {
             System.err.println("Erro ao recuperar os dados: "+ ex.getMessage());
         }finally {
      	   ConexaoBD.fechaConexao(conexao, ps, rs);
         }
         return null;
      }
           
    }
    
}
