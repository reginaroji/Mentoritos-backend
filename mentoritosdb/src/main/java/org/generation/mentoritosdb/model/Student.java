package org.generation.mentoritosdb.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="student")
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idStudent", unique = true, nullable = false)
	private Long idStudent;
	private String uid;
	private String name;
	private String lastname;
	private LocalDate birthday;
	private String location;	
	private String phone;
	private String imageProfile;
	private String about;
	private String education;
	private String interests;
	private LocalDateTime registerDate;
	private Long user_id;
	
	public Student() {
		// Constructor vacío
	}
	
	public Student(Long idStudent, String uid, String name, String lastname, LocalDate birthday, String location,
			String phone, String imageProfile, String about, String education, String interests,
			LocalDateTime registerDate, Long user_id) {
		super();
		this.idStudent = idStudent;
		this.uid = uid;
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.location = location;
		this.phone = phone;
		this.imageProfile = imageProfile;
		this.about = about;
		this.education = education;
		this.interests = interests;
		this.registerDate = registerDate;
		this.user_id = user_id;
	}

	public Long getIdStudent() {
		return idStudent;
	}
	
	/*public void setIdStudent() {
		this.idStudent = idStudent;
	} */

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageProfile() {
		return imageProfile;
	}

	public void setImageProfile(String imageProfile) {
		this.imageProfile = imageProfile;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registration) {
		this.registerDate = registration;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", uid=" + uid + ", name=" + name + ", lastname=" + lastname
				+ ", birthday=" + birthday + ", location=" + location + ", phone=" + phone + ", imageProfile="
				+ imageProfile + ", about=" + about + ", education=" + education + ", interests=" + interests
				+ ", registerDate=" + registerDate + ", user_id=" + user_id + "]";
	}

}
