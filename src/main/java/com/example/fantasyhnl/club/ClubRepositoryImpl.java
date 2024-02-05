package com.example.fantasyhnl.club;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

@Repository
public class ClubRepositoryImpl implements ClubRepository{
	private final Gson gson = new Gson();
	private final FileReader reader;
	private final JsonReader jsonReader;
	Logger logger = LoggerFactory.getLogger(getClass());
	
	public ClubRepositoryImpl(@Value("${file.club.path}") String file_url) throws FileNotFoundException {
		super();
		this.reader = new FileReader(file_url);
		this.jsonReader = new JsonReader(this.reader);
		logger.info("ClubRepositoryImpl");
	}

	@Override
	public List<Club> getClubs() {
		logger.info("getClubs method called");
		JsonObject jsonObject = gson.fromJson(jsonReader, JsonObject.class);
        JsonArray responseArray = jsonObject.getAsJsonArray("response");
        List<Club> clubs = new ArrayList<>();

        for (int i = 0; i < responseArray.size(); i++) {
            JsonObject teamObject = responseArray.get(i).getAsJsonObject().getAsJsonObject("team");
            Club club = gson.fromJson(teamObject, Club.class);
            clubs.add(club);
        }
		return clubs;
	}
	
}
