package com.example.projectpizzazz.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.projectpizzazz.models.Appointment;


public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{

	
}
