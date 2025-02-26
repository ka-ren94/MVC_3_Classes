package com.senai.mvc.banco;

import com.senai.mvc.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class BancoDeClientes {

    // Instância única da classe
    private static BancoDeClientes instancia;

    // Lista de clientes
    private List<Cliente> clientes;

    // Construtor privado para evitar criação de instâncias fora da classe
    private BancoDeClientes() {
        this.clientes = new ArrayList<>();
    }

    // Método público para obter a instância única
    public static BancoDeClientes getInstancia() {
        if (instancia == null) {
            instancia = new BancoDeClientes();
        }
        return instancia;
    }

    // Insere um novo cliente na lista
    public void insert(Cliente c) {
        clientes.add(c);
    }

    // Busca um cliente pelo ID
    public Cliente findOne(int id) {
        for (Cliente c : clientes) {
            if (c.getIdCliente() == id) {
                return c;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os clientes cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    // Atualiza um cliente existente na lista
    public boolean update(Cliente c) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == c.getIdCliente()) {
                clientes.set(i, c);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o cliente não foi encontrado
    }

    // Remove um cliente pelo ID
    public boolean delete(int id) {
        return clientes.removeIf(c -> c.getIdCliente() == id);
    }
}
