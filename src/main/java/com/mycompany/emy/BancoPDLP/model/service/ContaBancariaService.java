package com.mycompany.emy.BancoPDLP.model.service;

import com.mycompany.emy.BancoPDLP.controller.mapper.ContaBancariaMapper;
import com.mycompany.emy.BancoPDLP.model.dto.ContaBancariaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.exception.ContaBancariaNotFoundException;
import com.mycompany.emy.BancoPDLP.model.exception.SaldoInsuficienteException;
import com.mycompany.emy.BancoPDLP.model.exception.TransferenciaException;
import com.mycompany.emy.BancoPDLP.model.exception.ValorInvalidoException;
import com.mycompany.emy.BancoPDLP.model.repository.ContaBancariaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ContaBancariaService {
    private static final Logger logger = LoggerFactory.getLogger(ContaBancariaService.class);

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    @Autowired
    private OperacaoContaService operacaoContaService;

    @Autowired
    private ContaBancariaMapper contaBancariaMapper;

    @Transactional
    public ContaBancariaEntity cadastrarContaBancaria(ContaBancariaDTO contaBancariaDTO) {
        logger.info("ContaBancariaService - cadastrarContaBancaria: Fazendo o cadastro da conta: - {}", contaBancariaDTO);
        ContaBancariaEntity contaEntity = contaBancariaMapper.convertContaBancariaDtoTOEntity(contaBancariaDTO);
        contaBancariaRepository.save(contaEntity);
        logger.info("ContaBancariaService - cadastrarContaBancaria: Conta cadastrada com sucesso: - {}", contaEntity);

        return contaEntity;
    }

    public List<ContaBancariaEntity> procurarConta(ContaBancariaEntity contaBancaria) {
        logger.info("ContaBancariaService - procurarConta: Procurando conta: - {}",contaBancaria);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()//vai considerar tanto caixa alta quanto baixa
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);//Qualquer cliente que contenha essa string no nome
        Example<ContaBancariaEntity> example = Example.of(contaBancaria, matcher);//Vai pegar as propriedades que estão populadas e vai criar um example
        return contaBancariaRepository.findAll(example);
    }

    public ContaBancariaEntity consultarConta(String agencia, String numeroConta) throws Exception {
        logger.info("ContaBancariaService - consultarConta: Procurando conta: Agencia: - {}, Conta: - {}", agencia, numeroConta);
        ContaBancariaEntity contaEntity = contaBancariaRepository.findByAgenciaAndConta(agencia, numeroConta)
                .orElseThrow(() -> new ContaBancariaNotFoundException("Conta bancária não encontrada"));

        logger.info("ContaBancariaService - consultarConta: Conta achada: - {}", contaEntity);
        if (contaEntity == null) {
            throw new Exception("ERRO_CONTA_INVALIDA");
        }
        return contaEntity;
    }

    public ContaBancariaDTO consultarContaDTO(String agencia, String numeroConta) throws Exception {
        logger.info("ContaBancariaService - consultarContaDTO: Procurando conta: Agencia: - {}, Conta: - {}", agencia, numeroConta);
        ContaBancariaEntity contaEntity = contaBancariaRepository.findByAgenciaAndConta(agencia, numeroConta)
                .orElseThrow(() -> new ContaBancariaNotFoundException("Conta bancária não encontrada"));

        ContaBancariaDTO contaBancariaDTO = contaBancariaMapper.convertContaBancariaEntityTODto(contaEntity);
        logger.info("ContaBancariaService - consultarContaDTO: Conta achada: - {}", contaEntity);
        if (contaEntity == null) {
            throw new Exception("ERRO_CONTA_INVALIDA");
        }
        return contaBancariaDTO;
    }
    public BigDecimal consultarSaldo(String agencia, String numeroConta) throws ContaBancariaNotFoundException {
        logger.info("ContaBancariaService - consultarSaldo: Procurando saldo: Agencia: - {}, Conta: - {}", agencia, numeroConta);
        ContaBancariaEntity contaEntity = contaBancariaRepository.findByAgenciaAndConta(agencia, numeroConta)
                        .orElseThrow(() -> new ContaBancariaNotFoundException("Conta bancária não encontrada"));
        logger.info("ContaBancariaService - consultarSaldo: Conta achada: - {} Saldo Atual - {}",contaEntity, contaEntity.getSaldo());

        return contaEntity.getSaldo();
    }

    @Transactional
    public void realizarDeposito(ContaBancariaDTO contaDto, BigDecimal valor) throws Exception {
        logger.info("ContaBancariaService - realizarDeposito: Realizando deposito de - R${} - ContaID - {}", valor, contaDto);
        ContaBancariaEntity contaBancariaEntity = contaBancariaMapper.convertContaBancariaDtoTOEntity(contaDto);

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValorInvalidoException("O valor do depósito deve ser maior que zero");
        }

        BigDecimal novoSaldo = contaBancariaEntity.getSaldo().add(valor);
        contaBancariaEntity.setSaldo(novoSaldo);
        logger.info("ContaBancariaService - realizarDeposito: Saldo atual - R${} da conta - {} ", contaBancariaEntity.getSaldo(), contaBancariaEntity);

        contaBancariaRepository.save(contaBancariaEntity);
    }

    @Transactional
    public void realizarSaque(ContaBancariaDTO contaBancariaDTO, BigDecimal valor) {
        logger.info("ContaBancariaService - realizarSaque: Realizando saque de - R${} - ContaID - {}",valor, contaBancariaDTO);
        ContaBancariaEntity contaBancariaEntity = contaBancariaMapper.convertContaBancariaDtoTOEntity(contaBancariaDTO);

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValorInvalidoException("O valor do saque deve ser maior que zero");
        }
        if (valor.compareTo(contaBancariaEntity.getSaldo()) > 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }

        BigDecimal novoSaldo = contaBancariaEntity.getSaldo().subtract(valor);
        contaBancariaEntity.setSaldo(novoSaldo);
        logger.info("ContaBancariaService - realizarSaque: Saldo atual - R${} da conta - {} ", contaBancariaEntity.getSaldo(), contaBancariaEntity);

        contaBancariaRepository.save(contaBancariaEntity);
    }

    @Transactional
    public void transferir(ContaBancariaDTO origem, ContaBancariaDTO destino, BigDecimal valor) throws Exception {
        logger.info("ContaBancariaService - transferir: Realizando transferencia de - R${} da conta: {}  para :  {}",valor, origem, destino);

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new TransferenciaException("O valor da transferência deve ser positivo.");
        }
        ContaBancariaEntity contaOrigem = contaBancariaMapper.convertContaBancariaDtoTOEntity(origem);
        ContaBancariaEntity contaDestino = contaBancariaMapper.convertContaBancariaDtoTOEntity(destino);
        logger.info("ContaBancariaService - transferir: Realizando transferencia de - R${} da conta: {}  para :  {}",valor, contaOrigem, contaDestino);

        if (contaOrigem.getSaldo().compareTo(valor) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para a transferência.");
        }

        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(valor));
        logger.info("ContaBancariaService - transferir: Saldo atual - R${} da conta - {} ", contaOrigem.getSaldo(), contaOrigem);
        contaBancariaRepository.save(contaOrigem);

        contaDestino.setSaldo(contaDestino.getSaldo().add(valor));
        logger.info("ContaBancariaService - transferir: Saldo atual - R${} da conta - {} ", contaDestino.getSaldo(), contaDestino);
        contaBancariaRepository.save(contaDestino);
    }

}
