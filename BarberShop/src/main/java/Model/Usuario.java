package Model;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

public class Usuario extends Pessoa {
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String nome, String sexo, String dataNasc, String tel, 
            String email, String rg, String senha, String nivelAcesso) throws ParseException {
        super(id, nome, sexo, dataNasc, tel, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    

	public Usuario() {}


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }   

    @Override
    public String toString() {
        return "Usuario{ " + "id = " + id+ ", nome = " + nome + ", senha= " + senha + " }";
    }
    
    
}
