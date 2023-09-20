package com.mycompany.emy.BancoPDLP.model.utils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Constantes {

    //Tipos de conta
    CONTA_PF("Conta Corrente PF"),
    CONTA_PJ("Conta Corrente PJ"),
    CONTA_POUPANCA("Conta Poupança"),
    //Tipos de operacao
    DEPOSITO("D"),
    SAQUE("S"),
    TRANSFERENCIA("T"),
    DEPOSITO_OBSERVACAO("Deposito feito"),
    SAQUE_OBSERVACAO("Saque feito"),
    TRANSFERENCIA_OBSERVACAO("Transferencia feito");

    private final String value;

    public String getValue() {
        return value;
    }

}
