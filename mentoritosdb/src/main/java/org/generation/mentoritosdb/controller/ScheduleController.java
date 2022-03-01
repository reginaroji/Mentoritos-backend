package org.generation.mentoritosdb.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.generation.mentoritosdb.model.Schedule;
import org.generation.mentoritosdb.model.Student;
import org.generation.mentoritosdb.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/schedule/")
public class ScheduleController {
	private final ScheduleService scheduleService;
	
	@Autowired
	public ScheduleController(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
		System.out.println("Si está creando el objeto scheduleService");
	}//ScheduleController
	
	@GetMapping (path="{idSchedule}")
	public List<Schedule> getSchedule(@PathVariable("idSchedule") Long idschedule) {
		return scheduleService.getSchedule(idschedule);
	}//GET
	
	@DeleteMapping (path="{idSchedule}")
	public void deleteStudent(@PathVariable("idSchedule") Long idschedule) {
		scheduleService.deleteSchedule(idschedule);
	}//DELETE
	
	@PostMapping
	public void addSchedule(@RequestBody Schedule schedule) {
		scheduleService.addSchedule(schedule);
	}//POST
	
	@PutMapping (path="{idSchedule}")
	public void updateSchedule(@PathVariable("idSchedule") Long idSchedule, 
			int hour, 
			int idMentor, 
			int dayWeek) {
		scheduleService.updateSchedule(idSchedule, hour, idMentor, dayWeek);
	}//PUT - All items are required
	
}//class ScheduleController
