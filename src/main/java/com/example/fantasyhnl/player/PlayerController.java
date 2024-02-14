package com.example.fantasyhnl.player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class PlayerController {
	private final PlayerService service;
	
	@GetMapping("/api/players")
	public ResponseEntity<Object> getAllPlayers() {
		var players = service.getAllPlayers();
		return new ResponseEntity<Object>(players, HttpStatus.OK);
	}
	
	@GetMapping("/api/player")
	public ResponseEntity<Object> getPlayerById() {
		var players = service.getPlayerById(14494);
		return new ResponseEntity<Object>(players, HttpStatus.OK);
	}
}
