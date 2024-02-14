package com.example.fantasyhnl.fixture;

import com.example.fantasyhnl.team.Team;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "away_teams")
public class AwayTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int away_id;
	private Boolean winner;
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
}
