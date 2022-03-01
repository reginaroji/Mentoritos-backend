package org.generation.mentoritosdb.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // ayuda a crear la herencia de la clase
public class User {
    private String  name;
    private String lastname;
    private String email;
    private String password;
    private String about;
    private String education;
    private String location;
    private String image_profile;
    private String phone;
    private String birthdate;
    private String register_date;
    private String uid;

    public User(String name, String lastname, String email, String password, String about, String education, String location, String image_profile, String phone, String birthdate, String register_date, String uid) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.about = about;
        this.education = education;
        this.location = location;
        this.image_profile = image_profile;
        this.phone = phone;
        this.birthdate = birthdate;
        this.register_date = register_date;
        this.uid = uid;
    }

    public User() {
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
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