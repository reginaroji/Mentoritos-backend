package org.generation.mentoritosdb.service;

import java.util.Optional;

import org.generation.mentoritosdb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query("SELECT s FROM Student s WHERE s.uid=?1")
	Optional<Student> findByUID(String uid);
}
