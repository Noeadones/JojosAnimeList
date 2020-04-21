package com.practice.anime.anime.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimeDTO {

    @JsonProperty
    private long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Long numberOfEpisodes;
    @JsonProperty
    private String image;

    public AnimeDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Long numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
