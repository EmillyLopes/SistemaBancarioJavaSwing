package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ContaBancaria {

    protected String agencia;
    protected String conta;
    protected String tipoConta;
    protected String nome;
    protected double saldo;
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

}
