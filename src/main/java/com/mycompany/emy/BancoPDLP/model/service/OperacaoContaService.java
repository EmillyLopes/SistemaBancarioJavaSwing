package com.mycompany.emy.BancoPDLP.model.service;

import com.mycompany.emy.BancoPDLP.controller.mapper.OperacaoContaMapper;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePFDTO;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePJDTO;
import com.mycompany.emy.BancoPDLP.model.dto.ContaPoupancaDTO;
import com.mycompany.emy.BancoPDLP.model.dto.OperacaoContaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import com.mycompany.emy.BancoPDLP.model.exception.ContaBancariaNotFoundException;
import com.mycompany.emy.BancoPDLP.model.repository.OperacaoContaRepository;
import com.mycompany.emy.BancoPDLP.model.utils.Constantes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.aspectj.runtime.internal.Conversions.doubleValue;

@Service
public class OperacaoContaService {
    private static final Logger logger = LoggerFactory.getLogger(OperacaoContaService.class);

    @Autowired
    private OperacaoContaRepository operacaoContaRepository;

    @Autowired
    private OperacaoContaMapper operacaoContaMapper;

    public OperacaoContaEntity salvarOperacao(OperacaoContaDTO conta) {
        OperacaoContaEntity operacaoContaEntity = operacaoContaMapper.convertOperacaoContaDtoToEntity(conta);
        logger.info("OperacaoContaService - salvarOperacao: Salvando a operacao: - {}", operacaoContaEntity);
        return operacaoContaRepository.save(operacaoContaEntity);
    }

    public OperacaoContaEntity gerarOperacao(ContaBancariaEntity contaBancariaEntity, char tipoOperacao, String observacao) {
        OperacaoContaDTO operacao = new OperacaoContaDTO();
        operacao.setId(Long.valueOf(contaBancariaEntity.getId()));
        operacao.setTpOperacao(tipoOperacao);
        operacao.setValor(doubleValue(contaBancariaEntity.getSaldo()));
        operacao.setDataHora(LocalDateTime.now());
        operacao.setObservacao(observacao);

        return salvarOperacao(operacao);
    }


}
