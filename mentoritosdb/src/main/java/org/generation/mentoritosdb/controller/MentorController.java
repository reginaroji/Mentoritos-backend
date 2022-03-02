package org.generation.mentoritosdb.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.generation.mentoritosdb.model.Mentor;
import org.generation.mentoritosdb.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/mentors/")
public class MentorController {

	private final MentorService mentorService;

	@Autowired
	public MentorController(MentorService mentorService){
		this.mentorService = mentorService;
	}//constructor //es la constante+constructor

	@GetMapping
	public List<Mentor> getMentores(){
		return mentorService.getMentores();
	}

	@GetMapping(path = "{id_mentor}") 
	public Mentor getMentor(@PathVariable("id_mentor") Integer id_mentor){ 
		return mentorService.getMentor(id_mentor);
	}//get mentor
	
	@GetMapping(path = "{uid_mentor}") 
	public Mentor getMentorByUID(@PathVariable("uid_mentor") String uid_mentor){ 
		return mentorService.getMentorByUID(uid_mentor);
	}//get mentor

	@DeleteMapping(path = "{id_mentor}")
	public void deleteMentor(@PathVariable("id_mentor") Integer id_mentor) {
		mentorService.deleteMentor(id_mentor);
	}

	@PostMapping
	public void addMentor(@RequestBody Mentor mentor) {
		mentorService.addMentor(mentor);
	}

	@PutMapping(path = "{id_mentor}")
	public void updateMentor(@PathVariable ("id_mentor") Integer id_mentor,
		@RequestParam(required=false) Long price,
		@RequestParam(required=false) String portfolio,
		@RequestParam(required=false) String name,
		@RequestParam(required=false) String lastname,
		@RequestParam(required=false) String email,
		@RequestParam(required=false) String password,
		@RequestParam(required=false) String about,
		@RequestParam(required=false) String education,
		@RequestParam(required=false) String location,
		@RequestParam(required=false) String image_profile,
		@RequestParam(required=false) String phone,
		@RequestParam(required=false) LocalDate birthdate,
		@RequestParam(required=false) LocalDateTime register_date,
		@RequestParam(required=false) String uid,
		@RequestParam(required=false) Integer id_subject,
		@RequestParam(required=false) String modality,
		@RequestParam(required=false) String video){
			mentorService.updateMentor (id_mentor, name, lastname, email, password, about, education, location, image_profile, phone, birthdate,
					register_date, uid, id_subject, modality, video, price, portfolio);
		}

	}
