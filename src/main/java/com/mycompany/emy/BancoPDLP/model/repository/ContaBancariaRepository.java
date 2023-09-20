package com.mycompany.emy.BancoPDLP.model.repository;

import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaEntity, Integer> {

    Optional<ContaBancariaEntity> findByAgenciaAndConta(String agencia, String numero);

}
