package com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        List<Cliente> clienteList = clienteRepository.findAll();
        return ResponseEntity.ok(clienteList);
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
        Cliente cliente = clienteRepository.findById(idClient).get();
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        Cliente clienteDb = clienteRepository.findById(id).get();
        clienteDb.setEmail(cliente.getEmail());
        clienteDb.setEndereco(cliente.getEndereco());
        clienteDb.setIdade(cliente.getIdade());
        clienteDb.setNome(cliente.getNome());

        clienteRepository.save(clienteDb);
    }
}
