package com.example.fantasyhnl.fixture;

import com.example.fantasyhnl.team.Team;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HomeTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int home_id;
	private Boolean winner;
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
}
