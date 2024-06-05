package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rival {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRival;

    @Column(nullable = false, length = 75)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;
}
