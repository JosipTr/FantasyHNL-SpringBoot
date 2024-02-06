package com.example.fantasyhnl.club;

import java.util.List;

public interface ClubRepository {
	Club getClubById(int id);
	List<Club> getClubs();
}