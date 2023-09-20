package com.mycompany.emy.BancoPDLP.model.service;

import com.mycompany.emy.BancoPDLP.controller.mapper.OperacaoContaMapper;
import com.mycompany.emy.BancoPDLP.model.dto.OperacaoContaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import com.mycompany.emy.BancoPDLP.model.repository.OperacaoContaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacaoContaService {
    private static final Logger logger = LoggerFactory.getLogger(OperacaoContaService.class);

    @Autowired
    private OperacaoContaRepository operacaoContaRepository;

    @Autowired
    private OperacaoContaMapper operacaoContaMapper;

    public void salvarOperacao(OperacaoContaDTO conta) {
        OperacaoContaEntity operacaoContaEntity = operacaoContaMapper.convertOperacaoContaDtoToEntity(conta);
        logger.info("OperacaoContaService - salvarOperacao: Salvando a operacao: - {}", operacaoContaEntity);
        operacaoContaRepository.save(operacaoContaEntity);
    }
}
