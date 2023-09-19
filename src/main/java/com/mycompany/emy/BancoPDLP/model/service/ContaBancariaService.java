package com.mycompany.emy.BancoPDLP.model.service;

import com.mycompany.emy.BancoPDLP.model.dto.ContaBancaria;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePF;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePJ;
import com.mycompany.emy.BancoPDLP.model.dto.ContaPoupanca;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.repository.ContaBancariaRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public ContaBancariaEntity cadastrarContaBancaria(ContaBancaria contaBancaria) {
        ContaBancariaEntity contaEntity = new ContaBancariaEntity();
        contaEntity.setAgencia(contaBancaria.getAgencia());
        contaEntity.setConta(contaBancaria.getConta());
        contaEntity.setNome(contaBancaria.getNome());
        contaEntity.setSaldo(BigDecimal.valueOf(contaBancaria.getSaldo()));
        contaEntity.setTipoConta(contaBancaria.getTipoConta());

        System.out.println("Feito o cadastro com sucesso");

        return contaBancariaRepository.save(contaEntity);
    }

    public ContaBancariaEntity cadastrarContaBancaria(ContaPoupanca contaBancaria) {
        ContaBancariaEntity contaEntity = new ContaBancariaEntity();

        contaEntity.setAgencia(contaBancaria.getAgencia());
        contaEntity.setConta(contaBancaria.getConta());
        contaEntity.setNome(contaBancaria.getNome());
        contaEntity.setSaldo(BigDecimal.valueOf(contaBancaria.getSaldo()));
        contaEntity.setTipoConta(contaBancaria.getTipoConta());
        System.out.println("Feito o cadastro com sucesso");

        return contaBancariaRepository.save(contaEntity);
    }

    public ContaBancariaEntity cadastrarContaBancaria(ContaCorrentePF contaBancaria) {
        ContaBancariaEntity contaEntity = new ContaBancariaEntity();

        contaEntity.setAgencia(contaBancaria.getAgencia());
        contaEntity.setConta(contaBancaria.getConta());
        contaEntity.setNome(contaBancaria.getNome());
        contaEntity.setSaldo(BigDecimal.valueOf(contaBancaria.getSaldo()));
        contaEntity.setTipoConta(contaBancaria.getTipoConta());
        System.out.println("Feito o cadastro com sucesso");

        return contaBancariaRepository.save(contaEntity);
    }

    public ContaBancariaEntity cadastrarContaBancaria(ContaCorrentePJ contaBancaria) {
        ContaBancariaEntity contaEntity = new ContaBancariaEntity();

        contaEntity.setAgencia(contaBancaria.getAgencia());
        contaEntity.setConta(contaBancaria.getConta());
        contaEntity.setNome(contaBancaria.getNome());
        contaEntity.setSaldo(BigDecimal.valueOf(contaBancaria.getSaldo()));
        contaEntity.setTipoConta(contaBancaria.getTipoConta());
        System.out.println("Feito o cadastro com sucesso");

        return contaBancariaRepository.save(contaEntity);
    }

    public List<ContaBancariaEntity> procurarConta(ContaBancariaEntity contaBancaria) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()//vai considerar tanto caixa alta quanto baixa
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);//Qualquer cliente que contenha essa string no nome

        Example<ContaBancariaEntity> example = Example.of(contaBancaria, matcher);//Vai pegar as propriedades que estão populadas e vai criar um example
        return contaBancariaRepository.findAll(example);
    }

}
