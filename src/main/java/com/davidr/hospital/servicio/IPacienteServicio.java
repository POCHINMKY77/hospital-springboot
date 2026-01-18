package com.davidr.hospital.servicio;

import java.util.List;
import com.davidr.hospital.modelo.entidad.Paciente;

public interface IPacienteServicio {
	public Paciente insertarPaciente(Paciente nuevoPaciente);
	public Paciente editarPaciente(int idPaciente);
	public void eliminarPaciente(int idPaciente);
	public List<Paciente> listarPaciente();
}