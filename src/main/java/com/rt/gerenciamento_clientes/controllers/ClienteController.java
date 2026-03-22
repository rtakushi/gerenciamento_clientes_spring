package com.rt.gerenciamento_clientes.controllers;

import com.rt.gerenciamento_clientes.models.Cliente;
import com.rt.gerenciamento_clientes.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServices service;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
