package com.practice.anime.anime.Repository;

import com.practice.anime.anime.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository<UserEntity,Long> {
}
