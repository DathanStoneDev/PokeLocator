package com.example.pokelocator.controller;

import com.example.pokelocator.model.LetsGo;
import com.example.pokelocator.model.UltraSunMoon;
import com.example.pokelocator.service.LetsGoService;
import com.example.pokelocator.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin
public class PokemonRestController {

    @Autowired
    PokemonService pokemonService;
    @Autowired
    LetsGoService letsGoService;

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

    @GetMapping(value = "/lets-go", params = "pokeId")
    public LetsGo getLetsGoPokemonById(@RequestParam("pokeId") int id) { return letsGoService.getPokemonByPokeId(id); }

    @GetMapping(value = "/lets-go", params = "pokeName")
    public LetsGo getLetsGoPokemonByName(@RequestParam("pokeName") String name) {
        return letsGoService.getPokemonByPokeName(name);
    }

    @GetMapping("/lets-go/list")
    public Page<LetsGo> getLetsGoPokemon(Pageable pageable) {
        return letsGoService.getPokemonByPage(pageable);
    }

}
