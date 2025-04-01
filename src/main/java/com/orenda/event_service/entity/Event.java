package com.orenda.event_service.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String eventName;

    @Column(nullable = false)
    private String venue;

    private Date date;

    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private List<TicketType> ticketTypes = new ArrayList<>();

//    public void setTicketTypes(List<TicketType> ticketTypes) {
//        this.ticketTypes.clear();
//        for (TicketType ticketType : ticketTypes) {
//            ticketType.setEvent(this);  // Maintain bidirectional relationship
//            this.ticketTypes.add(ticketType);
//        }
//    }
//
//    public void addTicketType(TicketType ticketType) {
//        ticketTypes.add(ticketType);
//        ticketType.setEvent(this);  // Set the bidirectional relationship
//    }

    // will update as improvement in functionality
//    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
//    private EventMetaData eventMetaData;


}
