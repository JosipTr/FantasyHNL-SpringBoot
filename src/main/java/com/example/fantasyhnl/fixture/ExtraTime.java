package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "extra_times")
public class ExtraTime {
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
		return "ExtraTime [id=" + id + ", home=" + home + ", away=" + away + "]";
	}
	
	
}
