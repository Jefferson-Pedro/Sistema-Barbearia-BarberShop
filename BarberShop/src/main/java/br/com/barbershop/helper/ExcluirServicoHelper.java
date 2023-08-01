package br.com.barbershop.helper;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import br.com.barbershop.model.Service;
import br.com.barbershop.view.servicos.ExcluirServico;

public class ExcluirServicoHelper {

	private final ExcluirServico view;

	public ExcluirServicoHelper(ExcluirServico view) {
		this.view = view;
	}

	public void preencherServicos(ArrayList<Service> servicos) {

		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxExcluirServico().getModel();

		for (Service servico : servicos) {
			comboBoxModel.addElement(servico);
		}
	}

	public Service obterServico() {
		//Pegando o item selecionado no JComboBox
        return (Service) view.getjComboBoxExcluirServico().getSelectedItem();
	}
}
