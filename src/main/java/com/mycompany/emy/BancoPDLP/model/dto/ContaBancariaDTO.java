package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ContaBancariaDTO {

    protected Integer id;
    protected String agencia;
    protected String conta;
    protected String tipoConta;
    protected String nome;
    protected double saldo;

    public ContaBancariaDTO(String agencia, String conta, String tipoConta, String nome, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.tipoConta = tipoConta;
        this.nome = nome;
        this.saldo = saldo;
    }

}
