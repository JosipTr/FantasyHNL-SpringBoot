package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "full_times")
public class FullTime {
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
		return "FullTime [id=" + id + ", home=" + home + ", away=" + away + "]";
	}
	
	
}
