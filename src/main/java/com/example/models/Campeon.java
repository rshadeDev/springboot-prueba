package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Campeon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCampeon;

    @Column(nullable = false, length = 15)
    private String tipoAtaque;

    @Column(nullable = false)
    private Integer vidaBase;

    @Column(nullable = false)
    private Boolean manaBool;

    @Column(nullable = false)
    private Integer energiaBool;

    @Column(nullable = false)
    private Float velocidadAtaqueBase;

    @Column(nullable = false)
    private Float velocidadMovimientoBase;

    @Column(nullable = false, length = 70)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", nullable = false)
    private Nacionalidad nacionalidad;

    @ManyToOne
    @JoinColumn(name = "especie_id_especie", nullable = false)
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter", nullable = false)
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival", nullable = false)
    private Rival rival;
}
