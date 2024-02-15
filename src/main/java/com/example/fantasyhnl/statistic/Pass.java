package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "passes")
public class Pass {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer total;
	private Integer key;
	private String accuracy;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Pass [id=" + id + ", total=" + total + ", key=" + key + ", accuracy=" + accuracy + "]";
	}
	
	
}
