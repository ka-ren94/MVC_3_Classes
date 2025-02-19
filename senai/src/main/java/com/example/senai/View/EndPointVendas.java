package com.example.senai.View;

import com.example.senai.Controller.VendaController;
import com.example.senai.Model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EndPointVendas {
    VendaController vc = new VendaController();

    @GetMapping("/venda")
    public List<Venda> getAllVendas() {
        return vc.pegarTodasAsVendas();
    }

    @PostMapping("/venda")
    public String postNovaVenda(@RequestBody Venda v) {
        vc.inserirNoBanco(v);
        return "Sucesso!";
    }

    @PutMapping("/venda")
    public String putVenda(@RequestBody Venda v) {
        if(vc.atualizaVenda(v)) {
            return "Venda atualizada!";
        }else {
            return "Falha na atualização da venda...";
        }
    }

    @DeleteMapping("/venda")
    public String excluirVenda(@RequestBody Integer idVenda) {
        if(vc.excluirVenda(idVenda)) {
            return "Venda cancelada!";
        }else {
            return "Falha no cancelamento da venda...";
        }
    }

}//classe
