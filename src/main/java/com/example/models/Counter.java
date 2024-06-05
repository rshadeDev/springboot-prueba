package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Counter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCounter;

    @Column(nullable = false, length = 70)
    private String nombre;

    @Column(nullable = false)
    private Float porcentajeVictoria;

    @Column(nullable = false)
    private Float porcentajeDerrota;

    @ManyToOne
    @JoinColumn(name =  "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;
}
