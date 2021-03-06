package org.generation.mentoritosdb.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.generation.mentoritosdb.model.Student;
import org.generation.mentoritosdb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping (path="/api/students/")
@CrossOrigin("*")
public class StudentController {
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
		System.out.println("Si est? creando el objeto studentService");
	}
	
	@GetMapping
	public List<Student> getStudents() {
		//System.out.println("Si est? entrando a getStudents del controller");
		return studentService.getStudents();
	}
	
	@GetMapping (path="{idStudent}")
	public Student getStudent(@PathVariable("idStudent") Long idstudent) {
		return studentService.getStudent(idstudent);
	}
	
	@GetMapping (path="uid/{uidStudent}")
	public Student getStudentByUID(@PathVariable("uidStudent") String uidStudent) {
		return studentService.getStudentByUID(uidStudent);
	}
	
	@DeleteMapping (path="{idStudent}")
	public void deleteStudent(@PathVariable("idStudent") Long idstudent) {
		studentService.deleteStudent(idstudent);
	}
	
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@PutMapping (path="{idStudent}")
	public void updateStudent(@PathVariable("idStudent") Long idStudent, 
			@RequestParam (required=false) String uid, 
			@RequestParam (required=false) String name, 
			@RequestParam (required=false) String lastname, 
			@RequestParam (required=false) LocalDate birthday, 
			@RequestParam (required=false) String location,
			@RequestParam (required=false) String phone, 
			@RequestParam (required=false) String imageProfile, 
			@RequestParam (required=false) String about, 
			@RequestParam (required=false) String education, 
			@RequestParam (required=false) String interests,
			@RequestParam (required=false) LocalDateTime registerDate) {
		
		studentService.updateStudent(idStudent, uid, name, lastname, birthday, location, phone, imageProfile, about, education, interests, registerDate);
	}

}
