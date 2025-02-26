package com.senai.mvc.controller;


import com.senai.mvc.banco.BancoDeProdutos;
import com.senai.mvc.model.Produto;

import java.util.List;

public class ProdutoController {

    BancoDeProdutos bp = BancoDeProdutos.getInstancia();

    public List<Produto> getAllProdutos() {
        return bp.findAll();
    }

    public Boolean save(Produto p) {
        bp.insert(p);
        return true;
    }
}
