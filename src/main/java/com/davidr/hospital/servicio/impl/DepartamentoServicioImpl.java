package com.davidr.hospital.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.davidr.hospital.modelo.entidad.Departamento;
import com.davidr.hospital.repositorio.IDepartamentoRepositorio;
import com.davidr.hospital.servicio.IDepartamentoServicio;

@Service
@Component
public class DepartamentoServicioImpl implements IDepartamentoServicio {
	
	@Autowired
	public IDepartamentoRepositorio repositorioDepartamento;
	
	@Override
	public Departamento insertarDepartamento(Departamento nuevoDepartamento) {
		return repositorioDepartamento.save(nuevoDepartamento);
	}
	
	@Override
	public Departamento editarDepartamento(int idDepartamento) {
		return repositorioDepartamento.findById(idDepartamento).get();
	}
	
	@Override
	public void eliminarDepartamento(int idDepartamento) {
		repositorioDepartamento.delete(editarDepartamento(idDepartamento));
	}
	
	@Override
	public List<Departamento> listarDepartamento() {
		return repositorioDepartamento.findAll();
	}
}
