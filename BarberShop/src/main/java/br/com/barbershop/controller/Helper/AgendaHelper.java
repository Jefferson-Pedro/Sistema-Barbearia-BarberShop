package br.com.barbershop.controller.Helper;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import br.com.barbershop.dto.AgendamentoDTO;
import br.com.barbershop.model.Cliente;
import br.com.barbershop.model.Service;
import br.com.barbershop.view.Agenda;

public class AgendaHelper {
	
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

	public Service obterServico() {
		
		//Pegando o item selecionado no JComboBox
		return (Service) view.getJComboBoxServico().getSelectedItem();
	}

	public void setarValor(Service valorServico) {
		view.getTextValor().setText(valorServico + "");
	}
	
}
