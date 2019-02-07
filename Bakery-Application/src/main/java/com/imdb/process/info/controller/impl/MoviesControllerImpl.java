package com.imdb.process.info.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.imdb.process.info.controller.MoviesController;
import com.imdb.process.info.dto.TitleBasicDto;
import com.imdb.process.info.repositories.TileBasicsRepository;
import com.imdb.process.info.service.MovieService;
import com.imdb.process.info.vo.Movies;
import com.imdb.process.info.vo.SearchMovies;

/** BakeryOrderController controller provides endpoint for placing order in the bakery and in response it gets the biiling information
 * per package of the products order as per quantity
 *  
 * @author Ramandeep kaur
 *
 */
@Service
public class MoviesControllerImpl implements MoviesController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	TileBasicsRepository tileBasicsRepository;

	@Override
	public ResponseEntity<SearchMovies> placeOrder(@RequestBody SearchMovies searchMovies) {
		String genre = searchMovies.getSearchCritiera().getGenre();
		List<TitleBasicDto> titleBasics =tileBasicsRepository.findByGenre(genre);
		
		List<Movies> movies = new ArrayList<>();
		titleBasics.forEach(tb -> {
			Movies movie = new Movies();
			BeanUtils.copyProperties(tb, movie);
			movies.add(movie);
			});
		
		searchMovies.setMovies(movies);
		return new ResponseEntity<SearchMovies>(searchMovies, HttpStatus.OK);
	}


	
}
