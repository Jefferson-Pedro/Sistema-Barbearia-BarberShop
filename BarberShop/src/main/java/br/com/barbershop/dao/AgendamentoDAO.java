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

import javax.swing.JOptionPane;

import java.sql.Date;

import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
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

	 
    public ArrayList<AgendamentoDTO> selectAll() {
    	
    	 String sql = //"SELECT * FROM agendamento"; 
    	 "SELECT agendamento.id, cliente.nome, service.descricao, service.valor, agendamento.data, agendamento.observacao "
    	 + "FROM agendamento "
    	 + "INNER JOIN cliente ON cliente.id=agendamento.cliente "
    	 + "INNER JOIN service ON service.id=agendamento.servico";
    	 
         ArrayList<AgendamentoDTO> lista = new ArrayList<AgendamentoDTO>();
            
         try {
             conexao = ConexaoBD.conectaBD();
             ps = conexao.prepareStatement(sql);
                      
             rs = ps.executeQuery();
                         
             while(rs.next()){
                AgendamentoDTO a = new AgendamentoDTO(); 
                a.setId(rs.getInt("id"));
                a.setCliente(rs.getString("nome"));;
                a.setServico(rs.getString("descricao"));
                a.setValor(rs.getFloat("valor"));
                a.setData(rs.getDate("data"));
                a.setObservacao(rs.getString("observacao"));
               
                lista.add(a);

             }

         } catch (SQLException ex) {
             System.err.println("Erro ao recuperar os dados: "+ ex.getMessage());
         }finally {
      	   ConexaoBD.fechaConexao(conexao, ps, rs);
         }
         return lista;
      }
    	
  //Salva o agendamento
    public void save(Agendamento agendamento) throws SQLException {

       String sql = "INSERT INTO agendamento ("
               + "cliente,"
               + "servico,"
               + "valor,"
               + "data,"
               + "observacao) VALUES (?,?,?,?,?)";

       try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
           
           ps.setInt(1, agendamento.getCliente());
           ps.setInt(2, agendamento.getServico());
           ps.setFloat(3, agendamento.getValor());
           ps.setDate(4, new Date(agendamento.getData().getTime()));
           ps.setString(5, agendamento.getObservacao());
           
           ps.execute();
           JOptionPane.showMessageDialog(null, "Agendamento salvo com sucesso!");
           System.out.println("Agendamento salvo com sucesso!");
           
       } catch (Exception e) {
    	   JOptionPane.showMessageDialog(null, "\"Erro ao agendar cliente");
           throw new RuntimeException("Erro ao agendar; " + e.getMessage(), e);
       } finally {
           ConexaoBD.fechaConexao(conexao, ps);
       }
       
   }
   
   /*public void update(Usuario usuario) throws SQLException {
   	
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
            ConexaoBD.fechaConexao(conexao, ps);
        }
   }*/
   
}
