package com.mongodocker.test.repository;

import com.mongodocker.test.model.Cats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepo extends MongoRepository<Cats, String> {
}
