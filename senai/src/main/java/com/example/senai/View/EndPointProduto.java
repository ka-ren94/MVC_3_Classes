package com.example.senai.View;

import com.example.senai.Controller.ProdutoController;
import com.example.senai.Model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EndPointProduto {

    ProdutoController pc = new ProdutoController();

    @GetMapping("/produto") //lista todos os produtos registrados
    public List<Produto> getAllProdutos() {
        return pc.pegarTodosOsProdutos();
    }

    @PostMapping("/produto")
    public String postNovoProduto(@RequestBody Produto p) {
        pc.inserirNoBanco(p);
        return "Sucesso!";
    }

    @PutMapping("/produto")
    public String putProduto(@RequestBody Produto p) {
        if(pc.atualizaProduto(p)) {
            return "Produto atualizado!";
        }else {
            return "Falha ao atualizar...";
        }
    }

    @DeleteMapping("/produto")
    public String deletarProduto(@RequestBody Integer idProduto) {
        if(pc.excluirProduto(idProduto)) {
            return "Sucesso!";
        }else {
            return "Falha na exclusão...";
        }
    }

}//classe
