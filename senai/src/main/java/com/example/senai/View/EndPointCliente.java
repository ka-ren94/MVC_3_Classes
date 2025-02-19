package com.example.senai.View;

import com.example.senai.Controller.ClienteController;
import com.example.senai.Model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EndPointCliente {
    ClienteController cc = new ClienteController();

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes() {
        return cc.pegarTodosOsClientes();
    }

    @PostMapping("/cliente")
    public String postNovoCliente(@RequestBody Cliente c) {
        cc.inserirNoBanco(c);
        return "Sucesso!";
    }

    @PutMapping("/cliente")
    public String putCliente(@RequestBody Cliente c) {
        if(cc.atualizaCliente(c)) {
            return "Cadastro atualizado!";
        }else {
            return "Falha na atualização...";
        }
    }

    @DeleteMapping("/cliente")
    public String excluirCliente(@RequestBody Integer idCliente) {
        if(cc.excluirCliente(idCliente)) {
            return "Cadastro excluído!";
        }else {
            return "Falha na exclusão...";
        }
    }

}//classe
