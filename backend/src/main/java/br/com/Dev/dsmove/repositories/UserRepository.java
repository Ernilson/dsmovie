package br.com.Dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dev.dsmove.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
