package com.practice.anime.anime.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String pass;

    @OneToMany(mappedBy="userEntity", fetch=FetchType.EAGER)
    private List<ListAnime> listAnimes;


    public UserEntity() {
    }

    public UserEntity(String name, String pass) {
        this.name = name;
        this.pass = pass;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<ListAnime> getListAnime() {
        return listAnimes;
    }

    public void setListAnime(List<ListAnime> listAnime) {
        this.listAnimes = listAnime;
    }
}
