package br.com.barbershop.model;

import java.text.ParseException;
import java.util.Date;

public class Cliente extends Pessoa{
 
    private String endereco;
    private String cep;
    
    public Cliente(int id, String nome, String sexo, String dataNascimento, 
    		String telefone, String email, String rg, String endereco, String cep) 
    				throws ParseException {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
 
    public Cliente(String nome, String endereco, String cep) {
        super(nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public Cliente() {}
  
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

	@Override
	public String toString() {
		return this.nome;
	}
    
    
    
    
}
