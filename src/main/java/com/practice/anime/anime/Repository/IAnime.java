package com.practice.anime.anime.Repository;

import com.practice.anime.anime.Entity.AnimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnime extends JpaRepository<AnimeEntity,Long> {
}
