package com.example.pokelocator.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LetsGo")
public class LetsGo extends Pokemon{

    public LetsGo(String id, int pokeId, String pokeName, String location, String imageUrl) {
        super(id, pokeId, pokeName, location, imageUrl);
    }
}
