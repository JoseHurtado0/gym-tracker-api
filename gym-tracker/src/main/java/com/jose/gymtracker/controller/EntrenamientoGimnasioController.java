package com.jose.gymtracker.controller;


import com.jose.gymtracker.model.EntrenamientoGimnasio;
import com.jose.gymtracker.repository.EntrenamientoGimnasioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gimnasio")
public class EntrenamientoGimnasioController {

    private final EntrenamientoGimnasioRepository gimnasioRepository;

    public EntrenamientoGimnasioController(EntrenamientoGimnasioRepository gimnasioRepository) {
        this.gimnasioRepository = gimnasioRepository;
    }

    @GetMapping
    public List<EntrenamientoGimnasio> obteEntrenamientoGimnasios(){
        return gimnasioRepository.findAll();

    }
}
