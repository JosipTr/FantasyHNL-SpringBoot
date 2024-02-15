package com.example.fantasyhnl.statistic;

import com.example.fantasyhnl.fixture.Fixture;
import com.example.fantasyhnl.player.Player;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "statistics")
public class Statistic {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	@ManyToOne
	@MapsId("fixtureId")
	private Fixture fixture;
	private Integer offsides;
	@OneToOne(mappedBy = "statistic")
	private Game game;
	@OneToOne(mappedBy = "statistic")
	private Shot shot;
	@OneToOne(mappedBy = "statistic")
	private Pass pass;
	@OneToOne(mappedBy = "statistic")
	private Tackle tackle;
	@OneToOne(mappedBy = "statistic")
	private Duel duel;
	@OneToOne(mappedBy = "statistic")
	private Dribble dribble;
	@OneToOne(mappedBy = "statistic")
	private Foul foul;
	@OneToOne(mappedBy = "statistic")
	private Card card;
	@OneToOne(mappedBy = "statistic")
	private Penalty penalty;
	@OneToOne(mappedBy = "statistic")
	private Goal goal;
	@ManyToOne
	@MapsId("playerId")
	@JsonIgnore
	private Player player;
	
	public Statistic() {
		super();
		this.id = new StatisticId();
	}
	
	@Override
	public String toString() {
		return "Statistic [id=" + id + ", offsides=" + offsides + ", game=" + game + ", shot=" + shot + ", pass=" + pass
				+ ", tackle=" + tackle + ", duel=" + duel + ", dribble=" + dribble + ", foul=" + foul + ", card=" + card
				+ ", penalty=" + penalty + ", goal=" + goal + "]";
	}
}