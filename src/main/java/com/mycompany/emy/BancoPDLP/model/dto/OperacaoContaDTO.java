package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoContaDTO {

    public OperacaoContaDTO(LocalDateTime dataHora, String observacao, char tpOperacao, double valor) {
        this.dataHora = dataHora;
        this.observacao = observacao;
        this.tpOperacao = tpOperacao;
        this.valor = valor;
    }

    private Long id;
    private LocalDateTime dataHora;
    private String observacao;
    private char tpOperacao;
    private double valor;
}
