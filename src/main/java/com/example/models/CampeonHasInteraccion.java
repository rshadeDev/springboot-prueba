package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(CampeonHasInteraccionId.class)
public class CampeonHasInteraccion {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "campeon_id_campeon", nullable = false)
    private Campeon campeon;

    @Id
    @ManyToOne
    @JoinColumn(name = "campeon_counter_id_counter", nullable = false)
    private Counter counter;

    @Id
    @ManyToOne
    @JoinColumn(name = "interaccion_id_interaccion", nullable = false)
    private Interaccion interaccion;
}
