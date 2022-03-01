package org.generation.mentoritosdb.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.generation.mentoritosdb.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
	@Query("SELECT h FROM Schedule h WHERE h.hour=?1") // selecciono todos los h igual a input
	Optional<Schedule> findByHour(LocalDateTime hour);
	/*@Query("SELECT s FROM Schedule s WHERE s.name=?1")
	Optional<Student> findByName(String name);*/
	
}//interface ScheduleRepository
