package br.com.Dev.dsmove;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.Dev.dsmove.dto.ScoreDTO;
import br.com.Dev.dsmove.entities.Movie;
import br.com.Dev.dsmove.entities.Score;
import br.com.Dev.dsmove.entities.User;
import br.com.Dev.dsmove.repositories.MovieRepository;
import br.com.Dev.dsmove.repositories.ScoreRepository;
import br.com.Dev.dsmove.repositories.UserRepository;

@SpringBootTest
class DsmoveApplicationTests {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;

	@Test
	void contextLoads() {
		
		ScoreDTO dto = new ScoreDTO();	
		/*	
		User user  = userRepository.findByEmail(dto.getEmail());
		
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);			
		}
		*/
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		//score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s: movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
 		//return movie;
		
	}
	
}
