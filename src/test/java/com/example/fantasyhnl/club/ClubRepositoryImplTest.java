package com.example.fantasyhnl.club;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ClubRepositoryImplTest {

	@Autowired
	private ClubRepository clubRepository;
	
	@Test
	@DisplayName("Should return list of Clubs")
	void test() {
		List<Club> clubs = clubRepository.getClubs();
		assertThat(clubs).hasOnlyElementsOfType(Club.class);
		assertThat(clubs).isNotEmpty();
	}
	
	@Test
	@DisplayName("Should return club")
	void checkIfReturnsClubEntity() {
		var club = clubRepository.getClubById(561);
		assertThat(club).hasFieldOrPropertyWithValue("id", 561);
		assertEquals(Club.class, club.getClass());
		
	}
}
