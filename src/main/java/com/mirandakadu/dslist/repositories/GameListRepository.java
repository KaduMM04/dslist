package com.mirandakadu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirandakadu.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
