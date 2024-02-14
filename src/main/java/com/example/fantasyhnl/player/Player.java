package com.example.fantasyhnl.player;

import java.util.List;

import com.example.fantasyhnl.player.birth.Birth;
import com.example.fantasyhnl.statistic.Statistic;
import com.example.fantasyhnl.team.Team;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "players")
public class Player {
	@Id
	private int id;
	private String name;
	private Integer age;
	private Integer number;
	private String position;
	private String firstname;
	private String lastname;
	private String nationality;
	private String height;
	private String weight;
	private Boolean injured;
	private String photo;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Birth birth;
	@ManyToOne
	private Team team;
	@OneToMany(mappedBy = "player", cascade = CascadeType.PERSIST)
	private List<Statistic> statistics;
	
	public PlayerDto toPlayerDto() {
		return new PlayerDto(id, name, age, number, position, firstname, lastname, nationality, height, weight, injured, photo, birth, team, statistics);
	}
}
