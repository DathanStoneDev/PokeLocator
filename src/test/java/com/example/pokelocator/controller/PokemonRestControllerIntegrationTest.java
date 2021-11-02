package com.example.pokelocator.controller;

import com.example.pokelocator.model.LetsGo;
import com.example.pokelocator.model.UltraSunMoon;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PokemonRestControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void shouldGetSunAndMoonPokemonById() {
        //send the request to the api via TestRestTemplate and retrieve the response
        UltraSunMoon response = testRestTemplate.getForObject("/api/pokemon/ultra-sun-and-moon?pokeId=1", UltraSunMoon.class);
        //Check all fields for valid data.
        assertEquals(1, response.getPokeId());
        assertEquals("Bulbasaur", response.getPokeName());
        assertEquals("Melemele Island: Use the QR Scanner's Island Scan on Melemele Island on a Friday. Bulbasaur can then be encountered in Route 2.", response.getLocation());
        assertEquals("https://www.serebii.net/swordshield/pokemon/001.png", response.getImageUrl());
    }

    @Test
    void shouldGetSunAndMoonPokemonByName() {
        /*send the request to the api via TestRestTemplate and retrieve the response.
        Specifically used uppercase and lowercase in this instance. All names in the database have the first letter in uppercase,
        and the rest in lowercase - however the method for this endpoint should convert that path parameter to the correct format.
        */
        UltraSunMoon response = testRestTemplate.getForObject("/api/pokemon/ultra-sun-and-moon?pokeName=bULbaSauR", UltraSunMoon.class);
        //Check all fields for valid data.
        assertEquals(1, response.getPokeId());
        assertEquals("Bulbasaur", response.getPokeName());
        assertEquals("Melemele Island: Use the QR Scanner's Island Scan on Melemele Island on a Friday. Bulbasaur can then be encountered in Route 2.", response.getLocation());
        assertEquals("https://www.serebii.net/swordshield/pokemon/001.png", response.getImageUrl());
    }

    @Test
    void shouldGetLetsGoPokemonById() {
        LetsGo response = testRestTemplate.getForObject("/api/pokemon/lets-go?pokeId=1", LetsGo.class);
        assertEquals(1, response.getPokeId());
        assertEquals("Bulbasaur", response.getPokeName());
        assertEquals("Viridian Forest (rare). Or, from a woman in Cerulean City if you have caught at least 30 pokémon.", response.getLocation());
        assertEquals("https://www.serebii.net/swordshield/pokemon/001.png", response.getImageUrl());

    }

    @Test
    void shouldGetLetsGoPokemonByName() {

        LetsGo response = testRestTemplate.getForObject("/api/pokemon/lets-go?pokeName=bULbaSauR", LetsGo.class);
        assertEquals(1, response.getPokeId());
        assertEquals("Bulbasaur", response.getPokeName());
        assertEquals("Viridian Forest (rare). Or, from a woman in Cerulean City if you have caught at least 30 pokémon.", response.getLocation());
        assertEquals("https://www.serebii.net/swordshield/pokemon/001.png", response.getImageUrl());
    }

}