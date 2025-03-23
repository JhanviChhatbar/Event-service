package com.orenda.event_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ticket_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    //@Enumerated(EnumType.STRING)    //Improvement
    private String typeOfTicket;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Long capacity;
}
