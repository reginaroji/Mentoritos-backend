package org.generation.mentoritosdb.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.generation.mentoritosdb.model.Mentorship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MentorshipRepository extends JpaRepository<Mentorship, Long> {
	@Query("SELECT ms FROM Mentorship ms WHERE ms.id_schedule=?1")
	Optional<Mentorship> findByName (Long id_schedule, Long id_mentor, int day_week, Long id_student, String hour);

}
