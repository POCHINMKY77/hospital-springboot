package com.davidr.hospital.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.davidr.hospital.modelo.entidad.Doctor;
import com.davidr.hospital.repositorio.IDoctorRepositorio;
import com.davidr.hospital.servicio.IDoctorServicio;

@Service
@Component
public class DoctorServicioImpl implements IDoctorServicio {
	
	@Autowired
	public IDoctorRepositorio repositorioDoctor;
	
	@Override
	public Doctor insertarDoctor(Doctor nuevoDoctor) {
		return repositorioDoctor.save(nuevoDoctor);
	}
	
	@Override
	public Doctor editarDoctor(int idDoctor) {
		return repositorioDoctor.findById(idDoctor).get();
	}
	
	@Override
	public void eliminarDoctor(int idDoctor) {
		repositorioDoctor.delete(editarDoctor(idDoctor));
	}
	
	@Override
	public List<Doctor> listarDoctor() {
		return repositorioDoctor.findAll();
	}
}
