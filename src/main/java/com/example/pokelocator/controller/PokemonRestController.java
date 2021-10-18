package com.example.pokelocator.controller;

import com.example.pokelocator.model.UltraSunMoon;
import com.example.pokelocator.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin
public class PokemonRestController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping(value = "/ultra-sun-and-moon", params = "pokeId")
    public UltraSunMoon getPokemonById(@RequestParam("pokeId") int id) { return pokemonService.getPokemonByPokeId(id); }

    @GetMapping(value = "/ultra-sun-and-moon", params = "pokeName")
    public UltraSunMoon getPokemonByName(@RequestParam("pokeName") String name) {
        return pokemonService.getPokemonByPokeName(name);
    }

    @GetMapping("/ultra-sun-and-moon/list")
    public Page<UltraSunMoon> getSunAndMoonPokemon(Pageable pageable) {
        return pokemonService.getPokemonByPage(pageable);
    }

}
