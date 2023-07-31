package br.com.barbershop.helper;

import br.com.barbershop.dao.ClienteDAO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.ExcluirCliente;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

public class ExcluirClienteHelper {

    private final ExcluirCliente view;

    public ExcluirClienteHelper(ExcluirCliente view) {
        this.view = view;
    }

    public Cliente obterCliente() throws SQLException {
        try {
            ClienteDAO dao = new ClienteDAO();
            String nome = view.getjTextFieldPesquisa().getText();

            if (!view.getjTextFieldPesquisa().getText().equals("")) {
                DefaultListModel modelo = new DefaultListModel();
            } else {

            }
        } catch (Exception e) {
        }
		return null;

    }

}
