package com.jose.gymtracker;

import com.jose.gymtracker.model.EntrenamientoBjj;
import com.jose.gymtracker.model.EntrenamientoGimnasio;
import com.jose.gymtracker.repository.EntrenamientoBjjRepository;
import com.jose.gymtracker.repository.EntrenamientoGimnasioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GymTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymTrackerApplication.class, args);
	}

	//@Bean
	//public CommandLineRunner ejecutarAlArranque(
		//	EntrenamientoBjjRepository bjjRepo,
		//	EntrenamientoGimnasioRepository gymRepo){

		//return args -> {
			//System.out.println("============== INICIANDO INYECCIÓN DE ENTRENAMIENTOS ============");
			//EntrenamientoBjj entrenoBjj = new EntrenamientoBjj(null, 90, "2026-06-24", "Pasaje Guardia", 4);

			//EntrenamientoGimnasio entrenoGym = new EntrenamientoGimnasio(0, "Press Banca", 4, 12, 80);

			//bjjRepo.save(entrenoBjj);
			//gymRepo.save(entrenoGym);
			//System.out.println("====== ¡ENTRENAMIENTOS GUARDADOS EN MYSQL CON ÉXITO! ======");
	//	};
	//}

}
