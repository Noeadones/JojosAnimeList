package com.practice.anime.anime.DAO;

import com.practice.anime.anime.Entity.ListAnime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListAnimeDAO extends JpaRepository<ListAnime,Long> {
}
