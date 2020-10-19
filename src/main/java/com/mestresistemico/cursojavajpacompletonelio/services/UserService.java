package com.mestresistemico.cursojavajpacompletonelio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mestresistemico.cursojavajpacompletonelio.domain.User;
import com.mestresistemico.cursojavajpacompletonelio.repositories.UserRepository;
import com.mestresistemico.cursojavajpacompletonelio.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
	

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
