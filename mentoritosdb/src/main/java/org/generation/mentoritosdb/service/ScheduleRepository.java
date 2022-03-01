package org.generation.mentoritosdb.service;

import java.util.Optional;

import org.generation.mentoritosdb.model.Schedule;
import org.generation.mentoritosdb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
	/*@Query("SELECT s FROM Schedule s WHERE s.name=?1")
	Optional<Student> findByName(String name);*/
	
}//interface ScheduleRepository
