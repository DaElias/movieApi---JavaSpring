package com.testmovies.moviestest.controller;

import com.testmovies.moviestest.entity.Movie;
import com.testmovies.moviestest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> findAllMovies() throws Exception{
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id ){
//        return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id),HttpStatus.OK);
//    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId ){
        return new ResponseEntity<Optional<Movie>>(movieService.findMovieByImdbID(imdbId),HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Optional<Movie>> findMovieByTitle(@PathVariable String title){
        return new ResponseEntity<Optional<Movie>>(movieService.findMovieByTitle(title) , HttpStatus.OK);
    }
}
