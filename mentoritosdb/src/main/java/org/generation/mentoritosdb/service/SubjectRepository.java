package org.generation.mentoritosdb.service;

import java.util.Optional;

import org.generation.mentoritosdb.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	/*@Query("SELECT s FROM Subject s WHERE s.subject_name=?1")
	Optional<Subject> findByName(String subjectName);*/
}
