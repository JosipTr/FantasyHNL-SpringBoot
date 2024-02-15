package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "fouls")
public class Foul {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer drawn;
	private Integer committed;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Foul [id=" + id + ", drawn=" + drawn + ", committed=" + committed + "]";
	}
	
	
}
