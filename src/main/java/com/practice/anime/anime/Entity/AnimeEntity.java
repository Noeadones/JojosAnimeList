package com.practice.anime.anime.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "ANIMES_TABLE")
public class AnimeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Long numberOfEpisodes;
    private String image;

    @OneToMany(mappedBy="animeEntity", fetch=FetchType.EAGER)
    private List<ListAnime> listAnimes;

    @ManyToMany//(fetch = FetchType.LAZY,cascade ={CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH})
    @JoinTable(name = "anime_genres",
                joinColumns = @JoinColumn ( name = "anime_ID"),
                inverseJoinColumns = @JoinColumn ( name = "genre_ID"))
    private List<GenreEntity> genreEntities;


    public AnimeEntity() {
    }

    public AnimeEntity(String name, Long numberOfEpisodes, String image) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.image = image;

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

    public List<ListAnime> getAnimeList() {
        return listAnimes;
    }

    public void setAnimeList(List<ListAnime> animeList) {
        this.listAnimes = animeList;
    }

    public List<ListAnime> getListAnimes() {
        return listAnimes;
    }

    public void setListAnimes(List<ListAnime> listAnimes) {
        this.listAnimes = listAnimes;
    }

    public List<GenreEntity> getGenreEntities() {
        return genreEntities;
    }

    public void setGenreEntities(List<GenreEntity> genreEntities) {
        this.genreEntities = genreEntities;
    }

    public void addGenre(GenreEntity genre){
        if(this.genreEntities ==null)
            this.genreEntities = new ArrayList<>();

        this.genreEntities.add(genre);
    }
}
