package com.mycompany.emy.BancoPDLP.model.repository;

import com.mycompany.emy.BancoPDLP.model.entity.ContaBancariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaEntity, Integer> {

}
