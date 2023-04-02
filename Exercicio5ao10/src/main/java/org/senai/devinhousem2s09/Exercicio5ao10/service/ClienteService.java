package org.senai.devinhousem2s09.Exercicio5ao10.service;

import org.senai.devinhousem2s09.Exercicio5ao10.model.Cliente;
import org.senai.devinhousem2s09.Exercicio5ao10.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository repository;
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente save(Cliente cliente) {
        try{
            return repository.save(cliente);
        } catch (Exception e) {
            throw new ServerErrorException("Atributos incompatíveis", e);
        }
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public void editById(Integer id, Cliente editCliente) {
        Cliente cliente = repository.findById(id).get();
        cliente.setNome(editCliente.getNome());
        cliente.setCpf(editCliente.getCpf());
    }

    public Cliente findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
