package com.mestresistemico.cursojavajpacompletonelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mestresistemico.cursojavajpacompletonelio.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
