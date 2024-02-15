package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "cards")
public class Card {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer yellow;
	private Integer red;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", yellow=" + yellow + ", red=" + red + "]";
	}
	
	
}
