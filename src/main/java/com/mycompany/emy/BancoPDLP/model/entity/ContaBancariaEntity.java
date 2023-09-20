package com.mycompany.emy.BancoPDLP.model.entity;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "contas_bancarias")
public class ContaBancariaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "conta")
    private String conta;

    @Column(name = "tipoConta")
    private String tipoConta;

    @Column(name = "nome")
    private String nome;

    @Column(name = "saldo")
    private BigDecimal saldo;

}
