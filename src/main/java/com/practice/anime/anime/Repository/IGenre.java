package com.practice.anime.anime.Repository;

import com.practice.anime.anime.Entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenre extends JpaRepository<GenreEntity, Long> {
}
