package com.example.fantasyhnl.player.birth;

import com.example.fantasyhnl.country.Country;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "births")
public class Birth {
	@Id
	private int id;
	private String date;
	private String place;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country birth_country;
}
