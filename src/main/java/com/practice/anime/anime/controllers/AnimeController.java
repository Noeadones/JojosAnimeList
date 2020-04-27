package com.practice.anime.anime.controllers;

import com.practice.anime.anime.DTO.AnimeDTO;
import com.practice.anime.anime.Entity.AnimeEntity;
import com.practice.anime.anime.Repository.IAnime;
import com.practice.anime.anime.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping("/animes")
    public List<AnimeDTO> animesAll(){
        return animeService.all();
    }

    @GetMapping("/hello")
    public  String hello (){ return "Hello World";}
}
