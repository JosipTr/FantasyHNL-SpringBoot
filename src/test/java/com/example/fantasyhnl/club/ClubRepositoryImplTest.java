package com.example.fantasyhnl.club;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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
}
