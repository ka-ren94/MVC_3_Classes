package com.example.senai.DataBase;

import com.example.senai.Model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoDeVendas {
    private List<Venda> vendas;

    public BancoDeVendas() {
        this.vendas = new ArrayList<>();
    }

    //Insere uma venda na lista
    public void insert(Venda v) {
        vendas.add(v);
    }

    //Busca uma venda pelo ID
    public Venda findOne(int id) {
        for (Venda v : vendas) {
            if(v.getIdVenda() == id) {
                return  v;
            }
        }
        return null; //Se não encontrar a venda
    }

    public Boolean update(Venda v) {
        for(int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getIdVenda() == v.getIdVenda()) {
                vendas.set(i,v);
                return true; //Retorno que indica que a atualização foi feita
            }
        }
        return false; //Se a atualização não deu certo
    }

    //Retorna todas a vendas cadastradas
    public List<Venda> findAll() {
        return new ArrayList<>(vendas);
    }

    //Deleta o cadastro dos clientes
    public Boolean delete(int id) {
        return vendas.removeIf(c -> c.getIdVenda() == id);
    }

}//classe
