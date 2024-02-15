package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "status")
public class GameStatus {
	@Id
	@JsonIgnore
	private int id;
	private String longStatus;
	private String shortStatus;
	private Integer elapsed;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Fixture fixture;
	@Override
	public String toString() {
		return "GameStatus [id=" + id + ", longStatus=" + longStatus + ", shortStatus=" + shortStatus + ", elapsed="
				+ elapsed;
	}
	
	
}


