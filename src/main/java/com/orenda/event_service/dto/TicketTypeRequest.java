package com.orenda.event_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketTypeRequest {

    private String typeOfTicket;

    @NotNull(message = "Price can not be null")
    private Double price;

    private Long capacity;
}
