package com.mycompany.emy.BancoPDLP.model.dto;

import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoContaDTO {

    private Integer id;
    private ContaBancariaEntity contaBancariaId;
    private LocalDateTime dataHora;
    private String observacao;
    private char tpOperacao;
    private double valor;

}
