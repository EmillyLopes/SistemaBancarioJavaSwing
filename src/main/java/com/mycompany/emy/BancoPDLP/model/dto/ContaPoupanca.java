package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta,String tipo, String nome, double saldo) {
        super(agencia, conta, tipo, nome, saldo);
    }

    public void calcularJuros(double taxaDeJurosMensal) {
        double juros = saldo * (taxaDeJurosMensal / 100.0);
        saldo += juros;
    }

}
