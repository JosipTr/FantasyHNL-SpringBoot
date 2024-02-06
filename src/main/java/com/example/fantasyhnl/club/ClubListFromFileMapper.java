package com.example.fantasyhnl.club;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

@Component
public class ClubListFromFileMapper {
	private final Gson gson = new Gson();
	private final FileReader reader;
	private final JsonReader jsonReader;
	
	public ClubListFromFileMapper(@Value("${file.club.path}") String file_url) throws FileNotFoundException {
		super();
		this.reader = new FileReader(file_url);
		this.jsonReader = new JsonReader(this.reader);
	}
	
	public List<Club> getClubs() {
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
