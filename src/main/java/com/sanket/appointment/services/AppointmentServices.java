package com.sanket.appointment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.appointment.model.Appointment;
import com.sanket.appointment.repository.AppointmentRepository;

@Service
public class AppointmentServices{
@Autowired
AppointmentRepository appointmentRepository;

public Appointment createAppointment(Appointment appointment) {
	// TODO Auto-generated method stub
	return appointmentRepository.save(appointment);
}

public Optional<Appointment> viewAppointment(int id) {
	// TODO Auto-generated method stub
	return appointmentRepository.findById(id);
}

public Appointment updateAppointment(Appointment appointment) {
	// TODO Auto-generated method stub
	return appointmentRepository.save(appointment);
}

public String deleteAppointment(int id) {
	// TODO Auto-generated method stub
	appointmentRepository.deleteById(id);
	return "deleted successfully";
}

public List<Appointment> appointmentList() {
	// TODO Auto-generated method stub
	return appointmentRepository.findAll();
}


}



