/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbershop.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setSexo(rs.getString("sexo"));
                c.setDataNasc(rs.getDate("dataNasc"));
                c.setTel(rs.getString("tel"));
                c.setEmail(rs.getString("email"));
                c.setRg(rs.getString("rg"));
                c.setEndereco(rs.getString("endereco"));
                c.setCep(rs.getString("cep"));

                lista.add(c);
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao recuperar os dados: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar lista", "Erro", 0);
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return lista;
    }

    public Cliente findById(int cliente) {

        String sql = "SELECT * FROM cliente WHERE id = ?";
        Cliente c = new Cliente();

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, cliente);
            rs = ps.executeQuery();
            
             if (rs.next()) {
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setSexo(rs.getString("sexo"));
                c.setDataNasc(rs.getDate("dataNasc"));
                c.setTel(rs.getString("tel"));
                c.setEmail(rs.getString("email"));
                c.setRg(rs.getString("rg"));
                c.setEndereco(rs.getString("endereco"));
                c.setCep(rs.getString("cep"));
             }

        } catch (SQLException ex) {

            System.err.println("Cliente nao encontradono BD: " + ex.getMessage());
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return c;
    }
    
    public ArrayList<Cliente> findByName(String cliente) throws SQLException {

        String sql = "SELECT * FROM cliente WHERE nome LIKE ? ORDER BY nome";
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);
            
           //int v = 0;
            
            ps.setString(1, cliente + "%");
            rs = ps.executeQuery();
            
            while (rs.next()) {
             Cliente c = new Cliente();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));

                lista.add(c);
            }
            return lista;

        } catch (SQLException ex) {

            System.err.println("Clientes nao encontrados: " + ex.getMessage());
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return null;
    }

    public void save(Cliente cliente) throws ParseException {

        String sql = "INSERT INTO cliente ("
                + "nome,"
                + "sexo, "
                + "dataNasc,"
                + "tel,"
                + "email,"
                + "rg,"
                + "endereco,"
                + "cep) VALUES (?,?,?,?,?,?,?,?)";

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSexo());
            ps.setDate(3, new Date(cliente.getDataNasc().getTime()));
            ps.setString(4, cliente.getTel());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getRg());
            ps.setString(7, cliente.getEndereco());
            ps.setString(8, cliente.getCep());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            System.out.println("Cliente salvo com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente no BD. Verifique"
                    + " as informações prenchidas e tente novamente!", "Erro", 0);
            throw new RuntimeException("Erro ao cadastrar o cliente; " + e.getMessage(), e);
        } finally {
            ConexaoBD.fechaConexao(conexao, ps);
        }
    }
    
    public void update(Cliente cliente) throws ParseException {

        String sql = "UPDATE cliente SET ("
                + "nome,"
                + "sexo, "
                + "dataNasc,"
                + "tel,"
                + "email,"
                + "rg,"
                + "endereco,"
                + "cep) VALUES (?,?,?,?,?,?,?,?) WHERE id = ?";

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSexo());
            ps.setDate(3, new Date(cliente.getDataNasc().getTime()));
            ps.setString(4, cliente.getTel());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getRg());
            ps.setString(7, cliente.getEndereco());
            ps.setString(8, cliente.getCep());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            System.out.println("Cliente atualizado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente no BD. Verifique"
                    + " as informações prenchidas e tente novamente!", "Erro", 0);
            throw new RuntimeException("Erro ao atualizar o cliente; " + e.getMessage(), e);
        } finally {
            ConexaoBD.fechaConexao(conexao, ps);
        }
    }

    public boolean removeClienteById(int cliente) {

        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
            
           ps.setInt(1, cliente);
           ps.execute();
           
           JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Sucesso",1);
           return true;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente no BD. Verifique"
                    + " se o cliente existe no Banco de Dados", "Erro", 0);
            throw new RuntimeException("Erro ao cadastrar o cliente; " + e.getMessage(), e);
            
        } finally {
           ConexaoBD.fechaConexao(conexao, ps);
        }
        
    }
    
    public boolean removeClienteByName(String cliente) {

        String sql = "DELETE FROM cliente WHERE nome = ?";

        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
            
           ps.setString(1, cliente);
           ps.execute();
           
           JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Sucesso",1);
           return true;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente no BD. Verifique"
                    + " se o cliente existe no Banco de Dados", "Erro", 0);
            throw new RuntimeException("Erro ao cadastrar o cliente; " + e.getMessage(), e);
            
        } finally {
           ConexaoBD.fechaConexao(conexao, ps);
        }
        
    }
}
