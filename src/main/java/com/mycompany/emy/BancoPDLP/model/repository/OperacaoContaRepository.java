package com.mycompany.emy.BancoPDLP.model.repository;

import com.mycompany.emy.BancoPDLP.model.dto.OperacaoContaDTO;
import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperacaoContaRepository extends JpaRepository<OperacaoContaEntity, Long> {
    List<OperacaoContaDTO> findByContaBancaria(ContaBancariaEntity contaBancariaEntity);
}
