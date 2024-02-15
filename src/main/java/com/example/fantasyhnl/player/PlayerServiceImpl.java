package com.example.fantasyhnl.player;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService{
	private final PlayerRepository repository;
	
	public Set<PlayerDto> getAllPlayers() {
		var players = repository.findAll();
		var playerDtos = players.stream().map(Player::toPlayerDto).toList();
		var set = new HashSet<PlayerDto>(playerDtos);
		return set;
	}

	@Override
	public PlayerDto getPlayerById(int id) {
		var player = repository.getReferenceById(id);
		System.out.println(player);
		return player.toPlayerDto();
	}
}
