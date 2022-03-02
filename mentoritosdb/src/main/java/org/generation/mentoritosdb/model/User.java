package org.generation.mentoritosdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String email;
	private String uid;
	private String URL_Imagen;

	
	public User(Long id, String email, String uid, String uRL_Imagen) {
		super();
		this.id = id;
		this.email = email;
		this.uid = uid;
		URL_Imagen = uRL_Imagen;

	}
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String descripcion) {
		this.uid = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", email=" + email + ", uid=" + uid + ", URL_Imagen="
				+ URL_Imagen + "]";
	}

}
