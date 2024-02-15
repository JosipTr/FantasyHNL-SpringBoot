package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "games")
public class Game {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer minutes;
	private Integer number;
	private String position;
	private String rating;
	private Boolean captain;
	private Boolean substitute;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Game [id=" + id + ", minutes=" + minutes + ", number=" + number + ", position=" + position + ", rating="
				+ rating + ", captain=" + captain + ", substitute=" + substitute + "]";
	}
	
	
}
