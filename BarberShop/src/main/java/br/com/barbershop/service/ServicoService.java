package br.com.barbershop.service;

import java.sql.SQLException;
import java.util.ArrayList;


import br.com.barbershop.dao.ServiceDAO;
import br.com.barbershop.helper.ServicoHelper;
import br.com.barbershop.model.Service;
import br.com.barbershop.view.servicos.CadastroServicos;
import br.com.barbershop.view.servicos.ExcluirServico;

public class ServicoService {

    private CadastroServicos cadastroServicosview;
    private ExcluirServico excluirServicosView;

    private ServicoHelper cadastroServicoHelper;
   

    public ServicoService(CadastroServicos view) {
        this.cadastroServicosview = view;
        this.cadastroServicoHelper = new ServicoHelper(cadastroServicosview);
    }

    public ServicoService(ExcluirServico excluirServicosView) {
        this.excluirServicosView = excluirServicosView;
        //this.excluirServicoHelper = new ExcluirServicoHelper(excluirServicosView);
    }

    public void cadastrarServico() {
        ServiceDAO dao = new ServiceDAO();
        Service service = cadastroServicoHelper.obterServico();

        dao.save(service);
    }

    public void preencheServico() {
        //Busca servico no BD
        ServiceDAO dao = new ServiceDAO();
        ArrayList<Service> servicos = dao.selectAll();

        // Exibir Serviços no ComboBox Cliente
        //excluirServicoHelper.preencherServicos(servicos);
    }

    public void excluirServico() throws SQLException {
        ServiceDAO dao = new ServiceDAO();
        //Service servico = excluirServicoHelper.obterServico();

        //dao.deleteById(servico);

        // Remove o Item do ComboBox da visão do usuário;
       //excluirServicosView.getjComboBoxExcluirServico().removeItem(servico);

    }

    public void atualizaServico() {
        System.out.println("Tudo bem, vai em frente!");
    }

}
