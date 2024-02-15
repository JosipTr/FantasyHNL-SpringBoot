package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class FixtureGoals {
	@Id
	@JsonIgnore
	private int id;
	private Integer home;
	private Integer away;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Fixture fixture;
	@Override
	public String toString() {
		return "FixtureGoals [id=" + id + ", home=" + home + ", away=" + away + "]";
	}
	
	
}
