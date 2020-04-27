package com.practice.anime.anime.services;

import com.practice.anime.anime.DTO.AnimeDTO;
import com.practice.anime.anime.Entity.AnimeEntity;
import com.practice.anime.anime.DAO.IAnimeDAO;
import com.practice.anime.anime.Utils.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private IAnimeDAO iAnimeDAO;

    @Autowired
    private Factory factory;

    public List<AnimeDTO> all(){
        List<AnimeDTO> listAnimeDTO;
        List<AnimeEntity> animes = iAnimeDAO.findAll();

        listAnimeDTO = factory.copyListEntiy(AnimeDTO.class, animes);
        return listAnimeDTO;
    }

}
