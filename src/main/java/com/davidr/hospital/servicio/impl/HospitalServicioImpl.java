package com.davidr.hospital.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.davidr.hospital.modelo.entidad.Hospital;
import com.davidr.hospital.repositorio.IHospitalRepositorio;
import com.davidr.hospital.servicio.IHospitalServicio;

@Service
@Component
public class HospitalServicioImpl implements IHospitalServicio {
	
	@Autowired
	public IHospitalRepositorio repositorioHospital;
	
	@Override
	public Hospital insertarHospital(Hospital nuevoHospital) {
		return repositorioHospital.save(nuevoHospital);
	}
	
	@Override
	public Hospital editarHospital(int idHospital) {
		return repositorioHospital.findById(idHospital).get();
	}
	
	@Override
	public void eliminarHospital(int idHospital) {
		repositorioHospital.delete(editarHospital(idHospital));
	}
	
	@Override
	public List<Hospital> listarHospital() {
		return repositorioHospital.findAll();
	}
}