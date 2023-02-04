package br.com.barbershop.controller.Helper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import br.com.barbershop.dao.AgendamentoDAO;
import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Agendamento;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
import br.com.barbershop.view.Agenda;

public class AgendaHelper implements IHelper {
	
	private final Agenda view;
	
	public AgendaHelper(Agenda view) {
		this.view = view;
	}

	public void preencherTabela(ArrayList<AgendamentoDTO> agendamentos) {
		
		DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
		tableModel.setNumRows(0);
		
		//Percorrer a lista preenchendo o table model
		
		for (AgendamentoDTO agendamento : agendamentos) {
			
			tableModel.addRow(new Object[] {
				agendamento.getId(),
				agendamento.getCliente(),
				agendamento.getServico(),
				agendamento.getValor(),
				agendamento.getDataFormatada(),
				agendamento.getHoraFormatada(),
				agendamento.getObservacao()				
			});
		}
	}

	public void preencherClientes(ArrayList<Cliente> clientes) {
		
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
		
		for (Cliente cliente : clientes) {
			comboBoxModel.addElement(cliente);
		}
	}

	public void preencherServicos(ArrayList<Service> servicos) {
		
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxServico().getModel();
		
		for (Service service : servicos) {
			
			comboBoxModel.addElement(service);
		}
	}
	
	public Cliente obterCliente() {
		
		//Pegando o item selecionado no JComboBox
		return (Cliente) view.getJComboBoxCliente().getSelectedItem();
	}

	public Service obterServico() {
		
		//Pegando o item selecionado no JComboBox
		return (Service) view.getJComboBoxServico().getSelectedItem();
	}

	public void setarValor(Service valorServico) {
		view.getTextValor().setText(valorServico.getValor() + "");
	}
	

	@Override
	public Object obterAgendamento() {
		
			
		Cliente clienteObj = obterCliente(); //Paulo Ricardo | ID - 2
		Service servicoObj = obterServico();//Corte Simples | ID - 1
		
		Integer id = Integer.parseInt(view.getTextId().getText());
		int idCliente = clienteObj.toId(); //Converto o obj em int
		int idServico = servicoObj.getId(); //Converto o obj em int
		float valor = Float.parseFloat(view.getTextValor().getText());
		//String data = view.getTextFormatedData().getText();
		String data = view.getTxtData().getText();
		String hora = view.getTextFormatedHora().getText();
		String dataHora = data + "" + hora;
		String obs = view.getTextObservacao().getText();
		
		Agendamento agendamento = new Agendamento(id, idCliente, idServico, valor, data, obs);
				
		return agendamento;
	}

	@Override
	public void limparTela() {
		view.getTextId().setText("0");
		view.getTxtData().setText("");
		view.getTextFormatedHora().setText("");
		view.getTextObservacao().setText("");
		
	}
	
}
