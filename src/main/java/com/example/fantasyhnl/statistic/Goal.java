package com.example.fantasyhnl.statistic;

import jakarta.persistence.EmbeddedId;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "goals")
public class Goal {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer total;
	private Integer conceded;
	private Integer assists;
	private Integer saves;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	
	@Override
	public String toString() {
		return "Goal [id=" + id + ", total=" + total + ", conceded=" + conceded + ", assists=" + assists + ", saves="
				+ saves + "]";
	}	
	
}