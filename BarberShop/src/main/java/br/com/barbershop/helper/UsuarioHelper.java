package br.com.barbershop.helper;

import br.com.barbershop.model.Usuario;
import br.com.barbershop.view.usuarios.CadastroUsuarios;
import java.text.ParseException;
import javax.swing.JOptionPane;
    
public class UsuarioHelper {
    
    private final CadastroUsuarios view;

    public UsuarioHelper(CadastroUsuarios view) {
        this.view = view;
    }

    public Usuario obterUsuario() throws ParseException {
        String nome = view.getTxtNomeUsuario().getText();
    	String sexo = "";
    	String dataNasc = view.getTxtDataNascUsuario().getText();
    	String telefone = view.getTxtTelefoneUsuario().getText();
    	String email = view.getTxtEmailUsuario().getText();
    	String rg = view.getTxtRgUsuario().getText();
    	String senha = view.getTxtSenhaUsuario().getText();
    	String nvAcesso = (String) view.getjComboBoxNvAcesso().getSelectedItem();
        
        if (view.getjRadioButtonMasculino().isSelected()) {
            sexo = "M";
        }else if(view.getjRadioButtonFeminino().isSelected()){
            sexo = "F";
        }
        
        Usuario usuario = null;
        
        try {
            usuario = new Usuario(0, nome, sexo, dataNasc, telefone, email, rg, senha, nvAcesso);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário, "
			+ "verifique se todas as informações foram preenchidas devidamente!", "Erro", 0);
			System.err.println("Data não prenchida" + e);
        }
        return usuario;
    }
}
