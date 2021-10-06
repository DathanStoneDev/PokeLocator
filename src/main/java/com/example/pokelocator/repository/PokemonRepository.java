package com.example.pokelocator.repository;

import com.example.pokelocator.model.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, String> {

    Pokemon findByPokeId(int pokeId);
    Pokemon findByPokeName(String pokeName);
}
