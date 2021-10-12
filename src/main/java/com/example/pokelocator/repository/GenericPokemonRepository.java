package com.example.pokelocator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericPokemonRepository<T, ID> extends MongoRepository<T, ID> {

    T findByPokeId(int pokeId);
    T findByPokeName(String pokeName);

}
