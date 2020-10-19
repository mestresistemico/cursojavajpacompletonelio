package com.mestresistemico.cursojavajpacompletonelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mestresistemico.cursojavajpacompletonelio.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
