package com.example.fantasyhnl.country;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CountryServiceImpl implements CountryService{
	private final CountryRepository repository;

	@Override
	public List<CountryDto> getAllCountries() {
		var countries = repository.findAll();
		var countriesDto = countries.stream().map(Country::toCountryDto).toList();
		return countriesDto;
	}
	
	
}
