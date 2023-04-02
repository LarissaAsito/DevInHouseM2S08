package org.senai.devinhousem2s09.Exercicio5ao10.repository;

import org.senai.devinhousem2s09.Exercicio5ao10.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
