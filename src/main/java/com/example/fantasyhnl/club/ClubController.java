package com.example.fantasyhnl.club;

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
	public void getClubs() {
		clubService.getClubs();
		return;
	}
}
