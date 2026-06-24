package com.jose.gymtracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "entrenamientos_gimnasio")
public class EntrenamientoGimnasio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String ejercicio;
    private int series;
    private int repeticiones;
    private int peso;

    public EntrenamientoGimnasio() {
    }

    public EntrenamientoGimnasio(long id, String ejercicio, int series, int repeticiones, int peso) {
        this.id = id;
        this.ejercicio = ejercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
