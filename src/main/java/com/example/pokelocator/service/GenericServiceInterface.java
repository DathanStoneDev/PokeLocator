package com.example.pokelocator.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericServiceInterface<T> {

     T getPokemonByPokeId(int pokeId);
     T getPokemonByPokeName(String pokeName);
     Page<T> getPokemonByPage(Pageable pageable);

}
