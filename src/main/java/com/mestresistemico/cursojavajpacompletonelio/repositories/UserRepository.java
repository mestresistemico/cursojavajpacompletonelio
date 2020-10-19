package com.mestresistemico.cursojavajpacompletonelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mestresistemico.cursojavajpacompletonelio.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
