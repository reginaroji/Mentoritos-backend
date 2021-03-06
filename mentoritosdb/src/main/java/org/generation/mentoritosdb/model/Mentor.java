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
@Table(name="mentor")
public class Mentor extends UserMentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mentor", unique = true, nullable = false)
    private Integer id_mentor;
    private Integer id_subject;
    private String modality;
    private String video;
    private Long price;
    private String portfolio;
    private Long user_id;

    public Mentor(String name, String lastname, String about, String education, String location, String image_profile,
			String phone, LocalDate birthdate, LocalDateTime register_date, String uid, Integer id_mentor,
			Integer id_subject, String modality, String video, Long price, String portfolio, Long user_id) {
		super(name, lastname, about, education, location, image_profile, phone, birthdate, register_date, uid);
		this.id_mentor = id_mentor;
		this.id_subject = id_subject;
		this.modality = modality;
		this.video = video;
		this.price = price;
		this.portfolio = portfolio;
		this.user_id = user_id;
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
    
    public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Mentor [id_mentor=" + id_mentor + ", id_subject=" + id_subject + ", modality=" + modality + ", video="
				+ video + ", price=" + price + ", portfolio=" + portfolio + ", user_id=" + user_id + "]";
	}
	
	
}
