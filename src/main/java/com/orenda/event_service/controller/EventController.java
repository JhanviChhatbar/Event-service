package com.orenda.event_service.controller;

import com.orenda.event_service.dto.CreateEventRequest;
import com.orenda.event_service.entity.Event;
import com.orenda.event_service.service.EventService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@Valid @RequestBody CreateEventRequest createEventRequest){
        Event event = eventService.createEvent(createEventRequest);
        return new ResponseEntity<>(event, HttpStatus.CREATED);
    }


}
