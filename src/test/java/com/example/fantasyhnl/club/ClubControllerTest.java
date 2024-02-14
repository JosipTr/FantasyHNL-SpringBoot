//package com.example.fantasyhnl.club;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//@ExtendWith(MockitoExtension.class)
//class ClubControllerTest {
//	
//	@Mock
//	private ClubService clubService;
//	private ClubController controller;
//	
//	@BeforeEach
//	public void setUp() {
//		controller = new ClubController(clubService);
//	}
//
//	@Test
//	void getClubs() {
//		var response = controller.getClubs();
//		assertEquals(ResponseEntity.class, response.getClass());
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//	}
//	
//	@Test
//	void getClubById() {
//		var response =  controller.getClub(561);
//		assertEquals(ResponseEntity.class, response.getClass());
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//	}
//}
