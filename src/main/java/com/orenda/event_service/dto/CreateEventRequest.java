package com.orenda.event_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateEventRequest {

    @NotNull(message = "Event name can not be null")
    private String eventName;

    @NotNull(message = "Venue can not be null")
    private String venue;

    @NotNull(message = "Event date can not be null")
    private Date date;

    @NotNull(message = "Ticket details are required")
    private List<TicketTypeRequest> ticketTypes;

    //private String eventStatus;  // will update as improvement in functionality
    // private EventMetaData eventMetaData;  // will update as improvement in functionality
}
