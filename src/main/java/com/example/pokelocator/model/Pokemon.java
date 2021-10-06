package com.example.pokelocator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UltraSunAndMoon")
public class Pokemon {

    @Id
    private String id;
    private int pokeId;
    private String pokeName;
    private String location;
    private String imageUrl;

    public Pokemon(String id, int pokeId, String pokeName, String location, String imageUrl) {
        this.id = id;
        this.pokeId = pokeId;
        this.pokeName = pokeName;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public int getPokeId() {
        return pokeId;
    }

    public String getPokeName() {
        return pokeName;
    }

    public String getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
