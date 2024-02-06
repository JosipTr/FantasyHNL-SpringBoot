package com.example.fantasyhnl.club;

import java.util.List;

public interface ClubService {
	ClubDto getClubById(int id);
	List<ClubDto> getClubs();
}
