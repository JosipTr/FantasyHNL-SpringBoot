package com.example.fantasyhnl.team;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TeamController {
	private final TeamService service;
	
	@GetMapping("/api/teams")
	public ResponseEntity<Object> getTeams() {
		var teams = service.getAllTeams();
		return new ResponseEntity<Object>(teams, HttpStatus.OK);
	}
}
