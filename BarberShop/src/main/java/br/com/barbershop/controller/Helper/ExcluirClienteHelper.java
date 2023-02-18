package br.com.barbershop.controller.Helper;

import br.com.barbershop.model.Cliente;
import br.com.barbershop.view.ExcluirCliente;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class ExcluirClienteHelper {
    
    private final ExcluirCliente view;

    public ExcluirClienteHelper(ExcluirCliente view) {
        this.view = view;
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxExcluirCliente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }
    
    public Cliente obterCliente() {
		
        //Pegando o item selecionado no JComboBox
        return (Cliente) view.getjComboBoxExcluirCliente().getSelectedItem();
    }    
}
