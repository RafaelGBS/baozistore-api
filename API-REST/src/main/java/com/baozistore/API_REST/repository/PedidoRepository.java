package com.baozistore.API_REST.repository;

import com.baozistore.API_REST.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
