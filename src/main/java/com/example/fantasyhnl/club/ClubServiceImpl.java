package com.example.fantasyhnl.club;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService{

	private final ClubRepository clubRepository;
	
	public ClubServiceImpl(ClubRepository clubRepository) {
		super();
		this.clubRepository = clubRepository;
	}

	@Override
	public List<Club> getClubs() {
		
		return clubRepository.getClubs();
	}

}
