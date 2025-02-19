package com.example.senai.DataBase;

import com.example.senai.Model.Cliente;
import com.example.senai.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoDeClientes {
    private List<Cliente> clientes;

    public BancoDeClientes() {
        this.clientes = new ArrayList<>();
    }

    //Insere um novo cliente na lista
    public void insert(Cliente c) {
        clientes.add(c);
    }

    //Busca um cliente pelo ID
    public Cliente findOne(int id) {
        for (Cliente c : clientes) {
            if(c.getIdCliente() == id) {
                return c;
            }
        }
        return null; //Se não encontrar o cliente
    }

    //Atualiza o cadastro de um cliente existente na lista
    public Boolean update(Cliente c) {
        for(int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == c.getIdCliente()) {
                clientes.set(i,c);
                return true; //Retorno que indica que a atualização foi feita
            }
        }
        return false; //Se a atualização não deu certo
    }

    // Retorna todos os produtos cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    //Deleta o cadastro dos clientes
    public Boolean delete(int id) {
        return clientes.removeIf(c -> c.getIdCliente() == id);
    }

}
