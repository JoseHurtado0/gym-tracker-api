package com.jose.gymtracker.controller;

import com.jose.gymtracker.model.EntrenamientoBjj;
import com.jose.gymtracker.repository.EntrenamientoBjjRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bjj")
public class EntrenamientoBjjController {

    private final EntrenamientoBjjRepository bjjRepository;

    public EntrenamientoBjjController(EntrenamientoBjjRepository bjjRepository) {
        this.bjjRepository = bjjRepository;
    }

    @GetMapping
    public List<EntrenamientoBjj> obtenerTodosLosEntrenamientosBjj() {
        return bjjRepository.findAll();
    }

    @PostMapping
    public EntrenamientoBjj crearEntrenamientoBjj(@RequestBody EntrenamientoBjj nuevoEntreno){
        return  bjjRepository.save(nuevoEntreno);
    }

    @DeleteMapping("/{id}")
    public void borrarEntrenamientoBjj(@PathVariable Long id){
        bjjRepository.deleteById(id);
    }
}