package com.practice.anime.anime.Repository;

import com.practice.anime.anime.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatus extends JpaRepository<StatusEntity, Long> {
}
