package com.mycompany.emy.BancoPDLP.controller.mapper;

import com.mycompany.emy.BancoPDLP.model.dto.ContaBancariaDTO;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePFDTO;
import com.mycompany.emy.BancoPDLP.model.dto.ContaCorrentePJDTO;
import com.mycompany.emy.BancoPDLP.model.dto.ContaPoupancaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.exception.ContaBancariaNotFoundException;
import com.mycompany.emy.BancoPDLP.model.utils.Constantes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.aspectj.runtime.internal.Conversions.doubleValue;

@Component
public class ContaBancariaMapper {
    private static final Logger logger = LoggerFactory.getLogger(ContaBancariaMapper.class);

    public ContaBancariaEntity convertContaBancariaDtoTOEntity(ContaBancariaDTO contaBancariaDTO) {
        logger.info("ContaBancariaMapper - convertContaBancariaDtoTOEntity: Realizando conversão do DTO - {} para a Entity",contaBancariaDTO);
        ContaBancariaEntity contaEntity = new ContaBancariaEntity();
        contaEntity.setAgencia(contaBancariaDTO.getAgencia());
        contaEntity.setConta(contaBancariaDTO.getConta());
        contaEntity.setNome(contaBancariaDTO.getNome());
        contaEntity.setSaldo(BigDecimal.valueOf(contaBancariaDTO.getSaldo()));
        contaEntity.setTipoConta(contaBancariaDTO.getTipoConta());
        logger.info("ContaBancariaMapper - convertContaBancariaDtoTOEntity: Entity - {}", contaEntity);
        return contaEntity;
    }

    public ContaBancariaDTO convertContaBancariaEntityTODto(ContaBancariaEntity contaBancariaEntity) {
        logger.info("ContaBancariaMapper - convertContaBancariaEntityTODto: Realizando conversão da Entity - {} para o DTO ",contaBancariaEntity);
        ContaBancariaDTO contaBancariaDTO;
        String tipoConta = contaBancariaEntity.getTipoConta();
        if (Constantes.CONTA_POUPANCA.getValue().equals(tipoConta)) {
            logger.info("ContaBancariaMapper - convertContaBancariaEntityTODto: Tipo da Conta - {}", contaBancariaEntity.getTipoConta());
            contaBancariaDTO = new ContaPoupancaDTO();
        } else if (Constantes.CONTA_PF.getValue().equals(tipoConta)) {
            logger.info("ContaBancariaMapper - convertContaBancariaEntityTODto: Tipo da Conta - {}", contaBancariaEntity.getTipoConta());
            contaBancariaDTO = new ContaCorrentePFDTO();
        } else if (Constantes.CONTA_PJ.getValue().equals(tipoConta)) {
            logger.info("ContaBancariaMapper - convertContaBancariaEntityTODto: Tipo da Conta - {}", contaBancariaEntity.getTipoConta());
            contaBancariaDTO = new ContaCorrentePJDTO();
        } else {
            throw new ContaBancariaNotFoundException("Tipo da conta inválido");
        }

        contaBancariaDTO.setId(contaBancariaEntity.getId());
        contaBancariaDTO.setAgencia(contaBancariaEntity.getAgencia());
        contaBancariaDTO.setConta(contaBancariaEntity.getConta());
        contaBancariaDTO.setNome(contaBancariaEntity.getNome());
        contaBancariaDTO.setSaldo(doubleValue(contaBancariaEntity.getSaldo()));
        contaBancariaDTO.setTipoConta(contaBancariaEntity.getTipoConta());
        logger.info("ContaBancariaMapper - convertContaBancariaEntityTODto: DTO - {}  ",contaBancariaDTO);

        return contaBancariaDTO;
    }
}
