package org.generation.mentoritosdb.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.generation.mentoritosdb.model.Mentor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {
    private final MentorRepository mentorRepository;

    @Autowired
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }//constructor

    public List<Mentor> getMentores() {
        return mentorRepository.findAll(); 
    }

    public Mentor getMentor(Integer id_mentor) {
        return mentorRepository.findById(id_mentor).orElseThrow(() -> new IllegalMonitorStateException("EL Mentor con el id : " + id_mentor + "no existe"));
    }
    
    public void deleteMentor(Integer id_mentor) {
		if (mentorRepository.existsById(id_mentor)) {
			mentorRepository.deleteById(id_mentor);
		}// if exist
	}//deleteMentor

	public void addMentor(Mentor mentor) {
		Optional<Mentor> mentorByUID = mentorRepository.findByUID(mentor.getUid());
		if (mentorByUID.isPresent()) {
			throw new IllegalStateException("Este correo "
					+ "[" + mentor.getUid() + "] ya ha sido registrado.");
		}else {
			mentorRepository.save(mentor);
		}//else //if				
	}//addMentor

	public void updateMentor(Integer id_mentor, String name, String lastname, String email, String password, String about, String education, String location, String image_profile, String phone, LocalDate birthdate, LocalDateTime register_date, String uid, Integer id_subject, String modality, String video, Long price, String portfolio) {
		if (mentorRepository.existsById(id_mentor)) { 
			Mentor m = mentorRepository.getById(id_mentor);
			if (id_mentor != null) m.setId_mentor(id_mentor); 
			if (name != null) m.setName(name); 
			if (lastname != null) m.setLastname(lastname);
			if (about != null) m.setAbout(about);
			if (education != null) m.setEducation(education);
			if (location != null) m.setLocation(location); 
			if (image_profile != null) m.setImage_profile(image_profile);
			if (phone != null) m.setPhone(phone);
			if (birthdate != null) m.setBirthdate(birthdate); 
			if (register_date != null) m.setRegister_date(register_date);
			if (uid != null) m.setuid(uid);
			if (id_subject != null) m.setId_subject(id_subject);
			if (modality != null) m.setModality(modality);
			if (video != null) m.setVideo(video);
			if (price != null) m.setPrice(price);
			if (portfolio != null) m.setPortfolio(portfolio);
			mentorRepository.save(m);
			
		}else {
			System.out.println("No existe el id "+id_mentor);
			System.err.println("*No existe el id "+id_mentor);
		}// if 		
	} // updateMentor
}
