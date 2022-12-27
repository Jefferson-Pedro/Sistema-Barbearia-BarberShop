package Model;

import java.util.Date;

public class Usuario extends Pessoa {
    protected String senha;
    protected String nivelAcesso;

    public Usuario(String senha, int id, String nome) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, 
            char sexo, String dataNasc, String tel, String email, String rg) {
        
        super(id, nome, sexo, dataNasc, tel, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

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
}
