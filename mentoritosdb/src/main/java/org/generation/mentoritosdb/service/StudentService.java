package org.generation.mentoritosdb.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.generation.mentoritosdb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
		System.out.println("Si está creando el objeto");
	}

	public List<Student> getStudents() {
		System.out.println("Si está entrando a getStudents");
		return studentRepository.findAll();
	}

	public Student getStudent(Long idstudent) {
		return studentRepository.findById(idstudent).orElseThrow(() -> new IllegalStateException("El estudiante con el id " + idstudent + " no existe."));
	}

	public void deleteStudent(Long idstudent) {
		if(studentRepository.existsById(idstudent))
			studentRepository.deleteById(idstudent);	
	}

	public void addStudent(Student student) {
		Optional<Student> studentByUID = studentRepository.findByUID(student.getUid());
		if(studentByUID.isPresent()) { //isPresent pregunta si ya existe en la tabla este producto
			throw new IllegalStateException("El estudiante con el nombre [" + student.getUid() + "] ya existe.");
		}
		else {
			studentRepository.save(student);
		}
	}

	public void updateStudent(Long idStudent,
			String uid,
			String name,
			String lastname,
			LocalDate birthday,
			String location,
			String phone,
			String imageProfile,
			String about,
			String education,
			String interests,
			LocalDateTime registerDate) {
		
		if(studentRepository.existsById(idStudent)) {
			Student student = studentRepository.getById(idStudent);
			if (name != null) student.setName(name);
			if (lastname != null) student.setLastname(lastname);
			if (birthday != null) student.setBirthday(birthday);
			if (location != null) student.setLocation(location);
			if (phone != null) student.setPhone(phone);
			if (imageProfile != null) student.setImageProfile(imageProfile);
			if (about != null) student.setAbout(about);
			if (education != null) student.setEducation(education);
			if (interests != null) student.setInterests(interests);
			if (registerDate != null) student.setRegisterDate(registerDate);
			
			studentRepository.save(student);
		}
		else {
			System.out.println("No existe el id " + idStudent);
			System.err.println("No existe el id " + idStudent);
		}

		
	}

	public Student getStudentByUID(String uidStudent) {
		return studentRepository.findByUID(uidStudent).orElseThrow(() -> new IllegalMonitorStateException("EL estudiante con el uid : " + uidStudent + "no existe"));
	}
	
	
}
