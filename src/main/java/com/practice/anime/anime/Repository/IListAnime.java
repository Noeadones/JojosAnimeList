package com.practice.anime.anime.Repository;

import com.practice.anime.anime.Entity.ListAnime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListAnime extends JpaRepository<ListAnime,Long> {
}
