package com.mycompany.emy.BancoPDLP.model.repository;

import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaEntity, Integer> {

    @Query("SELECT c FROM ContaBancariaEntity c " +
            "WHERE (:agencia IS NULL OR c.agencia = :agencia) " +
            "  AND (:conta IS NULL OR c.conta = :conta) ")
    Optional<ContaBancariaEntity> findByAgenciaContaId(String agencia, String conta);

    Optional<ContaBancariaEntity> findByAgenciaAndConta(String agencia, String numero);

}
