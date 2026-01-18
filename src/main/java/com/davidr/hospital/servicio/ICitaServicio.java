package com.davidr.hospital.servicio;

import java.util.List;
import com.davidr.hospital.modelo.entidad.Cita;

public interface ICitaServicio {
	public Cita insertarCita(Cita nuevaCita);
	public Cita editarCita(int idCita);
	public void eliminarCita(int idCita);
	public List<Cita> listarCita();
}
