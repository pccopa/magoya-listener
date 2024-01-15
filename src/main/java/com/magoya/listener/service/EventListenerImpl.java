package com.magoya.listener.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.magoya.listener.models.EventModel;
import com.magoya.listener.models.EventType;
import com.magoya.listener.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@EnableRabbit
public class EventListenerImpl {

    private final ObjectMapper mapper;
    private final EventRepository repository;


    @RabbitListener(queues = "event_notification")
    public void handleMessage(String message) {
        EventModel event = null;
        try {
            event = mapper.readValue(message, EventModel.class);
            if (event.getType().equals(EventType.GREATER_THAN_10000)) {
                log.info("A greater than USD 10000 has been made.... {}", event.getData());
            }
            event.setData(mapper.writeValueAsString(event.getData()));
            repository.save(event);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



}
