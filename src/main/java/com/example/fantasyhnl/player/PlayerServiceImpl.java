package com.example.fantasyhnl.player;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService{
	private final PlayerRepository repository;
	
//	public List<PlayerDto> getAllPlayers() {
//		var players = repository.findAll();
////		var playerDtos = players.stream().map(Player::toPlayerDto).toList();
//		return playerDtos;
//	}

	@Override
	public Player getPlayerById(int id) {
		var player = repository.getReferenceById(id);
		return player;
//		return player.toPlayerDto();
	}
}
