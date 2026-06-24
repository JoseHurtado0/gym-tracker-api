package com.jose.gymtracker.model;

import jakarta.persistence.*;


@Entity
@Table(name = "entrenamientos_bjj")
public class EntrenamientoBjj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;
    private int duracion;
    private String tecnica;
    private int rolls;

    public EntrenamientoBjj() {
    }

    public EntrenamientoBjj(Long id, int duracion, String fecha, String tecnica, int rolls) {
        this.id = id;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tecnica = tecnica;
        this.rolls = rolls;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getRolls() {
        return rolls;
    }

    public void setRolls(int rolls) {
        this.rolls = rolls;
    }
}
