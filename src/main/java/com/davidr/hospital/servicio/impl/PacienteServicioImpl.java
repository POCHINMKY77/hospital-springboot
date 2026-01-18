package com.davidr.hospital.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.davidr.hospital.modelo.entidad.Paciente;
import com.davidr.hospital.repositorio.IPacienteRepositorio;
import com.davidr.hospital.servicio.IPacienteServicio;

@Service
@Component
public class PacienteServicioImpl implements IPacienteServicio {
	
	@Autowired
	public IPacienteRepositorio repositorioPaciente;
	
	@Override
	public Paciente insertarPaciente(Paciente nuevoPaciente) {
		return repositorioPaciente.save(nuevoPaciente);
	}
	
	@Override
	public Paciente editarPaciente(int idPaciente) {
		return repositorioPaciente.findById(idPaciente).get();
	}
	
	@Override
	public void eliminarPaciente(int idPaciente) {
		repositorioPaciente.delete(editarPaciente(idPaciente));
	}
	
	@Override
	public List<Paciente> listarPaciente() {
		return repositorioPaciente.findAll();
	}
}