package com.sanket.appointment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.appointment.model.Appointment;
import com.sanket.appointment.services.AppointmentServices;


@RestController
public class AppointmentController {
	@Autowired
	AppointmentServices appointmentServices;
	
	@RequestMapping("/")
	String print() {
		return "Server is live";
	}
		
	@PostMapping("/appointment")
	Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentServices.createAppointment(appointment);
	}
	
	@GetMapping("/appointment/{id}")
	Optional<Appointment> viewAppointment(@PathVariable int id) {
		return appointmentServices.viewAppointment(id);
	}
	@PutMapping("/appointment")
	Appointment updateAppointment(@RequestBody Appointment appointment) {
		return appointmentServices.updateAppointment(appointment);
	}
	@DeleteMapping("/appointment/{id}")
	String deleteAppointment(@PathVariable int id) {
		return appointmentServices.deleteAppointment(id);
	}
	@GetMapping("/appointmentList")
	List<Appointment> appointmentList(){
		return appointmentServices.appointmentList();
	}
	
}
