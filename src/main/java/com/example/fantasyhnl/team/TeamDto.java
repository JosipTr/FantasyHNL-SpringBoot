package com.example.fantasyhnl.team;

import com.example.fantasyhnl.league.League;
import com.example.fantasyhnl.venue.Venue;

public record TeamDto(int id, String name, String code, Integer founded, String logo, League league, Venue venue) {
}
