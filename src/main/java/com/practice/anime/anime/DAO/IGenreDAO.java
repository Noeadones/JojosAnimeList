package com.practice.anime.anime.DAO;

import com.practice.anime.anime.Entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreDAO extends JpaRepository<GenreEntity, Long> {
}
