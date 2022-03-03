package org.generation.mentoritosdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="schedule")
public class Schedule {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idSchedule", unique = true, nullable = false)
	private Long idSchedule;
	private String hour;
	private Long idMentor;
	private int dayWeek;
	
	public Schedule() {
		
	}// Constructor - EMPTY

	public Schedule(Long idSchedule, String hour, Long idMentor, int dayWeek) {
		super();
		this.idSchedule = idSchedule;
		this.hour = hour;
		this.idMentor = idMentor;
		this.dayWeek = dayWeek;
	}// Constructor

	public Long getIdSchedule() {
		return idSchedule;
	}//getIdSchedule

	public void setIdSchedule(Long idSchedule) {
		this.idSchedule = idSchedule;
	}//setIdSchedule

	public String getHour() {
		return hour;
	}//getHour

	public void setHour(String hour) {
		this.hour = hour;
	}//setHour

	public Long getIdMentor() {
		return idMentor;
	}//getIdMentor

	public void setIdMentor(Long idMentor) {
		this.idMentor = idMentor;
	}//setIdMentor

	public int getDayWeek() {
		return dayWeek;
	}//getDayWeek

	public void setDayWeek(int dayWeek) {
		this.dayWeek = dayWeek;
	}

	@Override
	public String toString() {
		return "Schedule [idSchedule=" + idSchedule + ", hour=" + hour + ", idMentor=" + idMentor + ", dayWeek="
				+ dayWeek + "]";
	}//setDayWeek
	
}//class Schedule
