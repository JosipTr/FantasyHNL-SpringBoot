package com.example.fantasyhnl.team;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TeamServiceImpl implements TeamService{
	private final TeamRepository repository;

	@Override
	public List<TeamDto> getAllTeams() {
		var teams = repository.findAll();
		var teamDtos = teams.stream().map(Team::toTeamDto).toList();
		return teamDtos;
	}
}
