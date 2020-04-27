package com.practice.anime.anime.DAO;

import com.practice.anime.anime.Entity.AnimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeDAO extends JpaRepository<AnimeEntity,Long> {
}
