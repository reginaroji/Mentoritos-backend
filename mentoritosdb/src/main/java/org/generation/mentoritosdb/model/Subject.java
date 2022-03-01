package org.generation.mentoritosdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="subject")
public class Subject {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column
	private Long idSubject;
	private String subjectName;
	private String imageSubject;
	
	public Subject() {
		// Constructor vacío
	}

	public Subject(Long idSubject, String subjectName, String imageSubject) {
		super();
		this.idSubject = idSubject;
		this.subjectName = subjectName;
		this.imageSubject = imageSubject;
	}

	public Long getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getImageSubject() {
		return imageSubject;
	}

	public void setImageSubject(String imageSubject) {
		this.imageSubject = imageSubject;
	}

	@Override
	public String toString() {
		return "Subject [idSubject=" + idSubject + ", subjectName=" + subjectName + ", imageSubject=" + imageSubject
				+ "]";
	}
	
	
}
