package com.itrex.queriesperformance.repository;

import com.itrex.queriesperformance.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("redis")
public interface PersonRedisRepository extends JpaRepository<Long, Person> {

}
