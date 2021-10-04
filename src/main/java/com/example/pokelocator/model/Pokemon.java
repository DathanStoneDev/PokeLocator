package com.example.pokelocator.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UltraSunAndMoonLocations")
public class Pokemon {

    private int pokeId;
    private String pokeName;
    private String imageUrl;

    public int getPokeId() {
        return pokeId;
    }

    public String getPokeName() {
        return pokeName;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
