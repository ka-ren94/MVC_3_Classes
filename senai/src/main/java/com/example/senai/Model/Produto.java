package com.example.senai.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    public int IdProduto;
    public String nome;
    public double preco;
    public Integer quantidade;


    //metodo para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("ID: " + IdProduto);
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}//classe
