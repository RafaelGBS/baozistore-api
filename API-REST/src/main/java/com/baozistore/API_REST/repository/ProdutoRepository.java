package com.baozistore.API_REST.repository;

import com.baozistore.API_REST.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}