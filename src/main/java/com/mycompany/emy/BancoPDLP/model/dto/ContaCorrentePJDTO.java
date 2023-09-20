package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ContaCorrentePJDTO extends ContaBancariaDTO {

    public ContaCorrentePJDTO(String agencia, String conta, String tipoConta, String nome, double saldo) {
        super(agencia, conta, tipoConta, nome, saldo);
    }

    @Override
    public void depositar(double valor) {
        // Aplicar acréscimo de 1.5% no depósito para Conta Corrente PJ
        double acrescimo = valor * 0.015;
        saldo += (valor + acrescimo);
    }
}
