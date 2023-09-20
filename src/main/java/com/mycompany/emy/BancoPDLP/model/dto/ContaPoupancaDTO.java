package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ContaPoupancaDTO extends ContaBancariaDTO {

    public ContaPoupancaDTO(String agencia, String conta, String tipoConta, String nome, double saldo) {
        super(agencia, conta, tipoConta, nome, saldo);
    }

    public void calcularJuros(double taxaDeJurosMensal) {
        double juros = saldo * (taxaDeJurosMensal / 100.0);
        saldo += juros;
    }

}
