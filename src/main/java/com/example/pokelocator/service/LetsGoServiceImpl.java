package com.example.pokelocator.service;

import com.example.pokelocator.model.LetsGo;
import com.example.pokelocator.repository.LetsGoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LetsGoServiceImpl implements LetsGoService {

    @Autowired
    LetsGoRepository letsGoRepository;

    public LetsGo getPokemonByPokeId(int pokeId) {
        return letsGoRepository.findByPokeId(pokeId);
    }

    public LetsGo getPokemonByPokeName(String pokeName) {
        return letsGoRepository.findByPokeName(pokeName);
    }

    public Page<LetsGo> getPokemonByPage(Pageable pageable) {
        return letsGoRepository.findAll(pageable);
    }
}
