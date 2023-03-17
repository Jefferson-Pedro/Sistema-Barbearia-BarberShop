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
                c.setEmail(rs.getNString("email"));

                lista.add(c);
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao recuperar os dados: " + ex.getMessage());
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return lista;
    }

    public Cliente findById(Cliente cliente) {

        String sql = "SELECT nome FROM cliente WHERE id = ?";
        Cliente c = new Cliente();

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();

            rs.next();
            c.setId(rs.getInt("id"));

        } catch (SQLException ex) {

            System.err.println("Cliente nao encontrado: " + ex.getMessage());
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return c;
    }
    
     public ArrayList<Cliente> findByName(String nome) throws SQLException {

        String sql = "SELECT * FROM cliente WHERE nome LIKE '?%'";
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        try {
            conexao = ConexaoBD.conectaBD();
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, nome);
            rs = ps.executeQuery();
            
            while (rs.next()) {
             Cliente c = new Cliente();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setRg(rs.getString("rg"));

                lista.add(c);
            }

        } catch (SQLException ex) {

            System.err.println("Clientes nao encontrados: " + ex.getMessage());
        } finally {
            ConexaoBD.fechaConexao(conexao, ps, rs);
        }
        return lista;
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

    public void removeClienteById(Cliente cliente) {

        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
           conexao = ConexaoBD.conectaBD();
           ps = conexao.prepareStatement(sql);
            
           ps.setInt(1, cliente.getId());
           ps.execute();
           
           JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Sucesso",1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente no BD. Verifique"
                    + " se o cliente existe no Banco de Dados", "Erro", 0);
            throw new RuntimeException("Erro ao cadastrar o cliente; " + e.getMessage(), e);

        } finally {
           ConexaoBD.fechaConexao(conexao, ps);
        }
    }
}
