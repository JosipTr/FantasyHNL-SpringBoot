package com.example.fantasyhnl.club;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
	private final ClubService clubService;
	
	public ClubController(ClubService clubService) {
		super();
		this.clubService = clubService;
	}

	@GetMapping()
	public ResponseEntity<Object> getClubs() {
		var clubs = clubService.getClubs();
		return new ResponseEntity<Object>(clubs, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getClub(@PathVariable int id) {
		var club = clubService.getClubById(id);
		return new ResponseEntity<Object>(club, HttpStatus.OK);
	}
}
