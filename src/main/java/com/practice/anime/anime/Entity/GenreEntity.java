package com.practice.anime.anime.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany//(fetch = FetchType.LAZY,cascade ={CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH})
    @JoinTable(name = "anime_genres",
            joinColumns = @JoinColumn ( name = "genre_ID"),
            inverseJoinColumns = @JoinColumn ( name = "anime_ID"))
    private List<AnimeEntity> animeEntities;

    public GenreEntity(String name) {
        this.name = name;
    }

    public GenreEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnimeEntity> getAnimeEntities() {
        return animeEntities;
    }

    public void setAnimeEntities(List<AnimeEntity> animeEntities) {
        this.animeEntities = animeEntities;
    }
}
