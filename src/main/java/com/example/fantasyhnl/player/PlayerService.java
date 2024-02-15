package com.example.fantasyhnl.player;

import java.util.Set;

public interface PlayerService {
	Set<PlayerDto> getAllPlayers();
	PlayerDto getPlayerById(int id);
}
