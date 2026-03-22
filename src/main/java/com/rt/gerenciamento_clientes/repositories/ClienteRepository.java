package com.rt.gerenciamento_clientes.repositories;

import com.rt.gerenciamento_clientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
