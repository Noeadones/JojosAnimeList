package com.practice.anime.anime.DAO;

import com.practice.anime.anime.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDAO extends JpaRepository<UserEntity,Long> {
}
