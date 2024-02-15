package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "tackles")
public class Tackle {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer total;
	private Integer blocks;
	private Integer intereptions;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	@Override
	public String toString() {
		return "Tackle [id=" + id + ", total=" + total + ", blocks=" + blocks + ", intereptions=" + intereptions + "]";
	}
	
}
