package br.com.Dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Dev.dsmove.entities.Score;
import br.com.Dev.dsmove.entities.ScorePK;;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
