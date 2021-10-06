package com.example.pokelocator.service;

import com.example.pokelocator.model.Pokemon;
import com.example.pokelocator.model.PokemonListWrapper;
import com.example.pokelocator.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public Pokemon getPokemonByPokeId(int pokeId) {
        return pokemonRepository.findByPokeId(pokeId);
    }

    public Pokemon getPokemonByPokeName(String pokeName) {
        return pokemonRepository.findByPokeName(pokeName);
    }

    public PokemonListWrapper getAllSunAndMoonPokemon() {
        PokemonListWrapper pokemonListWrapper = new PokemonListWrapper();
        pokemonListWrapper.setAllPokemonList(pokemonRepository.findAll());
        return pokemonListWrapper;
    }
}
