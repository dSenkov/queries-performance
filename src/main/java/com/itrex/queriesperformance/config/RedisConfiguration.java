package com.itrex.queriesperformance.config;

import com.itrex.queriesperformance.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@Profile("redis")
public class RedisConfiguration {

    @Bean
    public RedisTemplate<Long, Person> redisTemplate() {
        RedisTemplate<Long, Person> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(new JedisConnectionFactory());
        return redisTemplate;
    }
}
