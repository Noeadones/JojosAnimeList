package com.practice.anime.anime.DAO;

import com.practice.anime.anime.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusDAO extends JpaRepository<StatusEntity, Long> {
}
