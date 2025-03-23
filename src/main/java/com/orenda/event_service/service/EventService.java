package com.orenda.event_service.service;

import com.orenda.event_service.dto.CreateEventRequest;
import com.orenda.event_service.entity.Event;

public interface EventService {

    Event createEvent(CreateEventRequest createEventRequest);
}
