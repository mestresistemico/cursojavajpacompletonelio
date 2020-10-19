package com.mestresistemico.cursojavajpacompletonelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mestresistemico.cursojavajpacompletonelio.domain.Order;
import com.mestresistemico.cursojavajpacompletonelio.repositories.OrderRepository;
import com.mestresistemico.cursojavajpacompletonelio.services.exceptions.ObjectNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll(){
		return repository.findAll();
	}
	

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
