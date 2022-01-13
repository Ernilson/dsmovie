package br.com.Dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dev.dsmove.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
