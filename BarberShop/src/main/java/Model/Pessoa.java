package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Pessoa {
    protected int id;
    protected String nome;
    protected String sexo;
    protected Date dataNasc;
    protected String tel;
    protected String email;
    protected String rg; 

    public Pessoa(int id, String nome, String sexo, String dataNasc, String tel, 
            String email, String rg) throws ParseException {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.tel = tel;
        this.email = email;
        this.rg = rg;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = formato.parse(dataNasc); 
        this.dataNasc = data;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    

	public Pessoa() {}
    
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

    public void setDataNasc(Date date) {
        this.dataNasc = date;
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

    /*@Override
    public String toString() {
        return "\nid = " + id + ", nome = " + nome + ", sexo = " + sexo +
                ", dataNasc = " + dataNasc + ", tel = " + tel + 
                ", email = " + email + ", rg = " + rg;
    }*/

}
