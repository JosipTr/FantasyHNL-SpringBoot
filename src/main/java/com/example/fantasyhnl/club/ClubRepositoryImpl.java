package com.example.fantasyhnl.club;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ClubRepositoryImpl implements ClubRepository{
	private final List<Club> clubList;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public ClubRepositoryImpl(ClubListFromFileMapper mapper) {
		super();
		this.clubList = mapper.getClubs();
	}



	@Override
	public Club getClubById(int id) {
		logger.info("getClubById method called");
		var club = clubList.stream().filter(c -> c.getId() == id).findFirst().get();
		return club;
	}



	@Override
	public List<Club> getClubs() {
		logger.info("getClubs method called");
		return clubList;
	}
	
}
