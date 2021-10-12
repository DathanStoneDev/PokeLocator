package com.example.pokelocator.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UltraSunAndMoon")
public class UltraSunMoon extends Pokemon{

    public UltraSunMoon(String id, int pokeId, String pokeName, String location, String imageUrl) {
        super(id, pokeId, pokeName, location, imageUrl);
    }
}
