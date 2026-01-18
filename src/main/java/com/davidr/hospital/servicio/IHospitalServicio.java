package com.davidr.hospital.servicio;

import java.util.List;
import com.davidr.hospital.modelo.entidad.Hospital;

public interface IHospitalServicio {
	public Hospital insertarHospital(Hospital nuevoHospital);
	public Hospital editarHospital(int idHospital);
	public void eliminarHospital(int idHospital);
	public List<Hospital> listarHospital();
}