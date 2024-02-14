package com.example.fantasyhnl.player;

import java.util.List;

public interface PlayerService {
	List<PlayerDto> getAllPlayers();
	PlayerDto getPlayerById(int id);
}
