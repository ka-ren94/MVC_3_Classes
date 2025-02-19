package com.example.senai.Controller;

import com.example.senai.DataBase.BancoDeVendas;
import com.example.senai.Model.Venda;

import java.util.List;

public class VendaController {
    BancoDeVendas bv = new BancoDeVendas();

    //Insere a venda no banco de dados
    public void inserirNoBanco(Venda v) {
        bv.insert(v);
    }

    public List<Venda> pegarTodasAsVendas() {
        return bv.findAll();
    }

    public Boolean atualizaVenda(Venda v) {
        return bv.update(v);
    }

    public Boolean excluirVenda(Integer idVenda) {
        return bv.delete(idVenda);
    }

}//classe
