# ️Gym Tracker API

¡Bienvenido a **Gym Tracker API**! Este es un proyecto backend desarrollado desde cero para la gestión, optimización y seguimiento diario de entrenamientos de **Fuerza (Gimnasio)** y **Brazilian Jiu-Jitsu (BJJ)**.

El objetivo principal de este repositorio es demostrar el dominio de la arquitectura en capas y el desarrollo de un CRUD completo en el ecosistema Java/Spring.

---

## Tecnologías y Herramientas Utilizadas

* **Lenguaje:** Java 17 / 21
* **Framework Principal:** Spring Boot (Spring Web)
* **Persistencia de Datos:** Spring Data JPA / Hibernate
* **Base de Datos:** MySQL (Relacional)
* **Control de Versiones:** Git & GitHub
* **Pruebas de Endpoints:** Cliente HTTP integrado de IntelliJ IDEA (`.http`)

---

## Arquitectura del Proyecto

El proyecto sigue de forma estricta el patrón de **Arquitectura en Capas**, garantizando una separación limpia de responsabilidades:

1. **Capas de Controladores (`@RestController`):** Gestionan las peticiones HTTP entrantes (`GET`, `POST`, `PUT`, `DELETE`) y devuelven respuestas en formato JSON.
2. **Capa de Modelos/Entidades (`@Entity`):** Mapeo objeto-relacional (ORM) de las tablas `EntrenamientoBjj` y `EntrenamientoGimnasio` hacia MySQL.
3. **Capa de Repositorios (`JpaRepository`):** Abstracción completa de las operaciones de base de datos sin necesidad de picar consultas SQL nativas a mano.

---

## Endpoints Disponibles (CRUD Completo)

### Brazilian Jiu-Jitsu (`/api/bjj`)
* `GET /api/bjj` -> Obtiene todos los entrenamientos registrados.
* `GET /api/bjj/{id}` -> Busca un entrenamiento específico por su ID.
* `POST /api/bjj` -> Registra un nuevo entrenamiento (pasa duración, fecha, técnica y número de rolls).
* `PUT /api/bjj/{id}` -> Modifica los datos de un entrenamiento existente.
* `DELETE /api/bjj/{id}` -> Elimina un registro de la base de datos de forma permanente.

### Gimnasio (`/api/gimnasio`)
* Cuenta con los mismos endpoints simétricos (`GET`, `POST`, `PUT`, `DELETE`) bajo la ruta base `/api/gimnasio` para controlar ejercicios, series, repeticiones y pesos levantados.