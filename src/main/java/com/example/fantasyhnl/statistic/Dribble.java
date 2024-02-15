package com.example.fantasyhnl.statistic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "dribbles")
public class Dribble {
	@EmbeddedId
	@JsonIgnore
	private StatisticId id;
	private Integer attempts;
	private Integer success;
	private Integer past;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Statistic statistic;
	
	@Override
	public String toString() {
		return "Dribble [id=" + id + ", attempts=" + attempts + ", success=" + success + ", past=" + past + "]";
	}
	
}
