package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "shots")
public class Shot {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer total;
	private Integer on_goal;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Shot [id=" + id + ", total=" + total + ", on_goal=" + on_goal + "]";
	}
	
	
}
