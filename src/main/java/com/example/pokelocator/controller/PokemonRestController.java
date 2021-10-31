package com.example.pokelocator.controller;

import com.example.pokelocator.model.LetsGo;
import com.example.pokelocator.model.UltraSunMoon;
import com.example.pokelocator.service.LetsGoService;
import com.example.pokelocator.service.UltraSunAndMoonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin
public class PokemonRestController {

    private final UltraSunAndMoonService ultraSunAndMoonService;

    private final LetsGoService letsGoService;

    public PokemonRestController(UltraSunAndMoonService ultraSunAndMoonService, LetsGoService letsGoService) {
        this.ultraSunAndMoonService = ultraSunAndMoonService;
        this.letsGoService = letsGoService;
    }

    @GetMapping(value = "/ultra-sun-and-moon", params = "pokeId")
    public UltraSunMoon getPokemonById(@RequestParam("pokeId") int id) { return ultraSunAndMoonService.getPokemonByPokeId(id); }

    @GetMapping(value = "/ultra-sun-and-moon", params = "pokeName")
    public UltraSunMoon getPokemonByName(@RequestParam("pokeName") String name) {
        return ultraSunAndMoonService.getPokemonByPokeName(name);
    }

    @GetMapping("/ultra-sun-and-moon/list")
    public Page<UltraSunMoon> getSunAndMoonPokemon(Pageable pageable) {
        return ultraSunAndMoonService.getPokemonByPage(pageable);
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
