package org.generation.mentoritosdb.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mentorship")
public class Mentorship {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mentorship", unique = true, nullable = false)
    private Long id_mentorship;
    private Long id_schedule;
    private Long id_mentor;
    private LocalDateTime datetime;
    private Long id_student;


    public Mentorship(Long id_mentorship, Long id_schedule, Long id_mentor, LocalDateTime datetime, Long id_student) {
		super();
		this.id_mentorship = id_mentorship;
		this.id_schedule = id_schedule;
		this.id_mentor = id_mentor;
		this.datetime = datetime;
		this.id_student = id_student;
	}

	public Mentorship() {

    }

	public Long getId_mentorship() {
		return id_mentorship;
	}

	public void setId_mentorship(Long id_mentorship) {
		this.id_mentorship = id_mentorship;
	}

	public Long getId_schedule() {
		return id_schedule;
	}

	public void setId_schedule(Long id_schedule) {
		this.id_schedule = id_schedule;
	}

	public Long getId_mentor() {
		return id_mentor;
	}

	public void setId_mentor(Long id_mentor) {
		this.id_mentor = id_mentor;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	@Override
	public String toString() {
		return "Mentorship [id_mentorship=" + id_mentorship + ", id_schedule=" + id_schedule + ", id_mentor="
				+ id_mentor + ", datetime=" + datetime + ", id_student=" + id_student + "]";
	}
	
	
	
}