package com.itrex.queriesperformance.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@RedisHash
@Document(collection = "persons")
public class Person {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    private int age;
}
