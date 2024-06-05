package com.example.models;

import java.io.Serializable;
import java.util.Objects;

public class CampeonHasInteraccionId implements Serializable{
    
    private Integer campeon;
    private Integer counter;
    private Integer interaccion;

    public CampeonHasInteraccionId() {}

    public CampeonHasInteraccionId(Integer campeon, Integer counter, Integer interaccion) {
        this.campeon = campeon;
        this.counter = counter;
        this.interaccion = interaccion;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CampeonHasInteraccionId that = (CampeonHasInteraccionId) o;
        return Objects.equals(campeon, that.campeon) &&
                Objects.equals(counter, that.counter) &&
                Objects.equals(interaccion, that.interaccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campeon, counter, interaccion);
    }
}
