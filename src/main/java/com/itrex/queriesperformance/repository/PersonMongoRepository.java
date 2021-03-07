package com.itrex.queriesperformance.repository;

import com.itrex.queriesperformance.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo")
public interface PersonMongoRepository extends MongoRepository<Long, Person> {

}
