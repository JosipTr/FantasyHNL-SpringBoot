package com.example.fantasyhnl.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	@Query(value = "SELECT * FROM countries WHERE name = ?1", nativeQuery = true)
	Country getCountryByName(String name);
}
