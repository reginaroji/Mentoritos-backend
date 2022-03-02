package org.generation.mentoritosdb.controller;

import java.util.List;

import org.generation.mentoritosdb.model.Mentorship;
import org.generation.mentoritosdb.service.MentorshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/mentorship/")
public class MentorshipController {
	
	private final MentorshipService mentorshipService;
	
	@Autowired
	public MentorshipController(MentorshipService mentorshipService ) {
		this.mentorshipService = mentorshipService;
	}//constructor
	
	@GetMapping
	public List<Mentorship> getMentorships(){
		return mentorshipService.getMentorships();
	}// getMentorship
	
	@GetMapping(path="{id_mentorship}")
	public Mentorship getMentorship(@PathVariable("id_mentorship") Long id_mentorship){
		return mentorshipService.getMentorship(id_mentorship);
	}// getMentorship
	
	@PostMapping
	public void addMentorship(@RequestBody Mentorship mentorship) {
		mentorshipService.addMentorship(mentorship);
	}//addMentorship
}

