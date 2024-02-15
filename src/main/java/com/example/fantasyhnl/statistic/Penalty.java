package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "penalties")
public class Penalty {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer won;
	private Integer commited;
	private Integer scored;
	private Integer missed;
	private Integer saved;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Penalty [id=" + id + ", won=" + won + ", commited=" + commited + ", scored=" + scored + ", missed="
				+ missed + ", saved=" + saved + "]";
	}
	
	
}
