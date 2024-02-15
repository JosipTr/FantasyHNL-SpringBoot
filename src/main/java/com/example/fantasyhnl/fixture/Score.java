package com.example.fantasyhnl.fixture;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Score {
	@Id
	@JsonIgnore
	private int id;
	@OneToOne(mappedBy = "score")
	private HalfTime halfTime;
	@OneToOne(mappedBy = "score")
	private FullTime fullTime;
	@OneToOne(mappedBy = "score")
	private ExtraTime extraTime;
	@OneToOne(mappedBy = "score")
	private PenaltyTime penaltyTime;
	@OneToOne
	@MapsId
	@JsonIgnore
	private Fixture fixture;
	@Override
	public String toString() {
		return "Score [id=" + id + ", halfTime=" + halfTime + ", fullTime=" + fullTime + ", extraTime=" + extraTime
				+ ", penaltyTime=" + penaltyTime + "]";
	}
	
}
