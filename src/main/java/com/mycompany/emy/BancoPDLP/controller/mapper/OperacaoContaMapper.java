package com.mycompany.emy.BancoPDLP.controller.mapper;

import com.mycompany.emy.BancoPDLP.model.dto.OperacaoContaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OperacaoContaMapper {
    private static final Logger logger = LoggerFactory.getLogger(OperacaoContaMapper.class);

    public OperacaoContaDTO convertOperacaoContaEntityToDto(OperacaoContaEntity operacaoContaEntity) {
        logger.info("OperacaoContaMapper - convertOperacaoContaEntityToDto: Realizando conversão da Entity - {} para o DTO",operacaoContaEntity);
        OperacaoContaDTO operacaoConta = new OperacaoContaDTO();
        operacaoConta.setId(operacaoContaEntity.getId());
        operacaoConta.setContaBancariaId(operacaoContaEntity.getContaBancaria());
        operacaoConta.setDataHora(operacaoContaEntity.getDataHora());
        operacaoConta.setObservacao(operacaoContaEntity.getObservacao());
        operacaoConta.setTpOperacao(operacaoContaEntity.getTpOperacao());
        operacaoConta.setValor(operacaoContaEntity.getValor());
        logger.info("OperacaoContaMapper - convertOperacaoContaEntityToDto: DTO - {}", operacaoConta);
        return operacaoConta;
    }

    public OperacaoContaEntity convertOperacaoContaDtoToEntity(OperacaoContaDTO operacaoContaDto) {
        logger.info("OperacaoContaMapper - OperacaoContaEntity: Realizando conversão do DTO - {} para a Entity",operacaoContaDto);
        OperacaoContaEntity operacaoContaEntity = new OperacaoContaEntity();
        operacaoContaEntity.setId(operacaoContaDto.getId());
        operacaoContaEntity.setContaBancaria(operacaoContaDto.getContaBancariaId());
        operacaoContaEntity.setDataHora(LocalDateTime.now());
        operacaoContaEntity.setObservacao(operacaoContaDto.getObservacao());
        operacaoContaEntity.setTpOperacao(operacaoContaDto.getTpOperacao());
        operacaoContaEntity.setValor(operacaoContaDto.getValor());

        logger.info("OperacaoContaMapper - OperacaoContaEntity: Entity - {}", operacaoContaEntity);
        return operacaoContaEntity;
    }
}
