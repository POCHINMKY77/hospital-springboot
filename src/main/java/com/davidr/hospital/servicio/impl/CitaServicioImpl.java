package com.davidr.hospital.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.davidr.hospital.modelo.entidad.Cita;
import com.davidr.hospital.repositorio.ICitaRepositorio;
import com.davidr.hospital.servicio.ICitaServicio;

@Service
@Component
public class CitaServicioImpl implements ICitaServicio {
	
	@Autowired
	public ICitaRepositorio repositorioCita;
	
	@Override
	public Cita insertarCita(Cita nuevaCita) {
		return repositorioCita.save(nuevaCita);
	}
	
	@Override
	public Cita editarCita(int idCita) {
		return repositorioCita.findById(idCita).get();
	}
	
	@Override
	public void eliminarCita(int idCita) {
		repositorioCita.delete(editarCita(idCita));
	}
	
	@Override
	public List<Cita> listarCita() {
		return repositorioCita.findAll();
	}
}