package com.mycompany.emy.BancoPDLP.model.repository;

import com.mycompany.emy.BancoPDLP.model.entity.OperacaoContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoContaRepository extends JpaRepository<OperacaoContaEntity, Long> {
}
