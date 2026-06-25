package com.jose.gymtracker.controller;

import com.jose.gymtracker.model.EntrenamientoBjj;
import com.jose.gymtracker.repository.EntrenamientoBjjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bjj")
public class EntrenamientoBjjController {

    @Autowired
    private EntrenamientoBjjRepository bjjRepository;

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
    public ResponseEntity<String> borrarEntrenamientoBjj(@PathVariable Long id){
        bjjRepository.deleteById(id);

        String mensaje = "El entrenamiento de BJJ con ID" + id + "ha sido borrado.";

        return ResponseEntity.ok(mensaje);

    }

    @PutMapping("/{id}")
    public ResponseEntity<EntrenamientoBjj> actualizarEntrenamientoBjj(@PathVariable Long id, @RequestBody EntrenamientoBjj datosActualizados) {

        EntrenamientoBjj entrenoExistente = bjjRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se puede actualizar. ID no encontrado" + id));

        entrenoExistente.setDuracion(datosActualizados.getDuracion());
        entrenoExistente.setFecha(datosActualizados.getFecha());
        entrenoExistente.setTecnica(datosActualizados.getTecnica());
        entrenoExistente.setRolls(datosActualizados.getRolls());

        EntrenamientoBjj entrenoGuardado = bjjRepository.save(entrenoExistente);

        return  ResponseEntity.ok(entrenoGuardado);

    }
}