package br.com.barbershop.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import br.com.barbershop.dao.AgendamentoDAO;

public class Email {
	
	private String assunto;
	private String emailDestinatario;
	private String emailRemetente;
	private String corpoMsg;
	private String minhaSenha = "COLOQUE SUA SENHA AQUI";
	private SimpleEmail email;

	public Email(String assunto, String emailDestinatario, String emailRemetente, String corpoMsg) {
		
		this.assunto = assunto;
		this.emailDestinatario = emailDestinatario;
		this.emailRemetente = emailRemetente;
		this.corpoMsg = corpoMsg;
		this.email = new SimpleEmail();
	}

	// Configurando o email
	public void enviar() throws EmailException {
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(emailDestinatario, minhaSenha));
		email.setSSLOnConnect(true);

		try {
			email.setFrom(this.emailDestinatario);
			email.setSubject(this.assunto);
			email.setMsg(this.corpoMsg);
			email.addTo(emailDestinatario);
			email.send();
			System.out.println("Email enviado com sucesso!");

		} catch (Exception e) {
			System.err.println("Deu problema na hora de enviar o email: " + e);
		}
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

	public String getEmailRemetente() {
		return emailRemetente;
	}

	public void setEmailRemetente(String emailRemetente) {
		this.emailRemetente = emailRemetente;
	}

	public String getCorpoMsg() {
		return corpoMsg;
	}

	public void setCorpoMsg(String corpoMsg) {
		this.corpoMsg = corpoMsg;
	}
}
