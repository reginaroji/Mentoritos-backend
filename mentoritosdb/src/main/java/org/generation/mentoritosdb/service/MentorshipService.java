package org.generation.mentoritosdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.mentoritosdb.model.Mentorship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorshipService {
	
	private final MentorshipRepository mentorshipRepository;
	
	@Autowired
	public MentorshipService(MentorshipRepository mentorshipRepository) {
		this.mentorshipRepository = mentorshipRepository;		
	}//constructor

	public List<Mentorship> getMentorship() {
		return mentorshipRepository.findAll();
	}//getMentorship

	public Mentorship getMentorship(Long id_mentorship) {
		return mentorshipRepository.findById(id_mentorship).
				orElseThrow(()-> new IllegalStateException
				("Mentorship" + " con el id " + id_mentorship + " no existe."));
	}//getMentorship

	public void addMentorship(Mentorship mentorship) {
		Optional<Mentorship> mentorshipByName =	mentorshipRepository.findByName(mentorship.getId_schedule(), mentorship.getId_mentor(), mentorship.getDatetime(), mentorship.getId_student());
		if (mentorshipByName.isPresent()) {	
			throw new IllegalStateException ("Mentorship ya existe");
		}else {
			mentorshipRepository.save(mentorship);
		}			
	}//addMentorship

}//class MentorshipService
