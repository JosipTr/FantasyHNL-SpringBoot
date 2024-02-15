package com.example.fantasyhnl.fixture;

import com.example.fantasyhnl.team.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class HomeTeam {
	@Id
	@JsonIgnore
	private int home_id;
	private Boolean winner;
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Fixture fixture;
	@Override
	public String toString() {
		return "HomeTeam [home_id=" + home_id + ", winner=" + winner + ", team=" + team + "]";
	}
	
}
