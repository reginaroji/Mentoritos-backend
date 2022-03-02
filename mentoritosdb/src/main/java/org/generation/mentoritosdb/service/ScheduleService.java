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

	public Schedule getSchedule(Long idschedule) {
		System.out.println("Si está entrando a getSchedule");
		return scheduleRepository.findById(idschedule).orElseThrow(() -> new IllegalStateException("El horario con el id " + idschedule + " no existe."));
	}//GET

	public void deleteSchedule(Long idschedule) {
		if(scheduleRepository.existsById(idschedule))
			scheduleRepository.deleteById(idschedule);
	}//DELETE

	public void addSchedule(Schedule schedule) {
		Optional<Schedule> scheduleByHour = scheduleRepository.findByHour(schedule.getHour());
		if(scheduleByHour.isPresent()) { //isPresent pregunta si ya existe en la tabla este producto
			throw new IllegalStateException("El horario [" + schedule.getHour() + "] ya existe.");
		}//if
		else {
			scheduleRepository.save(schedule);
		}//else
	}//ADD

	public void updateSchedule(Long idSchedule, 
			String hour, 
			//int idMentor, 
			int dayWeek) {
		if(scheduleRepository.existsById(idSchedule)) {
			Schedule schedule = scheduleRepository.getById(idSchedule);
			if (hour != null) schedule.setHour(hour);
			//if (idMentor != 0) schedule.setIdMentor(idMentor);
			if (dayWeek != 0) schedule.setDayWeek(dayWeek);
			
			scheduleRepository.save(schedule);
		}
		else {
			System.out.println("No existe el id " + idSchedule);
			System.err.println("No existe el id " + idSchedule);
		}
		
	}//UPDATE

	public List<Schedule> getSchedules(Long idschedule) {
		return scheduleRepository.findAll();
	}


}//class ScheduleService
