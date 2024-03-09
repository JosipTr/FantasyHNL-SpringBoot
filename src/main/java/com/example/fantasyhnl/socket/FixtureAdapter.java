package com.example.fantasyhnl.socket;

import java.lang.reflect.Type;

import com.example.fantasyhnl.fixture.Fixture;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class FixtureAdapter implements JsonSerializer<Fixture>{

	@Override
	public JsonElement serialize(Fixture src, Type typeOfSrc, JsonSerializationContext context) {
		
	    JsonObject jsonObject = new JsonObject();
	    jsonObject.addProperty("id", src.getId());
	    jsonObject.addProperty("referee", src.getReferee());
	    jsonObject.addProperty("referee", src.getReferee());
	    jsonObject.addProperty("referee", src.getReferee());
	    jsonObject.addProperty("referee", src.getReferee());
	    jsonObject.addProperty("referee", src.getReferee());
	    jsonObject.addProperty("referee", src.getReferee());
	    return jsonObject;      
	}

}
