package com.mycompany.emy.BancoPDLP.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoContaDTO {

    private Long id;
    private LocalDateTime dataHora;
    private String observacao;
    private char tpOperacao;
    private double valor;
}
