package com.practice.anime.anime.Entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "ANIMES_TABLE")
public class AnimeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String numberOfEpisodes;
    private ArrayList<String> genres;
    private String episode;
    private String status;
    private String image;

    public AnimeEntity(String name, String numberOfEpisodes, ArrayList<String> genres, String episode, String status, String image) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genres = genres;
        this.episode = episode;
        this.status = status;
        this.image = image;
    }

    public AnimeEntity() {
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

    public String getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(String numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
