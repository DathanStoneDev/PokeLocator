package com.example.pokelocator.service;

import com.example.pokelocator.model.UltraSunMoon;
import com.example.pokelocator.repository.UltraSunAndMoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UltraSunAndMoonService {

    @Autowired
    UltraSunAndMoonRepository ultraSunAndMoonRepository;

    public UltraSunMoon getPokemonByPokeId(int pokeId) {
        return ultraSunAndMoonRepository.findByPokeId(pokeId);
    }

    public UltraSunMoon getPokemonByPokeName(String pokeName) {
        return ultraSunAndMoonRepository.findByPokeName(pokeName);
    }

    public Page<UltraSunMoon> getPokemonByPage(Pageable pageable) {
        return ultraSunAndMoonRepository.findAll(pageable);
    }
}
