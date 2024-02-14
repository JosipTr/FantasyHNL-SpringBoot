package com.example.fantasyhnl.league;

import com.example.fantasyhnl.country.Country;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
@Table(name = "leagues")
public class League {
	@Id
	private int id;
	private String name;
	private String type;
	private String logo;
	@ManyToOne
	private Country country;
}
