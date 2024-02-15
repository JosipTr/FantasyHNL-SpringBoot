package com.example.fantasyhnl.statistic;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Embeddable
@ToString
@EqualsAndHashCode
public class StatisticId {
	private int playerId;
	private int fixtureId;
}
