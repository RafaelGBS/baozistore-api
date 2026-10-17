package com.baozistore.API_REST.repository;

import com.baozistore.API_REST.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}