package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Interaccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInteraccion;

    @Column(nullable = false, length = 45)
    private String nombreInteraccion;

    @Column(nullable  = false)
    private Integer limiteInteraccion;
}
