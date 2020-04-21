package com.practice.anime.anime.Entity;

import javax.persistence.*;


@Entity
public class ListAnime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userEntity_ID")
    private UserEntity userEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="animeEntity_ID")
    private AnimeEntity animeEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="statusEntity_ID")
    private StatusEntity statusEntity;

    private long numberOfEpisode;

    public ListAnime() {
    }

    public ListAnime(UserEntity userEntity, AnimeEntity animeEntity, StatusEntity statusEntity, long numberOfEpisode) {
        this.userEntity = userEntity;
        this.animeEntity = animeEntity;
        this.statusEntity = statusEntity;
        this.numberOfEpisode = numberOfEpisode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public AnimeEntity getAnimeEntity() {
        return animeEntity;
    }

    public void setAnimeEntity(AnimeEntity animeEntity) {
        this.animeEntity = animeEntity;
    }

    public long getNumberOfEpisode() {
        return numberOfEpisode;
    }

    public void setNumberOfEpisode(long numberOfEpisode) {
        this.numberOfEpisode = numberOfEpisode;
    }

    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }

    @Override
    public String toString() {
        return "ListAnime{" +
                "id=" + id +
                ", userEntity=" + userEntity +
                ", animeEntity=" + animeEntity +
                ", statusEntity=" + statusEntity +
                ", numberOfEpisode=" + numberOfEpisode +
                '}';
    }
}
