package com.example.fantasyhnl.club;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClubServiceImplTest {

	@Autowired
	private ClubService clubService;
	
	@Test
	@DisplayName("Should return List of ClubDto's")
	void test() {
		var clubs = clubService.getClubs();
		assertThat(clubs).hasOnlyElementsOfType(ClubDto.class);
		assertThat(clubs).isNotEmpty();
	}
	
	@Test
	@DisplayName("Should return ClubDto")
	void checkIfReturnTypeIsClubDto() {
		var club = clubService.getClubById(561);
		assertThat(club).hasFieldOrPropertyWithValue("id", 561);
		assertEquals(ClubDto.class, club.getClass());
	}

}
