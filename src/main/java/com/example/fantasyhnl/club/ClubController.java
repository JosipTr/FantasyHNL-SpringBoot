package com.example.fantasyhnl.club;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {
	private final ClubService clubService;
	
	public ClubController(ClubService clubService) {
		super();
		this.clubService = clubService;
	}

	@GetMapping("/")
	public ResponseEntity<Object> getClubs() {
		var clubs = clubService.getClubs();
		return new ResponseEntity<Object>(clubs, HttpStatus.OK);
	}
}
