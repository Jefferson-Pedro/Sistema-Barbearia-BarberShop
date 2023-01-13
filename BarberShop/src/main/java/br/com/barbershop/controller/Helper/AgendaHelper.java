package br.com.barbershop.controller.Helper;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import br.com.barbershop.model.Agendamento;
import br.com.barbershop.view.Agenda;

public class AgendaHelper {
	
	private final Agenda view;
	
	public AgendaHelper(Agenda view) {
		this.view = view;
	}

	public void preencherTabela(ArrayList<Agendamento> agendamentos) {
		
		DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
		tableModel.setNumRows(0);
		
		//Percorrer a lista preenchendo o table model
		
		for (Agendamento agendamento : agendamentos) {
			
			tableModel.addRow(new Object[] {
				agendamento.getId(),
				agendamento.getCliente(),
				agendamento.getServico(),
				agendamento.getValor(),
				agendamento.getData(),
				agendamento.getData(),
				agendamento.getObservacao()				
			});
		}
	}
	
}
