package com.example.pokelocator.repository;

import com.example.pokelocator.model.LetsGo;
import org.springframework.stereotype.Repository;

@Repository
public interface LetsGoRepository extends GenericPokemonRepository<LetsGo, String> {

}
