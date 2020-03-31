package com.barbaro.springboottest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barbaro.springboottest.model.Evento;

@Repository
public interface EventoRepository extends MongoRepository<Evento, String>{
	
}
