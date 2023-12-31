package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ContaCorrentePFDTO extends ContaBancariaDTO {

    public ContaCorrentePFDTO(String agencia, String conta, String tipoConta, String nome, double saldo) {
        super(agencia, conta, tipoConta, nome, saldo);
    }

}
