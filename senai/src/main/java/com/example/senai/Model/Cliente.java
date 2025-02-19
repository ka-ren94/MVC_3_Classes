package com.example.senai.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    public int idCliente;
    public String nome;
    public String cpf;

    //exibir informações do cliente
    public void exibirInfoCliente() {
        System.out.println("ID cliente: " + idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}//classe
