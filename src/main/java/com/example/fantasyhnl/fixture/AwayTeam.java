package com.example.fantasyhnl.fixture;

import com.example.fantasyhnl.team.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "away_teams")
public class AwayTeam {
	@Id
	@JsonIgnore
	private int away_id;
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
		return "AwayTeam [away_id=" + away_id + ", winner=" + winner + ", team=" + team + "]";
	}
	
	
}
