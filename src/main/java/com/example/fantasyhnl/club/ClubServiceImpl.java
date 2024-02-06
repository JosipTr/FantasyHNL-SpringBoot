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
	public List<ClubDto> getClubs() {
		List<Club> clubs = clubRepository.getClubs();
		List<ClubDto> clubsDto = clubs.stream().map(club -> club.toClubDto()).toList();
		return clubsDto;
	}

}
