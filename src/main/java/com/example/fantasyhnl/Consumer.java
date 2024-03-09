package com.example.fantasyhnl;
import java.io.IOException;

import org.slf4j.*;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.fantasyhnl.fixture.FixtureRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private final FixtureRepository fixtureRepository;
    
    @KafkaListener(topics = "users", groupId = "group_id")
    public String consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        var fixtureOptional = fixtureRepository.findById(Integer.valueOf(message));
        if (fixtureOptional.isPresent()) {
        	var fixture = fixtureOptional.get();
        	return fixture.toString();
        }
		return null;
    }
}