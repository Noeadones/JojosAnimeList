package com.practice.anime.anime.services;

import com.practice.anime.anime.DTO.AnimeDTO;
import com.practice.anime.anime.Entity.AnimeEntity;
import com.practice.anime.anime.Repository.IAnime;
import com.practice.anime.anime.Utils.Factory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private IAnime iAnime;

    @Autowired
    private Factory factory;

    public List<AnimeDTO> all(){
        List<AnimeDTO> listAnimeDTO;
        List<AnimeEntity> animes = iAnime.findAll();

        listAnimeDTO = factory.copyListEntiy(AnimeDTO.class, animes);
        return listAnimeDTO;
    }


}
