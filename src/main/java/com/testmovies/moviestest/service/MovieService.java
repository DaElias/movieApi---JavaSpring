package com.testmovies.moviestest.service;

import com.testmovies.moviestest.entity.Movie;
import com.testmovies.moviestest.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdbID(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

    public Optional<Movie> findMovieByTitle(String title){
        return  movieRepository.findMovieByTitle(title);
    }
}
