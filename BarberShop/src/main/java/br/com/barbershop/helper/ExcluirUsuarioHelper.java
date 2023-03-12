package br.com.barbershop.helper;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.ExcluirUsuario;

public class ExcluirUsuarioHelper {
    
    private final ExcluirUsuario view;

    public ExcluirUsuarioHelper(ExcluirUsuario view) {
        this.view = view;
    }

    public void preencherUsuarios(ArrayList<Usuario> usuarios) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxExcluirUsuario().getModel();
        
        for (Usuario usuario : usuarios) {
            comboBoxModel.addElement(usuario);
        }
    }
    
    public Usuario obterUsuario() {	
        //Pegando o item selecionado no JComboBox
        return (Usuario) view.getjComboBoxExcluirUsuario().getSelectedItem();
    } 
}
