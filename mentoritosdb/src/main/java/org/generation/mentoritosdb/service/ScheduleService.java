package org.generation.mentoritosdb.service;

import java.util.List;
import java.util.Optional;

import org.generation.mentoritosdb.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
	private final ScheduleRepository scheduleRepository;
	
	@Autowired
	public ScheduleService(ScheduleRepository scheduleRepository) {
		super();
		this.scheduleRepository = scheduleRepository;
	}//constructor

	public List<Schedule> getSchedule(Long idschedule) {
		System.out.println("Si está entrando a getSchedule");
		return scheduleRepository.findAll();
	}//GET

	public void deleteSchedule(Long idschedule) {
		if(scheduleRepository.existsById(idschedule))
			scheduleRepository.deleteById(idschedule);
	}//DELETE

	public void addSchedule(Schedule schedule) {
		Optional<Schedule> scheduleById = scheduleRepository.findById(schedule.getIdSchedule());
		if(scheduleById.isPresent()) { //isPresent pregunta si ya existe en la tabla este producto
			throw new IllegalStateException("El estudiante con el nombre [" + schedule.getIdSchedule() + "] ya existe.");
		}//if
		else {
			scheduleRepository.save(schedule);
		}//else
	}//ADD

	public void updateSchedule(Long idSchedule, 
			int hour, 
			//int idMentor, 
			int dayWeek) {
		if(scheduleRepository.existsById(idSchedule)) {
			Schedule schedule = scheduleRepository.getById(idSchedule);
			if (hour != 0) schedule.setHour(hour);
			//if (idMentor != 0) schedule.setIdMentor(idMentor);
			if (dayWeek != 0) schedule.setDayWeek(dayWeek);
			
			scheduleRepository.save(schedule);
		}
		else {
			System.out.println("No existe el id " + idSchedule);
			System.err.println("No existe el id " + idSchedule);
		}
		
	}//UPDATE


}//class ScheduleService
