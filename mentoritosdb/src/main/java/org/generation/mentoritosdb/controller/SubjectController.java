package org.generation.mentoritosdb.controller;

import java.util.List;

import org.generation.mentoritosdb.model.Subject;
import org.generation.mentoritosdb.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/subjects/")
public class SubjectController {
	private final SubjectService subjectService;
	
	@Autowired
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	
	@GetMapping
	public List<Subject> getSubjects() {
		return subjectService.getSubjects();
	}
	
	@GetMapping (path="{idSubject}")
	public Subject getSubject(@PathVariable("idSubject") Long idSubject) {
		return subjectService.getSubject(idSubject);
	}
	
}
