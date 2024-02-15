package com.example.fantasyhnl.fixture;

import java.util.HashSet;

import java.util.Set;

import com.example.fantasyhnl.statistic.Statistic;
import com.example.fantasyhnl.venue.Venue;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Setter
@Table(name = "fixtures")
public class Fixture {
	@Id
	@JsonIgnore
	private int id;
	private String referee;
	private String timezone;
	private String date;
	private Integer timestamp;
	@ManyToOne
	private Venue venue;
	@OneToOne(mappedBy = "fixture")
	private GameStatus status;
	@OneToOne(mappedBy = "fixture")
	private HomeTeam homeTeam;
	@OneToOne(mappedBy = "fixture")
	private AwayTeam awayTeam;
	@OneToOne(mappedBy = "fixture")
	private Score score;
	@OneToMany(mappedBy = "fixture")
	@JsonIgnore
	private Set<Statistic> statistic = new HashSet<>();
	}
