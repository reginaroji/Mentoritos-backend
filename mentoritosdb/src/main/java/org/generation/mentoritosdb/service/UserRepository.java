package org.generation.mentoritosdb.service;

import java.util.Optional;

import org.generation.mentoritosdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT u FROM User u WHERE u.email=?1")
	Optional<User> findByNombre (String nombre);
	
	@Query("SELECT u FROM User u WHERE u.uid=?1")
	Optional<User> findByUID(String uid);
}
