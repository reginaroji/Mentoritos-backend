package org.generation.mentoritosdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mentor", unique = true, nullable = false)
    private Integer id_mentor;
    private Integer id_subject;
    private String modality;
    private String video;

    public Mentor(String name, String lastname, String email, String password, String about, String education, String location, String image_profile, String phone, String birthdate, String register_date, String uid, Integer id_mentor, Integer id_subject, String modality, String video) {
        super(name, lastname, email, password, about, education, location, image_profile, phone, birthdate, register_date, uid);
        this.id_mentor = id_mentor;
        this.id_subject = id_subject;
        this.modality = modality;
        this.video = video;
    }

    public Mentor() {

    }

    public Integer getId_mentor() {
        return id_mentor;
    }

    public void setId_mentor(int id_mentor) {
        this.id_mentor = id_mentor;
    }

    public Integer getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "id_mentor=" + id_mentor +
                ", id_subject=" + id_subject +
                ", modality='" + modality + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
