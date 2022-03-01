package org.generation.mentoritosdb.service;

import java.util.List;

import org.generation.mentoritosdb.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	private final SubjectRepository subjectRepository;
	
	@Autowired
	public SubjectService(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}
	
	public List<Subject> getSubjects() {
		return subjectRepository.findAll();
	}
	
	public Subject getSubject(Long idSubject) {
		return subjectRepository.findById(idSubject).orElseThrow(() -> new IllegalStateException("El tema con el id " + idSubject + " no existe."));
	}

}
