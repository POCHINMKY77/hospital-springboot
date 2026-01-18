package com.davidr.hospital.servicio;

import java.util.List;
import com.davidr.hospital.modelo.entidad.Doctor;

public interface IDoctorServicio {
	public Doctor insertarDoctor(Doctor nuevoDoctor);
	public Doctor editarDoctor(int idDoctor);
	public void eliminarDoctor(int idDoctor);
	public List<Doctor> listarDoctor();
}