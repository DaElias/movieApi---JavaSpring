package com.testmovies.moviestest.repository;

import com.testmovies.moviestest.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository  extends MongoRepository<Review, ObjectId> {
}
