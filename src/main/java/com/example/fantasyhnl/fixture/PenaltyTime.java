package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class PenaltyTime {
	@Id
	@JsonIgnore
	private int id;
	private Integer home;
	private Integer away;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Score score;

	@Override
	public String toString() {
		return "PenaltyTime [id=" + id + ", home=" + home + ", away=" + away + "]";
	}

}
