package com.jose.gymtracker.repository;

import com.jose.gymtracker.model.EntrenamientoGimnasio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenamientoGimnasioRepository extends JpaRepository<EntrenamientoGimnasio, Long>{
}
