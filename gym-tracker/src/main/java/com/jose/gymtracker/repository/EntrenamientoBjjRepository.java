package com.jose.gymtracker.repository;

import com.jose.gymtracker.model.EntrenamientoBjj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenamientoBjjRepository extends JpaRepository<EntrenamientoBjj, Long> {
}
