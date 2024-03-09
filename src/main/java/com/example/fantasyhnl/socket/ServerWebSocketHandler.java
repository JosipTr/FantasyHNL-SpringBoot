package com.example.fantasyhnl.socket;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.AbstractWebSocketMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.util.HtmlUtils;

import com.example.fantasyhnl.country.Country;
import com.example.fantasyhnl.country.CountryService;
import com.example.fantasyhnl.fixture.Fixture;
import com.example.fantasyhnl.fixture.FixtureRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@EnableScheduling
@Component
@NoArgsConstructor
@Transactional
public class ServerWebSocketHandler extends TextWebSocketHandler {
	
	 private List<WebSocketSession> sessions = Collections.synchronizedList(new ArrayList<>());
	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		String request = message.getPayload();
		String response = String.format("response from server to '%s'", HtmlUtils.htmlEscape(request));
		session.sendMessage(new TextMessage(response));
	}
	
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session); // Dodaj novu sesiju na listu
        
    }
//    @Scheduled(fixedRate = 10000)
//    @Transactional
//    public void ggg() {
////    	var fixture = fixtureRepository.getById(1034796);
////    	System.out.println(fixture);
////    	System.out.println(gson.toJson(fixture, Fixture.class));
////    	System.out.println(gson.toJson(fixture));
//    }

//    @Scheduled(fixedRate = 10000)
    
//    public void greet() throws IOException { 
//    	var fixture = fixtureRepository.getReferenceById(1034681);
//    	var fixtureJson = fixture.toString();
//        for (WebSocketSession session : sessions) {
//            if (session.isOpen()) {
//                session.sendMessage(new TextMessage(fixtureJson)); // Periodično šalji poruku svakih 10 sekundi svim aktivnim sesijama
//            }
//    }
//        }
//    
//    
//    public String autosToJson(Fixture fixture) {  
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        Gson gson = gsonBuilder.registerTypeAdapter(Fixture.class, new FixtureAdapter()).create();
//        return gson.toJson(fixture);
//    }   
}
