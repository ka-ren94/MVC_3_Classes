package com.example.senai.Controller;

import com.example.senai.DataBase.BancoDeClientes;
import com.example.senai.Model.Cliente;

import java.util.List;

public class ClienteController {
    BancoDeClientes cliente = new BancoDeClientes();

public void inserirNoBanco(Cliente c) {
    cliente.insert(c);
}

public List<Cliente> pegarTodosOsClientes() {
    return cliente.findAll();
}

public Boolean atualizaCliente(Cliente c) {
    return cliente.update(c);
}

public Boolean excluirCliente(Integer idCliente) {
    return cliente.delete(idCliente);
}


}//classe
