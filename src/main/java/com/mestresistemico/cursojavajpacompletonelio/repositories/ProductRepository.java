package com.mestresistemico.cursojavajpacompletonelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mestresistemico.cursojavajpacompletonelio.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
