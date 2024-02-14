package com.example.fantasyhnl.country;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Table(name = "countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(unique = true)
	private String name;
	private String code;
	private String flag;
	
	public CountryDto toCountryDto() {
		return new CountryDto(id, name, code, flag);
	}
}