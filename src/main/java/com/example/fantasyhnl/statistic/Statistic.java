package com.example.fantasyhnl.statistic;

import com.example.fantasyhnl.fixture.Fixture;
import com.example.fantasyhnl.player.Player;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "statistics")
public class Statistic {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Integer offsides;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Game game;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Shot shot;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Pass pass;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Tackle tackle;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Duel duel;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Dribble dribble;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Foul foul;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Card card;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Penalty penalty;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Goal goal;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Player player;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Fixture fixture;
}
