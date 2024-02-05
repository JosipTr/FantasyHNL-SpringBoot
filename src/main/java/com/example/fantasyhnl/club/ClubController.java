package com.example.fantasyhnl.club;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {
	private final ClubRepository repository;

	public ClubController(ClubRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/")
	public void getClubs() {
		repository.getClubs();
		return;
	}
}
