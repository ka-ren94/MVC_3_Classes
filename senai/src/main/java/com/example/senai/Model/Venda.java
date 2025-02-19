package com.example.senai.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    public int idVenda;
    public ZonedDateTime dataVenda;

    public ArrayList<Produto> produtos;
    public Cliente cliente;

    public void exibirInfoVenda() {
        System.out.println("ID da venda: " + idVenda);
        System.out.println("Data e horário da venda: " + dataVenda);
    }
}//classe
