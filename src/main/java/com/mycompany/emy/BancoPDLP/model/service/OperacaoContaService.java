package com.mycompany.emy.BancoPDLP.model.service;

import com.mycompany.emy.BancoPDLP.controller.mapper.OperacaoContaMapper;
import com.mycompany.emy.BancoPDLP.model.dto.OperacaoContaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import com.mycompany.emy.BancoPDLP.model.exception.ContaBancariaNotFoundException;
import com.mycompany.emy.BancoPDLP.model.repository.ContaBancariaRepository;
import com.mycompany.emy.BancoPDLP.model.repository.OperacaoContaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.aspectj.runtime.internal.Conversions.doubleValue;

@Service
public class OperacaoContaService {
    private static final Logger logger = LoggerFactory.getLogger(OperacaoContaService.class);

    @Autowired
    private OperacaoContaRepository operacaoContaRepository;

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    @Autowired
    private OperacaoContaMapper operacaoContaMapper;

    public OperacaoContaEntity salvarOperacao(OperacaoContaDTO conta) {
        OperacaoContaEntity operacaoContaEntity = operacaoContaMapper.convertOperacaoContaDtoToEntity(conta);
        logger.info("OperacaoContaService - salvarOperacao: Salvando a operacao: - {}", operacaoContaEntity);
        return operacaoContaRepository.save(operacaoContaEntity);
    }

    public OperacaoContaEntity gerarOperacao(ContaBancariaEntity contaBancariaEntity, char tipoOperacao, String observacao, BigDecimal valor) {
        OperacaoContaDTO operacao = new OperacaoContaDTO();
        operacao.setContaBancariaId(contaBancariaEntity);
        operacao.setTpOperacao(tipoOperacao);
        operacao.setValor(doubleValue(valor));
        operacao.setDataHora(LocalDateTime.now());
        operacao.setObservacao(observacao);

        return salvarOperacao(operacao);
    }
    public List<OperacaoContaDTO> pesquisarOperacoes(String agencia, String conta) {
        logger.info("OperacaoContaService - pesquisarOperacoes: Pesquisando extrato da conta com Agencia: - {}, Conta: - {}, e IDConta: - {}", agencia, conta);
        Optional<ContaBancariaEntity> contaBancariaOptional = contaBancariaRepository.findByAgenciaContaId(agencia, conta);

        if (contaBancariaOptional.isEmpty()) {
            throw new ContaBancariaNotFoundException("Conta bancária não encontrada");
        }

        Integer idContaBancaria = contaBancariaOptional.get().getId();

        logger.info("OperacaoContaService - pesquisarOperacoes: Pesquisando extrato da conta com ID: - {}", idContaBancaria);

        List<OperacaoContaEntity> operacaoEntities = operacaoContaRepository.findByContaBancaria_Id(idContaBancaria);
        logger.info("OperacaoContaService - pesquisarOperacoes: Achada conta com ID: - {}, Extratos: - {}", idContaBancaria,operacaoEntities);

        // Converta as entidades em DTOs
        List<OperacaoContaDTO> operacoesDTO = operacaoEntities.stream()
                .map(operacaoContaMapper::convertOperacaoContaEntityToDto)
                .collect(Collectors.toList());

        return operacoesDTO;
    }

}
