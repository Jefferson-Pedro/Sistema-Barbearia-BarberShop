package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Pessoa {
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date dataNasc;
    protected String tel;
    protected String email;
    protected String rg; 

    public Pessoa(int id, String nome, char sexo, String dataNasc, String tel, 
            String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.tel = tel;
        this.email = email;
        this.rg = rg;
        try {
            this.dataNasc = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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
    
    
}
