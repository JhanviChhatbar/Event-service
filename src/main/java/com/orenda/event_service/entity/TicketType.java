package com.orenda.event_service.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", referencedColumnName = "id",  updatable = true, insertable = true)
    private Event event;

    //@Enumerated(EnumType.STRING)    //Improvement
    private String typeOfTicket;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Long capacity;
}
