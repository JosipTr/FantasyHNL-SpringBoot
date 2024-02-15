package com.example.fantasyhnl.player;

import java.util.List;
import java.util.Set;

import com.example.fantasyhnl.player.birth.Birth;
import com.example.fantasyhnl.statistic.Statistic;
import com.example.fantasyhnl.team.Team;

public record PlayerDto(int id, String name, Integer age, Integer number, String position, String firstname,
		String lastname, String nationality, String height, String weight, Boolean injured, String photo, Birth birth,
		Team team, List<Statistic> statistics) {
}
