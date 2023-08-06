package br.com.barbershop.helper;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.cliente.ExcluirCliente;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

public class ExcluirClienteHelper {

    private final ExcluirCliente view;
    private DefaultListModel modelo;

    public ExcluirClienteHelper(ExcluirCliente view) {
        this.view = view;
        modelo = new DefaultListModel();
    }

    public String obterCliente() {
       
        String nome = view.getTxtPesquisa().getText();
        
        return nome;
    }

}
