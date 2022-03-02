package org.generation.mentoritosdb.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // ayuda a crear la herencia de la clase
public class UserMentor {
    private String  name;
    private String lastname;
    private String about;
    private String education;
    private String location;
    private String image_profile;
    private String phone;
    private LocalDate birthdate;
    private LocalDateTime register_date;
    private String uid;

    public UserMentor(String name, String lastname, String about, String education, String location, String image_profile, String phone, LocalDate birthdate, LocalDateTime register_date, String uid) {
        this.name = name;
        this.lastname = lastname;
        this.about = about;
        this.education = education;
        this.location = location;
        this.image_profile = image_profile;
        this.phone = phone;
        this.birthdate = birthdate;
        this.register_date = register_date;
        this.uid = uid;
    }

    public UserMentor() {
    }

    public String getUid() {
        return uid;
    }

    public void setuid(String uid) {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage_profile() {
        return image_profile;
    }

    public void setImage_profile(String image_profile) {
        this.image_profile = image_profile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDateTime getRegister_date() {
        return register_date;
    }

    public void setRegister_date(LocalDateTime register_date) {
        this.register_date = register_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", lastname='" + lastname + '\'' +
                ", about='" + about + '\'' +
                ", education='" + education + '\'' +
                ", location='" + location + '\'' +
                ", image_profile='" + image_profile + '\'' +
                ", phone='" + phone + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", register_date='" + register_date + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}