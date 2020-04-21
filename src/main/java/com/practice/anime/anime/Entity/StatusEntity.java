package com.practice.anime.anime.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy="statusEntity", fetch=FetchType.EAGER)
    private List<ListAnime> listAnimes;

    public StatusEntity(String name) {
        this.name = name;
    }

    public StatusEntity() {
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

    public List<ListAnime> getListAnimes() {
        return listAnimes;
    }

    public void setListAnimes(List<ListAnime> listAnimes) {
        this.listAnimes = listAnimes;
    }
}
