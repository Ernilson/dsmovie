package br.com.Dev.dsmove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Dev.dsmove.dto.MovieDTO;
import br.com.Dev.dsmove.dto.ScoreDTO;
import br.com.Dev.dsmove.services.ScoreService;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
