package com.imdb.process.info.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imdb.process.info.jpa.entities.NameBasics;

@Repository
public interface NameBasicsRepository extends CrudRepository<NameBasics, String>{

}
