package org.senai.devinhousem2s09.Exercicio5ao10.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.senai.devinhousem2s09.Exercicio5ao10.model.Cliente;
import org.senai.devinhousem2s09.Exercicio5ao10.model.Conta;
import org.senai.devinhousem2s09.Exercicio5ao10.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }

    public Conta save(Cliente cliente) {
        Conta conta = new Conta();
        conta.setSaldo(0d);
        conta.setCliente(cliente);
        return repository.save(conta);
    }

    public List<Conta> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public void editById(Integer id, Conta updatedConta) {
        Conta oldConta = repository.findById(id).get();
        oldConta.setCliente(updatedConta.getCliente());
        oldConta.setSaldo(updatedConta.getSaldo());
    }

    public Conta findById(Integer id) {
        return repository.findById(id).get();
    }


}
