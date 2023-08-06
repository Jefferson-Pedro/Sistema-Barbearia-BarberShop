/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.dto;

import br.com.barbershop.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author jefferson.silva
 */
public class ClienteDTO extends DefaultListModel<String> {
     private List<Cliente> clientes;

    public ClienteDTO() {
        clientes = new ArrayList<>();
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
        fireContentsChanged(this, 0, clientes.size() - 1);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public int getSize() {
        return clientes.size();
    }

    @Override
    public String getElementAt(int index) {
        return clientes.get(index).getNome();
    }
}

