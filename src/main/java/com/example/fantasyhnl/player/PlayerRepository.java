package com.example.fantasyhnl.player;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	@Query(value = "select * from players where team_id = ?1", nativeQuery = true)
	Set<Player> getAllPlayersFromTeam(int id);
}
