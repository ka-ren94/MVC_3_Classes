package com.senai.mvc.banco;

import com.senai.mvc.model.Venda;
import java.util.ArrayList;
import java.util.List;

public class BancoDeVendas {

    // A instância única da classe
    private static BancoDeVendas instancia;

    // A lista de vendas
    private List<Venda> vendas;

    // Construtor privado para evitar instâncias externas
    private BancoDeVendas() {
        this.vendas = new ArrayList<>();
    }

    // Método público para obter a instância única
    public static BancoDeVendas getInstancia() {
        if (instancia == null) {
            instancia = new BancoDeVendas();
        }
        return instancia;
    }

    // Insere uma nova venda na lista
    public void insert(Venda v) {
        vendas.add(v);
    }

    // Busca uma venda pelo ID
    public Venda findOne(int id) {
        for (Venda v : vendas) {
            if (v.getIdVenda() == id) {
                return v;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todas as vendas cadastradas
    public List<Venda> findAll() {
        return new ArrayList<>(vendas);
    }

    // Atualiza uma venda existente na lista
    public boolean update(Venda v) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getIdVenda() == v.getIdVenda()) {
                vendas.set(i, v);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se a venda não foi encontrada
    }

    // Remove uma venda pelo ID
    public boolean delete(int id) {
        return vendas.removeIf(v -> v.getIdVenda() == id);
    }
}
