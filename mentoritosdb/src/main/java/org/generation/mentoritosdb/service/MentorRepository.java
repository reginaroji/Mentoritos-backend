package org.generation.mentoritosdb.service;

import java.util.Optional;

import org.generation.mentoritosdb.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {
	@Query("SELECT m FROM Mentor m WHERE m.email=?1")
	   Optional<Mentor> findByEmail(String email);
}
