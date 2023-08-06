package br.com.barbershop.helper;

import br.com.barbershop.dao.ClienteDAO;
import java.text.ParseException;

import javax.swing.JOptionPane;

import br.com.barbershop.model.Cliente;
import br.com.barbershop.service.ClienteService;
import br.com.barbershop.view.cliente.EscolhaCliente;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ClienteHelper {

    
    private final EscolhaCliente view;
    private ClienteService service;

    public ClienteHelper(EscolhaCliente view) {
        this.view = view;
        DefaultTableModel modelo = (DefaultTableModel) view.getjListaCliente().getModel();
        view.getjListaCliente().setRowSorter(new TableRowSorter(modelo));
    }

    //Metodos para lidar com as informações na view
    
    public Cliente obterClienteDaView() throws ParseException {

        String nome = view.getTextNomeCliente().getText();
        String sexo = "";
        String dataNasc = view.getjFormattedTextDataNasc().getText();
        String telefone = view.getTextTelefoneCliente().getText();
        String email = view.getTextEmailCliente().getText();
        String rg = view.getTextRGCliente().getText();
        String endereco = view.getTextEnderecoCliente().getText();
        String cep = view.getTextCepCliente().getText();

        if (view.getjRadioButtonMasculino().isSelected()) {
            sexo = "M";
        } else if (view.getjRadioButtonFeminino().isSelected()) {
            sexo = "F";
        }

        Cliente cliente = null;

        try {
            cliente = new Cliente(0, nome, sexo, dataNasc, telefone, email, rg,
                    endereco, cep);
            this.limparDadosDaView();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente, "
                    + "verifique se todas as informações foram preenchidas devidamente!", "Erro", 0);
            System.err.println("Data não prenchida" + e);
        }
        return cliente;
    }
    
    public int recuperarIdClienteNaView(){
        
        //Pegando ID de um registro da JTable e convertendo para Int
        String id = this.view.getjListaCliente()
        .getValueAt(view.getjListaCliente()
        .getSelectedRow(), 0).toString();
        int idCLiente = Integer.parseInt(id);
        
        return idCLiente;
    }
    
    public void listaClienteNaView(){
        DefaultTableModel modelo = (DefaultTableModel) view.getjListaCliente().getModel();

        modelo.setNumRows(0);
        ClienteDAO dao = new ClienteDAO();
        for (Cliente c : dao.selectAll()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getTel()
            });
        }
    } 
        
    public void excluirClienteDaView(){
        DefaultTableModel modelo = (DefaultTableModel) view.getjListaCliente().getModel();
        modelo.removeRow(view.getjListaCliente().getSelectedRow());
    }

    public void limparDadosDaView() {
        view.getTextNomeCliente().setText("");
        //view.getTextSexoCliente().setText("");
        view.getjFormattedTextDataNasc().setText("");
        view.getTextTelefoneCliente().setText("");
        view.getTextEmailCliente().setText("");
        view.getTextRGCliente().setText("");
        view.getTextEnderecoCliente().setText("");
        view.getTextCepCliente().setText("");
    }

    public void setarClienteNaView() {
        
        Cliente cliente =  new Cliente();
        cliente = service.obterClientePorId();
        
        /*view.getTextNomeCliente().setText(cliente.getNome());
        //view.getjFormattedTextDataNasc().setText(cliente.getDataNasc());
        view.getTextTelefoneCliente().setText(cliente.getTel());
        view.getTextEmailCliente().setText(cliente.getEmail());
        view.getTextRGCliente().setText(cliente.getRg());
        view.getTextEnderecoCliente().setText(cliente.getEndereco());
        view.getTextCepCliente().setText(cliente.getCep());
        
        if(cliente.getSexo() == "M"){
            view.getjRadioButtonMasculino().isSelected();
        }else{
            view.getjRadioButtonFeminino().isSelected();
        }*/
        System.out.println("Cliente Helper: " + cliente.toString());
    }
}
