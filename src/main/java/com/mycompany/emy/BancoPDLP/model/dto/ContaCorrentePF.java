package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContaCorrentePF extends ContaBancaria {

    public ContaCorrentePF(String agencia, String conta, String tipo, String nome, double saldo) {
        super(agencia, conta, tipo, nome, saldo);
    }

    @Override
    public void sacar(double valor) {
        // Aplicar desconto de 1.25% no saque para Conta Corrente PF
        double desconto = valor * 0.0125;
        saldo -= (valor + desconto);
    }

}
