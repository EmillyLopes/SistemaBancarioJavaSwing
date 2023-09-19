package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContaCorrentePJ extends ContaBancaria {

    public ContaCorrentePJ(String agencia, String conta, String tipo, String nome, double saldo) {
        super(agencia, conta, tipo, nome, saldo);
    }

    @Override
    public void depositar(double valor) {
        // Aplicar acréscimo de 1.5% no depósito para Conta Corrente PJ
        double acrescimo = valor * 0.015;
        saldo += (valor + acrescimo);
    }
}
