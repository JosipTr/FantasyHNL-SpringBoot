package com.example.fantasyhnl.country;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class CountryController {
	private final CountryService service;
	
	@GetMapping("/api/countries")
	public ResponseEntity<Object> getCountries() {
		var countries = service.getAllCountries();
		return new ResponseEntity<Object>(countries, HttpStatus.OK);
	}
}
