package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "half_times")
public class HalfTime {
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
		return "HalfTime [id=" + id + ", home=" + home + ", away=" + away + "]";
	}

}
