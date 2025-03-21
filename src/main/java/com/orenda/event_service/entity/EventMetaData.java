package com.orenda.event_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "event_metadata")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventMetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "metadata_key", nullable = false, length = 255)
    private String metadataKey;

    @Column(name = "metadata_value", columnDefinition = "jsonb", nullable = false)
    private String metadataValue;
}
