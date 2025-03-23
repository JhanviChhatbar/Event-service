package com.orenda.event_service.service;

import com.orenda.event_service.dto.CreateEventRequest;
import com.orenda.event_service.dto.TicketTypeRequest;
import com.orenda.event_service.entity.Event;
import com.orenda.event_service.entity.TicketType;
import com.orenda.event_service.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(CreateEventRequest createEventRequest) {
        List<TicketType> ticketTypes = new ArrayList<>();
        for(TicketTypeRequest ticketTypeRequest : createEventRequest.getTicketTypes()){
            // check if new TicketType is required
            TicketType ticketType = TicketType.builder()
                    .capacity(ticketTypeRequest.getCapacity())
                    .typeOfTicket(ticketTypeRequest.getTypeOfTicket())
                    .price(ticketTypeRequest.getPrice())
                    .build();
            ticketTypes.add(ticketType);
        }

        Event event = Event.builder()
                .eventName(createEventRequest.getEventName())
                .venue(createEventRequest.getVenue())
                .date(createEventRequest.getDate())
                .ticketTypes(ticketTypes)
                .build();

        eventRepository.save(event);

        return event;
    }
}
