package com.example.pokelocator.model;

import java.util.List;

public class PokemonListWrapper {
    List<Pokemon> allPokemonList;

    public List<Pokemon> getAllPokemonList() {
        return allPokemonList;
    }

    public void setAllPokemonList(List<Pokemon> allPokemonList) {
        this.allPokemonList = allPokemonList;
    }
}
