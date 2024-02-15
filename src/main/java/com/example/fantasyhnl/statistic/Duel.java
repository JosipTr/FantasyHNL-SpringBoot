package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "duels")
public class Duel {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer total;
	private Integer won;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Duel [id=" + id + ", total=" + total + ", won=" + won + "]";
	}
	
}
