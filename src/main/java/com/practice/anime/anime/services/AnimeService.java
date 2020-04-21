package com.practice.anime.anime.services;

import com.practice.anime.anime.DTO.AnimeDTO;
import com.practice.anime.anime.Entity.AnimeEntity;
import com.practice.anime.anime.Repository.IAnime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private IAnime iAnime;

    public List<AnimeDTO> all(){
        List<AnimeDTO> listAnimeDTO = new ArrayList<>();
        List<AnimeEntity> animes = iAnime.findAll();
        animes.forEach( anime -> {
            AnimeDTO animeDTO = new AnimeDTO();
            BeanUtils.copyProperties(animeDTO,anime);
            listAnimeDTO.add(animeDTO);
        });
        return listAnimeDTO;
    }
}
