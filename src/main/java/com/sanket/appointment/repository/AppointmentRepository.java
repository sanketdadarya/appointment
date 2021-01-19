package com.sanket.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanket.appointment.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>  {

}
