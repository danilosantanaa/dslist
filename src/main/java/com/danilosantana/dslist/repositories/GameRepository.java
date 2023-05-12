package com.danilosantana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danilosantana.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
