package com.jose.gymtracker.controller;


import com.jose.gymtracker.model.EntrenamientoBjj;
import com.jose.gymtracker.model.EntrenamientoGimnasio;
import com.jose.gymtracker.repository.EntrenamientoGimnasioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gimnasio")
public class EntrenamientoGimnasioController {

    private final EntrenamientoGimnasioRepository gimnasioRepository;

    public EntrenamientoGimnasioController(EntrenamientoGimnasioRepository gimnasioRepository) {
        this.gimnasioRepository = gimnasioRepository;
        ;
    }

    @GetMapping
    public List<EntrenamientoGimnasio> obteEntrenamientoGimnasios(){
        return gimnasioRepository.findAll();

    }
    @PostMapping
    public EntrenamientoGimnasio crearEntrenaminetoGimnasio(@RequestBody EntrenamientoGimnasio nuevoEntreno){
        return gimnasioRepository.save(nuevoEntreno);
    }
    @DeleteMapping("/{id}")
    public void borrarEntrenamientoGimnasio(@PathVariable Long id){
        gimnasioRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntrenamientoGimnasio> actualizarEntrenamientoGimnasio(@PathVariable Long id, @RequestBody EntrenamientoGimnasio datosActualizados){

        EntrenamientoGimnasio entrenoExistente = gimnasioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se puede actualizar. ID de gimnasio no encontrado: " + id));

        entrenoExistente.setEjercicio(datosActualizados.getEjercicio());
        entrenoExistente.setPeso(datosActualizados.getPeso());
        entrenoExistente.setSeries(datosActualizados.getSeries());
        entrenoExistente.setRepeticiones(datosActualizados.getRepeticiones());

        EntrenamientoGimnasio entrenoGuardado = gimnasioRepository.save(entrenoExistente);

        return ResponseEntity.ok(entrenoGuardado);
    }

}
