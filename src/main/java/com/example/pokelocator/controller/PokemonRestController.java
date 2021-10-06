package com.example.pokelocator.controller;

import com.example.pokelocator.model.Pokemon;
import com.example.pokelocator.model.PokemonListWrapper;
import com.example.pokelocator.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PokemonRestController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon-list")
    public PokemonListWrapper getAllSunAndMoonPokemon() {
        return pokemonService.getAllSunAndMoonPokemon();
    }

    @GetMapping("/pokemon-id/{id}")
    public Pokemon getPokemon(@PathVariable int id) { return pokemonService.getPokemonByPokeId(id); }

    @GetMapping("/pokemon-name/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {
        return pokemonService.getPokemonByPokeName(name);
    }

}
