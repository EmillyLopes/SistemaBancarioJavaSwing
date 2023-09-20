/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emy.BancoPDLP.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author emtra
 */
@Entity
@Table(name = "operacao_conta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoContaEntity implements Serializable {

    private static final long serialVersionUID = -651313521057313717L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne // Muitas operações para uma conta bancária
    @JoinColumn(name = "contaBancariaId") // Nome da coluna que armazena a relação
    private ContaBancariaEntity contaBancaria; // Campo de relacionamento

    @Column(name = "dataHora")
    private LocalDateTime dataHora;

    @Column(name = "observacao")//Descrição da operação
    private String observacao;

    @Column(name = "tpOperacao")// Por exemplo, 'D' para depósito
    private char tpOperacao;

    @Column(name = "valor")
    private double valor;

}
